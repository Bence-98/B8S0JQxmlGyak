package domB8S0JQ;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DOMParseB8S0JQ {

	public static void main(String[] args) {

		try {
			
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			
	        Document doc = dBuilder.parse("D:\\KB_B8S0JQ\\KB_B8S0JQ\\XMLB8S0JQ.xml");
	        
	        doc.getDocumentElement().normalize();
	        
	        System.out.println("Adatbázis gyökere" + doc.getDocumentElement().getNodeName());
	        NodeList nList = doc.getElementsByTagName("Adatbazis");
	        System.out.println(".............................");
	        
	        for (int temp = 0; temp < nList.getLength(); temp++) {
	          Node nNode = nList.item(temp);
	          System.out.println("\nJelenlegi elem :" + nNode.getNodeName());
	          
	          if (nNode.getNodeType() == Node.ELEMENT_NODE)  {
	              Element eElement = (Element) nNode;
	              System.out.println (""
	                 + eElement.getAttribute("rollno"));
	              
	              System.out.println("Olvasójegy : "
	                 + eElement
	                 .getElementsByTagName("Olvasojegy")
	                 .item(0)
	                 .getTextContent());
	              System.out.println("Név  : "
	            	 + eElement
	            	 .getElementsByTagName("Nev")
	            	 .item(0)
	            	 .getTextContent());
	              System.out.println("Irányítószám : "
	            	  + eElement
	            	  .getElementsByTagName("Irsz")
	            	  .item(0)
	            	  .getTextContent());
	              System.out.println("Város : "
		            	  + eElement
		            	  .getElementsByTagName("Varos")
		            	  .item(0)
		            	  .getTextContent());
	              System.out.println("Utca : "
		            	  + eElement
		            	  .getElementsByTagName("Utca")
		            	  .item(0)
		            	  .getTextContent());
	              System.out.println("Házszám : "
		            	  + eElement
		            	  .getElementsByTagName("Hazsz")
		            	  .item(0)
		            	  .getTextContent());
	              System.out.println("ISBN : "
		            	  + eElement
		            	  .getElementsByTagName("ISBN")
		            	  .item(0)
		            	  .getTextContent());
	              System.out.println("Mennyiség : "
		            	  + eElement
		            	  .getElementsByTagName("Mennyiseg")
		            	  .item(0)
		            	  .getTextContent());
	              System.out.println("Könyvtár neve : "
		            	  + eElement
		            	  .getElementsByTagName("Konyvtar_neve")
		            	  .item(0)
		            	  .getTextContent());
	              System.out.println("Részleg : "
		            	  + eElement
		            	  .getElementsByTagName("Reszleg")
		            	  .item(0)
		            	  .getTextContent());
	              System.out.println("ISBN : "
		            	  + eElement
		            	  .getElementsByTagName("ISBN")
		            	  .item(0)
		            	  .getTextContent());
	              System.out.println("Cím : "
		            	  + eElement
		            	  .getElementsByTagName("KCim")
		            	  .item(0)
		            	  .getTextContent());
	              System.out.println("Szerzõ : "
		            	  + eElement
		            	  .getElementsByTagName("Szerzo")
		            	  .item(0)
		            	  .getTextContent());
	              System.out.println("Kiadó ID : "
		            	  + eElement
		            	  .getElementsByTagName("KiadoID")
		            	  .item(0)
		            	  .getTextContent());
	              System.out.println("Kiadás dátuma : "
		            	  + eElement
		            	  .getElementsByTagName("Kiadas_datuma")
		            	  .item(0)
		            	  .getTextContent());
	              System.out.println("Név : "
		            	  + eElement
		            	  .getElementsByTagName("Nev")
		            	  .item(0)
		            	  .getTextContent());
	              System.out.println("Kiadó ID : "
		            	  + eElement
		            	  .getElementsByTagName("KiadoID")
		            	  .item(0)
		            	  .getTextContent());
	              System.out.println("Irányítószám : "
		            	  + eElement
		            	  .getElementsByTagName("Irsz")
		            	  .item(0)
		            	  .getTextContent());
	              System.out.println("Város : "
		            	  + eElement
		            	  .getElementsByTagName("Varos")
		            	  .item(0)
		            	  .getTextContent());
	              System.out.println("Utca : "
		            	  + eElement
		            	  .getElementsByTagName("Utca")
		            	  .item(0)
		            	  .getTextContent());
	              System.out.println("Házszám : "
		            	  + eElement
		            	  .getElementsByTagName("Hazsz")
		            	  .item(0)
		            	  .getTextContent());
	              
	          	}
	        }
		}        catch (Exception e)  {
	            	e.printStackTrace();
	              }

	}

}
