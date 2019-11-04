/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio 
 * @version 1.0 
 */

// Importación de librerias
import java.util.Scanner;

public class AceptaElReto_313 {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int casos, saldo, balanceMensual;
        // Salida de datos
        // Operativa
        Scanner entrada = new Scanner( System.in );
        int contador;
        // Constantes
        // Inicialización

        
        // Entrada de datos y comprobación
        casos = entrada.nextInt();
        
        for ( contador = 0; contador != casos; contador++ ) {
            saldo = entrada.nextInt();
            balanceMensual = entrada.nextInt();
            if ( ( saldo + balanceMensual ) >= 0 ) {
                System.out.println( "SI" );
            } else {
                System.out.println( "NO" );
            }
        }      
        
    } // fin de main
    
} // fin de la clase AceptaElReto_313
