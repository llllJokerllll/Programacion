/*
 * Documento creado no 2020 por DAWDU10 y DAWDU08
 * CIFP A Carballeira. ExameJDBC en 21 mar. 2020
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */
package com.proyecto.javafx.app;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ResourceBundle;

import com.proyecto.javafx.modelo.Juego;
import com.proyecto.javafx.modelo.JuegoDAO;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.MenuBar;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * The Class JuegosController.
 */
public class JuegosController implements Initializable {

	/** The txt titulo. */
	@FXML
	private TextField txtTitulo;

	/** The combo box genero. */
	@FXML
	private ComboBox<String> comboBoxGenero;

	/** The combo box plataforma. */
	@FXML
	private ComboBox<String> comboBoxPlataforma;

	/** The btn guardar. */
	@FXML
	private Button btnGuardar;
	
	/** The btn modificar. */
	@FXML
	private Button btnModificar;
	
	/** The btn eliminar. */
	@FXML
	private Button btnEliminar;

	/** The btn salir. */
	@FXML
	private Button btnSalir;

	/** The rdb si. */
	@FXML
	private RadioButton rdbSi;

	/** The rdb no. */
	@FXML
	private RadioButton rdbNo;

	/** The grp 1. */
	@FXML
	private ToggleGroup grp1;

	/** The tbl juegos. */
	@FXML
	private TableView<Juego> tblJuegos;

	/** The col titulo. */
	@FXML
	private TableColumn colTitulo;

	/** The col genero. */
	@FXML
	private TableColumn colGenero;

	/** The col plataforma. */
	@FXML
	private TableColumn colPlataforma;

	/** The col multijugador. */
	@FXML
	private TableColumn colMultijugador;

	/** The menubar. */
	@FXML
	private MenuBar menubar;

	/** The juegos. */
	private ObservableList<Juego> juegos;

	/** The juego DAO. */
	private JuegoDAO juegoDAO;

	/**
	 * Agregar juego.
	 *
	 * @param event the event
	 */
	@FXML
	private void agregarJuego(ActionEvent event) {

		try {
			String multi = rdbSi.isSelected() ? "Sí" : "No";
			Juego j = new Juego(this.txtTitulo.getText(), this.comboBoxGenero.getValue(),
					this.comboBoxPlataforma.getValue(), multi);
			this.juegos.add(j);
			juegoDAO.rexistrar(j);
			this.tblJuegos.setItems(this.juegos);
		} catch (NumberFormatException e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setHeaderText(null);
			alert.setTitle("Error");
			alert.setContentText("Algún dato con formato incorrecto");
			alert.showAndWait();
		}

	}

	/**
	 * Modificar juego.
	 *
	 * @param event the event
	 */
	@FXML
	private void modificarJuego(ActionEvent event) {
		Juego j = this.tblJuegos.getSelectionModel().getSelectedItem();
		if (j == null) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setHeaderText((String) null);
			alert.setTitle("Error");
			alert.setContentText("Debes seleccionar un juego");
			alert.showAndWait();
		} else {
			try {
				FXMLLoader loader = new FXMLLoader(
						this.getClass().getResource("/com/proyecto/javafx/vista/JuegosDiag.fxml"));
				Parent root = (Parent) loader.load();
				JuegosDiagController controlador = (JuegosDiagController) loader.getController();
				controlador.inicializarAtributos(this.juegos, j);
				Scene scene = new Scene(root);
				Stage stage = new Stage();
				stage.initModality(Modality.APPLICATION_MODAL);
				stage.setScene(scene);
				stage.setResizable(false);
				stage.showAndWait();
				Juego aux = controlador.getJuego();
				if (aux != null) {
					this.juegoDAO.actualizar(aux);
					this.tblJuegos.refresh();
				}
			} catch (IOException var9) {
				Alert alert = new Alert(AlertType.ERROR);
				alert.setHeaderText((String) null);
				alert.setTitle("Error");
				alert.setContentText(var9.getMessage());
				alert.showAndWait();
			}

		}

	}

	/**
	 * Eliminar juego.
	 *
	 * @param event the event
	 */
	@FXML
	private void eliminarJuego(ActionEvent event) {
		Juego j = this.tblJuegos.getSelectionModel().getSelectedItem();
		if (j == null) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setHeaderText(null);
			alert.setTitle("Error");
			alert.setContentText("No hay nada seleccionado");
			alert.showAndWait();
		} else {
			this.juegos.remove(j);
			juegoDAO.eliminar(j);
			this.tblJuegos.setItems(this.juegos);
		}

	}

	/**
	 * Salir.
	 *
	 * @param event the event
	 */
	@FXML
	private void salir(ActionEvent event) {
		Platform.exit();
		System.exit(0);
	}

	/**
	 * About.
	 *
	 * @param event the event
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	@FXML
	private void about(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/com/proyecto/javafx/vista/about.fxml"));
		Parent root = (Parent) loader.load();	
		Scene scene = new Scene(root);
		Stage stage = new Stage();
		stage.initModality(Modality.APPLICATION_MODAL);
		stage.setScene(scene);
		stage.showAndWait();

		
	}

	/**
	 * Initialize.
	 *
	 * @param location the location
	 * @param resources the resources
	 */
	@Override
	public void initialize(URL location, ResourceBundle resources) {

		this.juegos = FXCollections.observableArrayList();
		this.tblJuegos.setItems(this.juegos);
		this.juegoDAO = new JuegoDAO();
		ArrayList<Juego> lista = (ArrayList<Juego>) this.juegoDAO.obter();
		Iterator<Juego> it = lista.iterator();

		while (it.hasNext()) {
			Juego j = (Juego) it.next();
			this.juegos.add(j);
		}

		colTitulo.setCellValueFactory(new PropertyValueFactory("titulo"));
		colGenero.setCellValueFactory(new PropertyValueFactory("genero"));
		colPlataforma.setCellValueFactory(new PropertyValueFactory("plataforma"));
		colMultijugador.setCellValueFactory(new PropertyValueFactory("multijugador"));

		this.tblJuegos.refresh();
	}

}
