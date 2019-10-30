/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio Acepta El Reto 148
 * @version 1.0 
 */

// Importación de librerías
import java.util.Scanner;

public class AceptaElReto_148 {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        String hora;
        String[] tiempo = new String[1];
        // Salida de datos
        int resultado;
        // Operativa
        int horas, minutos;
        Scanner entrada = new Scanner( System.in );
        // Constantes
        int MEDIA_NOCHE;
        // Inicialización
        MEDIA_NOCHE = 1440;
        
        // Entrada de datos y resolución del programa
        hora = entrada.next();
        
        while ( !hora.equals ( "00:00" ) ) {

            tiempo = hora.split( ":" );
            horas = Integer.parseInt( tiempo[0] );
            minutos = Integer.parseInt( tiempo[1] );
            
            resultado = MEDIA_NOCHE - ( horas * 60 + minutos );

            System.out.println( resultado );
            
            hora = entrada.next();
        } // fin del while
        
    } // fin de método main
    
} // fin de la clase AceptaElReto_148