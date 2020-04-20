/*
 * Documento creado no 2020 por DAWDU10 y DAWDU08
 * CIFP A Carballeira. ExameJDBC en 21 mar. 2020
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */
package com.proyecto.javafx.app;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * The Class App.
 */
public class App extends Application {

	/**
	 * Start.
	 *
	 * @param primaryStage the primary stage
	 */
	@Override
	public void start(Stage primaryStage) {

		primaryStage.setTitle("Base de datos VideoJuegos");
		primaryStage.setResizable(false);
		Pane ventanaPane;

		InputStream iconStream = App.class.getResourceAsStream("/com/proyecto/javafx/recursos/icono.jpg");
		primaryStage.getIcons().add(new Image(iconStream));

		FXMLLoader loader = new FXMLLoader();
		URL xmlUrl = App.class.getResource("/com/proyecto/javafx/vista/Juegos.fxml");
		loader.setLocation(xmlUrl);
		try {
			ventanaPane = loader.load();
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
			ventanaPane = null;
		}

		Scene primaryScene = new Scene(ventanaPane, 770, 430);
		primaryStage.setScene(primaryScene);
		primaryStage.show();

	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Application.launch();
	}

}
