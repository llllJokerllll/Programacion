/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Ejercicios_Programame en 12 dic. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio F_ToBeOrNotToBee
 * @version 1.0
 */

// Importación de librerías
import java.util.Scanner;

public class F_ToBeOrNotToBee {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int lado;
        // Salida de datos
        // Operativa
        // Constantes
        // Inicialización        
        // Creación de objetos
        Scanner entrada = new Scanner( System.in );
        
        // Entrada de datos y resolución del programa
        lado = entrada.nextInt();
        int[][] panalAbejas = new int[ lado ][ lado ];
        int[][] panalVelutina = new int[ lado ][ lado ];
            for ( int i = 0; i < lado; i++ ) {
                for ( int j = 0; j < lado; j++ ) {
                    panalAbejas[ i ][ j ] = entrada.nextInt();
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
        
        // Salida de datos


    } // fin de main
    
} // fin de la clase F_ToBeOrNotToBee

