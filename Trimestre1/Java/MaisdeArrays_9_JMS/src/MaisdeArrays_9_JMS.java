/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Boletin2deArrays_JMS en 18 nov. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio MaisdeArrays_9
 * @version 1.0
 */
// Ordena un array de números enteros generados al azar con sort de Arrays. 
// Muestra el array original y el array ordenado.

// Importación de librerías
import java.util.Random;
import java.util.Arrays;

public class MaisdeArrays_9_JMS {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        // Salida de datos
        // Operativa
        int contador;
        // Constantes
        // Inicialización        
        // Creación de objetos
        Random numAzar = new Random();
        int[] vector1 = new int[ 10 ];
        
        // Entrada de datos y resolución del programa
        for ( contador = 0; contador < vector1.length; contador++ ) {
            vector1[ contador ] = numAzar.nextInt( 50 );
            System.out.print( vector1[ contador ] + " " );
        }
        System.out.println( "" );
        Arrays.sort( vector1 );
        
        // Salida de datos
        for ( int x : vector1 ) {
            System.out.print( x + " " );
        } 

    } // fin de main
    
} // fin de la clase MaisdeArrays_9_JMS

