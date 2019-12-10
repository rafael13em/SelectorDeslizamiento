/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appusoselector;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import selectordeslizamiento.SelectorDeslizamiento;

/**
 * FXML Controller class
 *
 * @author rafae
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private SelectorDeslizamiento deslUP;
    @FXML
    private SelectorDeslizamiento deslDOWN;
    @FXML
    private Label lbSelected;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO     
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Uno");
        lista.add("Dos");
        lista.add("Tres");
        lista.add("Cuatro");
        lista.add("Cinco");
        lista.add("Seis");
        lista.add("Siete");
        lista.add("Ocho");
        lista.add("Nueve");
        lista.add("Diez");
        
        deslDOWN.setItems(lista);
        deslUP.setItems(lista);
        
        deslDOWN.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ev) {
                lbSelected.setText("Has pulsado el selector de abajo");
            }
        });
        
        deslUP.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent value) {
                lbSelected.setText("Has pulsado el selector de arriba");
            }
        });
    }    
    
}
