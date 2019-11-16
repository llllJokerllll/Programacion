/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio Array 8
 * @version 1.0 
 */
// Programa Java para leer la altura de N personas y calcular la altura media.
// Calcular cuántas personas tienen una altura superior a la media y cuántas tienen una altura inferior a la media.
// El valor de N se pide por teclado y debe ser entero positivo.

// Importación de librerías
import java.util.Scanner;

public class OB_8_AlturaMedia_JMS {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int casos;
        // Salida de datos
        double alturaMedia; 
        int mediaSuperior, mediaInferior;
        // Operativa
        Scanner entrada = new Scanner( System.in );
        int contador;
        // Constantes
        // Inicialización
        alturaMedia = 0;
        mediaSuperior = mediaInferior = 0;
        
        // Entrada de datos y resolución del programa
        System.out.println( "Por favor, introduzca el número de personas" );
        casos = entrada.nextInt();
        double[] alturas = new double[ casos ];
        
        for ( contador = 0; contador < casos; contador++ ) {
            System.out.println( "Por favor, introduzca la altura" );
            alturas[ contador ] = entrada.nextDouble();
            alturaMedia += alturas[ contador ];
        }
        
        alturaMedia /= casos;
        
        for ( double x : alturas ) {
            if ( x > alturaMedia ) {
                mediaSuperior++;
            } else if ( x < alturaMedia ) {
                mediaInferior++;
            }
        }
        
        // Salida de datos
        System.out.println( mediaSuperior + " tienen una altura superior a la media y " + mediaInferior + " tienen una altura inferior a la media.");

    } // fin de main
    
} // fin de la clase OB_8_AlturaMedia_JMS

