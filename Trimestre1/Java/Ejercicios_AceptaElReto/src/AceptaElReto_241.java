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
        int tCuatroHojas;
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
            tCuatroHojas = 0;
            while ( nHojas > 0 && nHojas % 3 != 0 ) {
                nHojas -= 4;
                tCuatroHojas++;
            }
            if ( nHojas < 3 && nHojas != 0 ) {
                System.out.println( "IMPOSIBLE" );
            } else {
                System.out.println( tCuatroHojas );
            }
        }
        
    } // fin de main
    
} // fin de la clase AceptaElReto_241

