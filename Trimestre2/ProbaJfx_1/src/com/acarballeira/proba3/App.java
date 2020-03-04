package com.acarballeira.proba3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class App extends Application {      
        

    @Override
    public void start(Stage primaryStage) throws Exception {
     
        primaryStage.setTitle("Ola Mundo!!!");
        primaryStage.setWidth(600);
        primaryStage.setHeight(300);
        primaryStage.setResizable(false);
        //Asociación de icono de aplicación
        
        HBox hbox = new HBox();
        hbox.setSpacing(10);
        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        Button btn4 = new Button("4");
        hbox.setSpacing(10);
        hbox.getChildren().addAll(btn1, btn2, btn3, btn4);
        
        Scene primaryScene = new Scene(hbox);
        //Establecemos a escena actual para a stage
        primaryStage.setScene(primaryScene);
        //Amosamos a ventana principal
        primaryStage.show();
        
        
    }

    public static void main(String[] args) {
        
        Application.launch();
    }
}
