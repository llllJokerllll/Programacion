/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio 
 * @version 1.0 
 */

// Importación de librerias
import java.util.Scanner;

public class AceptaElReto_158 {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int casos, nSaltos, alturas;
        // Salida de datos
        int sArriba, sAbajo;
        // Operativa
        Scanner entrada = new Scanner( System.in );
        int contador1, contador2, aux;
        // Constantes
        // Inicialización

        
        // Entrada de datos, comprobación y salida
        casos = entrada.nextInt();
        
        for ( contador1 = 0; contador1 != casos; contador1++ ) {
            nSaltos = entrada.nextInt();
            aux = 0;
            sAbajo = 0;
            sArriba = 0;
            for ( contador2 = 0; contador2 != nSaltos; contador2++ ) {
                alturas = entrada.nextInt();
                if ( contador2 > 0 ) {
                    if ( alturas > aux ) {
                        sArriba += 1;
                    } else if ( alturas < aux ) {
                        sAbajo += 1;
                    }
                }
                
                aux = alturas;
            }
            System.out.println( sArriba + " " + sAbajo );
        }

               
        
    } // fin de main
    
} // fin de la clase AceptaElReto_158
