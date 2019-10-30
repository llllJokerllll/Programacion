/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio Acepta El Reto 155
 * @version 1.0 
 */

// Importación de librerías
import java.util.Scanner;

public class AceptaElReto_155 {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int base, altura;
        // Salida de datos
        int perimetro;
        // Operativa
        Scanner entrada = new Scanner( System.in );
        // Constantes
        // Inicialización
        
        // Entrada de datos y resolución del programa
        base = entrada.nextInt();
        altura = entrada.nextInt();
        
        while ( base >= 0 && altura >= 0 ) {
        perimetro = base * 2 + altura * 2;
        System.out.println( perimetro );
        base = entrada.nextInt();
        altura = entrada.nextInt();    
        } // fin del while
        
    } // fin de método main
    
} // fin de la clase AceptaElReto_155
