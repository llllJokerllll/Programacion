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
            System.out.print( "" + x + caracter );
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
        return vector[ 0 ];
    }

    /**
     *
     * @param vector
     * @return
     */
    public static int maxVectorl( int[] vector ) {

        Arrays.sort( vector );
        return vector[ vector.length - 1 ];
    }

    /**
     *
     * @param vector
     * @param posiciones
     * @return
     */
    public static int[] rotaDereitaVector( int[] vector, int posiciones ) {

        int len = vector.length - 1;
        for ( int i = 0; i < posiciones; i++ ) {
            for ( int j = 1; j <= len; j++ ) {
                int aux2 = vector[ j ];
                int aux3 = vector[ 0 ];
                vector[ j ] = aux3;
                vector[ 0 ] = aux2;
            }
        }
        return vector;
    }

    /**
     *
     * @param vector
     * @param num
     * @return
     */
    public static int procuraLinealArray( int[] vector, int num ) {

        int contador = 0;
        for ( int x : vector ) {
            if ( x == num ) {
                return contador;
            } else {
                contador++;
            }
        }
        return -1;
    }

    /**
     * 
     * @param vector
     * @param num
     * @return 
     */
    public static int procuraBinariaArray( int[] vector, int num ) {

        Arrays.sort( vector );
        int len = vector.length;
        int centro, inferior = 0, superior = len - 1;
        while ( inferior <= superior ) {
            centro = ( superior + inferior ) / 2;
            if ( vector[ centro ] == num ) {
                return centro;
            } else if ( num < vector[ centro ] ) {
                superior = centro - 1;
            } else {
                inferior = centro + 1;
            }
        }
        return -1;
    }
    
    /**
     * 
     * @param vector
     * @param num
     * @param metodo
     * @return 
     */
    public static long tempoExecucionProcura( int[] vector, int num, int metodo ) {
        
        if ( metodo == 0 ) {
            long startTime = System.nanoTime();
            procuraLinealArray( vector, num );
            return System.nanoTime() - startTime;
        } else if ( metodo == 1 ) {
            long startTime = System.nanoTime();
            procuraBinariaArray( vector, num );
            return System.nanoTime() - startTime;
        }
        return 0;
    }
} // fin de la clase ArUtilities

