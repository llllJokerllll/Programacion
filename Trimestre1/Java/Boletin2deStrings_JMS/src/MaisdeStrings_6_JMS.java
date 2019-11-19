/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Boletin2deStrings_JMS en 19 nov. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio MaisdeStrings_6
 * @version 1.0
 */
// Contar el número de consonantes que se encuentran en una cadena (incluida la Ñ)

// Importación de librerías
import java.util.Scanner;

public class MaisdeStrings_6_JMS {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        String texto;
        // Salida de datos
        // Operativa
        int contador1, contador2, aux;
        // Constantes
        final String CONSONANTES = "BCDFGHJKLMNÑPQRSTVWXYZ";
        // Inicialización  
        aux = 0;
        // Creación de objetos
        Scanner entrada = new Scanner( System.in, "ISO-8859-1" );
        
        // Entrada de datos y resolución del programa
        System.out.println( "Por favor, introduzca un texto" );
        texto = entrada.nextLine();
        texto = texto.toUpperCase();
        
        for ( contador1 = 0; contador1 < CONSONANTES.length(); contador1++ ) {
            for ( contador2 = 0; contador2 < texto.length(); contador2 ++ ) {
                if ( texto.charAt( contador2 ) == ( CONSONANTES.charAt( contador1 ) ) ) {
                    aux++; 
                } 
            }
        }
        
        // Salida de datos
        System.out.println( "El texto que has introducido tiene " + aux + " consonantes." );

    } // fin de main
    
} // fin de la clase MaisdeStrings_6_JMS

