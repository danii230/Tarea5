/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea5p;

import domain.Platillo;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import domain.Restaurante;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;

/**
 * FXML Controller class
 *
 * @author ValeriaLeivaQuirós
 */
public class OcupadoController implements Initializable {

    @FXML
    private TableView<Platillo> listaMenu;
    private TableColumn nombre;
    private TableColumn precio;
    ObservableList<Platillo> menu;

    @FXML
    private TableView<Platillo> listaPedidos;
    private TableColumn nombrePedido;
    private TableColumn precioPedido;
    ObservableList<Platillo> pedido;
    @FXML
    private Button añadir;

    @FXML
    private Button retirar;

    @FXML
    private Button generarCobro;

    private int posicionListaMenuTabla;
    private int posicionListaPedidos;
    public Platillo platillo;

    @FXML
    private void añadir(ActionEvent event) {
        pedido.add(platillo);

    }

    @FXML
    private void retirar(ActionEvent event) {
        pedido.remove(posicionListaPedidos);
    }

    @FXML
    private void generarCobro(ActionEvent event) {
    }
    
 
        
        

/**
 * Initializes the controller class.
 */
@Override
        public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
