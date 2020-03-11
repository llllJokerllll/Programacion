package com.acarballeira.proba13.controlador;



import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.acarballeira.proba13.modelo.Persoa;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class PersoaController implements Initializable {
    
    @FXML
    private Button btnAgregar;
    
    @FXML
    private Button btnModificar;
    
    @FXML
    private Button btnEliminar;
    
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
    private void seleccionar(MouseEvent evento) {
        
        Persoa p = this.tblPersonas.getSelectionModel().getSelectedItem();
        if (p != null) {
            this.txtNombre.setText(p.getNombre());
            this.txtApellidos.setText(p.getApellidos());
            this.txtEdad.setText(String.valueOf(p.getEdad()));
        }
    }
    
    @FXML
    private void agregarPersona(ActionEvent event) {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/acarballeira/proba13/vista/PersoaDialogScene"));
        
        Pane ventanaModal = null;
        
        try {
            ventanaModal = loader.load();
        } catch (IOException e) {
            Alert alert = new Alert(AlertType.WARNING);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Alg�n dato con formato incorrecto");
            alert.showAndWait();
        }
        PersoaDialogController controlador = loader.getController();
        controlador.inicializarAtributos(this.personas);
        Scene scene = new Scene(ventanaModal);
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.showAndWait();
        
        Persoa p = controlador.getPersona();
        if (p != null) {
            this.personas.add(p);
            this.tblPersonas.refresh();
        }
       
    }
    
    @FXML
    private void modificar(ActionEvent event) {
        
        Persoa p = this.tblPersonas.getSelectionModel().getSelectedItem();
        if (p == null) {
            Alert alert = new Alert(AlertType.WARNING);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("No hay nada seleccionado");
            alert.showAndWait();
        } else {
            try {
                Persoa p2 = new Persoa(this.txtNombre.getText(), this.txtApellidos.getText(), Integer.parseInt(this.txtEdad.getText()));
                if (this.personas.contains(p2)) {
                    Alert alert = new Alert(AlertType.WARNING);
                    alert.setHeaderText(null);
                    alert.setTitle("Error");
                    alert.setContentText("A persoa xa existe.");
                    alert.showAndWait();
                } else {
                    p.setNombre(p2.getNombre());
                    p.setApellidos(p2.getApellidos());
                    p.setEdad(p2.getEdad());
                    this.tblPersonas.refresh();
                }
                
            } catch (NumberFormatException e) {
                Alert alert = new Alert(AlertType.WARNING);
                alert.setHeaderText(null);
                alert.setTitle("Error");
                alert.setContentText("Alg�n dato con formato incorrecto");
                alert.showAndWait();
            }
        }
    }
    
    @FXML
    private void eliminar(ActionEvent event) {
        
            Persoa p = this.tblPersonas.getSelectionModel().getSelectedItem();
            if (p == null) {
                Alert alert = new Alert(AlertType.WARNING);
                alert.setHeaderText(null);
                alert.setTitle("Error");
                alert.setContentText("No hay nada seleccionado");
                alert.showAndWait();
            } else {
                this.personas.remove(p);
                this.tblPersonas.setItems(this.personas);
            }
    }
    
    @FXML
    private void filtrarNombre(ActionEvent event) {
        
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

        this.personas = FXCollections.observableArrayList();
        
        
        colNombre.setCellValueFactory(new PropertyValueFactory("nombre"));
        colApellidos.setCellValueFactory(new PropertyValueFactory("apellidos"));
        colEdad.setCellValueFactory(new PropertyValueFactory("edad"));
    }
    

}