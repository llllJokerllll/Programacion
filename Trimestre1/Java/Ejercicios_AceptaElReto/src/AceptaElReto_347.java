/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio Acepta El Reto 347
 * @version 1.0 
 */

// Importación de librerías
import java.util.Scanner;

public class AceptaElReto_347 {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int ancho, alto;
        // Salida de datos
        int cuadrados;
        // Operativa
        Scanner entrada = new Scanner( System.in );
        // Constantes
        // Inicialización
        // Creación de objetos
        
        // Entrada de datos, resolución del programa y salida
        while ( true ) {
            ancho = entrada.nextInt();
            alto = entrada.nextInt();
            if ( ancho == 0 && alto == 0 ) break;
            cuadrados = 0;
            
            while ( ancho >= 10 && alto >= 10 ) {
                if ( ancho >= alto ) {
                    cuadrados += Math.floor( ancho / alto );
                    ancho = ancho % alto;
                } else {
                    cuadrados += Math.floor( alto / ancho );
                    alto = alto % ancho;
                }
            }
            System.out.println( cuadrados );
        }
        

    } // fin de main
    
} // fin de la clase AceptaElReto_347

