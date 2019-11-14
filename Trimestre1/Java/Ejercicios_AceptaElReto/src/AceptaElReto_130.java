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
        int res1, res2;
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
            
            res1 = Math.abs( x1 - x2 ) + Math.abs( y1 - y2 );
            res2 = Math.abs( x1 - x2 );
            
            if ( x1 < tamano && y1 < tamano && x2 < tamano && y2 < tamano && res1 % 2 == 0 ) {
                if ( x1 != x2 && y1 != y2 && ( res2 + y1 == y2 || y1 - res2 == y2 ) ) {
                    System.out.println( "1" );
                } else if ( x1 == x2 && y1 == y2 ) {
                    System.out.println( "0" );
                } else {
                    System.out.println( "2" );
                }
            } else {
                System.out.println( "IMPOSIBLE" );
            }
        }
        
    } // fin de main
    
} // fin de la clase AceptaElReto_130
