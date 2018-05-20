/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

<<<<<<< HEAD
import file.FileManagerJson;
=======
import domain.Mesa;
>>>>>>> 5175ec46be2153d85d63afd2cb62842ab1f2d1f9
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.parser.ParseException;

/**
 *
 * @author ValeriaLeivaQuirós
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            FileManagerJson fmj = new FileManagerJson();
            
            ArrayList<Object> mesas = new ArrayList<>();
            Mesa mesa1 = new Mesa("s", 0);
            Mesa mesa2 = new Mesa("ss", 2);
            mesas.add(mesa1);
            mesas.add(mesa2);
            fmj.insertToFile(mesas);
            
            ArrayList<Object> mesas2 = new ArrayList<>();
            
            mesas2 = fmj.getObjectsFromFile("mesa");
            
            for (int i = 0; i < mesas2.size(); i++) {
                System.out.println(mesas2.get(i).toString());
                
            }
            
//            fmj.deleteFile("mesa");
            
        } catch (IOException ex) {
            Logger.getLogger(Pruebas.class.getName()).log(Level.SEVERE, null, ex);
<<<<<<< HEAD
        } catch (ParseException ex) {
            Logger.getLogger(Pruebas.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (java.text.ParseException ex) {
//            Logger.getLogger(Pruebas.class.getName()).log(Level.SEVERE, null, ex);
=======
        } catch (java.text.ParseException ex) {
            Logger.getLogger(Pruebas.class.getName()).log(Level.SEVERE, null, ex);
>>>>>>> 5175ec46be2153d85d63afd2cb62842ab1f2d1f9
        }
        
    }
    
}
