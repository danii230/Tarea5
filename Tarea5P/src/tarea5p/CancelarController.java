/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea5p;

import domain.Mesa;
import domain.Reservacion;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import static tarea5p.FXMLController.mesas;

/**
 * FXML Controller class
 *
 * @author daniela
 *
 */
public class CancelarController implements Initializable {

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
    private Label lNumero;

    @FXML
    private Label lcorreo;

    @FXML
    private Label lFecha;

    @FXML
    private Label nombre;

    @FXML
    private Label cedula;

    @FXML
    private Label numero;

    @FXML
    private Label correo;

    @FXML
    private Label fecha;
    
    @FXML
    private Label hora;
     FXMLController controller = new FXMLController();
     
   
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String backgroundImage = "/imagen/tabla.jpeg";
        anchorPane.setStyle("-fx-background-image: url('" + backgroundImage + "'); "
                + "-fx-background-position: left top, center;"
                + "-fx-background-repeat: no-repeat;"
                + "-fx-background-size: cover, auto;");
        
        if(controller.numero==1){
        Mesa mesa = (Mesa) mesas.get(0);
        Reservacion rese = mesa.getReservacion();
        nombre.setText(rese.getNombre());
        cedula.setText(rese.getCedula());
        numero.setText(rese.getNumero());
        correo.setText(rese.getCorreo());
        fecha.setText(rese.getFecha());
        hora.setText(rese.getHora());
        
        
        
        } else if(controller.numero==2){
        Mesa mesa = (Mesa) mesas.get(1);
         Reservacion rese = mesa.getReservacion();
        nombre.setText(rese.getNombre());
        cedula.setText(rese.getCedula());
        numero.setText(rese.getNumero());
        correo.setText(rese.getCorreo());
         fecha.setText(rese.getFecha());
         hora.setText(rese.getHora());
        
        } else if(controller.numero==3){
        Mesa mesa = (Mesa) mesas.get(2);
         Reservacion rese = mesa.getReservacion();
        nombre.setText(rese.getNombre());
        cedula.setText(rese.getCedula());
        numero.setText(rese.getNumero());
        correo.setText(rese.getCorreo());
         fecha.setText(rese.getFecha());
         hora.setText(rese.getHora());
       
        }
    }

    @FXML
    void accionC(ActionEvent event) {
        if(controller.numero==1){
        //Mesa mesa = (Mesa) mesas.get(0);
        Mesa mesaC = new Mesa("vacia", 1);
        mesas.set(0, mesaC);
        System.out.println(mesas.get(0));
        
        } else if(controller.numero==2){
       // Mesa mesa = (Mesa) mesas.get(1);
        Mesa mesaC = new Mesa("vacia", 2);
        mesas.set(1, mesaC);
        System.out.println(mesas.get(1));
        
        } else if(controller.numero==3){
       // Mesa mesa = (Mesa) mesas.get(2);
        Mesa mesaC = new Mesa("vacia", 3);
        mesas.set(2, mesaC);
        System.out.println(mesas.get(2));
        }
    }

}
