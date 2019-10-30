/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio Break/Continue 2
 * @version 1.0 
 */
// Elabora un programa Java que averigüe se un número enteiro positivo dado polo usuario é primo ou non.
// Emprega unha variable booleana.

// Importación de librerias
import java.util.Scanner;

public class brco_2_JoseManuelSabaris {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int numero;
        // Salida de datos
        // Operativa
        Scanner entrada = new Scanner( System.in );
        boolean esPrimo;
        int contador;
        // Constantes
        // Inicialización
        esPrimo = true;
        
        // Entrada de datos y comprobación
        System.out.print( "Por favor, introduzca un número entero y positivo: " );
        numero = entrada.nextInt();
        if ( numero > 0 ) {
            for ( contador = 2; contador < numero; contador++ ) {
                if ( numero % contador == 0 ) {
                    esPrimo = false;
                    break;
                }              
            }
        }
        
        // Salida
        if ( esPrimo ) {
            System.out.println( "El " + numero + " es Primo" );
        } else {
            System.out.println( "El " + numero + " no es Primo" );
        }
        
        
    } // fin de main
    
} // fin de la clase brco_2_JoseManuelSabaris

