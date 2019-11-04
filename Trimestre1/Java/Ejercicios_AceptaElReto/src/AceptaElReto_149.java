
/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio Ejercicio Acepta El Reto 149
 * @version 1.0
 */

// Importación de librerias
import java.util.Scanner;

public class AceptaElReto_149 {

    public static void main( String[] args ) {

        // Declaración de variables
        // Entrada de datos
        int nToros, vToros;
        // Salida de datos
        int vCorredor;
        // Operativa
        Scanner entrada = new Scanner( System.in );
        // Constantes
        // Inicialización

        // Entrada de datos, comprobación y salida
        while ( entrada.hasNext() ) {
            vCorredor = 0;
            nToros = entrada.nextInt();
            for ( int i = 0; i < nToros; i++ ) {
                vToros = entrada.nextInt();

                if ( vToros > vCorredor ) {
                    vCorredor = vToros;
                }
            }
            System.out.println( vCorredor );
        }
        entrada.close();


    } // fin de main

} // fin de la clase AceptaElReto_149
