/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio 
 * @version 1.0 
 */
// Programa Java que llene un array con 10 números enteros que se leen por teclado.
//  A continuación calcula y muestra la media de los valores positivos y la de los valores negativos del array.

// Importación de librerías
import java.util.Scanner;

public class Ejercicio_Array_7_JoseManuelSabaris {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int[] vector = new int[ 10 ];
        // Salida de datos
        double promedioPos, promedioNeg;
        // Operativa
        Scanner entrada = new Scanner( System.in );
        int contador, aux1, aux2;
        // Constantes
        // Inicialización
        promedioPos = promedioNeg = 0;
        aux1 = aux2 = 0;
        
        // Entrada de datos y resolución del programa
        for ( contador = 0; contador < vector.length; contador++ ) {
            System.out.print( "Por favor, introduzca un número: " );
            vector[ contador ] = entrada.nextInt();
        }
        
        for ( int x : vector ) {
            if ( x < 0 ) {
                promedioNeg += x;
                aux1++;
            } else if ( x > 0 ) {
                promedioPos += x;
                aux2++;
            }
        }    
        promedioNeg /= aux1;
        promedioPos /= aux2;
        
        // Salida de datos
        System.out.println( "La media de los valores positivos es: " + promedioPos + ", y los negativos es: " + promedioNeg );

    } // fin de main
    
} // fin de la clase Ejercicio_Array_7_JoseManuelSabaris

