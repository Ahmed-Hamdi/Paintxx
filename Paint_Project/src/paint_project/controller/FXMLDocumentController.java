/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint_project.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author hp_pc
 */
public class FXMLDocumentController implements Initializable {

@FXML
private Label label;

@FXML
private void handleButtonAction(ActionEvent event) {
label.setText("Hello World!");
}

@Override
public void initialize(URL url, ResourceBundle rb) {
// TODO
}

}
