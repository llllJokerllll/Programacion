/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio Acepta El Reto 216
 * @version 1.0 
 */

// Importación de librerías
import java.util.Scanner;

public class AceptaElReto_216 {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int casos, gotas;
        // Salida de datos
        int sS, mM, hH;
        // Operativa
        Scanner entrada = new Scanner( System.in );
        int contador;
        // Constantes
        // Inicialización
        
        // Entrada de datos y resolución del programa
        casos = entrada.nextInt();
        
        for ( contador = 0; contador < casos; contador++) {
            gotas = entrada.nextInt();
            
            hH = gotas / 3600;
            mM = ( gotas / 60 ) - ( hH * 60 ) ;
            sS = gotas - ( mM * 60 ) - ( hH * 3600 );            
           
            System.out.printf( "%02d:%02d:%02d\n", hH, mM, sS );
        }
        
    } // fin de método main
    
} // fin de la clase AceptaElReto_216

