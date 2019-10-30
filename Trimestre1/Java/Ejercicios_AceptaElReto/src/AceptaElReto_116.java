/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio 
 * @version 1.0 
 */

// Importación de librerías
import java.util.Scanner;

public class AceptaElReto_116 {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        Byte cImpresion;
        // Salida de datos
        String resultado = "Hola mundo.";
        // Operativa
        Scanner entrada = new Scanner( System.in );
        byte contador;
        // Constantes
        // Inicialización
        // Creación de objetos
        
        // Entrada de datos, resolución del programa y salida
        cImpresion = entrada.nextByte();
        
        for ( contador = 0; contador != cImpresion; contador++ ) {
            System.out.println( resultado );
        }
        

    } // fin de main
    
} // fin de la clase AceptaElReto_116

