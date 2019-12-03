/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio 
 * @version 1.0
 */
// Nun programiña na que debes implementar a clase Regex3 recolle un texto inserido polo
// usuario no que se esqueceu de engadir un espazo en branco despois dos puntos e das
// comas. Debes aplicar expresións regulares para solventar o desaguisado.
// Un texto de exemplo podería ser este:
//Lorem ipsum dolor sit amet,consectetur adipiscing elit.Pellentesque mattis tristique accumsan.Cras volutpat porta ex vel
//hendrerit.Suspendisse non elementum eros.Proin mattis hendrerit blandit.Fusce mattis dui in tempor condimentum.In lectus
//justo,venenatis eget lacus in,scelerisque posuere ante.Aenean commodo leo eget ornare condimentum.Ut tempor ligula
//diam,finibus consectetur lectus blandit faucibus.Sed at enim id lectus vehicula pulvinar sit amet eu ipsum.In hac habitasse
//platea dictumst.Pellentesque ex erat,rutrum elementum nisl eleifend,feugiat aliquam odio.Proin nibh sem,malesuada a porta
//at,posuere sit amet felis.

// Importación de librerías
import java.util.Scanner;

public class Regex3 {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        String texto;
        // Salida de datos
        String resultado;
        // Operativa
        // Constantes
        // Inicialización        
        // Creación de objetos
        Scanner entrada = new Scanner( System.in );
        
        // Entrada de datos y resolución del programa
        System.out.println( "Por favor, introduzca un texto" );
        texto = entrada.nextLine();
        texto += " " + entrada.nextLine();
        texto += " " + entrada.nextLine();
        texto += " " + entrada.nextLine();
        texto += " " + entrada.nextLine();
        texto += " " + entrada.nextLine();
        
        resultado = engadirEspazos( texto );
        
        // Salida de datos
        System.out.println( "El texto introducido queda de esta manera: \n" + resultado );

    } // fin de main
    
    static String engadirEspazos ( String n ) {
        
        String patron = "[.]";
        String patron2 = "[,]";
        n = n.replaceAll( patron, ". " ).replaceAll( patron2, ", ");
        
        return n;
    }
    
} // fin de la clase Regex3

