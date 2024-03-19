import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;

/*
 * Escribe un programa en Java que analice un archivo 
 * XML dado y extraiga cierta información específica, 
 * como etiquetas, atributos o contenido de elementos 
 * específicos. Por ejemplo, puedes extraer todos los 
 * elementos <nombre> dentro del archivo XML.
 */

public class AnalisisArchivosXML {
	
	public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Uso: java AnalisisXML <fichero_XML>");
            return;
        }

        String ficheroXML = args[0];

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new File(ficheroXML));
            document.getDocumentElement().normalize();

            NodeList nodeList = document.getElementsByTagName("nombre");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out.println("Nombre: " + element.getTextContent());
                }
            }
        } catch (Exception e) {
            System.out.println("Error al analizar el archivo XML.");
            e.printStackTrace();
        }
    }

}
