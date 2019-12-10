/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Boletin_Funcions_Procedementos_Metodos en 10 dic. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

package com.acarballeira;

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Métodos dentro del paquete
 * @version 1.0
 */

// Importación de librerías
import java.util.Random;
import java.util.Arrays;

public class ArUtilities {

    /**
     * 
     * @param tamano
     * @param maximo
     * @param minimo
     * @return 
     */
    public static int[] xeraVector( int tamano, int maximo, int minimo ) {
        
        int[] vector = new int[ tamano ];
        Random numRandom = new Random();
        for ( int i = 0; i < tamano; i++ ) {
            vector[ i ] = numRandom.nextInt( maximo - minimo + 1 ) + minimo;
        }
        return vector;
    }
    
    /**
     * 
     * @param vector
     * @param caracter 
     */
    public static void amosaVector( int[] vector, char caracter ) {
        
        for ( int x : vector ) {
            System.out.print( "" + x + caracter);
        }
        System.out.print( "\b" );
        System.out.println( "" );
    }
    
    /**
     * 
     * @param vector
     * @return 
     */
    public static int minVectorl( int[] vector ) {
        
        Arrays.sort( vector );
        return vector[0];
    }
    
    public static int maxVectorl( int[] vector ) {
        
        Arrays.sort( vector );
        return vector[ vector.length - 1 ];
    }
    
    public static int[] rotaDereitaVector( int[] vector, int posiciones ) {
        
        int len = vector.length - 1;
        for ( int i = 0; i < posiciones; i++ ) {
            int aux = vector[ len ];
            for ( int j = 0; j < len; j++ ) {
                vector[ j ] = vector[ aux ];
            }
            vector[ 0 ] = aux;
        }
        return vector;
    }
} // fin de la clase ArUtilities

