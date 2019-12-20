/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Examen_Distancia1_2018 en 20 dic. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

package examen_distancia1_2018;

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio 
 * @version 1.0
 */

// Importación de librerías
import java.util.Scanner;

public class Ejercicio_2 {
    
    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int num;
        // Salida de datos
        // Operativa
        // Constantes
        // Inicialización        
        // Creación de objetos
        Scanner entrada = new Scanner( System.in );
        
        // Entrada de datos y resolución del programa
        System.out.print( "Introduce un número entero comprendido entre 3 y 40: " );
        num = entrada.nextInt();
            
        while ( num < 3 || num > 40 ) {
            System.out.print( "Número fuera de rango, introduce otro: " );
            num = entrada.nextInt();
        }
        
        // Salida de datos
        for ( int i = 1; i <= num; i++ ) {
            for ( int j = 0; j < num; j++ ) {
                if ( j < num - i ) {
                    System.out.print( "." );
                } else {
                    System.out.print( "A" );
                }
            }
            System.out.println( "" );
        }
        if ( num % 2 != 0 ) {
            for ( int i = num / 2 + 1; i > 0; i-- ) {
                for ( int j = 0; j < num; j++ ) {
                    if ( j < num - i ) {
                        System.out.print( "." );
                    } else {
                        System.out.print( "A" );
                    }
                }
            System.out.println( "" );
            }
        } else {
            for ( int i = num / 2; i > 0; i-- ) {
                for ( int j = 0; j < num; j++ ) {
                    if ( j < num - i ) {
                        System.out.print( "." );
                    } else {
                        System.out.print( "A" );
                    }
                }
                System.out.println( "" );
            }
        }

    } // fin de main
    
} // fin de la clase Ejercicio_2

