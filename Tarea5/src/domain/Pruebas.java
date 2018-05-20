/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import file.FileManagerJson;

import domain.Mesa;
import static domain.Objectos.MESA;

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
            Mesa mesa1 = new Mesa("vacio", 1);
            Mesa mesa2 = new Mesa("vacio", 2);
            Mesa mesa3 = new Mesa("vacio", 3);
            mesas.add(mesa1);
            mesas.add(mesa2);
            mesas.add(mesa3);
            fmj.insertToFile(mesas);

            ArrayList<Object> mesas2 = new ArrayList<>();

            mesas2 = fmj.getObjectsFromFile(MESA);

            for (int i = 0; i < mesas2.size(); i++) {
                System.out.println(mesas2.get(i).toString());

            }

            ArrayList<Object> premios = new ArrayList<>();
          Premios premios= new Premios()

            mesas.add(mesa1);
            mesas.add(mesa2);
            mesas.add(mesa3);
            fmj.insertToFile(mesas);

            ArrayList<Object> mesas2 = new ArrayList<>();

            mesas2 = fmj.getObjectsFromFile(MESA);

            for (int i = 0; i < mesas2.size(); i++) {
                System.out.println(mesas2.get(i).toString());

            }

//            fmj.deleteFile("mesa");
        } catch (IOException ex) {
            Logger.getLogger(Pruebas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Pruebas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
