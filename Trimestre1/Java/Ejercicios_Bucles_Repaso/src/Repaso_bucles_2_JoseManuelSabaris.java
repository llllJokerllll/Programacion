/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio 
 * @version 1.0 
 */
// Calcular el factorial de un número entero N. 

// Importación de librerías
import java.util.Scanner;

public class Repaso_bucles_2_JoseManuelSabaris {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int numero;
        // Salida de datos
        int resultado;
        // Operativa
        Scanner entrada = new Scanner( System.in );
        int contador, factorial;
        // Constantes
        // Inicialización
        resultado = 0;
        factorial = 1;
        // Creación de objetos
        
        // Entrada de datos y resolución del programa
        System.out.print( "Por favor, introduzca un número: " );
        numero = entrada.nextInt();
        contador = numero;
        
        while ( contador > 1 ){
            factorial *= contador;
            contador--;
        }
        
        // Salida de datos
        System.out.println( "El factorial del " + numero + " es: " + resultado );

    } // fin de main
    
} // fin de la clase Repaso_bucles_2_JoseManuelSabaris

