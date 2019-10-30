/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio Acepta El Reto 293
 * @version 1.0 
 */

// Importación de librerías
import java.util.Scanner;

public class AceptaElReto_293 {

    public static void main( String[] args ) {
            
        // Declaración de variables
        // Entrada de datos
        int casos;
        int numInsectos, numAracnidos, numCrustaceos, numMiriapodos, numAnillos;
        // Salida de datos
        int patasTotales;
        // Operativa
        Scanner entrada = new Scanner( System.in );
        int contador;
        // Constantes
        int INSECTOS = 6;
        int ARACNIDOS = 8;
        int CRUSTACEOS = 10;
        int ANILLOS = 2;
        // Inicialización
        
        // Entrada de datos y resolución del programa
        casos = entrada.nextInt();
        
        for ( contador = 0; contador != casos; contador++ ) {
            numInsectos = entrada.nextInt();
            numAracnidos = entrada.nextInt();
            numCrustaceos = entrada.nextInt();
            numMiriapodos = entrada.nextInt();
            numAnillos = entrada.nextInt();
            
            patasTotales = numInsectos * INSECTOS + numAracnidos * ARACNIDOS + numCrustaceos * CRUSTACEOS + ( numAnillos * ANILLOS ) * numMiriapodos;
            
            System.out.println( patasTotales );
        }
        
    } // fin de método main
    
} // fin de la clase AceptaElReto_293
