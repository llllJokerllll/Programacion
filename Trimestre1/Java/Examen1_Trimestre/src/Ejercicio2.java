/*
 * Documento creado no 2020 por DAWDU10
 * CIFP A Carballeira. Proyecto Examen1_Trimestre en 16 ene. 2020
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio 
 * @version 1.0
 */

// Importación de librerías
import java.util.Random;

public class Ejercicio2 {

    static final int MAX = 46;
    static final int MIN = -50;
    
    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int filas, columnas;
        // Salida de datos
        int[][] matriz;
        // Operativa
        // Constantes
        // Inicialización        
        // Creación de objetos
        
        // Entrada de datos y resolución del programa
        if ( args.length != 2 || Integer.parseInt( args[ 0 ] ) < 2 || Integer.parseInt( args[ 1 ] ) < 2  || Integer.parseInt( args[ 0 ] ) > 100  || Integer.parseInt( args[ 1 ] ) > 100 ) {
            System.out.println( "Error. Parámetros de entrada incorrectos" );
        } else {
            filas = Integer.parseInt( args[ 0 ] );
            columnas = Integer.parseInt( args[ 1 ] );
            
            matriz = generaMatriz( filas, columnas );
            System.out.println( "Matriz Original" );
            verMatriz( matriz );
            matriz = transMatriz( matriz );
            System.out.println( "Matriz Traspuesta" );
            verMatriz( matriz );
        }
        
        // Salida de datos


    } // fin de main
    
    static int[][] generaMatriz( int fila, int columna ) {
        
        int [][] matriz = new int[ fila ] [ columna ];
        Random aleatorio = new Random();
        
        for ( int i = 0; i < fila; i++ ) {
            for ( int j = 0; j < columna; j++ ) {
                matriz[ i ][ j ] = aleatorio.nextInt( MAX - MIN + 1 ) + MIN;
            }
        }
        return matriz;
    }
    
    static int[][] transMatriz( int[][] matriz ) {
        
        int filas = matriz[0].length;
        int columnas = matriz.length;
        int [][] matrizTrans = new int [ filas ][ columnas ];
        
        for ( int i = 0; i < filas; i++ ) {
            for ( int j = 0; j < columnas; j++ ) {
                matrizTrans[ i ][ j ] = matriz [ j ][ i ];
            }
        }
        return matrizTrans;
    }
    
    static void verMatriz ( int[][] matriz ) {
        
        for ( int[] x : matriz ) {
            for ( int y : x ) {
                System.out.printf( "%4d", y );
            }
            System.out.println();
        }
    }
    
} // fin de la clase Ejercicio2

