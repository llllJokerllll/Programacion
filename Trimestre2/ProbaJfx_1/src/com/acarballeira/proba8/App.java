package com.acarballeira.proba8;

import java.io.InputStream;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class App extends Application {      
    
    static int contador = 0;

    @Override
    public void start(Stage primaryStage) throws Exception {
     
        primaryStage.setTitle("Ola Mundo!!!");
//        primaryStage.setWidth(600);
//        primaryStage.setHeight(300);
//        primaryStage.setResizable(false);

        Pane root = new Pane();
        
        Label nomeLb = new Label("Nome: ");
        nomeLb.relocate(10, 10);
        
        TextField nomeFld = new TextField();
        nomeFld.relocate(50, 10);
        
        Label passLb = new Label("Contrasinal: ");
        passLb.relocate(200, 10);
        
        TextField passFld = new TextField();
        passFld.relocate(260, 10);
        
        Button login = new Button("Login");
        login.relocate(10, 50);
        
        Label etiqueta = new Label(String.valueOf(contador));
        etiqueta.relocate(150, 50);
        etiqueta.setVisible(false);
        
        root.getChildren().addAll(nomeLb, nomeFld, passLb, passFld, login, etiqueta);
        
        //Efectos
        DropShadow shadow = new DropShadow();
        
        //Eventos
        login.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                etiqueta.setText(" " + ++contador);
                etiqueta.setVisible(true);
            }
        });
        
        login.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                login.setEffect(shadow);
            }
        });
        
        login.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                login.setEffect(null);
            }
        });
        
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
