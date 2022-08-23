package de.enithing.contenthub.generator.util;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.DocumentType;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXWriter;
import org.dom4j.io.XMLWriter;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;

import java.io.*;
import java.lang.reflect.Field;
import java.util.Stack;

/**
 * Pretty printing utilities for XML
 *
 * @author mvonkeil
 */
public class XmlUtils {

    private static class ModifiedXMLWriter extends XMLWriter {
        // indentLevel is private, need reflection to read it
        private Field indentLevel;
        boolean currentElementHasChildren = false;

        public ModifiedXMLWriter(OutputStream out, OutputFormat format) throws UnsupportedEncodingException {
            super(out, format);
            try {
                indentLevel = XMLWriter.class.getDeclaredField("indentLevel");
                indentLevel.setAccessible(true);
            } catch (NoSuchFieldException e) {
                throw new RuntimeException(e);
            }
        }
        private int getIndentLevel() {
            try {
                return indentLevel.getInt(this);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        protected void writeAttributes(Attributes attributes) throws IOException {
            int l = getIndentLevel();
            setIndentLevel(l + 1);
            super.writeAttributes(attributes);
            setIndentLevel(l);
        }

        @Override
        protected void writeAttribute(Attributes attributes, int index) throws IOException {
            writePrintln();
            indent();

            char quote = getOutputFormat().getAttributeQuoteCharacter();
            this.writer.write(attributes.getQName(index));
            this.writer.write("=");
            this.writer.write(quote);
            this.writeEscapeAttributeEntities(attributes.getValue(index));
            this.writer.write(quote);
        }

        @Override
        protected void writePrintln() throws IOException {
            super.println();
        }

        @Override
        public void startElement(String namespaceURI, String localName, String qName, Attributes attributes) throws SAXException {
            try {
                this.writePrintln();
                this.indent();
                this.writer.write("<");
                this.writer.write(qName);
                this.writeNamespaces();
                this.writeAttributes(attributes);
                if (!currentElementHasChildren) {
                    this.writer.write(" />");
                } else {
                    this.writer.write(">");
                    this.setIndentLevel(this.getIndentLevel() + 1);
                }
                this.lastOutputNodeType = 1;
                // this.lastElementClosed = false;
            } catch (IOException ex) {
                this.handleException(ex);
            }
        }

        @Override
        public void endElement(String namespaceURI, String localName, String qName) throws SAXException {
            try {
                if (currentElementHasChildren) {
                    this.writePrintln();
                    this.setIndentLevel(this.getIndentLevel() - 1);
                    this.indent();
                    this.writer.write("</");
                    this.writer.write(qName);
                    this.writer.write(">");
                }
            } catch (Exception ex) {
                //this.handleException(ex);
            }
        }
    }

    private static class ModifiedSAXWriter extends SAXWriter {
        private Stack<Boolean> hasChildrenStack = new Stack<>();

        public ModifiedSAXWriter(ContentHandler contentHandler) {
            super(contentHandler);
        }

        @SuppressWarnings("unchecked")
        @Override
        protected void startElement(Element element, AttributesImpl namespaceAttributes) throws SAXException {
            hasChildrenStack.push(element.content().stream().anyMatch(e -> e instanceof Element));
            ((ModifiedXMLWriter) getContentHandler()).currentElementHasChildren = hasChildrenStack.peek();
            super.startElement(element, namespaceAttributes);
        }

        @Override
        protected void endElement(Element element) throws SAXException {
            ((ModifiedXMLWriter) getContentHandler()).currentElementHasChildren = hasChildrenStack.pop();
            super.endElement(element);
        }
    }

    private XmlUtils() {
    }

    /**
     * Pretty prints a string containing XML
     *
     * @param raw The raw XML string
     * @return The pretty printed version of the input
     */
    public static String prettyPrint(String raw) {
        try {
            OutputStream os = new ByteArrayOutputStream();
            OutputFormat format = OutputFormat.createPrettyPrint();
            format.setIndentSize(4);
            format.setNewLineAfterDeclaration(false);
            XMLWriter writer = new ModifiedXMLWriter(os, format);
            SAXWriter sw = new ModifiedSAXWriter(writer);
            Document doc = DocumentHelper.parseText(raw);
            sw.write(doc);
            return os.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return raw;
    }

    private static class PrettyPrintWriter extends Writer {
        public Writer sink;
        private String buffer = "";

        public PrettyPrintWriter(Writer sink) {
            this.sink = sink;
        }

        private void flushBuffer() throws IOException {
            if (!buffer.isEmpty()) {
                buffer = prettyPrint(buffer);
                sink.write(buffer);
            }
            buffer = "";
            sink.flush();
        }

        @Override
        public void close() throws IOException {
            flushBuffer();
            sink.close();
        }

        @Override
        public void flush() throws IOException {
            flushBuffer();
        }

        @Override
        public void write(char[] str, int offset, int len) throws IOException {
            String s = new String(str);
            buffer += s.substring(offset, len);
        }
    }

    /**
     * Creates a writer that pretty prints input before sending it down to the wrapped sink
     *
     * @param sink The sink to receive the pretty printed result
     * @return A pretty printing wrapper for the given sink
     */
    public static Writer getPrettyPrintWriter(Writer sink) {
        return new PrettyPrintWriter(sink);
    }

    /**
     * Creates a writer that pretty prints input before sending it down to the sink
     *
     * @param sink The sink to receive the pretty printed result
     * @return A pretty printing writer for the given sink
     */
    public static Writer getPrettyPrintWriter(OutputStream sink) {
        return new PrettyPrintWriter(new PrintWriter(sink));
    }
}
