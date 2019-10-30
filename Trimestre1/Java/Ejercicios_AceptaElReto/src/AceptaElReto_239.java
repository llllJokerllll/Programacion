/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio Acepta El Reto 239
 * @version 1.0 
 */

// Importación de librerías
import java.util.Scanner;

public class AceptaElReto_239 {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int dias, emisoras;
        // Salida de datos
        int dD, hH, mM, sS;
        // Operativa
        Scanner entrada = new Scanner( System.in );
        int totalSegundos;
        // Constantes
        int TIEMPO_DIA;
        // Inicialización
        TIEMPO_DIA = 144;
        
        // Entrada de datos y resolución del programa
        while ( true ) {
            dias = entrada.nextInt();
            emisoras = entrada.nextInt();
            
            if ( dias == 0 && emisoras == 0 ) break;
            
            totalSegundos = dias * TIEMPO_DIA * emisoras;
            
            sS = totalSegundos % 60;
            mM = ( totalSegundos / 60 ) % 60 ;
            hH = ( totalSegundos / 3600 ) % 24;
            dD = totalSegundos / 86400;
            
           
            System.out.printf( "%01d:%02d:%02d:%02d\n", dD, hH, mM, sS );
        }
        
        
        
    } // fin de método main
    
} // fin de la clase AceptaElReto_239

