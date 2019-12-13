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
import java.util.Scanner;

public class Mates {

    /**
     * Aquí mostramos si un número entero dado es primo o no
     * @param num int
     * @return Devolvemos un valor del tipo boolean.
     */
    public static boolean esPrimo( int num ) {
        
        int contador1 = 2;
        boolean primo = true;
        
        while ( ( primo ) && ( contador1 != num ) ) {
            if ( num % contador1 == 0 ) {
                primo = false;
            }
            contador1++;
        }
        return primo;
    }
    
    /**
     * Aquí reutilizamos el método anterior y devolvemos el siguiente número primo que tenga el número dado.
     * @param num int
     * @return Devolvemos un valor del tipo entero.
     */
    public static int siguientePrimo( int num ) {
        
        for ( int i = num + 1; i > num; i++ ) {
            if ( esPrimo( i ) ) {
                return i;
            }
        }
        return 0;
    }
    
    /**
     * Aquí devolvemos el tamaño de dígitos que tiene un entero.
     * @param num int
     * @return Devolvemos un valor del tipo entero.
     */
    public static int digitos( int num ) {
        
        return Integer.toString( num ).length();
    }
    
    /**
     * Aquí mostramos de 3 formas distintas como darle la vuelta a un valor de tipo entero. Métodos con StringBuilder(insert y reverse) y usando solo operaciones matemáticas.
     * @param num int
     */
    public static void voltea( int num ) {
        
        int aux = 0;
        int numero = num, volteaL = 0, resto;
        String numString = Integer.toString( num );
        StringBuilder volteaS = new StringBuilder("");
        
        for ( int i = numString.length() - 1; i >= 0; i-- ) {
            volteaS.insert( aux, numString.charAt( i ) );
            aux++;
        }
        System.out.println( "El resultado usando el método insert es: " + volteaS );
        
        StringBuilder volteaS2 = new StringBuilder( numString );
        volteaS2.reverse().toString();
        System.out.println( "El resultado usando StringBuilder es: " + volteaS2 );
    
        while ( numero > 0 ) {
            resto = numero % 10;
            volteaL = volteaL * 10 + resto;
            numero /= 10;
        }
        System.out.println( "El resultado usando operaciones matemáticas es: " + volteaL );
    }
    
    /**
     * Aquí damos la posición de un dígito dentro de un número del tipo entero.
     * @param digito int
     * @param num int
     * @return Devolvemos un valor de tipo entero.
     */
    public static int posicionDeDigito( int digito, int num ) {
        
        return Integer.toString( num ).indexOf( Integer.toString( digito ) );
    }
    
    /**
     * Aquí mostramos como quitar dígitos por detrás a un número de tipo entero con dos métodos, Substring y operaciones matemáticas.
     * @param digitos int
     * @param num int
     */
    public static void quitaPorDetras( int digitos, int num ) {
        
        String numString = Integer.toString( num );
        
        System.out.println( "El resultado usando String es: " + numString.substring( 0, numString.length() - digitos ) );
        
            num /= Math.pow( 10, digitos );
      
        System.out.println( "El resultado usando Numeros es: " + num );
    }
    
    /**
     * Aquí quitamos los digitos por delante de un número de tipo entero y devolvemos un valor del mismo tipo.
     * @param digitos int
     * @param num int
     * @return Devolvemos un valor del tipo entero. 
     */
    public static int quitaPorDelante( int digitos, int num ) {
                
        return  Integer.parseInt(Integer.toString( num ).substring( digitos, Integer.toString( num ).length() ));   
    }
    
    /**
     * Aquí pegamos un dígito por detras de un número entero dado.
     * @param digito
     * @param num
     * @return Devolvemos un valor de tipo entero.
     */
    public static int pegaPorDetras( int digito, int num ) {
        
        return num * 10 + digito;
    }
    
    /**
     * Aquí pegamos un dígito por delante de un número entero dado.
     * @param digito
     * @param num
     * @return Devolvemos un valor de tipo entero.
     */
    public static int pegaPorDelante( int digito, int num ) {
        
        return ( digito * ( int ) Math.pow( 10, Integer.toString( num ).length() ) + num );
    }
    
    public static final double E = 2.7182818284590452354;
    public static final double PI = 3.14159265358979323846;

    /**
     * Aquí mostramos cual es el de máximo valor de una serie de valores introducidos por teclado hasta que meta un 0, eeutilizando el método max de la clase Mates.
     * @return Devolvemos un valor de tipo entero.
     */
    public static int numeroMaximo() {
        
        int aux = -999999;
        Scanner entrada = new Scanner( System.in );
        int num = entrada.nextInt();
        while ( num != 0 ) {
            aux = Utilidades.max( aux, num );
            num = entrada.nextInt();
        }
        return aux;
    }
    
} // fin de la clase Mates

