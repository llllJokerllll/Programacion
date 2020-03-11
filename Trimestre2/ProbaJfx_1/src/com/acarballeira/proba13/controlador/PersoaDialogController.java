package com.acarballeira.proba13.controlador;

import java.net.URL;
import java.util.ResourceBundle;

import com.acarballeira.proba13.modelo.Persoa;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class PersoaDialogController implements Initializable {

    @FXML
    private TextField txtEdad;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtApellidos;
    
    @FXML
    private TextField btnGuardar;
    @FXML
    private TextField btnSalir;
    
    private Persoa persona;
    
    private ObservableList<Persoa> personas;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        
    }

    public void inicializarAtributos(ObservableList<Persoa> personas) {
        this.personas = personas;
        this.persona = pSeleccionada;
        
        
    }
    
    @FXML
    private void salir(ActionEvent event) {
        this.persona = null;
        Stage stage = (Stage) this.btnGuardar.getScene().getWindow();
        stage.close();
    }
    
    @FXML
    private void guardar(ActionEvent event) {
        
        try {
            Persoa p = new Persoa(this.txtNombre.getText(), this.txtApellidos.getText(), Integer.parseInt(this.txtEdad.getText()));
            if (this.personas.contains(p)) {
                Alert alert = new Alert(AlertType.WARNING);
                alert.setHeaderText(null);
                alert.setTitle("Error");
                alert.setContentText("Persoa xa existente");
                alert.showAndWait();
            } else {
                this.persona = p;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setTitle("Perfecto");
                alert.setContentText("Persoa creada correctamente");
                alert.showAndWait();
            }
            
        } catch (NumberFormatException e) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Algún dato con formato incorrecto");
            alert.showAndWait();
        }
    }
    
}
