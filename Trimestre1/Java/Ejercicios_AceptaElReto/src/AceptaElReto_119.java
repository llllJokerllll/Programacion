
/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio Acepta El Reto 119
 * @version 1.0
 */

// Importación de librerías
import java.util.Scanner;

public class AceptaElReto_119 {

    public static void main( String[] args ) {

        // Declaración de variables
        // Entrada de datos
        int numLegion;
        // Salida de datos
        int numEscudos;
        // Operativa
        Scanner entrada = new Scanner( System.in );
        int contador, auxEscu;
        // Constantes
        int ESQUINAS;
        // Inicialización
        ESQUINAS = 12;

        // Creación de objetos

        // Entrada de datos, resolución del programa y salida
        while ( true ) {
            numLegion = entrada.nextInt();
            if ( numLegion == 0 ) {
                break;
            }
            numEscudos = 0;
            
            while ( numLegion > 0 ) {
                contador = 1;
                auxEscu = 0;
                
                while ( ( numLegion - Math.pow( contador, 2 ) ) >= 0 ) {
                    contador++;
                }
                contador--;
                auxEscu += ESQUINAS + ( ( contador - 2 ) * 4 ) * 2 + ( contador * contador - ( contador - 1 ) * 4 );
                numEscudos += auxEscu;
                numLegion -= contador * contador;
                
            }
            //numEscudos += numLegion * 5;
            System.out.println( numEscudos );
        }

    } // fin de main

} // fin de la clase AceptaElReto_119

