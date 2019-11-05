
/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio
 * @version 1.0
 */

// Importación de librerias
import java.util.Scanner;

public class AceptaElReto_122 {

    public static void main( String[] args ) {

        // Declaración de variables
        // Entrada de datos
        int num1, num2;
        // Salida de datos
        int kM, planas;
        boolean comen;
        // Operativa
        Scanner entrada = new Scanner( System.in );
        int pos, auxKm, auxPlanas;
        boolean first;
        // Constantes
        // Inicialización

        // Entrada de datos, comprobación y salida
        while ( true ) {

            comen = first = false;
            pos = kM = planas = auxKm = 0;
            auxPlanas = -1;

            num1 = entrada.nextInt();
            if ( num1 == -1 ) {
                break;
            }

            while ( true ) {
                num2 = entrada.nextInt();
                if ( num2 == -1 ) {
                    break;
                }
                if ( num1 == num2 ) {
                    comen = true;
                    if ( !first ) {
                        auxPlanas = 0;
                        first = true;
                        auxKm = pos;
                    }
                    auxPlanas++;
                    if ( auxPlanas > planas ) {
                        planas = auxPlanas;
                        kM = auxKm;
                    }
                } else {
                    first = false;
                }
                num1 = num2;
                pos++;
            }

            if ( !comen ) {
                System.out.println( "HOY NO COMEN" );
            } else {
                System.out.println( kM + " " + planas );
            }
        }

    } // fin de main

} // fin de la clase AceptaElReto_122
