/* 
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Boletin_Funcions_Procedementos_Metodos
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */
package com.acarballeira;

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Métodos dentro del paquete
 * @version 1.0
 */
// Importación de librerías
public class Utilidades {

    public static boolean par( int num ) {

        return num % 2 == 0;
    }

    public static boolean bisiesto( int ano ) {

        return ( ano % 4 == 0 && ano % 100 != 0 || ( ano % 100 == 0 ) );
    }

    public static void tablaMultiplicar( int num ) {

        System.out.println( "Tabla de multiplicar de #: " + num );
        for ( int i = 0; i <= 10; i++ ) {
            System.out.printf( "%3d %s %2d\t%s%6d\n", num, "x", i, "=", num * i );
        }
    }

    public static void imprimeSerie( int num1, int num2 ) {

        int incremento = num1 < num2 ? 1 : -1;
        System.out.println( "Valores pares comprendidos entre " + num1 + " y " + num2 + ":" );
        for ( int i = num1, j = 0; j <= Math.abs( num1 - num2 ); j++, i += incremento ) {
            if ( par( i ) ) {
                System.out.print( i + " " );
            }
        }
        System.out.println( "" );
    }

    public static short signo( int num ) {

        return ( short ) ( num < 0 ? -1 : num > 0 ? 1 : 0 );
    }
    
    public static String signoString( int num ) {

        return ( num < 0 ? "-1" : num > 0 ? "1" : "0" );
    }
    
} // fin de la clase Utilidades

