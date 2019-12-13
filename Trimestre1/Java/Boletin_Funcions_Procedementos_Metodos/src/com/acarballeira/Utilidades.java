/* 
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Boletin_Funcions_Procedementos_Metodos
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */
package com.acarballeira;

/**
 * @author Jose Manuel 
 * Título: Métodos dentro del paquete
 * @version 1.0
 */

public class Utilidades {

    /**
     * Aquí comprobamos si un número entero es par.
     * @param num int
     * @return Devolvemos un valor boolean.
     */
    public static boolean par( int num ) {

        return num % 2 == 0;
    }

    /**
     * Aquí comprobamos si un año es bisiesto.
     * @param ano int
     * @return Devolvemos un valor boolean.
     */
    public static boolean bisiesto( int ano ) {

        return ( ano % 4 == 0 && ano % 100 != 0 || ( ano % 100 == 0 ) );
    }

    /**
     * Aquí mostramos la tabla de multiplicar del número entero dado.
     * @param num int
     */
    public static void tablaMultiplicar( int num ) {

        System.out.println( "Tabla de multiplicar de #: " + num );
        for ( int i = 0; i <= 10; i++ ) {
            System.out.printf( "%3d %s %2d\t%s%6d\n", num, "x", i, "=", num * i );
        }
    }

    /**
     * Aquí rehutilizamos el método Par y mostramos los números pares que hay entre dos números segun el valor de num1 y num2, ascendente o descendente.
     * @param num1 int
     * @param num2 int
     */
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

    /**
     * Aquí devolvemos el tipo de signo en un valor de tipo short de un un número de tipo entero dado.
     * @param num int
     * @return Devolvemos un valor de tipo short.
     */
    public static short signo( int num ) {

        return ( short ) ( num < 0 ? -1 : num > 0 ? 1 : 0 );
    }

    /**
     * Aquí devolvemos el tipo de signo en un valor de tipo String de un un número de tipo entero dado.
     * @param num int
     * @return Devolvemos un valor de tipo String.
     */
    public static String signoString( int num ) {

        return ( num < 0 ? "-1" : num > 0 ? "1" : "0" );
    }

    /**
     * Aquí devolvemos un valor de tipo entero de la suma de 2 valores del tipo entero.
     * @param num1 int
     * @param num2 int
     * @return Devolvemos un valor de tipo entero.
     */
    public static int suma( int num1, int num2 ) {

        return num1 + num2;
    }

    /**
     * Aquí reutilizamos el método anterior y sobrecargando dicho método al recibir esta vez 3 valores del tipo entero.
     * @param num1 int
     * @param num2 int
     * @param num3 int
     * @return Devolvemos un valor de tipo entero.
     */
    public static int suma( int num1, int num2, int num3 ) {

        return suma( num1, suma( num2, num3 ) );
    }

    /**
     * Aquí damos el valor máximo entre 2 números del tipo entero.
     * @param num1 int
     * @param num2 int
     * @return Devolvemos un valor de tipo entero.
     */
    public static int max( int num1, int num2 ) {

        return num1 < num2 ? num2 : num1;
    }

    /**
     * Aquí damos el valor mínimo entre 2 números del tipo entero.
     * @param num1 int
     * @param num2 int
     * @return Devolvemos un valor de tipo entero.
     */
    public static int min( int num1, int num2 ) {

        return num1 < num2 ? num1 : num2;
    }

    /**
     * Aquí hacemos el máximo común divisor entre 2 números del tipo entero.
     * @param num1 int
     * @param num2 int
     * @return Devolvemos un valor de tipo entero.
     */
    public static int mcd( int num1, int num2 ) {

        if ( num2 == 0 ) {
            return num1;
        } else {
            return mcd( num2, num1 % num2 );
        }
    }

    /**
     * Aquí hacemos el mínimo común multiplo entre 2 números del tipo entero reutilizando el método MCD.
     * @param num1 int
     * @param num2 int
     * @return Devolvemos un valor de tipo entero.
     */
    public static int mcm( int num1, int num2 ) {

        return ( num1 / mcd( num1, num2 ) * num2 );
    }

    /**
     * Aquí reutilizamos el método bisiesto para dar los días y el mes de un año.
     * @param mes int
     * @param ano int
     * @return Devolvemos un vector del tipo String.
     */
    public static String[] diasMes( int mes, int ano ) {

        String[][] matriz = { { "31", "28", "31", "30", "31", "30", "31", "31", "30", "31", "30", "31" },
        { "Xaneiro", "Febreiro", "Marzo", "Abril", "Mayo", "Xuño", "Xullo", "Agosto", "Setembro", "Outubro", "Novembro", "Decembro" } };

        String[] resultado1 = { "29", "Febreiro" };
        String[] resultado2 = { matriz[ 0 ][ mes - 1 ], matriz[ 1 ][ mes - 1 ] };
        return ( bisiesto( ano ) && mes == 2 ? resultado1 : resultado2 );
    }

    /**
     * Aquí marcamos los días transcurridos desde 1980 a la fecha dada.
     * @param dia int
     * @param mes int
     * @param ano int
     * @return Devolvemos en un valor de tipo entero. 
     */
    public static int diasTranscurridos1980( int dia, int mes, int ano ) {

        int dias = 0;
        int[] vector = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        final int ANO_INICIO = 1980;
        for ( int i = ANO_INICIO; i < ano; i++ ) {
            if ( bisiesto( i ) == true ) {
                dias += 366;
            } else {
                dias += 365;
            }
        }
        for ( int i = 0; i < mes - 1; i++ ) {
            dias += vector[ i ];
        }

        dias += dia - 1;

        if ( bisiesto( ano ) == true && mes > 2 ) {
            dias += 1;
        }

        return dias;
    }

    /**
     * Aquí marcamos los días transcurridos entre dos fechas que sean válidas.
     * @param diaInicio int
     * @param mesInicio int
     * @param anoInicio int
     * @param diaFinal int
     * @param mesFinal int
     * @param anoFinal int
     * @return Devolvemos en un valor de tipo entero.
     */
    public static int diasEntreFechas( int diaInicio, int mesInicio, int anoInicio, int diaFinal, int mesFinal, int anoFinal ) {

        int dias = 0;
        final int NUM_MES_ANO = 12;
        int[] vector = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if ( diaInicio < 1 || mesInicio < 1 || diaFinal < 1 || mesFinal < 1 || diaInicio > 31 || diaFinal > 31 || mesInicio > 12 || mesFinal > 12 || anoFinal < anoInicio || anoFinal == anoInicio && mesFinal < mesInicio || anoFinal == anoInicio && mesFinal == mesInicio && diaFinal < diaInicio ) {
            return -1;
        } else {
            for ( int i = mesInicio - 1; i < NUM_MES_ANO; i++ ) {
                dias += vector[ i ];
            }
            if ( bisiesto( anoInicio ) == true && mesInicio <= 2 && diaInicio < 29 ) {
                dias += -diaInicio + 1;
            } else {
                dias += -diaInicio;
            }

            for ( int i = anoInicio + 1; i < anoFinal; i++ ) {
                if ( bisiesto( i ) == true ) {
                    dias += 366;
                } else {
                    dias += 365;
                }
            }

            for ( int i = 0; i < mesFinal - 1; i++ ) {
                dias += vector[ i ];
            }

            dias += diaFinal;

            if ( bisiesto( anoFinal ) == true && mesFinal > 2 ) {
                dias += 1;
            }
            return dias;
        }
    }

    /**
     * Aquí mostramos los segundos consumidos del día a traves de una hora completa válida dada.
     * @param hora nint
     * @param minutos int
     * @param segundos int
     * @return Devolvemos un valor del tipo entero.
     */
    public static int horaASegundos( int hora, int minutos, int segundos ) {

            return ( hora > 23 || hora < 0 || minutos > 59 || minutos < 0 || segundos > 59 || segundos < 0 ) ? -1 : hora * 3600 + minutos * 60 + segundos;
    }

    /**
     * Aquí completamos con 0 a la izquierda donde sea oportuno de una hora dada que sea válida.
     * @param hora int
     * @param minutos int
     * @param segundos int
     * @return Devolvemos un valor de tipo String.
     */
    public static String horaBonita( int hora, int minutos, int segundos ) {
        String resultado;
        if ( hora > 23 || hora < 0 || minutos > 59 || minutos < 0 || segundos > 59 || segundos < 0 ) {
            return "00:00:00";
        }
        resultado = ( hora < 10 ) ? "0" + hora : "" + hora;
        resultado += ( minutos < 10 ) ? "0" + minutos : "" + minutos;
        resultado += ( segundos < 10 ) ? "0" + segundos : "" + minutos;

        return resultado;
    }

} // fin de la clase Utilidades

