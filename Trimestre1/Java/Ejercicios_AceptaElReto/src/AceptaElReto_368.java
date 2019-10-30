/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio Acepta El Reto 368
 * @version 1.0 
 */

// Importación de librerias
import java.util.Scanner;

public class AceptaElReto_368 {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        short numHuevos, capacidad;
        // Salida de datos
        short acumulador;
        // Operativa
        Scanner entrada = new Scanner( System.in );
        short contador;
        // Constantes
        byte TIEMPO_COC;
        // Inicialización
        TIEMPO_COC = 10;
        acumulador = 0;
        
        // Entrada de datos y comprobación
        while ( true ) {
            numHuevos = entrada.nextShort();
            capacidad = entrada.nextShort();
            
            if ( numHuevos == 0 && capacidad == 0 ) break;
            
            if ( numHuevos <= capacidad ) {
                System.out.println( TIEMPO_COC );
            } else {
                for ( contador = 1; numHuevos > 0; contador++ ){
                    numHuevos = ( short ) ( numHuevos - capacidad );
                    acumulador = contador;
                }
                System.out.println( TIEMPO_COC * acumulador );
            }           
        }
                
        
    } // fin de main
    
} // fin de la clase AceptaElReto_368
