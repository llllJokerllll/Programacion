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
        int[][] matriz;
        // Salida de datos
        // Operativa
        int f, c;
        // Constantes
        // Inicialización
        f = 4;
        c = 5;
        
        // Entrada de datos y resolución del programa
        matriz = crearMatriz( f, c );
        sumaFila( matriz );
        sumaColumnaPar( matriz, f, c );
        imprimir( matriz );

    } // fin de main
    
    static int[][] crearMatriz( int f, int c ) {
        
        int[][] matriz = new int[ f ][ c ];
        Random numeroAzar = new Random();
        for ( int i = 0; i < matriz.length; i++ ) {
            for ( int j = 0; j < matriz[ i ].length; j++ ) {
                matriz[ i ][ j ] = numeroAzar.nextInt(10) + 1;
            }
        }
        return matriz;
    }
    
    static void sumaFila( int[][] matriz ) {
        
        int sumaFila = 0;
        for ( int i = 0; i < matriz.length; i++ ) {
            for ( int j = 0; j < matriz[ i ].length; j++ ) {
                sumaFila += matriz[ i ][ j ];
            }
            System.out.println( "Suma de los elementos de la fila " + i + " --> " + sumaFila );
        }
        System.out.println( "-----------------------------------------" );
    }
    
    static void sumaColumnaPar( int[][] matriz , int f, int c ) {
                
        for ( int i = 0; i < c; i++ ) {
            int sumaColumna = 0;
            for ( int j = 0; j < f; j++ ) {
                if ( matriz[ j ][ i ] % 2 == 0 ) {
                    sumaColumna += matriz[ j ][ i ];
                }
            }
            System.out.println( "Suma de los elementos pares de la columna" + i + " --> " + sumaColumna );
        }
    }
    
    static void imprimir( int[][] matriz ) {
        
        for ( int[] x : matriz ) {
            for ( int y : x ) {
                System.out.printf( "%2d ", y );
            }
            System.out.println( "" );
        }
    }
    
} // fin de la clase OB_11_SumaFilasyColumnas_JMS
