package Trimestre1;

/**
 * @author Jose Manuel Sabarís Título: Ejercicio
 * @version 1.0
 */
// Crear un algoritmo donde nos daran un número por teclado y lo descomponemos en factores.
// Importación de librerías
import java.util.Scanner;

public class Ejercicio_Factorial_JoseManuelSabaris {

    static int factorial( int numero ) {
        
        if ( numero <= 1 ) {
            return 1;
        } else {
            return numero * factorial( numero - 1 );
        }
    }

    public static void main( String args[] ) {

        int numero;

        Scanner entrada = new Scanner( System.in );

        numero = entrada.nextInt();

        System.out.println( factorial( numero ) );
    }

} // fin de la clase Ejercicio_Factorial_JoseManuelSabaris

