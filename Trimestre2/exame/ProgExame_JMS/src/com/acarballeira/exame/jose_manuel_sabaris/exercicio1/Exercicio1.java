package com.acarballeira.exame.jose_manuel_sabaris.exercicio1;

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio 1
 * @version 1.0
 */

// Importación de librerías
import java.util.Random;
import java.util.Scanner;

public class Exercicio1 {

    static final int MAX = 900;
    static final int MIN = 150;
    
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
        Scanner entrada = new Scanner( System.in );
        
        // Entrada de datos y resolución del programa
        do {
            System.out.println( "Por favor, introduzca el valor para las filas" );
            filas = entrada.nextInt();
            
        } while ( filas < 5 || filas > 10 );
            
        do {
            System.out.println( "Por favor, introduzca el valor para las columnas" );
            columnas = entrada.nextInt();
            
        } while ( columnas < 5 || columnas > 10 );
        
        // Salida de datos
        matriz = generaMatriz( filas, columnas );
        verMatriz( matriz );

    } // fin de main
    
    /**
     * Aquí con los valores de filas y columnas generamos una matriz con numeros aleatorios no repetidos.
     * @param numFilas int
     * @param numColumnas int
     * @return una matriz de valores enteros entre MAX y MIN
     */
    static int[][] generaMatriz( int numFilas, int numColumnas ) {
        
        Random aleatorio = new Random();
        int[][] matriz = new int[ numFilas ][ numColumnas ];
        int aux;
        
        for ( int i = 0; i < numFilas; i++ ) {
            for ( int j = 0; j < numColumnas; j++ ) {
                aux = aleatorio.nextInt( MAX - MIN + 1 ) + MIN;
                for ( int k = 0; k <= i; k++ ) {
                    for ( int l = 0; l <= j; l++ ) {
                        if ( matriz[ k ][ l ] == aux ) {
                            aux = aleatorio.nextInt( MAX - MIN + 1 ) + MIN;
                            k = 0;
                            l = 0;
                        }
                    }
                }
                matriz[ i ][ j ] = aux;
            }
        }
        return matriz;
    } // Fin de generaMatriz
    
    /**
     * Aquí mandamos imprimir los valores de la matriz dada
     * @param matriz int
     */
    static void verMatriz( int[][] matriz ) {
        
        for ( int[] x : matriz ) {
            for ( int y : x ) {
                System.out.print( y + " " );
            }
            System.out.println();
        }
    } // Fin de verMatriz
    
} // fin de la clase Exercicio1

