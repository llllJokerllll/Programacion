package com.acarballeira.exame.jose_manuel_sabaris.ejercicio3;

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio 3
 * @version 1.0
 */

// Importación de librerías
import java.util.Scanner;

public class Ejercicio3 {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int num;
        // Salida de datos
        // Operativa
        // Constantes
        char simbolo = '*';
        char espacio = ' ';
        // Inicialización        
        // Creación de objetos
        Scanner entrada = new Scanner( System.in );
        
        // Entrada de datos y resolución del programa
        do {
            System.out.print( "Por favor, introduzca un número entero: " );
            num = entrada.nextInt();
        } while ( num < 3 || num > 10 );
        
        for ( int i = 1; i <= num; i++ ) {
            for ( int j = 1; j <= num * 2; j++ ) {
                if ( j <= i ) {
                    System.out.print( simbolo );
                } else if ( j > num * 2 - i ){
                    System.out.print( simbolo );
                } else {
                    System.out.print( espacio );
                }
            }
            System.out.println( "" );
        }


    } // fin de main
    
} // fin de la clase Ejercicio3

