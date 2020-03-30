package com.acarballeira;

import java.io.InputStream;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application{
	
	private static Pane panel;
	private static Scene escena;
	private static int ANCHO = 600;
	private static final int ALTO = 400;
	private static final int DESFASE_PALA = 20;
	private static Circle bola;
	private static Rectangle pala;
	private static int velocidadeBolaX = 3;
	private static int velocidadeBolaY = 3;
	private static AnimationTimer bolaAnimada;
	private static int posicionBolaX = 10;
	private static int posicionBolaY = 20;
	private static int velocidadePala = 0;
	private static int posicionPalaY = 0;
	
	/*Variables creadas o 13-03-2020*/
	private static int puntuacionActual;
	private static int puntuacionRecord = 0;
	private static Text textMarcadorActual;
    private static Text textMarcadorRecord;
    private static final int TEXT_SIZE = 24;
	
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
		//Configuración de pantalla
		panel = new Pane();
		escena = new Scene(panel, ANCHO, ALTO);
		escena.setFill(Color.web("#000000", 1));
		primaryStage.setScene(escena);
		primaryStage.show();
		
		crearBola();
		crearPala();
		crearRede();
		
		crearMarcador(); // Método creado o 13-03-2020
		
		configurarInteraccionPala();
		configurarAnimacion();
		
		comezarPartida();

	}

	private static void configurarInteraccionPala() {
		
		escena.setOnKeyPressed(new EventHandler<KeyEvent>() {			

			@Override
			public void handle(KeyEvent event) {
				switch(event.getCode()) {
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

	private static void crearRede() {
		Line line;
		
		for(int i = 0; i < ALTO; i += 20) {
			line = new Line((ANCHO - DESFASE_PALA) / 2, i, (ANCHO - DESFASE_PALA) / 2, i + 10);
			line.setStroke(Color.RED);
			line.setStrokeWidth(4);
			panel.getChildren().add(line);
		}
		
	}

	private void crearPala() {
		pala = new Rectangle(0, 0, 7, 50);
		pala.setFill(Color.RED);
		
		panel.getChildren().add(pala);
	}

	private static void comezarPartida() {		
		posicionBolaX = 10;
		posicionBolaY = 20;
		establecerPosicionBola(posicionBolaX, posicionBolaY);
		posicionPalaY = (int)(ALTO - pala.getHeight())/2;
		establecerPosicionPala(ANCHO-DESFASE_PALA, posicionPalaY );
		
		/*Engadido o 13-03-2020*/
		puntuacionActual = 0;
        velocidadeBolaX = 3;
        velocidadeBolaY = 3;
        establecerPuntuacion(puntuacionActual);
		bolaAnimada.start();
	}
	
	/*Método creado o 13-03-2020*/
    private static void finalizarPartida() {
        
        bolaAnimada.stop();                    
        comezarPartida();
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
				
				if(posicionPalaY < 0) {
					posicionPalaY = 0;
				} else if (posicionPalaY > ALTO - pala.getHeight()) {
					posicionPalaY = (int)(ALTO - pala.getHeight());
				}
				
				/*Engadido o 13-03-2020*/
				if (posicionBolaX >= ANCHO - 2) {
                    velocidadeBolaX = -3;
                }
                if (posicionBolaX <= 2) {
                    velocidadeBolaX = 3;
                }                
                if (posicionBolaY >= ALTO - 2) {
                    velocidadeBolaY = -3;
                }
                if (posicionBolaY <= 2) {
                    velocidadeBolaY = 3;
                } 
                
                Shape shapeColision = Shape.intersect(bola, pala);
                if (!shapeColision.getBoundsInLocal().isEmpty() && velocidadeBolaX > 0) { //Para que só contabilice se a bola vai hacia a dereita
                    velocidadeBolaX = -3;
                    puntuacionActual++;                    
                    establecerPuntuacion(puntuacionActual);
                    if (puntuacionActual > puntuacionRecord) {
                        puntuacionRecord = puntuacionActual;
                        establecerPuntuacionRecord(puntuacionRecord);
                    }
                }
                
                //Agora detecto se choca coa parede dereita e debo reiniciar partida
                
                if (posicionBolaX >= ANCHO - 2) {
                    finalizarPartida();                    
                }
				
			}//handle
			
		};
		
	}
	
	/*Método creado o 13-03-2020*/
    private static void establecerPuntuacion(int valor) {
        textMarcadorActual.setText(String.valueOf(valor));
    }
    
	/*Método creado o 13-03-2020*/    
    private static void establecerPuntuacionRecord(int valor) {
        textMarcadorRecord.setText(String.valueOf(valor));
    }
    
    /*Método creado o 13-03-2020*/    
    private static void crearMarcador() {        
        
        HBox marcador = new HBox();
        marcador.setTranslateY(20);
        marcador.setMinWidth(ANCHO);
        marcador.setAlignment(Pos.CENTER);
        marcador.setSpacing(60);
        
        HBox marcadorActual = new HBox();
        marcadorActual.setSpacing(10);
        marcador.getChildren().add(marcadorActual);
        
        HBox marcadorRecord = new HBox();
        marcadorRecord.setSpacing(10);
        marcador.getChildren().add(marcadorRecord);
        
        Text textTituloMarcadorActual = new Text("Puntuación: ");        
        textTituloMarcadorActual.setFill(Color.RED);
        textTituloMarcadorActual.setFont(Font.font(TEXT_SIZE));
        
        textMarcadorActual = new Text("0");        
        textMarcadorActual.setFill(Color.RED);
        textMarcadorActual.setFont(Font.font(TEXT_SIZE));
        
        
        Text textTituloMarcadorRecord = new Text("Max. Puntuación: ");
        textTituloMarcadorRecord.setFill(Color.RED);
        textTituloMarcadorRecord.setFont(Font.font(TEXT_SIZE));
        
        textMarcadorRecord = new Text("0");
        textMarcadorRecord.setFill(Color.RED);
        textMarcadorRecord.setFont(Font.font(TEXT_SIZE));
        
        marcadorActual.getChildren().add(textTituloMarcadorActual);                
        marcadorActual.getChildren().add(textMarcadorActual);        
        marcadorRecord.getChildren().add(textTituloMarcadorRecord);
        marcadorRecord.getChildren().add(textMarcadorRecord);
        
        panel.getChildren().add(marcador);
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
		
		panel.getChildren().add(bola);
	}

}
