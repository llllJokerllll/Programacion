/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio 
 * @version 1.0 
 */

// Importación de librerias
import java.util.Scanner;

public class AceptaElReto_190 {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        long numerador, denominador;
        // Salida de datos
        long resultado;
        // Operativa
        Scanner entrada = new Scanner( System.in );
        long fNumerador, fDenominador;
        long contador;
        // Constantes
        // Inicialización

        
        // Entrada de datos, comprobación y salida
        while ( true ) {
            numerador = entrada.nextInt();
            denominador = entrada.nextInt();
            if ( numerador < denominador ) break;
            
//            for ( contador = ( numerador - 1 ); contador != 1; contador-- ) {
//                numerador *= contador;
//            }
//            for ( contador = ( denominador - 1 ); contador != 1; contador-- ) {
//                denominador *= contador;
//            }
            resultado = 1;
            for ( contador = ( denominador + 1 ); contador <= numerador; contador ++ ) {
                resultado *= contador;
            }

            //resultado = numerador / denominador;
            System.out.println( resultado );
        }
        
    } // fin de main
    
} // fin de la clase AceptaElReto_190
