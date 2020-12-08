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
        File inputFile = new File("D:\\KB_B8S0JQ\\KB_B8S0JQ\\XMLB8S0JQ.xml");//xml f�jl megad�sa

        Document doc = DocumentBuilderFactory
                .newInstance()
                .newDocumentBuilder()
                .parse(inputFile);

        Element gyoker = doc.getDocumentElement();
        gyoker.normalize();// a normalize olvashat� form�tumot hoz l�tre

        kiir(gyoker, "");
    }

    public static void kiir(Node gyoker, String bekezdes) {
        String nodename = gyoker.getNodeName();//list�zza az egyedeket
        if (!nodename.contains("text")) {
            System.out.println(bekezdes + nodename);//adatb�zis gy�ker�nek ki�r�sa
        }
        bekezdes += "  ";//

        NodeList children = gyoker.getChildNodes();//gyerekek feldolgoz�sa
        for (int i = 0; i < children.getLength(); i++) {
            Node child = children.item(i);
            boolean veg = child.getTextContent().contains("\n");//van-e benne �j sor

            if (veg) {
                kiir(child, bekezdes);//rekurz�v m�don megh�vja a f�ggv�nyt
            } else {
                System.out.print(bekezdes + child.getNodeName());
                System.out.println(": " + child.getTextContent());
            }
        }
    }
}