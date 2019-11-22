/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Boletin2deStrings_JMS en 20 nov. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio MaisdeStrings_13
 * @version 1.0
 */
//

// Importación de librerías
import java.util.Scanner;

public class MaisdeStrings_13_JMS {

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
        numeroVocales( texto );

    } // fin de main
    
    public static void numeroVocales ( String cadena ) {
        
        // Declaración de variables
        // Entrada de datos
        // Salida de datos
        int numVocales;
        // Operativa
        int contador1, contador2;
        // Constantes
        final String VOCALES;
        // Inicialización
        numVocales = 0;
        VOCALES = "aeiouAEIOU";
        // Creación de objetos
        
        // Entrada de datos y resolución del programa
        for ( contador1 = 0; contador1 < cadena.length(); contador1++ ) {
            for ( contador2 = 0; contador2 < 10; contador2++ ){
                if ( cadena.charAt( contador1 ) == VOCALES.charAt( contador2 ) ) {
                    numVocales++;
                }
            }
        }
        
        // Salida de datos
        System.out.println("El texto que ha introducido tiene: " + numVocales + " vocales" );
        
    } // fin de numeroVocales
    
} // fin de la clase MaisdeStrings_13_JMS

