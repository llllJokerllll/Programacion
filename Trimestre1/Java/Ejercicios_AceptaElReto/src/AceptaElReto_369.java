/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio Acepta El Reto 369
 * @version 1.0 
 */

// Importación de librerias
import java.util.Scanner;

public class AceptaElReto_369 {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int numero;
        // Salida de datos
        long resultado;
        // Operativa
        Scanner entrada = new Scanner( System.in );
        int contador;
        // Constantes
        // Inicialización

        
        // Entrada de datos, comprobación y salida
        while ( true ) {
            numero = entrada.nextInt();
            
            if ( numero == 0 ) break;
            
            for ( contador = 0; contador != numero; contador++ ) {
                System.out.print( "1" );
            }
            System.out.println( "" );
        }     
        
    } // fin de main
    
} // fin de la clase AceptaElReto_369
