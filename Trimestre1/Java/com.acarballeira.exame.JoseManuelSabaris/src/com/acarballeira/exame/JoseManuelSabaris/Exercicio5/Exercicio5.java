/*
 * Documento creado no 2019 por DAWDU110.
 * CIFP A Carballeira. Proxecto com.acarballeira.exame.JoseManuelSabaris no 13 dic. 2019.
 * Contido con licenciamento Creative Commons CC BY-NC-SA
 * Cualificación: ?
 */

package com.acarballeira.exame.JoseManuelSabaris.Exercicio5;

/**
 * TODO - Descrición da clase
 * Plantilla de exame
 * @author Jose Manuel Sabaris Garcia "Josemsabaris@gmail.com"
 * @version 1.0
 */

public class Exercicio5 {

    public static void main(String[] args) {
        
        // Definición de variables
        // Variables de entrada
        // Variables de salida
        // Variables de operaciones
        String patron1 = ".*[aeiou]$";
        // Variables constantes
        // Creacion de objetos
        String[][] peliculas = {{"Top Gun", "Tony Scott", "110", "Tom Cruise", "Val Kilmer", "Kelly McGillis"}, 
                                {"Gladiator", "Ridley Scott", "155", "Russel Crowe", "Joaquin Phoenix", "Connie Nielsen"}, 
                                {"Oblivion", "Joseph Kosinki", "125", "Tom Cruise", "Olga Kurylenko"}, 
                                {"James Bond: El Mañana nunca muere", "Roger Spottiswoode", "119", "Pierce Brosnan", "Teri Hatcher", "Jonathan Pryce", "Michelle Yeoh"}};
        // Inicialización de variables
        
        
        // Entrada de datos
        
        
        // Resolución del problema
        for ( int i = 0; i < peliculas.length; i++ ) {
            for ( int j = 3; j < peliculas[i].length; j++ ) {
                if ( peliculas[ i ][ j ].matches( patron1 ) ) {
                    peliculas[ i ][ j ] = peliculas[ i ][ j ].concat( "(*)" );
                }               
            }
        }
        
        // Salida de datos
        System.out.println("### PELICULAS ###");
        System.out.printf( "Película%40s %19s %8s\n", "Director", "Duración", "Actores" );
        System.out.println("-----------------------------------------------------------------------------");
        for ( int i = 0; i < peliculas.length; i++ ) {
            for ( int j = 0; j < peliculas[i].length; j++ ) {
                if ( j == 0 ) {
                    System.out.printf( "%-40s", peliculas[ i ][ j ] );
                } else if ( j == 1 ) {
                    System.out.printf( "%-20s", peliculas[ i ][ j ] );
                } else if ( j == 2 ) {
                    System.out.printf( "%-10s", peliculas[ i ][ j ] );
                } else {
                    System.out.printf( "%-3s, ", peliculas[ i ][ j ] );
                }
            }
            System.out.print( "\b\b" );
            System.out.println( "" );
        }
        
    } // fin de main
    
} // fin de class Ekercicio5
