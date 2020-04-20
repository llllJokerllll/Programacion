/*
 * Documento creado no 2020 por DAWDU10 y DAWDU08
 * CIFP A Carballeira. ExameJDBC en 21 mar. 2020
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */
package com.proyecto.javafx.app;

import java.net.URL;
import java.util.ResourceBundle;

import com.proyecto.javafx.modelo.Juego;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

/**
 * The Class JuegosDiagController.
 */
public class JuegosDiagController implements Initializable {

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

	/** The juego. */
	private Juego juego;
	
	/** The juegos. */
	private ObservableList<Juego> juegos;

	/**
	 * Initialize.
	 *
	 * @param location the location
	 * @param resources the resources
	 */
	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	/**
	 * Inicializar atributos.
	 *
	 * @param juegos the juegos
	 */
	public void inicializarAtributos(ObservableList<Juego> juegos) {
		this.juegos = juegos;
	}

	/**
	 * Inicializar atributos.
	 *
	 * @param juegos the juegos
	 * @param j the j
	 */
	public void inicializarAtributos(ObservableList<Juego> juegos, Juego j) {
		this.juegos = juegos;
		this.juego = j;
		this.txtTitulo.setText(j.getTitulo());
	}

	/**
	 * Salir.
	 *
	 * @param event the event
	 */
	@FXML
	private void salir(ActionEvent event) {
		this.juego = null;
		Stage stage = (Stage) this.btnGuardar.getScene().getWindow();
		stage.close();
	}

	/**
	 * Guardar.
	 *
	 * @param event the event
	 */
	@FXML
	private void guardar(ActionEvent event) {
		String multi = rdbSi.isSelected() ? "Sí": "No";
		Alert alert;

		Juego j = new Juego(this.txtTitulo.getText(), this.comboBoxGenero.getValue(),
				this.comboBoxPlataforma.getValue(), multi);
		if (!this.juegos.contains(j)) {
			this.juego.setTitulo(this.txtTitulo.getText());
			this.juego.setGenero(this.comboBoxGenero.getValue());
			this.juego.setPlataforma(this.comboBoxPlataforma.getValue());
			this.juego.setMultijugador(multi);
			alert = new Alert(AlertType.INFORMATION);
			alert.setHeaderText((String) null);
			alert.setTitle("Información");
			alert.setContentText("Modificado correctamente");
			alert.showAndWait();
			Stage stage = (Stage) this.btnGuardar.getScene().getWindow();
			stage.close();
		} else {
			alert = new Alert(AlertType.ERROR);
			alert.setHeaderText((String) null);
			alert.setTitle("Error");
			alert.setContentText("El juego ya existe");
			alert.showAndWait();
		}
	}

	/**
	 * Gets the juego.
	 *
	 * @return the juego
	 */
	public Juego getJuego() {
		return this.juego;
	}

}
