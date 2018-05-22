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
public class Mesa {
    private String estado;
    private int numero;
    private Reservacion reserva;
//    private ArrayList<Platillo> pedido;
//    private Pago pago;
//    private Cliente cliente;

    public Mesa() {
    }

    public Mesa(String estado, int numero) {
        this.estado = estado;
        this.numero = numero;
    }

    public Mesa(String estado, int numero, Reservacion reserva) {
        this.estado = estado;
        this.numero = numero;
        this.reserva = reserva;
    }
    
    

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Reservacion getReserva() {
        return reserva;
    }

    public void setReserva(Reservacion reserva) {
        this.reserva = reserva;
    }
    
    

//    public ArrayList<Platillo> getPedido() {
//        return pedido;
//    }
//
//    public void setPedido(ArrayList<Platillo> pedido) {
//        this.pedido = pedido;
//    }
//
//    public Pago getPago() {
//        return pago;
//    }
//
//    public void setPago(Pago pago) {
//        this.pago = pago;
//    }
//
//    public Cliente getCliente() {
//        return cliente;
//    }
//
//    public void setCliente(Cliente cliente) {
//        this.cliente = cliente;
//    }
//
//    @Override
//    public String toString() {
//        return "Mesa{" + "estado=" + estado + ", numero=" + numero + ", pedido=" + pedido + ", pago=" + pago + ", cliente=" + cliente + '}';
//    }

    @Override
    public String toString() {
        return "Mesa{" + "estado=" + estado + ", numero=" + numero + ", reserva=" + reserva + '}';
    }

  
    
}
