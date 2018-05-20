/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author ValeriaLeivaQuirós
 */
public class Premios {

    private int descuento;

    public Premios() {
    }

    public Premios(int descuento) {
        this.descuento = descuento;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

  

    @Override
    public String toString() {
        return "Premios{" + "descuento=" + descuento + '}';
    }

}
