package Sax;

import java.io.IOException;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import com.sun.org.apache.xerces.internal.parsers.SAXParser;




public class SaxB8S0JQ implements ContentHandler {
	private Locator loc;

	public SaxB8S0JQ() {
	}

	public static void main(String[] args) {
		try {
			XMLReader parser = new SAXParser();
			SaxB8S0JQ Shand = new SaxB8S0JQ();
			parser.setContentHandler(Shand);
			if (args.length > 0) {
				parser.parse(args[0]);
			} else {
				parser.parse("D:\\KB_B8S0JQ\\KB_B8S0JQ\szemelyek.xml");
			}
		} catch (SAXException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public void setDocumentLocator(Locator lloc) {
		this.loc = lloc;
	}

	public void startDocument() throws SAXException {
	}

	public void endDocument() throws SAXException {
	}

	public void startPrefixMapping(String prefix, String uri) throws SAXException {
		System.out.println("sor:" + this.loc.getLineNumber());
		System.out.println("prefix:" + prefix + " : " + uri);
	}

	public void endPrefixMapping(String prefix) throws SAXException {
		System.out.println("sor:" + this.loc.getLineNumber());
		System.out.println("prefix vege:" + prefix);
	}

	public void processingInstruction(String target, String data) throws SAXException {
		System.out.println("sor:" + this.loc.getLineNumber());
		System.out.println("Feld. utasitas:" + target);
	}

	public void startElement(String namespaceuri, String localname, String rawname, Attributes atts)
			throws SAXException {
		System.out.println("sor:" + this.loc.getLineNumber());
		System.out.println("elemkezdet:" + localname);
		for (int i = 0; i < atts.getLength(); i++) {
			System.out.println(atts.getLocalName(i) + ":" + atts.getValue(i));
		}
	}

	public void endElement(String namespaceuri, String localname, String rawname) throws SAXException {
		System.out.println("sor:" + this.loc.getLineNumber());
		System.out.println("elem vege:" + localname);
	}

	public void characters(char[] ch, int start, int length) throws SAXException {
		String ered = new String();
		for (int i = start; i < start + length; i++) {
			ered += ch[i];
		}
		System.out.println("sor:" + this.loc.getLineNumber());
		System.out.println("szoveg:" + ered);
	}

	public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException {
	}

	public void skippedEntity(String name) throws SAXException {
	}
}