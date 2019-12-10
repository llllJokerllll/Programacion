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

public class OB_10_CuadradoLatinoOrden10_JMS {
        
    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        // Salida de datos
        int[][] cuadradoLatino;
        // Operativa
        int f, c;
        // Constantes
        // Inicialización
        f = c = 10;
        // Entrada de datos y resolución del programa
        imprimir( cuadradoLatino = crearCuadradoLat( f, c ) );
        

    } // fin de main
    
    static int[][] crearCuadradoLat( int f, int c ) {
        
        int aux = 1;
        int[][] cuadradoLatino = new int[ f ][ c ];
        for ( int i = 0; i < cuadradoLatino.length; i++ ) {
            for ( int j = 0; j < cuadradoLatino[ i ].length; j++ ) {
                if ( j == 0 ) {
                cuadradoLatino[ i ][ j ] = aux;    
                } else {
                    aux++;
                    if ( aux == 11 ) {
                    aux = 1;                   
                    }
                    cuadradoLatino[ i ][ j ] = aux;
                }    
            }
        }
        return cuadradoLatino;
    }
    
    static void imprimir( int[][] cuadradoLatino ) {
        
        for ( int[] x : cuadradoLatino ) {
            for ( int y : x ) {
                System.out.printf( "%2d  ", y );
            }
            System.out.println( "" );
        }
    }
} // fin de la clase OB_10_CuadradoLatinoOrden10_JMS

