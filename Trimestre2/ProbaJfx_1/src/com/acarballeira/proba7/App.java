package com.acarballeira.proba7;

import java.io.InputStream;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
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
        VBox vBox = (VBox) crearVbox();
        StackPane sp = (StackPane) crearStackPane();
        GridPane gp = (GridPane) crearGridPane();
        
        hBox.getChildren().add(sp);
        hBox.setAlignment(Pos.CENTER);
        root.setTop(hBox);
        root.setLeft(vBox);
        root.setCenter(gp);
        
        
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
    
    private Pane crearVbox() {
        
        VBox vBox = new VBox();
        vBox.setPadding(new Insets(15));
        vBox.setSpacing(15);
        Text titulo = new Text("Menu");
        titulo.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        vBox.getChildren().add(titulo);
        
        Hyperlink [] opcions = new Hyperlink[] {
          new Hyperlink("Inicio"),
          new Hyperlink("Persoal"),
          new Hyperlink("Compras"),
          new Hyperlink("Vendas"),
        };
        vBox.getChildren().addAll(opcions);
        
        return vBox;
    }
    
    private Pane crearStackPane() {
        
        StackPane sTack = new StackPane();
        
        InputStream cartafol = App.class.getResourceAsStream("/com/acarballeira/recursos/icona_cartafol.png");
        Image imaxeCartafol = new Image(cartafol, 50.0, 50.0, true, true);
        ImageView viewCartafol = new ImageView(imaxeCartafol);
        
        Text axuda = new Text("?");
        axuda.setFont(Font.font("Verdana", FontWeight.BOLD, 25));
        axuda.setFill(Color.WHITE);
        axuda.setStroke(Color.web("#9090C0"));
        
        sTack.setMargin(axuda, new Insets(8,0,0,0));
        sTack.getChildren().add(viewCartafol);
        sTack.getChildren().add(axuda);
        
        return sTack;
    }

        private Pane crearGridPane() {
        
        GridPane grid = new GridPane();
        grid.setVgap(20);
        grid.setHgap(10);
        
        Text titulo = new Text("Nombre Proyecto: ");
        titulo.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
        grid.add(titulo, 1, 0);
        
        Text nomeProxecto = new Text("Probando Grid");
        nomeProxecto.setFont(Font.font("Courier", FontWeight.BOLD, 20));
        nomeProxecto.setFill(Color.BLUE);
        grid.add(nomeProxecto, 2, 0);
        
        Text entradilla = new Text("Aprendendo con futuros xenios da programación en Ourense.");
        grid.add(entradilla, 1, 1, 2, 1);
        
        ImageView imageProject = new ImageView(new Image(App.class.getResourceAsStream("/com/acarballeira/recursos/project_alargado.png")));
        grid.add(imageProject, 0, 0, 1,2);
        
        ImageView coche = new ImageView(new Image(App.class.getResourceAsStream("/com/acarballeira/recursos/golf_ii.png")));
        grid.add(coche, 1, 2, 2,1);
        
        Text pequeno = new Text("Golfito G60");
        GridPane.setValignment(pequeno, VPos.BOTTOM);
        grid.add(pequeno, 0, 2);
        
        return grid;
    }

    public static void main(String[] args) {
        
        Application.launch();
    }
}
