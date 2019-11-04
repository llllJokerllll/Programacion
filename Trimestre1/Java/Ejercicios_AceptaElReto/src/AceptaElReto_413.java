/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio 
 * @version 1.0 
 */

// Importación de librerias
import java.util.Scanner;

public class AceptaElReto_413 {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int casos, ancho, alto;
        // Salida de datos
        int lClaras, lOscuras;
        // Operativa
        Scanner entrada = new Scanner( System.in );
        int contador, lTotales;
        // Constantes
        // Inicialización

        
        // Entrada de datos, comprobación y salida
        casos = entrada.nextInt();
        
        for ( contador = 0; contador != casos; contador++ ) {
            ancho = entrada.nextInt();
            alto = entrada.nextInt();
            lTotales = ancho * alto;
            lOscuras = lTotales / 2;
            lClaras = lTotales - lOscuras;
            System.out.println( lClaras + " " + lOscuras );
        }
            
        
    } // fin de main
    
} // fin de la clase AceptaElReto_413
