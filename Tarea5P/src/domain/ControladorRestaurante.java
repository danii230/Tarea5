/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import static domain.Objectos.MESA;
import static domain.Objectos.PLATILLOS;
import static domain.Objectos.PREMIOS;
import file.FileManagerJson;
import java.io.IOException;
import org.json.simple.parser.ParseException;

/**
 *
 * @author daniela
 */
public class ControladorRestaurante {

    private static Restaurante restaurante;
    FileManagerJson fileManagerJson;

    public ControladorRestaurante() {
    }

    public void llenarListaMesas() throws ParseException, IOException {
        restaurante.setListaMesas(fileManagerJson.getObjectsFromFile(MESA));

    }

    public void llenarListaMenu() throws ParseException, IOException {
        restaurante.setListaMenu(fileManagerJson.getObjectsFromFile(PLATILLOS));

    }

    public void llenarListaPremios() throws ParseException, IOException {
        restaurante.setListaPremios(fileManagerJson.getObjectsFromFile(PREMIOS));

    }

    public static Restaurante getRestaurante() {
        return restaurante;
    }

}
