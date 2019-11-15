/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio Array 9
 * @version 1.0 
 */
// Programa que cree un array de 10x10 enteros y lo rellene con valores introducidos por
// teclado, a los que agregará posteriormente, el valor de la suma de todos los elementos.

// Importación de librerías
import java.util.Scanner;

public class Ejercicio_Array_9_JoseManuelSabaris {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int[][] matriz = new int[ 10 ][ 10 ];
        // Salida de datos
        // Operativa
        Scanner entrada = new Scanner( System.in );
        int contador1, contador2, suma;
        // Constantes
        // Inicialización
        suma = 0;
        
        // Entrada de datos y resolución del programa
        for ( contador1 = 0; contador1 < matriz.length; contador1++ ) {
            for( contador2 = 0; contador2 < matriz[ contador1 ].length; contador2 ++ ) {
                matriz[ contador1 ][ contador2 ] = entrada.nextInt();
                suma += matriz[ contador1 ][ contador2 ];
            }
        }
        
        for ( contador1 = 0; contador1 < matriz.length; contador1++ ) {
            for( contador2 = 0; contador2 < matriz[ contador1 ].length; contador2 ++ ) {
                matriz[ contador1 ][ contador2 ] += suma; 
            }
        }
        
        // Salida de datos
        for ( int[] x : matriz ) {
            for ( int y : x ) {
            System.out.print( y + " " );    
            }
            System.out.println( "" );
        }

    } // fin de main
    
} // fin de la clase Ejercicio_Array_9_JoseManuelSabaris

