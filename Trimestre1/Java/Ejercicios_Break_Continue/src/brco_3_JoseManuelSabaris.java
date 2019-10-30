/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio Break/Continue 3
 * @version 1.0 
 */
// Implementa un programa en Java que imprima os números que vaia lendo por teclado, excepto os que sexan negativos.
// O programa terminará cando escribamos un cero.
// Debes implementar a solución cun bucle do while infinito.

// Importación de librerias
import java.util.Scanner;

public class brco_3_JoseManuelSabaris {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int numero;
        // Salida de datos
        // Operativa
        Scanner entrada = new Scanner( System.in );
        int contador;
        // Constantes
        // Inicialización
        contador = 1;
        
        // Entrada de datos, comprobación y salida
        while ( true ) {
            System.out.print( "Por favor, introduzca un número: " );
            numero = entrada.nextInt();
            
            if ( numero == 0 ) break;
            
            if ( numero > 0 ) {
                System.out.println( numero );
            }
        }
                
    } // fin de main
    
} // fin de la clase brco_3_JoseManuelSabaris
