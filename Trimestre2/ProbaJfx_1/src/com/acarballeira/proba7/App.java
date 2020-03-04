package com.acarballeira.proba7;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class App extends Application {      
        

    @Override
    public void start(Stage primaryStage) throws Exception {
     
        primaryStage.setTitle("Ola Mundo!!!");
//        primaryStage.setWidth(600);
//        primaryStage.setHeight(300);
//        primaryStage.setResizable(true);
        
        BorderPane root = new BorderPane();
        
        HBox hBox = (HBox) crearHbox();
        //VBox vBox = crearVbox();
        root.setTop(hBox);
        
        
        Scene primaryScene = new Scene(root, 800, 600, Color.BLUE);
        
        //Establecemos a escena actual para a stage
        primaryStage.setScene(primaryScene);
        //Amosamos a ventana principal
        primaryStage.show();
        
        
    }

    private Pane crearHbox() {
        
        HBox hBox = new HBox();
        Button b = new Button("Ver Proxectos");
        Button c = new Button("Engadir Proxecto");
        hBox.setPadding(new Insets(15, 15, 15, 15));
        hBox.setSpacing(15);
        hBox.setStyle("-fx-background-color: #996600;");
        
        c.setPrefSize(150, 50);
        b.setPrefSize(150, 50);
        
        hBox.getChildren().addAll(b, c);
        return hBox;
    }
    
    public static void main(String[] args) {
        
        Application.launch();
    }
}
