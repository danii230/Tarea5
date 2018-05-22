/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea5p;

import domain.ControladorRestaurante;
import domain.Mesa;
import domain.Restaurante;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author ValeriaLeivaQuirós
 */
public class FXMLController implements Initializable {

    @FXML
    private AnchorPane pane;

    @FXML
    private ImageView img1;

    @FXML
    private ImageView img2;

    @FXML
    private ImageView img3;

    private Mesa mesa;

    ControladorRestaurante controladorRestaurante;
    private Restaurante rest;

    static ArrayList<Object> mesas = new ArrayList<>();

    ReservacionController rese;

    static int numero = 0;

    /**
     * Initializes the controller class.
     */
//    public void llenarLista() {
////
////        Mesa mesa1 = new Mesa("vacia", 1);
////        Mesa mesa2 = new Mesa("vacia", 2);
////        Mesa mesa3 = new Mesa("vacia", 3);
////        mesas.add(mesa1);
////        mesas.add(mesa2);
////        mesas.add(mesa3);
//    }
    public void initialize(URL url, ResourceBundle rb) {

        String backgroundImage = "/imagen/restaurante.jpg";
        pane.setStyle("-fx-background-image: url('" + backgroundImage + "'); "
                + "-fx-background-position: left top, center;"
                + "-fx-background-repeat: no-repeat;"
                + "-fx-background-size: cover, auto;");

        Image image = new Image("/imagen/table-vacio.png");
        img1.setImage(image);
        img1.setId("0");
        img2.setImage(image);
        img2.setId("1");
        img3.setImage(image);
        img3.setId("2");
        controladorRestaurante = new ControladorRestaurante();
        mesas = controladorRestaurante.getRestaurante().getListaMesas();
        //        llenarLista();
//
//        System.out.println(mesas.get(0));
//        System.out.println(mesas.get(1));
//        System.out.println(mesas.get(2));
    }

    @FXML
    void a(MouseEvent event) throws IOException {

        mesa = (Mesa) mesas.get(0);
        System.out.println(mesa.toString());
        numero = mesa.getNumero();

        if (mesa.getEstado().equalsIgnoreCase("vacia")) {
            Parent root = FXMLLoader.load(getClass().getResource("Reservacion.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setTitle("Reservar");
            stage.setScene(scene);
            stage.show();

        } else if (mesa.getEstado().equalsIgnoreCase("reservada")) {
            Parent root = FXMLLoader.load(getClass().getResource("Cancelar.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setTitle("Cancelar Reservacion");
            stage.setScene(scene);
            stage.show();

        }

    }

    @FXML
    void b(MouseEvent event) throws IOException {

        mesa = (Mesa) mesas.get(1);
        numero = mesa.getNumero();

        if (mesa.getEstado().equalsIgnoreCase("vacia")) {
            Parent root = FXMLLoader.load(getClass().getResource("Reservacion.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setTitle("Reservar");
            stage.setScene(scene);
            stage.show();
        } else if (mesa.getEstado().equalsIgnoreCase("reservada")) {
            Parent root = FXMLLoader.load(getClass().getResource("Cancelar.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setTitle("Cancelar Reservacion");
            stage.setScene(scene);
            stage.show();

        }

    }

    @FXML
    void c(MouseEvent event) throws IOException {

        mesa = (Mesa) mesas.get(2);
        numero = mesa.getNumero();

        if (mesa.getEstado().equalsIgnoreCase("vacia")) {
            Parent root = FXMLLoader.load(getClass().getResource("Reservacion.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setTitle("Reservar");
            stage.setScene(scene);
            stage.show();
        } else if (mesa.getEstado().equalsIgnoreCase("reservada")) {
            Parent root = FXMLLoader.load(getClass().getResource("Cancelar.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setTitle("Cancelar Reservacion");
            stage.setScene(scene);
            stage.show();

        }

    }

}
