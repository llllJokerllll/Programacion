/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio Acepta El Reto 157
 * @version 1.0 
 */

// Importación de librerias
import java.util.Scanner;

public class AceptaElReto_157 {

    static final int[] meses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        short casos, dia, mes;
        // Salida de datos
        int resultado;
        // Operativa
        Scanner entrada = new Scanner( System.in );
        // Constantes
        short contador1;
        short contador2;
        // Inicialización
        
        
        // Entrada de datos, comprobación y salida
        casos = entrada.nextShort();
        
        for ( contador1 = 0; contador1 != casos; contador1++ ) {
            dia = entrada.nextShort();
            mes = entrada.nextShort();
            
            resultado = meses[ mes - 1 ] - dia;
            for ( contador2 = mes; contador2 < 12; contador2++ ) {
                resultado += meses[ contador2 ];
            }    
                
            System.out.println( resultado );
            
        }  
        
    } // fin de main
    
} // fin de la clase AceptaElReto_157
