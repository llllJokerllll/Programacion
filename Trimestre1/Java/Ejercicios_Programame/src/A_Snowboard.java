/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Ejercicios_Programame en 11 dic. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio A_Snowboard
 * @version 1.0
 */

// Importación de librerías
import java.util.Scanner;

public class A_Snowboard {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int participantes;
        // Salida de datos
        // Operativa
        String[] competidores;
        // Constantes
        final int f = 3;
        // Inicialización        
        // Creación de objetos
        Scanner entrada = new Scanner( System.in );
        
        // Entrada de datos y resolución del programa
        participantes = entrada.nextInt();
        while ( participantes != 0 ) {
            competidores = new String[ participantes ];
            double[][] puntuaciones = new double[ f ][ participantes ];
            entrada.nextLine();
            
            for ( int i = 0; i < participantes; i++ ) {
                competidores[ i ] = entrada.nextLine();
            }
            
            for ( int i = 0; i < f; i++ ) {
                for ( int j = 0; j < participantes; j++ ) {
                    puntuaciones[ i ][ j ] = Double.parseDouble( entrada.next() );
                }
            }
            
            for ( String x : competidores ) {
                System.out.println( x );
            }
            
            for ( double[] x : puntuaciones ) {
                for ( double y : x ) {
                    System.out.print( y + " " );
                }
                System.out.println( "" );
            }
            participantes = entrada.nextInt();
            if( participantes != 0 ) {
                System.out.println( "" );
            }
        }
        


    } // fin de main
    
} // fin de la clase A_Snowboard

