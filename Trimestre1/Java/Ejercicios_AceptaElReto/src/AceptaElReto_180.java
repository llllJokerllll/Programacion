
/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio
 * @version 1.0
 */

// Importación de librerias
import java.util.Scanner;

public class AceptaElReto_180 {

    public static void main( String[] args ) {

        // Declaración de variables
        // Entrada de datos
        int casos, lado1, lado2, lado3;
        // Salida de datos
        // Operativa
        Scanner entrada = new Scanner( System.in );
        int contador, p1, p2;
        // Constantes
        // Inicialización

        // Entrada de datos, comprobación y salida
        casos = entrada.nextInt();

        for ( contador = 0; contador != casos; contador++ ) {
            lado1 = entrada.nextInt();
            lado2 = entrada.nextInt();
            lado3 = entrada.nextInt();

            if ( ( lado1 + lado2 > lado3 ) && ( lado1 + lado3 > lado2 ) && ( lado2 + lado3 > lado1 ) ) {

                if ( lado1 >= lado2 && lado1 >= lado3 ) {
                    p1 = lado1 * lado1;
                    p2 = lado2 * lado2 + lado3 * lado3;

                    if ( p1 < p2 ) {
                        System.out.println( "ACUTANGULO" );
                    } else if ( p1 > p2 ) {
                        System.out.println( "OBTUSANGULO" );
                    } else {
                        System.out.println( "RECTANGULO" );
                    }
                } else if ( lado2 >= lado1 && lado2 >= lado3 ) {
                    p1 = lado2 * lado2;
                    p2 = lado1 * lado1 + lado3 * lado3;

                    if ( p1 < p2 ) {
                        System.out.println( "ACUTANGULO" );
                    } else if ( p2 < p1 ) {
                        System.out.println( "OBTUSANGULO" );
                    } else {
                        System.out.println( "RECTANGULO" );
                    }
                } else if ( lado3 >= lado1 && lado3 >= lado2 ) {
                    p1 = lado3 * lado3;
                    p2 = lado1 * lado1 + lado2 * lado2;

                    if ( p1 < p2 ) {
                        System.out.println( "ACUTANGULO" );
                    } else if ( p2 < p1 ) {
                        System.out.println( "OBTUSANGULO" );
                    } else {
                        System.out.println( "RECTANGULO" );
                    }
                }

            } else {
                System.out.println( "IMPOSIBLE" );
            }
        }

    } // fin de main

} // fin de la clase AceptaElReto_180
