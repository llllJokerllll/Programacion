/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio Array 10
 * @version 1.0 
 */
// Hacer un programa que genere e imprima un cuadrado latino de orden 10 (matriz 10x10).
// Un cuadradado latino de orden n es aquel en el que la primera fila tiene los nº naturales del 1 a n,
// y cada una de las filas restantes de la matriz es igual a su fila superior desplazada una posicion hacia la derecha, 
// entrando por la izquierda el número que se pierde en el desplazamiento. Por ejemplo, un cuadrado latino de orden 5 es:

// Importación de librerías

public class Ejercicio_Array_10_JoseManuelSabaris {
        
    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int[][] cuadradoLatino = new int[ 10 ][ 10 ];
        // Salida de datos
        // Operativa
        int contador1, contador2, aux, aux2;
        // Constantes
        // Inicialización
        aux = 1;
        
        // Entrada de datos y resolución del programa
        for ( contador1 = 0; contador1 < cuadradoLatino.length; contador1++ ) {
            for ( contador2 = 0; contador2 < cuadradoLatino[ contador1 ].length; contador2++ ) {
                if ( contador2 == 0 ) {
                cuadradoLatino[ contador1 ][ contador2 ] = aux;    
                } else {
                    aux++;
                    if ( aux == 11 ) {
                    aux = 1;                   
                    }
                    cuadradoLatino[ contador1 ][ contador2 ] = aux;
                }    
            }
        }
        
        // Salida de datos
        for ( int[] x : cuadradoLatino ) {
            for ( int y : x ) {
                System.out.printf( "%2d  ", y );
            }
            System.out.println( "" );
        }

    } // fin de main
    
} // fin de la clase Ejercicio_Array_10_JoseManuelSabaris

