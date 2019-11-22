/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Boletin2deArrays_JMS en 18 nov. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio MaisdeArrays_11
 * @version 1.0
 */
// Crear de forma estática un array de dúas dimensións que almacene o nome de 5 equipos
// da LNFS, indicando o nome do equipo, cidade e nome do estadio. 
// Amosa o contido do array.

// Importación de librerías
import java.util.Scanner;

public class MaisdeArrays_11_JMS {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        // Salida de datos
        // Operativa
        int contador1, contador2;
        // Constantes
        // Inicialización        
        // Creación de objetos
        Scanner entrada = new Scanner( System.in );
        String[][] equipos = new String[ 5 ][ 3 ];
        
        // Entrada de datos y resolución del programa
        for ( contador1 = 0; contador1 < equipos.length; contador1++ ) {
            System.out.println( "Por favor, introduzca el nombre del equipo de la LNFS, luego la ciudad y por ultimo el nombre del estadio" );
            for ( contador2 = 0; contador2 < equipos[ contador1 ].length; contador2++ ) {
                equipos[ contador1 ][ contador2 ] = entrada.next();
            }
        }
        
        // Salida de datos
        for ( String[] x : equipos ) {
            for ( String y : x ) {
                System.out.printf( "%-15s", y );
            }
            System.out.println( "" );
        }

    } // fin de main
    
} // fin de la clase MaisdeArrays_11_JMS

