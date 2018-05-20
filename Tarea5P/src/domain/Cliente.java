/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author daniela
 */
public class Cliente {
 private String nombre;
 private String correo;
 private String numero;
 private String cedula;

    public Cliente() {
    }

    public Cliente(String nombre, String correo, String numero, String cedula) {
        this.nombre = nombre;
        this.correo = correo;
        this.numero = numero;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", correo=" + correo + ", numero=" + numero + ", cedula=" + cedula + '}';
    }
 
 
}
