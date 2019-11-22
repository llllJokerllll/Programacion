/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Ejercicios_AceptaElReto en 22 nov. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio AceptaElReto_207
 * @version 1.0
 */

// Importación de librerías
import java.util.Scanner;

public class AceptaElReto_207 {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int alto, ancho, nArboles; 
        // Salida de datos
        // Operativa
        int contador1, contador2;
        // Constantes
        // Inicialización        
        // Creación de objetos
        Scanner entrada = new Scanner( System.in );
        
        // Entrada de datos, resolución del programa y salida de datos
        while ( true ) {
            alto = entrada.nextInt();
            ancho = entrada.nextInt();
            nArboles = entrada.nextInt();
            if ( alto == 0 && ancho == 0 && nArboles == 0 ) break;
            int[][] bosque = new int[ alto ][ ancho ];
            
            for ( contador1 = 1; contador1 <= nArboles; contador1++ ) {
                bosque[ entrada.nextInt() - 1 ][ entrada.nextInt() - 1 ] = 1;
            }
            
            for ( contador1 = 0; contador1 < alto; contador1++ ) {
                for ( contador2 = 0; contador2 < ancho; contador2++ ) {
                    if ( bosque[ contador1 ][ contador2 ] == 1 ) {
                        if ( contador1 == 0 && contador2 == 0 ) {
                            if ( bosque[ 0 ][ 1 ] != 1 ) {
                                bosque[ 0 ][ 1 ] = 7;
                            }
                            if ( bosque[ 1 ][ 0 ] != 1 ) {
                                bosque[ 1 ][ 0 ] = 7;
                            }
                            if ( bosque[ 1 ][ 1 ] != 1 ) {
                                bosque[ 1 ][ 1 ] = 7;
                            }
                        } else if ( contador1 == 0 && contador2 == ancho - 1 ) {
                            if ( bosque[ 0 ][ ancho - 2 ] != 1 ) {
                                bosque[ 0 ][ ancho - 2 ] = 7;
                            }
                            if ( bosque[ 1 ][ ancho - 1 ] != 1 ) {
                                bosque[ 1 ][ ancho - 1 ] = 7;
                            }
                            if ( bosque[ 1 ][ ancho - 2 ] != 1 ) {
                                bosque[ 1 ][ ancho - 2 ] = 7;
                            }
                        }
                    }
                }
            }
            
            for ( int[] x : bosque ) {
                for ( int y : x ) {
                System.out.print( y + " " );
                }
                System.out.println( "" );
            }
        }

    } // fin de main
    
} // fin de la clase AceptaElReto_207

