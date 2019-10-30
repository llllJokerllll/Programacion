/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio Acepta El Reto 340
 * @version 1.0 
 */

// Importación de librerías
import java.util.Scanner;

public class AceptaElReto_340 {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int casos, horizontal, vertical;
        // Salida de datos
        int cantidad;
        // Operativa
        Scanner entrada = new Scanner( System.in );
        int contador;
        // Constantes
        // Inicialización
        
        // Entrada de datos y resolución del programa
        casos = entrada.nextInt();
        
        for ( contador = 0; contador != casos; contador++ ) {
            horizontal = entrada.nextInt();
            vertical = entrada.nextInt();
            
            cantidad = horizontal + vertical + ( ( horizontal * 2 ) * vertical );
            System.out.println( cantidad );
        }
        
        
    } // fin de método main
    
} // fin de la clase AceptaElReto_340

