/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Ejercicios_AceptaElReto en 26 nov. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio AceptaElReto_151
 * @version 1.0
 */

// Importación de librerías
import java.util.Scanner;

public class AceptaElReto_151 {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int filas;
        // Salida de datos
        boolean ceros, unos;
        // Operativa
        int contador1, contador2;
        // Constantes
        // Inicialización        
        // Creación de objetos
        Scanner entrada = new Scanner( System.in );
        
        // Entrada de datos y resolución del programa
        filas = entrada.nextInt();
        
        while ( filas != 0 ) {
            int[][] matriz = new int[ filas ][ filas ];
            unos = ceros = true;
            for ( contador1 = 0; contador1 < filas; contador1++ ) {
                for ( contador2 = 0; contador2 < filas; contador2++ ) {
                    matriz[ contador1 ][ contador2 ] = entrada.nextInt();
                    if ( unos ) {
                        if ( matriz[ contador1 ][ contador2 ] != 1 && contador1 == contador2 ) {
                            unos = false;
                        }
                    }
                    if ( ceros ) {
                        if ( matriz[ contador1 ][ contador2 ] != 0 && contador1 != contador2 ) {
                            ceros = false;
                        }
                    }
                }
            }
            if ( unos && ceros ) {
                System.out.println( "SI" );
            } else {
                System.out.println( "NO" );
            }
            filas = entrada.nextInt();
        }


    } // fin de main
    
} // fin de la clase AceptaElReto_151

