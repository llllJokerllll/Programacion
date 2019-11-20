/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Boletin2deStrings_JMS en 20 nov. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio MaisdeStrings_12
 * @version 1.0
 */
// Escribe la función “numeroEspacios” a la que le pasamos una cadena y nos devuelve el
// número de espacios que contiene esa cadena (tanto al principio y al final como intercalados). 

// Importación de librerías
import java.util.Scanner;

public class MaisdeStrings_12_JMS {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        String texto;
        // Salida de datos
        // Operativa
        // Constantes
        // Inicialización        
        // Creación de objetos
        Scanner entrada = new Scanner( System.in );
        
        // Entrada de datos
        System.out.println( "Por favor, introduzca el texto" );
        texto = entrada.nextLine();
        
        // Resolución del programa y salida de datos
        numeroEspacios( texto );

    } // fin de main
    
    public static void numeroEspacios ( String cadena ) {
        
        // Declaración de variables
        // Entrada de datos
        // Salida de datos
        int numEspacios;
        // Operativa
        int contador;
        // Constantes
        final char ESPACIO;
        // Inicialización
        numEspacios = 0;
        ESPACIO = ' ';
        // Creación de objetos
        
        // Entrada de datos y resolución del programa
        for ( contador = 0; contador < cadena.length(); contador++ ) {
            if ( cadena.charAt( contador ) == ESPACIO ) {
                numEspacios++;
            }
        }
        
        // Salida de datos
        System.out.println( "El texto que ha introducido tiene: " + numEspacios + " espacios en blanco" );
        
    } // fin de numeroEspacios
    
} // fin de la clase MaisdeStrings_12_JMS

