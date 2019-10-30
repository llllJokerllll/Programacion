/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio Acepta El Reto 166 V2
 * @version 1.0 
 */

// Importación de librerías
import java.util.Scanner;

public class AceptaElReto_166_V2 {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int canalA, canalB;
        // Salida de datos
        int resultado;
        // Operativa
        Scanner entrada = new Scanner( System.in );
        int solucionA, solucionB;
        // Constantes
        
        // Inicialización
        
        // Entrada de datos y resolución del programa
        while ( true ) {
            
            //System.out.print( "Por favor, introduzca el canal origen: " );
            canalA = entrada.nextInt();
            //System.out.print( "Por favor, introduzca el canal destino: " );
            canalB = entrada.nextInt();
            
            if ( canalA == 0 && canalB == 0 ) break;
            
            if ( canalB > canalA ) {
                solucionA = canalB - canalA;
                solucionB = 99 - canalB + canalA;
            } else {
                solucionA = canalA - canalB;
                solucionB = 99 - canalA + canalB;
            }
            
            resultado = Math.min( solucionA, solucionB );
            System.out.println( resultado );
            
        }
        
        
    } // fin de método main
    
} // fin de la clase AceptaElReto_166