/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;

/**
 *
 * @author daniela
 */
public class Restaurante {

    private ArrayList<Object> listaMesas;
    private ArrayList<Object> listaMenu;
    private ArrayList<Object> listaPremios;

    public ArrayList<Object> getListaMesas() {
        return listaMesas;
    }

    public void setListaMesas(ArrayList<Object> listaMesas) {
        this.listaMesas = listaMesas;
    }

    public ArrayList<Object> getListaMenu() {
        return listaMenu;
    }

    public void setListaMenu(ArrayList<Object> listaMenu) {
        this.listaMenu = listaMenu;
    }

    public ArrayList<Object> getListaPremios() {
        return listaPremios;
    }

    public void setListaPremios(ArrayList<Object> listaPremios) {
        this.listaPremios = listaPremios;
    }

}
