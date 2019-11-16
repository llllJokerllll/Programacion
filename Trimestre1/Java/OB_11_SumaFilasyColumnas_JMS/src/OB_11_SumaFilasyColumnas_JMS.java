/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio Array 11
 * @version 1.0 
 */
// Programa que asigne números a una matriz de orden 4x5 comprendidos entre 1 y 10.
// El programa tiene que escribir la suma de los elementos de cada fila y la suma de los números
// que son pares de cada columna.


// Importación de librerías
import java.util.Random;

public class OB_11_SumaFilasyColumnas_JMS {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int[][] matriz = new int[ 4 ][ 5 ];
        // Salida de datos
        int sumaFila, sumaColumna, sumaColumna1, sumaColumna2, sumaColumna3, sumaColumna4;
        // Operativa
        Random numeroAzar = new Random();
        int contador1, contador2;
        // Constantes
        // Inicialización
        //sumaColumna0 = sumaColumna1 = sumaColumna2 = sumaColumna3 = sumaColumna4 = 0;
        
        // Entrada de datos y resolución del programa
        for ( contador1 = 0; contador1 < matriz.length; contador1++ ) {
            sumaFila = 0;
            for ( contador2 = 0; contador2 < matriz[ contador1 ].length; contador2++ ) {
                matriz[ contador1 ][ contador2 ] = numeroAzar.nextInt(10) + 1;
                sumaFila += matriz[ contador1 ][ contador2 ];
            }
            System.out.println( "suma de los elementos de la fila " + contador1 + " --> " + sumaFila );
        }
        
        System.out.println( "-----------------------------------------" );
        
        for ( contador2 = 0; contador2 < matriz[ 3 ].length; contador2++ ) {
            sumaColumna = 0;
            for ( contador1 = 0; contador1 < matriz.length; contador1++ ) {
                if ( matriz[ contador1 ][ contador2 ] % 2 == 0 ) {
                    sumaColumna += matriz[ contador1 ][ contador2 ];
                }
            }
            System.out.printf( "suma de los elementos pares de la columna %d %s %2d\n", contador2, "-->", sumaColumna );
        }
        
        // Salida de datos
        for ( int[] x : matriz ) {
            for ( int y : x ) {
                System.out.printf( "%2d ", y );
            }
            System.out.println( "" );
        }

    } // fin de main
    
} // fin de la clase OB_11_SumaFilasyColumnas_JMS
