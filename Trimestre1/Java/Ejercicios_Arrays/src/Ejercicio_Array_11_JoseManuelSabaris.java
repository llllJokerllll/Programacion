/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio Array 11
 * @version 1.0 
 */
// Programa que asigne números a una matriz de orden 4x5 comprendidos entre 1 y 10.
// El programa tiene que escribir la suma de los elementos de cada fila y la suma de los números
// que son pares de cada columna.


// Importación de librerías
import java.util.Random;

public class Ejercicio_Array_11_JoseManuelSabaris {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int[][] matriz = new int[ 4 ][ 5 ];
        // Salida de datos
        // Operativa
        Random numeroAzar = new Random();
        int contador1, contador2;
        // Constantes
        // Inicialización
        
        
        // Entrada de datos y resolución del programa
        for ( contador1 = 0; contador1 < matriz.length; contador1++ ) {
            for ( contador2 = 0; contador2 < matriz[ contador1 ].length; contador2++ ) {
                matriz[ contador1 ][ contador2 ] = numeroAzar.nextInt(10) + 1;
            }
        }
        
        // Salida de datos


    } // fin de main
    
} // fin de la clase Ejercicio_Array_11_JoseManuelSabaris

