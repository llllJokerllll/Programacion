package com.acarballeira.proba4;

import java.io.InputStream;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {      
        

    @Override
    public void start(Stage primaryStage) throws Exception {
     
        primaryStage.setTitle("Ola Mundo!!!");
        primaryStage.setWidth(600);
        primaryStage.setHeight(300);
        primaryStage.setResizable(true);
        
        HBox hBox = new HBox();
        VBox vBox = new VBox();
        for (int i = 0; i < 20; i++) {
            vBox.getChildren().add(new Text("Texto " + i));
        }
        
        VBox vBox2 = new VBox();
        for (int j = 0; j < 20; j++) {
            vBox2.getChildren().add(new Text("Texto " + j));
        }
        
        hBox.getChildren().addAll(vBox, vBox2);
        
        ScrollPane sp = new ScrollPane(hBox);
        
        Scene primaryScene = new Scene(sp, 800, 600);
        
        //Establecemos a escena actual para a stage
        primaryStage.setScene(primaryScene);
        //Amosamos a ventana principal
        primaryStage.show();
        
        
    }

    public static void main(String[] args) {
        
        Application.launch();
    }
}
