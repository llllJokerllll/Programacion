/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio Acepta El Reto 191
 * @version 1.0 
 */

// Importación de librerías
import java.util.Scanner;

public class AceptaElReto_191 {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int casos, compartimentos, capacidad, difCapa;
        // Salida de datos
        int nLitros;
        // Operativa
        Scanner entrada = new Scanner( System.in );
        int contador1;
        int contador2;
        // Constantes
        // Inicialización
        
        // Entrada de datos y resolución del programa
        casos = entrada.nextInt();
        
        for ( contador1 = 0; contador1 < casos; contador1++) {
            nLitros = 0;
            
            compartimentos = entrada.nextInt();
            capacidad = entrada.nextInt();
            difCapa = entrada.nextInt();
            
            for ( contador2 = 0; contador2 < compartimentos; contador2++ ) {
                nLitros += capacidad - ( difCapa * contador2 );
            }  
           
            System.out.println( nLitros );
        }
        
        
        
    } // fin de método main
    
} // fin de la clase AceptaElReto_191
