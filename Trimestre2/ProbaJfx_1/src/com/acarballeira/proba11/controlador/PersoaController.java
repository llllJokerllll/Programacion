package com.acarballeira.proba11.controlador;

import java.net.URL;
import java.util.ResourceBundle;

import com.acarballeira.proba11.modelo.Persoa;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;


public class PersoaController implements Initializable {
    
    @FXML
    private Button btnAgregar;
    
    @FXML
    private TextField txtNombre;
    
    @FXML
    private TextField txtApellidos;
    
    @FXML
    private TextField txtEdad;
    
    @FXML
    private TableView<Persoa> tblPersonas;
    
    @FXML
    private TableColumn colNombre;
    
    @FXML
    private TableColumn colApellidos;

    @FXML
    private TableColumn colEdad;
    
    private ObservableList<Persoa> personas;
    
    @FXML
    private void agregarPersona(ActionEvent event) {
        
        try {
            Persoa p = new Persoa(this.txtNombre.getText(), this.txtApellidos.getText(), Integer.parseInt(this.txtEdad.getText()));
            this.personas.add(p);
            this.tblPersonas.setItems(this.personas);
        } catch (NumberFormatException e) {
            Alert alert = new Alert(AlertType.WARNING);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Algún dato con formato iuncorrecto");
            alert.showAndWait();
        }
    }
    

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

        this.personas = FXCollections.observableArrayList();
        
        colNombre.setCellValueFactory(new PropertyValueFactory("nombre"));
        colApellidos.setCellValueFactory(new PropertyValueFactory("apellidos"));
        colEdad.setCellValueFactory(new PropertyValueFactory("edad"));
    }
    

}