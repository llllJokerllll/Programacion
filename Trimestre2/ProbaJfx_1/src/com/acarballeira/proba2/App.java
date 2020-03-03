package com.acarballeira.proba2;

import java.io.InputStream;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {      
        

    @Override
    public void start(Stage primaryStage) throws Exception {
     
        primaryStage.setTitle("Ola Mundo!!!");
        primaryStage.setWidth(600);
        primaryStage.setHeight(300);
        primaryStage.setResizable(false);
        //Asociación de icono de aplicación
        try {
            InputStream it = ClassLoader.getSystemResourceAsStream("com/acarballeira/recursos/Joker.png");
            Image im = new Image(it);
            primaryStage.getIcons().add(im);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        
        VBox vBox = new VBox(new Label("Etiqueta"));
        Label etiqueta2 = new Label("Outra etiqueta");
        vBox.getChildren().add(etiqueta2);
        etiqueta2.setAlignment(Pos.CENTER);
        for (int i = 0; i < 5; i++) {
            vBox.getChildren().add(new Label("Buff" + i));
        }
        
        
        Scene primaryScene = new Scene(vBox);
        //Establecemos a escena actual para a stage
        primaryStage.setScene(primaryScene);
        //Amosamos a ventana principal
        primaryStage.show();
        
        
    }

    public static void main(String[] args) {
        
        Application.launch();
    }
}
