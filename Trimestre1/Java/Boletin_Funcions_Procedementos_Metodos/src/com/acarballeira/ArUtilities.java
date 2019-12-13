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
     * Aquí creamos un vactor del tipo entero con números aleatorios dentro de el.
     * @param tamano int
     * @param maximo int
     * @param minimo int
     * @return Devolvemos un vector de tipo entero.
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
     * Aquí mostramos los valores del vector con un caracter escogido para separarlos.
     * @param vector int[]
     * @param caracter char
     */
    public static void amosaVector( int[] vector, char caracter ) {

        for ( int x : vector ) {
            System.out.print( "" + x + caracter );
        }
        System.out.print( "\b" );
        System.out.println( "" );
    }

    /**
     * Aquí ordenamos el vector de tipo entero y devolvemos el valor mas pequeño que ocupa la primera posición del vector.
     * @param vector int[]
     * @return Devolvemos un valor del tipo entero.
     */
    public static int minVectorl( int[] vector ) {

        Arrays.sort( vector );
        return vector[ 0 ];
    }

    /**
     * Aquí ordenamos el vector de tipo entero y devolvemos el valor mas grande que ocupa la ultima posición del vector.
     * @param vector int[]
     * @return Devolvemos un valor del tipo entero.
     */
    public static int maxVectorl( int[] vector ) {

        Arrays.sort( vector );
        return vector[ vector.length - 1 ];
    }

    /**
     * Aquí rotamos los valores de un vector de tipo entero hacia la derecha y lo devolvemos.
     * @param vector int[]
     * @param posiciones int
     * @return Devolvemos un vector del tipo entero.
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
     * Aquí buscamos dentro de un vector de tipo entero un valor, si se encuentra devolvemos la posicion que ocupa si no devolvemos -1.
     * @param vector int[]
     * @param num int
     * @return Devolvemos un valor del tipo entero.
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
     * Aquí utilizamos una busqueda de un valor dentro de un vector de tipo entero partiendo al medio el array tantas veces como sea necesario y devolvemos su posición si lo encuentra y -1 en caso contrario.
     * @param vector int[]
     * @param num int
     * @return Devolvemos un valor del tipo entero.
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
     * Aquí damos la opción de que método escoger para buscar un valor de tipo Entero dentro de un vector del mismo tipo y devolvemos un tipo long del tiempo que tarda en realizarse dicho método.
     * @param vector int[]
     * @param num int
     * @param metodo int
     * @return Devolvemos un valor del tipo long.
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

