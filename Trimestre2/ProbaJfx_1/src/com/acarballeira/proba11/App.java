package com.acarballeira.proba11;

import java.io.IOException;
import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Ola Mundo!!!");
        Pane ventanaPane;       
        
        FXMLLoader loader = new FXMLLoader();
        URL xmlUrl = App.class.getResource("/com/acarballeira/proba11/controlador/PersoaScene.fxml");
        loader.setLocation(xmlUrl);
        try {
            ventanaPane = loader.load();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            ventanaPane = null;
        }

        Scene primaryScene = new Scene(ventanaPane, 800, 600);
        primaryStage.setScene(primaryScene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        Application.launch();
    }
}