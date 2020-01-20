package com.acarballeira.exame.jose_manuel_sabaris.ejercicio4;

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio 4
 * @version 1.0
 */

// Importación de librerías
import java.util.Scanner;

public class Ejercicio4 {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int cantidad;
        // Salida de datos
        int moneda1, moneda2, billete5, billete10, billete20, billete50, billete100;
        // Operativa
        // Constantes
        int M1 = 1;
        int M2 = 2;
        int B5 = 5;
        int B10 = 10;
        int B20 = 20;
        int B50 = 50;
        int B100 = 100;
        // Inicialización
        moneda1 = moneda2 = billete5 = billete10 = billete20 = billete50 = billete100 = 0;
        // Creación de objetos
        Scanner entrada = new Scanner( System.in );
        
        // Entrada de datos y resolución del programa
        System.out.println( "Por favor, introduzca la cantidad de dinero a mostrar: " );
        cantidad = entrada.nextInt();
        
            billete100 = Math.floorDiv( cantidad, B100 );
            cantidad -= ( billete100 * 100 );
            billete50 = Math.floorDiv( cantidad, B50 );
            cantidad -= ( billete50 * 50 );
            billete20 = Math.floorDiv( cantidad, B20 );
            cantidad -= ( billete20 * 20 );
            billete10 = Math.floorDiv( cantidad, B10 );
            cantidad -= ( billete10 * 10 );
            billete5 = Math.floorDiv( cantidad, B5 );
            cantidad -= ( billete5 * 5 );
            moneda2 = Math.floorDiv( cantidad, M2 );
            cantidad -= ( moneda2 * 2 );
            moneda1 = Math.floorDiv( cantidad, M1 );
            cantidad -= ( moneda1 * 1 );

        
        // Salida de datos
        if ( billete100 == 1 ) {
            System.out.println( billete100 + " billete de 100 euros" );
        } else if ( billete100 > 1 ) {
            System.out.println( billete100 + " billetes de 100 euros" );
        }
        if ( billete50 == 1 ) {
            System.out.println( billete50 + " billete de 50 euros" );
        } else if ( billete50 > 1 ) {
            System.out.println( billete50 + " billetes de 50 euros" );
        }
        if ( billete20 == 1 ) {
            System.out.println( billete20 + " billete de 20 euros" );
        } else if ( billete20 > 1 ) {
            System.out.println( billete20 + " billetes de 20 euros" );
        }
        if ( billete10 == 1 ) {
            System.out.println( billete10 + " billete de 10 euros" );
        } else if ( billete10 > 1 ) {
            System.out.println( billete10 + " billetes de 10 euros" );
        }
        if ( billete5 == 1 ) {
            System.out.println( billete5 + " billete de 5 euros" );
        } else if ( billete5 > 1 ) {
            System.out.println( billete5 + " billetes de 5 euros" );
        }
        if ( moneda2 == 1 ) {
            System.out.println( moneda2 + " moneda de 2 euros" );
        } else if ( moneda2 > 1 ) {
            System.out.println( moneda2 + " monedas de 2 euros" );
        }
        if ( moneda1 == 1 ) {
            System.out.println( moneda1 + " moneda de 1 euro" );
        } else if ( moneda1 > 1 ) {
            System.out.println( moneda1 + " monedas de 1 euro" );
        }

    } // fin de main
    
} // fin de la clase Ejercicio4

