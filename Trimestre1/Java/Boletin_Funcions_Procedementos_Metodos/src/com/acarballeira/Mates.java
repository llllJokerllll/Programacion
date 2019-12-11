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
     * 
     * @param num
     * @return 
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
     * 
     * @param num
     * @return 
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
     * 
     * @param num
     * @return 
     */
    public static int digitos( int num ) {
        
        String numString = Integer.toString( num );
        
        return numString.length();
    }
    
    /**
     * 
     * @param num 
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
        System.out.println( "El resultado usando StringBuilder es: " + volteaL );
    }
    
    /**
     * 
     * @param digito
     * @param num
     * @return 
     */
    public static int posicionDeDigito( int digito, int num ) {
        
        String numString = Integer.toString( num );
        String digitoString = Integer.toString( digito );
        
        return numString.indexOf( digitoString );
    }
    
    /**
     * 
     * @param digitos
     * @param num 
     */
    public static void quitaPorDetras( int digitos, int num ) {
        
        String numString = Integer.toString( num );
        
        System.out.println( "El resultado usando String es: " + numString.substring( 0, numString.length() - digitos ) );
        
        int numero = num;
        for ( int i = 0; i < digitos; i++ ) {
            numero /= 10;
        }
        System.out.println( "El resultado usando Numeros es: " + numero );
    }
    
    /**
     * 
     * @param digitos
     * @param num 
     */
    public static void quitaPorDelante( int digitos, int num ) {
        
        String numString = Integer.toString( num );
        
        System.out.println( "El resultado usando String es: " + numString.substring( digitos, numString.length() ) );   
    }
    
    /**
     * 
     * @param digito
     * @param num
     * @return 
     */
    public static int pegaPorDetras( int digito, int num ) {
        
        return num * 10 + digito;
    }
    
    /**
     * 
     * @param digito
     * @param num
     * @return 
     */
    public static int pegaPorDelante( int digito, int num ) {
        
        String numString = Integer.toString( num );
        return digito * ( int ) Math.pow( 10, numString.length() ) + num;
    }
    
    public static final double E = 2.7182818284590452354;
    public static final double PI = 3.14159265358979323846;

    /**
     * 
     * @return 
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

