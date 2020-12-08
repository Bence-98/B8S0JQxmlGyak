package domB8S0JQ;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class DOMParseB8S0JQ {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        File inputFile = new File("D:\\KB_B8S0JQ\\KB_B8S0JQ\\XMLB8S0JQ.xml");//xml fájl megadása

        Document doc = DocumentBuilderFactory
                .newInstance()
                .newDocumentBuilder()
                .parse(inputFile);

        Element gyoker = doc.getDocumentElement();
        gyoker.normalize();// a normalize olvasható formátumot hoz létre

        kiir(gyoker, "");
    }

    public static void kiir(Node gyoker, String bekezdes) {
        String nodename = gyoker.getNodeName();//listázza az egyedeket
        if (!nodename.contains("text")) {
            System.out.println(bekezdes + nodename);//adatbázis gyökerének kiírása
        }
        bekezdes += "  ";//

        NodeList children = gyoker.getChildNodes();//gyerekek feldolgozása
        for (int i = 0; i < children.getLength(); i++) {
            Node child = children.item(i);
            boolean veg = child.getTextContent().contains("\n");//van-e benne új sor

            if (veg) {
                kiir(child, bekezdes);//rekurzív módon meghívja a függvényt
            } else {
                System.out.print(bekezdes + child.getNodeName());
                System.out.println(": " + child.getTextContent());
            }
        }
    }
}