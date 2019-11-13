/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio 
 * @version 1.0 
 */

// Importación de librerias
import java.util.Scanner;

public class AceptaElReto_471 {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int casos, gradosInicio, gradosPinchazo; 
        // Salida de datos
        // Operativa
        Scanner entrada = new Scanner( System.in );
        int contador;
        // Constantes
        // Inicialización

        
        // Entrada de datos, comprobación y salida
        casos = entrada.nextShort();
        
        for ( contador = 0; contador < casos; contador++ ) {
            gradosInicio = entrada.nextShort();
            gradosPinchazo = entrada.nextShort();
            
            if ( Math.abs(gradosInicio - gradosPinchazo) < 180 ) {
                System.out.println( "ASCENDENTE" );
            } else if ( Math.abs(gradosInicio - gradosPinchazo) > 180 ) {
                System.out.println( "DESCENDENTE" );
            } else {
                System.out.println( "DA IGUAL" );
            }
        }
     
        
    } // fin de main
    
} // fin de la clase AceptaElReto_471
