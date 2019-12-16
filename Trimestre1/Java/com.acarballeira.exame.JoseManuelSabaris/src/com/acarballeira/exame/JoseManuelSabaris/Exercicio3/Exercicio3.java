/*
 * Documento creado no 2019 por DAWDU110.
 * CIFP A Carballeira. Proxecto com.acarballeira.exame.JoseManuelSabaris no 13 dic. 2019.
 * Contido con licenciamento Creative Commons CC BY-NC-SA
 * Cualificación: ?
 */

package com.acarballeira.exame.JoseManuelSabaris.Exercicio3;

/**
 * TODO - Descrición da clase
 * Plantilla de exame
 * @author Jose Manuel Sabaris Garcia "Josemsabaris@gmail.com"
 * @version 1.0
 */

// Importación de librerias
import java.util.Scanner;
import java.util.Random;

public class Exercicio3 {
    
    public static void main(String[] args) {
        
        // Definición de variables
        // Variables de entrada
        int filas, columnas;
        // Variables de salida
        // Variables de operaciones
        // Variables constantes
        // Creacion de objetos
        Scanner entrada = new Scanner( System.in );
        Random numero = new Random();
        // Inicialización de variables
        
        
        // Entrada de datos
        System.out.println( "Por favor, introduzca el número de filas" );
        filas = Integer.parseInt( args[ 0 ] );
        System.out.println( "Por favor, introduzca el número de columnas" );
        columnas = Integer.parseInt( args[ 1 ] );
        entrada.close();
        
        // Resolución del problema
        if ( filas < 2 || filas > 100 || columnas < 2 || columnas > 100 ) {
            System.out.println( "Error: parámetros de entrada incorrectos" );
        } else {
            int[][] matrizOrixinal = new int[ filas ][ columnas ];
            int[][] matrizTransposta = new int[ columnas ][ filas ];
            
        for ( int i = 0; i < filas; i++ ) {
            for ( int j = 0; j < columnas; j++ ) {
                matrizOrixinal[ i ][ j ] = numero.nextInt(97) - 50;
                matrizTransposta[ j ][ i ] = matrizOrixinal[ i ][ j ];
                }     
            }
        
            System.out.println("Matriz orixinal");
            for ( int[] x : matrizOrixinal ) {
                for ( int y : x ) {
                    System.out.printf( "%4d", y );
                }
                System.out.println("");
            }
            System.out.println("Matriz transposta");
            for ( int[] x : matrizTransposta ) {
                for ( int y : x ) {
                    System.out.printf( "%4d", y );
                }
                System.out.println("");
            }
        }
 
        
    } // fin de main
    
} // fin de class Ekercicio3
