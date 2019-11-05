/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio 
 * @version 1.0 
 */

// Importación de librerias
import java.util.Scanner;

public class AceptaElReto_121 {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int envoltorios, chiclesRegalo, cChiclesTienen;
        // Salida de datos
        int cChiclesTotales, envoltoriosSobrantes;
        // Operativa
        Scanner entrada = new Scanner( System.in );
        int aux;
        // Constantes
        // Inicialización

        
        // Entrada de datos, comprobación y salida
        while ( true ) {
            envoltorios = entrada.nextInt();
            chiclesRegalo = entrada.nextInt();
            cChiclesTienen = entrada.nextInt();
            
            if ( envoltorios == 0 && chiclesRegalo == 0 && cChiclesTienen == 0 ) break;
                       
            if ( chiclesRegalo >= envoltorios && cChiclesTienen >= envoltorios ) {
                System.out.println( "RUINA" );
            } else if ( chiclesRegalo == 0 ) {
                System.out.println(cChiclesTienen + " " + cChiclesTienen );
            } else {
                cChiclesTotales = cChiclesTienen;
                while ( cChiclesTienen >= envoltorios ) {
                    aux = cChiclesTienen / envoltorios;
                    cChiclesTotales += aux * chiclesRegalo;
                    envoltoriosSobrantes = cChiclesTienen % envoltorios;
                    cChiclesTienen = aux + envoltoriosSobrantes;
                }
                System.out.println( cChiclesTotales + " " + cChiclesTienen );
            }
        }
        
        
    } // fin de main
    
} // fin de la clase AceptaElReto_121
