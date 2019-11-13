/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio 
 * @version 1.0 
 */

// Importación de librerias
import java.util.Scanner;

public class AceptaElReto_130 {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int tamano, x1, y1, x2, y2;
        // Salida de datos
        int movimientos;
        // Operativa
        Scanner entrada = new Scanner( System.in );
        // Constantes
        // Inicialización

        
        // Entrada de datos, comprobación y salida
        while ( true ) {
            tamano = entrada.nextInt();
            if ( tamano == 0 ) break;
            x1 = entrada.nextInt();
            y1 = entrada.nextInt();
            x2 = entrada.nextInt();
            y2 = entrada.nextInt();
            
            movimientos = ( x2 + y2 ) / ( x1 + y1 );
            
            if ( movimientos == 0 ) {
                System.out.println( "IMPOSIBLE" );
            } else {
                System.out.println( movimientos );
            }
        }
        
    } // fin de main
    
} // fin de la clase AceptaElReto_130
