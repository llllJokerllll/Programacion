 /**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio Array 3
 * @version 1.0 
 */
// Programa que le de valores al azar comprendidos entre 0 y 31 a una tabla de dimensiones 10x10.
// Escribir la tabla para comprobar que tiene los valores correctos.

// Importación de librerías
import java.util.Random;

public class OB_3_Azar_10x10_JMS {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        // Salida de datos
        int[][] matriz = new int[ 10 ][ 10 ];
        // Operativa
        Random valorAzar = new Random();
        int contador1, contador2;
        // Constantes
        // Inicialización
        
        
        // Entrada de datos, resolución del programa y salida
        for ( contador1 = 0; contador1 < matriz.length; contador1++ ) {
            for ( contador2 = 0; contador2 < matriz[ contador1 ].length; contador2++ ) {
                matriz[ contador1 ][ contador2 ] = valorAzar.nextInt(32);
                System.out.printf( "%2d  ", matriz[ contador1 ][ contador2 ] );
            }
            System.out.println( "" );
        }


    } // fin de main
    
} // fin de la clase OB_3_Azar_10x10_JMS

