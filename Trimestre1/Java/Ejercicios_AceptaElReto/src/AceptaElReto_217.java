/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio Acepta El Reto 217
 * @version 1.0 
 */

// Importación de librerias
import java.util.Scanner;

public class AceptaElReto_217 {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        short numVivienda;
        // Salida de datos
        // Operativa
        Scanner entrada = new Scanner( System.in );
        // Constantes
        // Inicialización

        
        // Entrada de datos y comprobación
        while ( true ) {
            numVivienda = entrada.nextShort();
            if ( numVivienda == 0 ) {
                break;
            } else {
                if ( numVivienda % 2 == 0 ) {
                    System.out.println( "DERECHA" );
                } else {
                    System.out.println( "IZQUIERDA" );
                }
            }
        }   
        
    } // fin de main
    
} // fin de la clase AceptaElReto_217
