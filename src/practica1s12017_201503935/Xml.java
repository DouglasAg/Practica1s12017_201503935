/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1s12017_201503935;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 *
 * @author ddani
 */
public class Xml {

    public boolean cargarXml(String ruta) {
        SAXBuilder builder = new SAXBuilder();
        File xmlFile = new File(ruta);
        try {
            Document document = (Document) builder.build(xmlFile);
            Element rootNode = document.getRootElement();
            //Capturando las palabras
            List dimension = rootNode.getChildren("dimension");
            // para la dimension
            Element node4 = (Element) dimension.get(0);
            Pimera.dimension=Integer.parseInt(node4.getText());
            
            //Para los dobles
            List list = rootNode.getChildren("dobles");
            for (int i = 0; i < list.size(); i++) {
                Element nod = (Element) list.get(i);
                List listaCasilla = nod.getChildren("casilla");
                for (int j = 0; j < listaCasilla.size(); j++) {
                    Element node2 = (Element) listaCasilla.get(j);
                    Pimera.doble.agregarAlFinal(Integer.parseInt(node2.getChildText("x")), Integer.parseInt(node2.getChildText("y")));
                }
            }
            //Para los triples
            List triples = rootNode.getChildren("triples");
            for (int i = 0; i < triples.size(); i++) {
                Element node = (Element) triples.get(i);
                List listaCasilla = node.getChildren("casilla");
                for (int j = 0; j < listaCasilla.size(); j++) {
                    Element node2 = (Element) listaCasilla.get(j);
                    Pimera.triple.agregarAlFinal(Integer.parseInt(node2.getChildText("x")), Integer.parseInt(node2.getChildText("y")));
                }
            }
            // para las palabras
            List diccionario = rootNode.getChildren("diccionario");
            for (int i = 0; i < diccionario.size(); i++) {
                Element nod = (Element) diccionario.get(i);
                List listaPalabras = nod.getChildren("palabra");
                for (int j = 0; j < listaPalabras.size(); j++) {
                    Element nod2 = (Element) listaPalabras.get(j);
                    Pimera.list.agregarAlFinal(nod2.getText());
                }
            }
            
            return true;
            
        } catch (IOException io) {
            System.out.println(io.getMessage());
            return false;
        } catch (JDOMException jdomex) {
            System.out.println(jdomex.getMessage());
            return false;
        }

    }

}
