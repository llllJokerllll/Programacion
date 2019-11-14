/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio 
 * @version 1.0 
 */

// Importación de librerias
import java.util.Scanner;

public class AceptaElReto_138 {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int casos, numero;
        // Salida de datos
        int resultado;
        // Operativa
        Scanner entrada = new Scanner( System.in );
        int contador;
        // Constantes
        // Inicialización

        
        // Entrada de datos, comprobación y salida
        casos = entrada.nextInt();
        
        for ( contador = 0; contador < casos; contador++ ) {
            numero = entrada.nextInt();
            resultado = 0;
            
            while ( numero >= 5 ) {
                resultado += numero / 5;
                numero /= 5;
            }
            System.out.println( resultado );
        }
        
        
    } // fin de main
    
} // fin de la clase AceptaElReto_138
