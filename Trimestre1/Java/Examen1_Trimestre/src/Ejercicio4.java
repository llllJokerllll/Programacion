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

public class Ejercicio4 {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        String[][] peliculas = {{"Top Gun", "Tony Scott", "110", "Tom Cruise", "Val Kilmer", "Kelly McGillis"}, 
                                {"Gladiator", "Ridley Scott", "155", "Russel Crowe", "Joaquin Phoenix", "Connie Nielsen"}, 
                                {"Oblivion", "Joseph Kosinki", "125", "Tom Cruise", "Olga Kurylenko"}, 
                                {"James Bond: El Mañana nunca muere", "Roger Spottiswoode", "119", "Pierce Brosnan", "Teri Hatcher", "Jonathan Pryce", "Michelle Yeoh"}};
        // Salida de datos
        // Operativa
        String patron1 = ".*[aeiou]$";
        // Constantes
        // Inicialización        
        // Creación de objetos
        
        // Entrada de datos y resolución del programa
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
    
} // fin de la clase Ejercicio4

