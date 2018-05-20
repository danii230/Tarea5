/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea5p;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author ValeriaLeivaQuirós
 */
public class FXMLController implements Initializable {

    @FXML
    private AnchorPane pane;

<<<<<<< HEAD:Tarea5P/src/tarea5p/FXMLDocumentController.java
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

    
=======
    @FXML
    private ImageView img1;

    @FXML
    private ImageView img2;

    @FXML
    private ImageView img3;

    /**
     * Initializes the controller class.
     */
>>>>>>> af988ddf9a88ac3884128f00e26468a5096dbcc7:Tarea5P/src/tarea5p/FXMLController.java
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String backgroundImage = "/imagen/restaurante.jpg";
        pane.setStyle("-fx-background-image: url('" + backgroundImage + "'); "
                + "-fx-background-position: left top, center;"
                + "-fx-background-repeat: no-repeat;"
                + "-fx-background-size: cover, auto;");
<<<<<<< HEAD:Tarea5P/src/tarea5p/FXMLDocumentController.java
        
//        Image imag = new Image("/imagen/table-2715994_960_720.png");
//        im1 = new ImageView(imag);
//        im2 = new ImageView(imag);
//        im3 = new ImageView(imag);
//        
//    
        
    }    
    
=======

        Image image = new Image("/imagen/table-vacio.png");
        img1.setImage(image);
        img2.setImage(image);
        img3.setImage(image);
    }

>>>>>>> af988ddf9a88ac3884128f00e26468a5096dbcc7:Tarea5P/src/tarea5p/FXMLController.java
}
