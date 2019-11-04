/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio 
 * @version 1.0 
 */

// Importación de librerías
import java.util.Scanner;

public class AceptaElReto_241 {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int casos, nHojas;
        // Salida de datos
        // Operativa
        Scanner entrada = new Scanner( System.in );
        int contador;
        // Constantes
        // Inicialización
        
        // Creación de objetos
        
        // Entrada de datos, resolución del programa y salida
        casos = entrada.nextInt();
        
        for ( contador = 0; contador != casos; contador++ ) {
            nHojas = entrada.nextInt();
            if ( nHojas % 3 == 1 && nHojas > 3 ) {
                System.out.println( "1" );
            } else if ( nHojas == 3 ) {
                System.out.println( "0" );
            } else {
                System.out.println( "IMPOSIBLE" );
            }
        }
        
    } // fin de main
    
} // fin de la clase AceptaElReto_241

