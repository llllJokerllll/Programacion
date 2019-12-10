/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio Array 9
 * @version 1.0 
 */
// Programa que cree un array de 10x10 enteros y lo rellene con valores introducidos por
// teclado, a los que agregará posteriormente, el valor de la suma de todos los elementos.

// Importación de librerías
import java.util.Scanner;

public class OB_9_ArrayValorySuma_JMS {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int f, c;
        // Salida de datos
        int[][] matriz;
        // Operativa
        int suma;
        // Constantes
        // Inicialización
        f = c = 3;
        
        // Entrada de datos y resolución del programa
        matriz = crearMatriz( f, c );
        imprimirResultado( matriz );
        matriz = matrizAcumulada( matriz, sumaMatriz( matriz ) );
        imprimirResultado( matriz );


    } // fin de main
    
    static int[][] crearMatriz( int f, int c ) {
        
        int[][] matriz = new int[ f ][ c ];
        Scanner entrada = new Scanner( System.in );
        
        for ( int i = 0; i < matriz.length; i++ ) {
            for( int j = 0; j < matriz[ i ].length; j ++ ) {
                matriz[ i ][ j ] = entrada.nextInt();
            }
        }
        return matriz;
    }
    
    static int sumaMatriz( int[][] matriz ) {
        
        int acum = 0;
        for ( int[] x : matriz ) {
            for ( int y : x ) {
                acum += y;
            }
        }
        return acum;
    }
    
    static int[][] matrizAcumulada( int[][] matriz, int acum ) {
        
        for ( int i = 0; i < matriz.length; i++ ) {
            for( int j = 0; j < matriz[ i ].length; j ++ ) {
                matriz[ i ][ j ] += acum;
            }
        }
        return matriz;
    }
    
    static void imprimirResultado( int[][] matriz ) {
        
        for ( int[] x : matriz ) {
            for ( int y : x ) {
            System.out.print( y + " " );    
            }
            System.out.println( "" );
        }
    }
    
} // fin de la clase OB_9_ArrayValorySuma_JMS

