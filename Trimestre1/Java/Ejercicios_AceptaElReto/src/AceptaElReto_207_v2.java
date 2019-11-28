/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Ejercicios_AceptaElReto en 28 nov. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio AceptaElReto_207_v2
 * @version 1.0
 */
//
// Importación de librerías
import java.util.Scanner;

public class AceptaElReto_207_v2 {

    public static void main( String[] args ) {

        // Declaración de variables
        // Entrada de datos
        int alto, ancho, nArboles;
        // Salida de datos
        int totalSombra;
        // Operativa
        int fila, columna;
        int contador1, contador2;
        // Constantes
        // Inicialización        
        // Creación de objetos
        Scanner entrada = new Scanner( System.in );

        // Entrada de datos, resolución del programa y salida
        while ( true ) {
            alto = entrada.nextInt();
            ancho = entrada.nextInt();
            nArboles = entrada.nextInt();
            if ( alto == 0 && ancho == 0 && nArboles == 0 ) break;
            int[][] bosque = new int[ alto ][ ancho ];
            totalSombra = 0;

            for ( contador1 = 1; contador1 <= nArboles; contador1++ ) {
                fila = entrada.nextInt() - 1;
                columna = entrada.nextInt() - 1;
                bosque[ fila ][ columna ] = 1;
                for ( contador2 = 0; contador2 < 8; contador2++ ) {
                    if ( fila > 0 ) {
                        bosque[ fila - 1 ][ columna ] = 1;
                        if ( columna > 0 ) {
                            bosque[ fila - 1 ][ columna - 1 ] = 1;
                        }

                        if ( columna < ancho - 1 ) {
                            bosque[ fila - 1 ][ columna + 1 ] = 1;
                        }
                    }
                    if ( columna < ancho - 1 ) {
                        bosque[ fila ][ columna + 1 ] = 1;
                    }

                    if ( columna > 0 ) {
                        bosque[ fila ][ columna - 1 ] = 1;
                        if ( fila < alto - 1 ) {
                            bosque[ fila + 1 ][ columna - 1 ] = 1;
                        }
                    }
                    if ( fila < alto - 1 ) {
                        bosque[ fila + 1 ][ columna ] = 1;
                    }
                    if ( columna < ancho - 1 && fila < alto - 1 ) {
                        bosque[ fila + 1 ][ columna + 1 ] = 1;
                    }

                }

            }

            for ( int[] x : bosque ) {
                for ( int y : x ) {
                    if ( y == 1 ) {
                        totalSombra++;
                    }
                }
            }
            System.out.println( totalSombra - nArboles );
        }

    } // fin de main

} // fin de la clase AceptaElReto_207_v2

