
/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio
 * @version 1.0
 */
// Escribir un programa que pida por teclado un número n, forzando a que este comprendido entre 3 y 15 y además sea impar.
// Y a continuación escribir un gráfico con * para formar un rombo con base n.

// Importación de librerías
import java.util.Scanner;

public class Bucles_Repaso_11_JoseManuelSabaris {

    public static void main( String[] args ) {

        // Declaración de variables
        // Entrada de datos
        int numero;
        // Salida de datos
        // Operativa
        Scanner entrada = new Scanner( System.in );
        int contador1, contador2, contador3;
        // Constantes
        // Inicialización

        // Creación de objetos
        // Entrada de datos y resolución del programa
        do {
            System.out.print( "Por favor, introduzca un número impar entre 3 y 15: " );
            numero = entrada.nextInt();
        } while ( numero < 3 && numero > 15 && numero % 2 == 0 );

        for ( contador1 = 1; contador1 <= numero; contador1 += 2 ) {
            for ( contador3 = 1; contador3 <= numero - contador1; contador3 += 2 ) {
                System.out.print( " " );
            }
            for ( contador2 = 1; contador2 <= contador1; contador2++ ) {
                if ( contador2 == 1 || contador2 == contador1 ) {
                    System.out.print( "*" );
                } else {
                    System.out.print( " " );
                }
            }
            System.out.println( "" );
        }
        for ( contador1 = ( numero - 2 ); contador1 >= 1; contador1 -= 2 ) {
            for ( contador3 = 1; contador3 <= numero - contador1; contador3 += 2 ) {
                System.out.print( " " );
            }
            for ( contador2 = contador1; contador2 >= 1; contador2-- ) {
                if ( contador2 == contador1 || contador2 == 1 ) {
                    System.out.print( "*" );
                } else {
                    System.out.print( " " );
                }
            }
            System.out.println( "" );
        }
        // Salida de datos

    } // fin de main

} // fin de la clase Bucles_Repaso_11_JoseManuelSabaris

