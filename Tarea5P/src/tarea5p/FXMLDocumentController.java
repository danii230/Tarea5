/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea5p;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author daniela
 */
public class FXMLDocumentController implements Initializable {
    
    
    @FXML
    private AnchorPane pane;

//    @FXML
//    private ImageView im1;
//
//    @FXML
//    private ImageView im2;
//
//    @FXML
//    private ImageView im3;
//    
//    

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      String backgroundImage = "/imagen/restaurante.jpg";
        pane.setStyle("-fx-background-image: url('" + backgroundImage + "'); "
                + "-fx-background-position: left top, center;"
                + "-fx-background-repeat: no-repeat;"
                + "-fx-background-size: cover, auto;");
        
//        Image imag = new Image("/imagen/table-2715994_960_720.png");
//        im1 = new ImageView(imag);
//        im2 = new ImageView(imag);
//        im3 = new ImageView(imag);
//        
//    
        
    }    
    
}
