package com.acarballeira.proba9.controlador;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class App extends Application {      
    
    static int contador = 0;

    @Override
    public void start(Stage primaryStage) throws Exception {
     
        primaryStage.setTitle("Calculadora");
//        primaryStage.setWidth(600);
//        primaryStage.setHeight(300);
//        primaryStage.setResizable(false);

        Pane root = new Pane();
        
        
        
        Scene primaryScene = new Scene(root, 500, 200);
        //Establecemos a escena actual para a stage
        primaryStage.setScene(primaryScene);
        //Amosamos a ventana principal
        primaryStage.show();
        
        
    }

    public static void main(String[] args) {
        
        Application.launch();
    }
}
