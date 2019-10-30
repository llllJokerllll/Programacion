/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio Acepta El Reto 166
 * @version 1.0 
 */

// Importación de librerías
import java.util.Scanner;

public class AceptaElReto_166 {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int canalA, canalB;
        // Salida de datos
        int avanzar;
        int retroceder;
        // Operativa
        int contador;
        Scanner entrada = new Scanner( System.in );
        // Constantes
        
        // Inicialización
        
        // Entrada de datos y resolución del programa
        while ( true ) {
            avanzar = 0;
            retroceder = 0;
            
            //System.out.print( "Por favor, introduzca el canal origen: " );
            canalA = entrada.nextInt();
            //System.out.print( "Por favor, introduzca el canal destino: " );
            canalB = entrada.nextInt();
            
            if ( canalA == 0 && canalB == 0 ) break;
            
            if ( Math.abs( canalA - canalB ) < 49 ) {
                for ( contador = canalA; contador != canalB; contador++ ) {
                    avanzar += 1;
                }
                System.out.println( Math.abs( avanzar ) );
            } else if ( ( ( canalA - canalB  ) > 49 ) && ( canalA > canalB ) ) {
                for ( contador = canalA; contador != ( canalB + 99 ); contador-- ) {
                    retroceder += 1;
                }
                System.out.println( Math.abs( retroceder ) );
            } else {
                for ( contador = canalB; contador != ( canalA + 99 ); contador-- ) {
                    retroceder += 1;
                }
                System.out.println( Math.abs( retroceder ) );
            }
            
        }
        
        
    } // fin de método main
    
} // fin de la clase AceptaElReto_166