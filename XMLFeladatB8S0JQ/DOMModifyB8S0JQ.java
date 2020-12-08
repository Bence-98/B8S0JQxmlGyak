package domB8S0JQ;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Scanner;

public class DOMModifyB8S0JQ {
	public static void main(String args[]) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse("D:\\KB_B8S0JQ\\KB_B8S0JQ\\XMLB8S0JQ.xml"); //xml f�jl megad�sa
			NodeList nodeList = doc.getElementsByTagName("Adatbazis");

			for (int i = 0; i < nodeList.getLength(); i++) {
				Node nd = nodeList.item(i);
				if (nd.getNodeType() == Node.ELEMENT_NODE) {
					Element ement = (Element) nd;
					System.out.println("Melyik k�ny mennyis�s�g szeretn� megv�ltoztatni? ISBN:");
					Scanner scanner = new Scanner(System.in);
					String isbn = scanner.next();//Bek�rem, hogy melyik k�nyv sz�m�t akarom m�dos�tani
					System.out.println("K�nyvek sz�ma: ");
					String db = scanner.next();// az �j menyis�g megad�sa
					scanner.close();
					NodeList list = ement.getChildNodes();
					for (int j = 0; j < list.getLength(); j++) {
						Node n = list.item(j);
						if (n.getNodeName() == "Konyvtar") { // megnm�zem, hogy a k�nyvt�rn�l j�r-e m�r a ciklus
							NodeList children = n.getChildNodes();
							int x = 0;
							for (int k = 0; k < children.getLength(); k++) {
								Node c = children.item(k);
								String co = c.getNodeName();
								String rs = c.getTextContent();
								if (rs.equals(isbn)) { //Elen�rz�m, hogy ez-e az a k�nyv amit keresek
									x = 1;
								}
								if (co == "Mennyiseg" && x == 1) { // ha igen, akkor m�dos�tom a mynnis�get
									c.setTextContent(db);
								}
							}
						}
						if (n.getNodeType() == Node.ELEMENT_NODE) { // xml adatainak ki�r�sa a m�dos�t�ssal egy�tt
							Element name = (Element) n;
							System.out.println("   " + name.getTagName() + ": " + name.getTextContent());
						}
					}
				}
			}
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
