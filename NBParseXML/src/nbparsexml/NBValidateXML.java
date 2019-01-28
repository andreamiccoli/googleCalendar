/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nbparsexml;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author scuola
 */
public class NBValidateXML {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        List libri = null;
        Parser dom = new Parser();
        try {
            libri = dom.parseDocument("/Users/andreamiccoli/Desktop/Scuola/TEP/XML/fileXML.xml");
        } catch (ParserConfigurationException | SAXException | IOException exception) {
            System.out.println("Errore!");
        }
        // iterazione della lista e visualizzazione degli oggetti
        System.out.println("Numero di libri: " + libri.size());
        Iterator iterator = libri.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }

    }
   
}
