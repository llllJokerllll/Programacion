/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio 
 * @version 1.0 
 */

// Importación de librerías
import java.util.Scanner;

public class AceptaElReto_170 {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int cantidad;
        // Salida de datos
        int lado, sobrantes;
        // Operativa
        Scanner entrada = new Scanner( System.in );
        int contador;
        // Constantes
        // Inicialización
        // Creación de objetos
        
        // Entrada de datos y resolución del programa
        while ( true ) {
            
            cantidad = entrada.nextInt();
            if ( cantidad == 0 ) break;
            
            lado = 1;
            sobrantes = 0;
            
            for ( contador = 0; contador < cantidad; contador++ ) {
                sobrantes += lado;
                lado++;
                if ( sobrantes == cantidad ) {
                    System.out.println( --lado + " " + 0 );
                    break;
                } else if ( ( sobrantes + lado ) > cantidad ) {
                    System.out.println( --lado + " " + ( cantidad - sobrantes) );
                    break;
                }
            }
        }
        
        // Salida de datos


    } // fin de main
    
} // fin de la clase AceptaElReto_170

