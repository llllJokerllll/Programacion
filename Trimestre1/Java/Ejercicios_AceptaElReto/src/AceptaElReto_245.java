/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio 
 * @version 1.0 
 */

// Importación de librerias
import java.util.Scanner;

public class AceptaElReto_245 {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int numPersonajes, altura;
        // Salida de datos
        String resultado;
        // Operativa
        Scanner entrada = new Scanner( System.in );
        int contador, aux;
        // Constantes
        // Inicialización

        
        // Entrada de datos, comprobación y salida
        while ( true ) {
            numPersonajes = entrada.nextInt();
            if ( numPersonajes == 0 ) break;
            altura = entrada.nextInt();
            aux = altura;
            resultado = "DALTON";
            
            for ( contador = 1; contador < numPersonajes; contador++ ) {
                altura = entrada.nextInt();
                if ( altura - 1 != aux ) {
                    resultado = "DESCONOCIDOS";
                }
                aux = altura;
            }
            System.out.println( resultado );
        }


        
        
    } // fin de main
    
} // fin de la clase AceptaElReto_245
