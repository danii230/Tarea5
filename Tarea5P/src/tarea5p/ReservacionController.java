/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea5p;

import domain.Mesa;
import domain.Reservacion;
import domain.Restaurante;
import tarea5p.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import static tarea5p.FXMLController.mesas;

/**
 * FXML Controller class
 *
 * @author daniela
 */
public class ReservacionController implements Initializable {
    
    

    /**
     * Initializes the controller class.
     */
    @FXML
    private AnchorPane anchorPane;

    @FXML
    private Label lNombre;

    @FXML
    private Label lCedula;

    @FXML
    private Label lnumero;

    @FXML
    private Label lcorreo;

    @FXML
    private TextField tNombre;

    @FXML
    private TextField tCedula;

    @FXML
    private TextField tNumero;

    @FXML
    private TextField tCorreo;

    @FXML
    private DatePicker calendario;

    @FXML
    private Label lFecha;
    
    @FXML
    private TextField tHora;

    Reservacion reserva;
    // Mesa mesa = new Mesa();
//    Mesa mesaSelec;
//    
//    
//
//    public ReservacionController(Mesa mesa) {
//        this.mesaSelec = mesa;
//        
//    }
    
    FXMLController controller = new FXMLController();
//    
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        reserva = new Reservacion();

        String backgroundImage = "/imagen/tabla.jpeg";
        anchorPane.setStyle("-fx-background-image: url('" + backgroundImage + "'); "
                + "-fx-background-position: left top, center;"
                + "-fx-background-repeat: no-repeat;"
                + "-fx-background-size: cover, auto;");
        // System.out.println(contro.mesas.get(1));
    }

    @FXML
    void accionR(ActionEvent event) {
        
        if(controller.numero==1){
        String nombre = tNombre.getText();
        String cedula = tCedula.getText();
        String numero = tNumero.getText();
        String correo = tCorreo.getText();
       
        String dia = (calendario.getValue().getDayOfMonth()+"");
        String mes = (calendario.getValue().getMonth()+"");
        String año = (calendario.getValue().getYear()+"");
        String fecha = (dia+"-"+mes+"-"+año);
        
        String hora = tHora.getText();
        reserva = new Reservacion(nombre, cedula, numero, correo, fecha, hora);
        Mesa mesaR = new Mesa("reservada", 1, reserva);
        mesas.set(0, mesaR);
        System.out.println(mesas.get(0));
        }
        
       else if(controller.numero==2){
        String nombre = tNombre.getText();
        String cedula = tCedula.getText();
        String numero = tNumero.getText();
        String correo = tCorreo.getText();
        
        String dia = (calendario.getValue().getDayOfMonth()+"");
        String mes = (calendario.getValue().getMonth()+"");
        String año = (calendario.getValue().getYear()+"");
        String fecha = (dia+"-"+mes+"-"+año);
        
        String hora = tHora.getText();
        reserva = new Reservacion(nombre, cedula, numero, correo, fecha, hora);
        Mesa mesaR = new Mesa("reservada", 2, reserva);
        mesas.set(1, mesaR);
        System.out.println(mesas.get(1));
        }
        else if(controller.numero==3){
        String nombre = tNombre.getText();
        String cedula = tCedula.getText();
        String numero = tNumero.getText();
        String correo = tCorreo.getText();
        
        
        String dia = (calendario.getValue().getDayOfMonth()+"");
        String mes = (calendario.getValue().getMonth()+"");
        String año = (calendario.getValue().getYear()+"");
        String fecha = (dia+"-"+mes+"-"+año);
        
        String hora = tHora.getText();
        reserva = new Reservacion(nombre, cedula, numero, correo, fecha, hora);
        Mesa mesaR = new Mesa("reservada", 3, reserva);
        mesas.set(2, mesaR);
        System.out.println(mesas.get(2));
        }
    }
}

