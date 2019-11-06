/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio 
 * @version 1.0 
 */

// Importación de librerias
import java.util.Scanner;

public class Bucles_Repaso_12_V3 {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        byte numero;
        // Salida de datos
        // Operativa
        Scanner entrada = new Scanner( System.in );
        byte alto, ancho;
        byte contador1, auxNum;
        // Constantes
        // Inicialización
        auxNum = 1;
        
        // Entrada de datos y comprobación
        numero = entrada.nextByte();
        
        for ( alto = 1; alto <= numero; alto++ ) {
            for ( ancho = 1; ancho <= numero - alto; ancho++ ) {
                System.out.print( " " );
            }
            for ( contador1 = 1; contador1 <= ( ( alto * 2 ) - 1 ); contador1++ ) {
                if ( contador1 == 1 || contador1 == ( ( alto * 2 ) - 1 ) ) {
                    System.out.print( auxNum );
                } else if ( contador1 == alto ) {
                    System.out.print( "|" );
                } else {
                    System.out.print( "/" );
                }
            }
            auxNum++;
            if ( auxNum > 9 ) {
                auxNum = 0;
            }
            System.out.println( "" );
        }

        
        // Salida

        
        
    } // fin de main
    
} // fin de la clase Bucles_Repaso_12_V3
