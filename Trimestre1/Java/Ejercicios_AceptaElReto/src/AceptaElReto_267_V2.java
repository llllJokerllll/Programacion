
/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio Acepta El Reto 267
 * @version 1.0
 */

// Importación de librerias
import java.util.Scanner;

public class AceptaElReto_267_V2 {

    public static void main( String[] args ) {

        // Declaración de variables
        // Entrada de datos
        int lado1, lado2, disMaxima;
        // Salida de datos
        int resultado;
        // Operativa
        Scanner entrada = new Scanner( System.in );
        // Constantes
        // Inicialización

        // Entrada de datos ,comprobación y salida
        while ( true ) {
            lado1 = entrada.nextInt();
            lado2 = entrada.nextInt();
            disMaxima = entrada.nextInt();

            if ( lado1 == 0 && lado2 == 0 && disMaxima == 0 ) {
                break;
            }

            if ( lado1 <= disMaxima && lado2 <= disMaxima ) {
                System.out.println( 4 );
            } else if ( lado1 <= disMaxima && lado2 > disMaxima ) {
                resultado = 2 + ( lado2 / disMaxima ) * 2;
                if ( ( lado2 / disMaxima ) != 0 ) {
                    resultado += 2;
                }
                if ( ( lado2 % disMaxima ) == 0 ) {
                    resultado -= 2;
                }
                System.out.println( resultado );
            } else if ( lado1 > disMaxima && lado2 <= disMaxima ) {
                resultado = 2 + ( lado1 / disMaxima ) * 2;
                if ( ( lado1 / disMaxima ) != 0 ) {
                    resultado += 2;
                }
                if ( ( lado1 % disMaxima ) == 0 ) {
                    resultado -= 2;
                }
                System.out.println( resultado );
            } else if ( lado1 > disMaxima && lado2 > disMaxima ) {
                resultado = ( lado1 / disMaxima ) * 2 + ( lado2 / disMaxima ) * 2;
                if ( ( lado1 / disMaxima ) != 0 ) {
                    resultado += 2;
                }
                if ( ( lado1 % disMaxima ) == 0 ) {
                    resultado -= 2;
                }
                if ( ( lado2 / disMaxima ) != 0 ) {
                    resultado += 2;
                }
                if ( ( lado2 % disMaxima ) == 0 ) {
                    resultado -= 2;
                }
                System.out.println( resultado );
            }

        }

    } // fin de main

} // fin de la clase AceptaElReto_267_V2

