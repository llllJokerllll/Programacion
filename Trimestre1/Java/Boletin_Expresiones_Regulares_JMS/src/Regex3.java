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
        n = n.replaceAll( patron, ". " );
        n = n.replaceAll( patron2, ", ");
        
        return n;
    }
    
} // fin de la clase Regex3

