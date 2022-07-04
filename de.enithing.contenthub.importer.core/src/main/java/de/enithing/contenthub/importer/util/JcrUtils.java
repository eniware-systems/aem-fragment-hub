package de.enithing.contenthub.importer.util;

import org.apache.commons.vfs2.FileObject;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class JcrUtils {
    public static Document parseXml(FileObject xmlFile) throws IOException, JDOMException {
        return parseXml(xmlFile.getContent().getInputStream());
    }

    public static Document parseXml(InputStream is) throws IOException, JDOMException {
        SAXBuilder sax = new SAXBuilder();
        return sax.build(is);
    }

    public static Collection<Element> parseJcrNodes(FileObject xmlFile) throws IOException, JDOMException {
        Document doc = parseXml(xmlFile);
        return parseJcrNodes(doc);
    }

    public static Collection<Element> parseJcrNodes(Document doc) {
        List<Element> roots = doc.getRootElement().getChildren();

        if (roots.isEmpty()) {
            return Collections.emptyList();
        }

        Element jcrContent = doc.getRootElement().getChildren().get(0);
        return jcrContent.getChildren();
    }

    public static Element getXmlNode(Element element, String path) {
        String[] segments = path.split("/");

        for (String segment : segments) {
            String namespace = null;
            if (segment.contains(":")) {
                namespace = segment.substring(0, segment.indexOf(':'));
                segment = segment.substring(segment.indexOf(':') + 1);
            }

            String finalNamespace = namespace;
            String finalSegment = segment;
            element = element.getChildren().stream().filter(c -> c.getName().equals(finalSegment) && (finalNamespace == null || c.getNamespacePrefix().equals(finalNamespace))).findFirst().orElseThrow();
        }

        return element;
    }

    public static Attribute getXmlAttribute(Element element, String attrib, String defaultValue) {
        String namespace = null;
        if (attrib.contains(":")) {
            namespace = attrib.substring(0, attrib.indexOf(':'));
            attrib = attrib.substring(attrib.indexOf(':') + 1);
        }

        String finalNamespace = namespace;
        String finalSegment = attrib;
        String finalAttrib = attrib;

        return element.getAttributes().stream()
                .filter(a -> a.getName().equals(finalSegment) && (finalNamespace == null || a.getNamespacePrefix().equals(finalNamespace)))
                .findFirst()
                .orElseGet(() -> new Attribute(finalAttrib, defaultValue));
    }

    public static Attribute getXmlAttribute(Element element, String attrib) {
        return getXmlAttribute(element, attrib, "");
    }

    public static boolean getXmlAttributeBool(Element element, String attrib) {
        return toBoolean(getXmlAttribute(element, attrib).getValue());
    }

    public static long getXmlAttributeNumber(Element element, String attrib) {
        String val = getXmlAttribute(element, attrib).getValue();

        if(val == null || val.isBlank()) {
            return 0;
        }

        val = val.replaceAll("\\{.*}", "");

        return Long.parseLong(val);
    }

    private static boolean toBoolean(Object value) {
        if (value == null) {
            return false;
        }

        if (value instanceof String s) {
            return s.equals("on");
        }

        if (value instanceof Boolean b) {
            return b;
        }

        return false;
    }

    public static Collection<String> fromArray(String array) {
        array = array.trim();

        if (array.startsWith("[") && array.endsWith("]")) {
            array = array.substring(1, array.length() - 1);
            return Arrays.stream(array.split(",")).toList();
        }

        return Collections.singleton(array);
    }
}
