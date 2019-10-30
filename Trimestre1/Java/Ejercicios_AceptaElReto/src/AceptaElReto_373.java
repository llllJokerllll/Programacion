/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio Acepta El Reto 373
 * @version 1.0 
 */

// Importación de librerías
import java.util.Scanner;

public class AceptaElReto_373 {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        long nLados, casos;
        // Salida de datos
        long totalLados;
        // Operativa
        Scanner entrada = new Scanner( System.in );
        int contador;
        // Constantes
        // Inicialización
        
        // Entrada de datos y resolución del programa
        casos = entrada.nextInt();
        
        for ( contador = 0; contador != casos; contador++ ) {
            nLados = entrada.nextInt();
            
            totalLados = ( ( nLados - 1 ) * nLados ) * 4 + ( nLados * nLados - ( ( nLados - 1 ) * 4 ) ) * 2;
            System.out.println( totalLados );
        }
        
        
    } // fin de método main
    
} // fin de la clase AceptaElReto_373

