/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio 
 * @version 1.0 
 */
// Programa que pida por teclado un número N y que a continuación calcule el valor del número e como suma de la serie:

// Importación de librerías
import java.util.Scanner;

public class Bucles_Repaso_10_JoseManuelSabaris {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        float numero;
        // Salida de datos
        float resultado;
        String salida1, salida2;
        // Operativa
        Scanner entrada = new Scanner( System.in );
        float contador1, contador2, aux;
        // Constantes
        // Inicialización
        resultado = 0;
        salida1 = "El valor de la iteración ";
        salida2 = " es: ";
        // Creación de objetos
        
        // Entrada de datos y resolución del programa
        System.out.print( "Por favor, introduzca un número entero positivo: " );
        numero = entrada.nextFloat();
        
        for ( contador1 = 0; contador1 <= numero; contador1++ ) {
            aux = 1;
            if ( contador1 == 0 ) {
                resultado = 1;
            } else {
                for ( contador2 = contador1; contador2 > 1; contador2-- ) {
                    aux *= contador2;
                }
                resultado += (float) ( 1 / aux );
            }
            
            System.out.printf( "%.30s%.0f%.30s%.6f\n",salida1, contador1, salida2, resultado );
        }
        // Salida de datos


    } // fin de main
    
} // fin de la clase Bucles_Repaso_10_JoseManuelSabaris

