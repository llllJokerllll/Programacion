
/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio
 * @version 1.0
 */
//

// Importación de librerías
import java.util.Scanner;

public class Recusividad {

    public static void main( String[] args ) {

        int numero;

        Scanner entrada = new Scanner( System.in );

        do {
            System.out.print( "Introduzca numero > 0: " );
            numero = entrada.nextInt();
        } while ( numero < 0 );

        System.out.println();
        System.out.print( "Binario: " );
        decBin( numero );
        System.out.println();
    }

    public static void decBin( int n ) {
        if ( n < 2 ) {
            System.out.print( n );
            return;
        } else {
            decBin( n / 2 );
            System.out.print( n % 2 );
            return;
        }
    }
}
