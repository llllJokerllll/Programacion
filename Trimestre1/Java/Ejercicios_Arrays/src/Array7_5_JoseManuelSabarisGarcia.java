/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio 
 * @version 1.0 
 */

// Fig. 7.7: TirarDado.java
// Programa para tirar dados que utiliza arreglos en vez de switch.
import java.util.Random;

public class Array7_5_JoseManuelSabarisGarcia {

    public static void main( String[] args ) {
        
        Random numerosAleatorios = new Random(); // generador de números aleatorios
        int[] frecuencia = new int [ 7 ]; // arreglo de contadores de frecuencia
        
        // tira el dado 6,000,000 veces; usa el valor del dado como índice de frecuencia
        for ( int tiro = 1; tiro <= 6000000; tiro++ ) {
            ++frecuencia[ 1 + numerosAleatorios.nextInt( 6 ) ];
        }
        
        System.out.printf( "%s%10s\n", "Cara ", "Frecuencia" );
        
        // imprime el valor de cada elemento del arreglo
        for ( int cara = 1; cara < frecuencia.length; cara++ )
            System.out.printf( "%4d %10d\n", cara, frecuencia[ cara ] );


    } // fin de main
    
} // fin de la clase Array7_5_JoseManuelSabarisGarcia

