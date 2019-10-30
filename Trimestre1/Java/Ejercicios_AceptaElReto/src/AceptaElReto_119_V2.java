/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio Acepta El Reto 119 V2
 * @version 1.0 
 */

// Importación de librerías
import java.util.Scanner;

public class AceptaElReto_119_V2 {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int ejercito;
        // Salida de datos
        int escudos;
        // Operativa
        Scanner entrada = new Scanner( System.in );
        int aux;
        // Constantes
        // Inicialización
        // Creación de objetos
        
        // Entrada de datos, resolución del programa y salida
        while ( true ) {
            ejercito = entrada.nextInt();
            
            if ( ejercito == 0 ) break;
            
            escudos = 0;
            while ( true ) {
                if ( ejercito == 0 ) break;
                if ( ejercito < 4 ) {
                    escudos += ejercito * 5;
                    break;
                }
                aux = ( int ) Math.sqrt( ejercito );
                ejercito -= ( aux * aux );
                escudos += ( aux - 2 ) * ( aux - 2 ) + 12 + ( ( aux - 2 ) * 4 ) * 2;
            }
            System.out.println( escudos );
        }
        


    } // fin de main
    
} // fin de la clase AceptaElReto_119_V2

