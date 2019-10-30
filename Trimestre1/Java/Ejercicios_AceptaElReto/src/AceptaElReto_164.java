/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio Acepta El Reto 164
 * @version 1.0 
 */

// Importación de librerías
import java.util.Scanner;

public class AceptaElReto_164 {

    public static void main( String[] args ) {
     
        // Declaración de variables
        // Entrada de datos
        int base1, altura1, base2, altura2;
        // Salida de datos
        int base, altura;
        // Operativa
        Scanner entrada = new Scanner( System.in );
        // Constantes
        // Inicialización
        
        // Entrada de datos y resolución del programa
        while ( true ) {

            base1 = entrada.nextInt();
            altura1 = entrada.nextInt();
            base2 = entrada.nextInt();
            altura2 = entrada.nextInt();

            base   = base2 - base1;
            altura = altura2 - altura1;

            if ( base < 0 || altura < 0 ) break;
            System.out.println( base * altura );
        } // fin del while
        
    } // fin de método main
    
} // fin de la clase AceptaElReto_164