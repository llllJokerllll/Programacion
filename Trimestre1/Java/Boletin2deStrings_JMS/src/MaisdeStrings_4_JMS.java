/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Boletin2deStrings_JMS en 18 nov. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio 
 * @version 1.0
 */
// Eliminar la última palabra de una frase.

// Importación de librerías
import java.util.Scanner;

public class MaisdeStrings_4_JMS {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        String frase;
        // Salida de datos
        // Operativa
        int posicion;
        // Constantes
        // Inicialización        
        // Creación de objetos
        Scanner entrada = new Scanner( System.in );
        
        // Entrada de datos y resolución del programa
        System.out.println( "Por favor, introduzca una frase" );
        frase = entrada.nextLine();
        frase = frase.trim();
        posicion = frase.lastIndexOf( " " );
        frase = frase.substring( 0, posicion );
        
        // Salida de datos
        System.out.println( frase );

    } // fin de main
    
} // fin de la clase MaisdeStrings_4_JMS

