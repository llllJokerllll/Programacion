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

public class Ejercicio_4 {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int num;
        // Salida de datos
        // Operativa
        int[] vector = { 16, 12 , 8, 4 };
        // Constantes
        final int TOTAL_NUMS;
        // Inicialización       
        TOTAL_NUMS = 4;
        // Creación de objetos
        Scanner entrada = new Scanner( System.in );
        
        // Entrada de datos y resolución del programa
        System.out.println( "Por favor, introduza un número entero" );
        num = entrada.nextInt();
        
        // Salida de datos
        for ( int i = 0; i < TOTAL_NUMS; i++ ) {
            if ( vector[ i ] < num ) {
                for ( int j = num; j >= vector[ i ]; j-- ) {
                    System.out.print( j + ", " );
                }
                System.out.print( "\b\b\n" );
            } else {
                for ( int j = vector[ i ]; j >= num; j-- ) {
                    System.out.print( j + ", " );
                }
                System.out.print( "\b\b\n" );
            }
        }

    } // fin de main
    
} // fin de la clase Ejercicio_4

