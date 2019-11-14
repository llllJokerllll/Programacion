/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio 
 * @version 1.0 
 */
// Programa Java que guarda en un array 10 números enteros que se leen por teclado.
// A continuación se recorre el array y calcula cuántos números son positivos, cuántos negativos y cuántos ceros.

// Importación de librerías
import java.util.Scanner;

public class Ejercicio_Array_6_JoseManuelSabaris {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int[] vector = new int[ 10 ];
        // Salida de datos
        int numPos, numNeg, numCero;
        // Operativa
        Scanner entrada = new Scanner( System.in );
        int contador;
        // Constantes
        // Inicialización
        numNeg = numPos = numCero = 0;
        
        // Entrada de datos y resolución del programa
        for ( contador = 0; contador < vector.length; contador++ ) {
            System.out.print( "Por favor, introduzca un número: " );
            vector[ contador ] = entrada.nextInt();
        }
        
        for ( int x : vector ) {
            if ( x < 0 ) {
                numNeg++;
            } else if ( x > 0 ) {
                numPos++;
            } else {
                numCero++;
            }
        }
        
        // Salida de datos
        System.out.println( "Hay: " + numPos + " positivos, " + numNeg + " negativos, " + numCero + " ceros.");

    } // fin de main
    
} // fin de la clase Ejercicio_Array_6_JoseManuelSabaris

