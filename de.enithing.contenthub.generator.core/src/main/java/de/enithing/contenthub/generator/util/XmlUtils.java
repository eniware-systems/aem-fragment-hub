package de.enithing.contenthub.generator.util;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;

import org.jdom2.Document;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

/**
 * Pretty printing utilities for XML
 * @author mvonkeil
 *
 */
public class XmlUtils {
	private XmlUtils() {
	}

	/**
	 * Pretty prints a string containing XML
	 * @param raw The raw XML string
	 * @return The pretty printed version of the input 
	 */
	public static String prettyPrint(String raw) {
		SAXBuilder builder = new SAXBuilder();
		try {
			Document document = builder.build(new ByteArrayInputStream(raw.getBytes("UTF-8")));
			Format fmt = Format.getPrettyFormat();

			XMLOutputter xout = new XMLOutputter();
			xout.setFormat(fmt);
			String result = xout.outputString(document);

			return result;
		} catch (JDOMException | IOException e) {
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
	 * @param sink The sink to receive the pretty printed result
	 * @return A pretty printing wrapper for the given sink
	 */
	public static Writer getPrettyPrintWriter(Writer sink) {
		return new PrettyPrintWriter(sink);
	}

	/**
	 * Creates a writer that pretty prints input before sending it down to the sink
	 * @param sink The sink to receive the pretty printed result
	 * @return A pretty printing writer for the given sink
	 */
	public static Writer getPrettyPrintWriter(OutputStream sink) {
		return new PrettyPrintWriter(new PrintWriter(sink));
	}
}