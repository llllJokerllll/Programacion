
/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio
 * @version 1.0
 */

// Importación de librerias
import java.util.Scanner;

public class AceptaElReto_105_V2 {

    public static void main( String[] args ) {

        // Declaración de variables
        // Entrada de datos
        double martes, numero, domingo;
        // Salida de datos
        String resMin, resMax, resProm;
        // Operativa
        Scanner entrada = new Scanner( System.in );
        double valorMin, valorMax, promedio;
        int contador, posMin, posMax;
        boolean empateMin, empateMax;
        // Constantes
        // Inicialización
        resMax = "";
        resMin = "";
        domingo = 0;
        empateMin = false;
        empateMax = false;

        // Entrada de datos y comprobación
        while ( true ) {
            martes = entrada.nextDouble();
            if ( martes < 0 ) {
                break;
            }
            promedio = martes;
            valorMin = martes;
            valorMax = martes;
            posMin = 1;
            posMax = 1;

            for ( contador = 2; contador <= 6; contador++ ) {
                numero = entrada.nextDouble();
                promedio += numero;
                
                if ( contador == 6 ) {
                    domingo = numero;
                }
                
                if ( numero == valorMin ) {
                    empateMin = true;
                } else if ( numero == valorMax ) {
                    empateMax = true;
                }

                if ( numero < valorMin ) {
                    valorMin = numero;
                    posMin = contador;
                    empateMin = false;
                } else if ( numero > valorMax ) {
                    valorMax = numero;
                    posMax = contador;
                    empateMax = false;
                }

            }
            
            promedio /= 6; 
            if ( promedio < domingo ) {
                resProm = "SI";
            } else {
                resProm = "NO";
            }
            
            if ( empateMin != true ) {
            switch ( posMin ) {
                case 1:
                    resMin = "MARTES";
                    break;
                case 2:
                    resMin = "MIERCOLES";
                    break;
                case 3:
                    resMin = "JUEVES";
                    break;
                case 4:
                    resMin = "VIERNES";
                    break;
                case 5:
                    resMin = "SABADO";
                    break;
                case 6:
                    resMin = "DOMINGO";
                    break;
            }
            } else {
                resMin = "EMPATE";
            }
            
            if ( empateMax != true ) {
            switch ( posMax ) {
                case 1:
                    resMax = "MARTES";
                    break;
                case 2:
                    resMax = "MIERCOLES";
                    break;
                case 3:
                    resMax = "JUEVES";
                    break;
                case 4:
                    resMax = "VIERNES";
                    break;
                case 5:
                    resMax = "SABADO";
                    break;
                case 6:
                    resMax = "DOMINGO";
                    break;
            }
            } else {
                resMax = "EMPATE";
            }
            
            System.out.println( resMax + " " + resMin + " " + resProm );

        }

    } // fin de main

} // fin de la clase AceptaElReto_105_V2
