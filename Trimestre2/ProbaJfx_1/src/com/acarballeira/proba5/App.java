package com.acarballeira.proba5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class App extends Application {      
        

    @Override
    public void start(Stage primaryStage) throws Exception {
     
        primaryStage.setTitle("Ola Mundo!!!");
//        primaryStage.setWidth(600);
//        primaryStage.setHeight(300);
//        primaryStage.setResizable(true);
        
        AnchorPane root = new AnchorPane();
        
        Button btnOk = new Button("Ok");
        Button btnClose = new Button("Pechar");
        HBox hBox = new HBox();
        hBox.getChildren().addAll(btnOk, btnClose);
        
        AnchorPane.setRightAnchor(hBox, 50d);
        AnchorPane.setBottomAnchor(hBox, 50d);
        
        root.getChildren().add(hBox);
        
        Scene primaryScene = new Scene(root, 800, 600);
        
        //Establecemos a escena actual para a stage
        primaryStage.setScene(primaryScene);
        //Amosamos a ventana principal
        primaryStage.show();
        
        
    }

    public static void main(String[] args) {
        
        Application.launch();
    }
}
