/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio 
 * @version 1.0 
 */
// Crear una matriz de enteros de 3 filas x 3 columnas.
// Pedir por teclado el valor de la primera fila primera columna, segunda fila segunda columna y tercera fila tercera columna.
// Los valores a la derecha de los introducidos por teclado se rellenarán con potencias sucesivas del número tecleado, comenzando por la potencia 2.
// Los valores a la izquierda de los introducidos por teclado se rellenarán con el número a su derecha desplazado dos bits a la derecha.

// Importación de librerías
import java.util.Scanner;

public class Ejercicio_Array_5_JoseManuelSabaris {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int[][] matriz = new int[ 3 ][ 3 ];
        // Salida de datos
        // Operativa
        Scanner entrada = new Scanner( System.in );
        int contador1, contador2, aux1, aux2;
        // Constantes
        // Inicialización
        
        
        // Entrada de datos
        System.out.println( "Por favor, introduzca el primer número" );
        matriz[ 0 ][ 0 ] = entrada.nextInt();
        System.out.println( "Por favor, introduzca el segundo número" );
        matriz[ 1 ][ 1 ] = entrada.nextInt();
        System.out.println( "Por favor, introduzca el tercer número" );
        matriz[ 2 ][ 2 ] = entrada.nextInt();
        
        // Resolución del programa
        for ( contador1 = 0; contador1 < matriz.length; contador1++ ) {
            aux2 = 2;
            aux1 = 0;
            for ( contador2 = 0; contador2 < matriz[ contador1 ].length; contador2++ ) {
                if ( contador1 == contador2 ) {
                    aux1 = matriz[ contador1 ][ contador2 ];
                }
                if ( contador1 != contador2 ) {
                    if ( contador2 > contador1 ) {
                        matriz[ contador1 ][ contador2 ] = ( int ) ( Math.pow( aux1, aux2 ) );
                        aux2++;
                    }
                    if ( contador2 < contador1 ) {
                        matriz[ contador1 ][ contador2 ] = ( matriz[ contador1 ][ contador2 + 1 ] >> 2 );
                    }
                }
                System.out.printf( "%2d ", matriz[ contador1 ][ contador2 ] );
            }
            System.out.println( "" );
        }
        // Salida de datos


    } // fin de main
    
} // fin de la clase Ejercicio_Array_5_JoseManuelSabaris

