/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio 
 * @version 1.0 
 */

// Importación de librerias
import java.util.Scanner;

public class AceptaElReto_105 {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        double martes, miercoles, jueves, viernes, sabado, domingo;
        // Salida de datos
        String resMin, resMax, resProm;
        // Operativa
        Scanner entrada = new Scanner( System.in );
        double valorMin, valorMax, promedio;
        // Constantes
        // Inicialización
        valorMin = Integer.MAX_VALUE;
        valorMax = Integer.MIN_VALUE;
        resMax = "";
        resMin = "";

        
        // Entrada de datos y comprobación
        while ( true ) {
            martes = entrada.nextDouble();
            if ( martes < 0 ) break;
            miercoles = entrada.nextDouble();
            jueves = entrada.nextDouble();
            viernes = entrada.nextDouble();
            sabado = entrada.nextDouble();
            domingo = entrada.nextDouble();
            
            if ( martes <= valorMin ) {
                valorMin = martes;
                resMin = "MARTES";
            } else if ( martes >= valorMax ) {
                valorMax = martes;
                resMax = "MARTES";
            }
            if ( miercoles <= valorMin ) {
                valorMin = miercoles;
                resMin = "MIERCOLES";
            } else if ( miercoles >= valorMax ) {
                valorMax = miercoles;
                resMax = "MIERCOLES";
            }
            if ( jueves <= valorMin ) {
                valorMin = jueves;
                resMin = "JUEVES";
            } else if ( jueves >= valorMax ) {
                valorMax = jueves;
                resMax = "JUEVES";
            }
            if ( viernes <= valorMin ) {
                valorMin = viernes;
                resMin = "VIERNES";
            } else if ( viernes >= valorMax ) {
                valorMax = viernes;
                resMax = "VIERNES";
            }
            if ( sabado <= valorMin ) {
                valorMin = sabado;
                resMin = "SABADO";
            } else if ( sabado >= valorMax ) {
                valorMax = sabado;
                resMax = "SABADO";
            }
            if ( domingo <= valorMin ) {
                valorMin = domingo;
                resMin = "DOMINGO";
            } else if ( domingo >= valorMax ) {
                valorMax = domingo;
                resMax = "DOMINGO";
            }
            
            promedio = ( martes + miercoles + jueves + viernes + sabado + domingo ) / 6;
            if ( promedio < domingo ) {
                resProm = "SI";
            } else {
                resProm = "NO";
            }
            
            if ( valorMin == martes && valorMin == miercoles || valorMin == martes && valorMin == jueves || valorMin == martes && valorMin == viernes || valorMin == martes && valorMin == sabado || valorMin == martes && valorMin == domingo ) {
                resMin = "EMPATE";
            } else if ( valorMin == miercoles && valorMin == jueves || valorMin == miercoles && valorMin == viernes || valorMin == miercoles && valorMin == sabado || valorMin == miercoles && valorMin == domingo ) {
                resMin = "EMPATE";
            } else if ( valorMin == jueves && valorMin == viernes || valorMin == jueves && valorMin == sabado || valorMin == jueves && valorMin == domingo ) {
                resMin = "EMPATE";
            } else if ( valorMin == viernes && valorMin == sabado || valorMin == viernes && valorMin == domingo ) {
                resMin = "EMPATE";
            } else if ( valorMin == sabado && valorMin == domingo ) {
                resMin = "EMPATE";
            }
            
            if ( valorMax == martes && valorMax == miercoles || valorMax == martes && valorMax == jueves || valorMax == martes && valorMax == viernes || valorMax == martes && valorMax == sabado || valorMax == martes && valorMax == domingo ) {
                resMax = "EMPATE";
            } else if ( valorMax == miercoles && valorMax == jueves || valorMax == miercoles && valorMax == viernes || valorMax == miercoles && valorMax == sabado || valorMax == miercoles && valorMax == domingo ) {
                resMax = "EMPATE";
            } else if ( valorMax == jueves && valorMax == viernes || valorMax == jueves && valorMax == sabado || valorMax == jueves && valorMax == domingo ) {
                resMax = "EMPATE";
            } else if ( valorMax == viernes && valorMax == sabado || valorMax == viernes && valorMax == domingo ) {
                resMax = "EMPATE";
            } else if ( valorMax == sabado && valorMax == domingo ) {
                resMax = "EMPATE";
            }
            
            System.out.println( resMax + " " + resMin + " " + resProm );
               
        }      
        
    } // fin de main
    
} // fin de la clase AceptaElReto_105
