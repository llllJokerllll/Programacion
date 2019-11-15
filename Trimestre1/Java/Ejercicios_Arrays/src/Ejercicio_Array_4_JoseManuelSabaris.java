/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio Array 4
 * @version 1.0 
 */
// Programa en el que se declare una matriz de dimensiones 5 x 8 (5 filas y 8 columnas) de datos de tipo entero.
// Asignarle a los elementos de la matriz valores generados al azar y comprendidos entre 20 y 40.
// Calcular cuál es el elemento mas pequeño y mayor de la tabla.
// Escribir también la tabla para comprobar los resultados.

// Importación de librerías
import java.util.Random;

public class Ejercicio_Array_4_JoseManuelSabaris {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int[][] matriz = new int[ 5 ][ 8 ];
        // Salida de datos
        int eMenor, eMayor;
        int filaMenor, columnaMenor, filaMayor, columnaMayor;
        // Operativa
        Random valorAzar = new Random();
        int contador1, contador2;
        // Constantes
        // Inicialización
        eMenor = 99;
        eMayor = 0;
        filaMenor = columnaMenor = filaMayor = columnaMayor = 0;
        
        
        // Entrada de datos y resolución del programa
        for ( contador1 = 0; contador1 < matriz.length; contador1++ ) {
            for ( contador2 = 0; contador2 < matriz[ contador1 ].length; contador2++ ) {
                matriz[ contador1 ][ contador2 ] = valorAzar.nextInt(21) + 20;
                System.out.printf( "%2d  ", matriz[ contador1 ][ contador2 ] );
                if ( eMenor > matriz[ contador1 ][ contador2 ] ) {
                    eMenor = matriz[ contador1 ][ contador2 ];
                    filaMenor = contador1 + 1;
                    columnaMenor = contador2 + 1;
                }
                if ( eMayor < matriz[ contador1 ][ contador2 ] ) {
                    eMayor = matriz[ contador1 ][ contador2 ];
                    filaMayor = contador1 + 1;
                    columnaMayor = contador2 + 1;
                }
                
            }
            System.out.println( "" );
        }
        
        // Salida
        System.out.printf( "Elemento menor: %4d\t Fila: %2d Columna: %2d\n", eMenor, filaMenor, columnaMenor );
        System.out.printf( "Elemento mayor: %4d\t Fila: %2d Columna: %2d\n", eMayor, filaMayor, columnaMayor );
        
    } // fin de main
    
} // fin de la clase Ejercicio_Array_4_JoseManuelSabaris

