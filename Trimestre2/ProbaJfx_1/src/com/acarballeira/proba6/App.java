package com.acarballeira.proba6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
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
        
        Pane root = new Pane();
        
        Rectangle rect = new Rectangle(25, 25, 50, 50);
        rect.setFill(Color.BROWN);
        Line line = new Line(90, 40, 230, 40);
        line.setFill(Color.BEIGE);
        Circle circ = new Circle(130, 130, 30);
        circ.setFill(Color.BLACK);
        
        root.getChildren().addAll(rect, line, circ);
        
        Scene primaryScene = new Scene(root, 800, 600, Color.BLUE);
        
        //Establecemos a escena actual para a stage
        primaryStage.setScene(primaryScene);
        //Amosamos a ventana principal
        primaryStage.show();
        
        
    }

    public static void main(String[] args) {
        
        Application.launch();
    }
}
