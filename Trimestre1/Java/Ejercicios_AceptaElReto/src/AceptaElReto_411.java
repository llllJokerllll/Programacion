/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio 
 * @version 1.0 
 */

// Importación de librerias
import java.util.Scanner;

public class AceptaElReto_411 {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int maxPeso, pesoElefante;
        // Salida de datos
        int resultado;
        // Operativa
        Scanner entrada = new Scanner( System.in );
        int suma;
        boolean seguir;
        // Constantes
        // Inicialización

        
        // Entrada de datos, comprobación y salida
        maxPeso = entrada.nextInt();
        
        while ( maxPeso != 0 ) {
            resultado = suma = 0;
            seguir = true;
            
            pesoElefante = entrada.nextInt();
            
            while ( pesoElefante != 0 ) {
                
                if ( seguir ) {
                    suma += pesoElefante;
                }
                
                if ( maxPeso < suma ) {
                    seguir = false;
                } else {
                    resultado++;
                }
                pesoElefante = entrada.nextInt();
            }
            System.out.println( resultado );
            maxPeso = entrada.nextInt();
        }
        
        
    } // fin de main
    
} // fin de la clase AceptaElReto_411
