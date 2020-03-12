package com.acarballeira;

import java.io.InputStream;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class App extends Application {

    private static Pane pane1;
    private static Scene escena;
    private final static int ANCHO = 600;
    private final static int ALTO = 400;
    private final static int DESFASE_PALA = 20;
    private static Circle bola;
    private static Rectangle pala;
    private static int velocidadeBolaX = 3;
    private static int velocidadeBolaY = 3;
    private static AnimationTimer bolaAnimada;
    private static int posicionBolaX = 10;
    private static int posicionBolaY = 20;
    private static int velocidadePala = 0;
    private static int posicionPalaY;
    
    
    public static void main(String[] args) {
        
        Application.launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        primaryStage.setTitle("Pong");
        primaryStage.setResizable(false);
        
        //Poñer icono
        InputStream iconStream = App.class.getResourceAsStream("/com/acarballeira/recursos/icon.png");
        primaryStage.getIcons().add(new Image(iconStream));
        //Configuracion de pantalla
        pane1 = new Pane();
        escena = new Scene(pane1, ANCHO, ALTO);
        escena.setFill(Color.web("#000000", 1));
        primaryStage.setScene(escena);
        primaryStage.show();
        
        crearBola();
        crearPala();
        crearRede();
        establecerPosicionBola(posicionBolaX, posicionBolaY);
        configurarIteraccionPala();
        configurarAnimacion();
        comezarPartida();
        
    }

    private static void configurarIteraccionPala() {
        
        escena.setOnKeyPressed(new EventHandler<KeyEvent>() {

            @Override
            public void handle(KeyEvent event) {
                switch (event.getCode()) {
                    case UP:
                        velocidadePala = -6;
                        break;
                    case DOWN:
                        velocidadePala = 6;
                        break;
                }
                
            }
        });
        
        escena.setOnKeyReleased(new EventHandler<KeyEvent>() {

            @Override
            public void handle(KeyEvent event) {
                velocidadePala = 0;
                                
            }
        });
        
    }

    private static void crearPala() {
        pala = new Rectangle(0, 0, 7, 50);
        pala.setFill(Color.RED);
        
        pane1.getChildren().add(pala);
        
    }

    private static void crearRede() {
        Line line;
        
        for (int i = 0; i < ALTO; i += 20) {
            line = new Line((ANCHO - DESFASE_PALA) / 2, i, (ANCHO - DESFASE_PALA) / 2, i + 10);
            line.setStroke(Color.RED);
            
            pane1.getChildren().add(line);
        }
        
    }

    private static void comezarPartida() {
        posicionBolaX = 10;
        posicionBolaY = 20;
        establecerPosicionBola(posicionBolaX, posicionBolaY);
        posicionPalaY = (int)((ALTO - pala.getHeight()) / 2);
        establecerPosicionPala(ANCHO - DESFASE_PALA, posicionPalaY);
        bolaAnimada.start();
        
    }

    private static void configurarAnimacion() {
        
        bolaAnimada = new AnimationTimer() {

            @Override
            public void handle(long now) {
                
                posicionBolaX += velocidadeBolaX;
                posicionBolaY += velocidadeBolaY;
                establecerPosicionBola(posicionBolaX, posicionBolaY);
                
                posicionPalaY += velocidadePala;
                establecerPosicionPala(ANCHO - DESFASE_PALA, posicionPalaY);
                
                if (posicionPalaY < 0) {
                    posicionPalaY = 0;
                } else if (posicionPalaY > ALTO - pala.getHeight()) {
                    posicionPalaY = (int) (ALTO - pala.getHeight());
                }
            }
        };    
    }

    private static void establecerPosicionBola(int x, int y) {
        bola.setCenterX(x);
        bola.setCenterY(y);
        
    }
    
    private static void establecerPosicionPala(int x, int y) {
        
        pala.setX(x);
        pala.setY(y);
    }

    private static void crearBola() {
        bola = new Circle();
        bola.setCenterX(10);
        bola.setCenterY(10);
        bola.setRadius(9);
        bola.setFill(Color.RED);
        
        pane1.getChildren().add(bola);
    }
}
