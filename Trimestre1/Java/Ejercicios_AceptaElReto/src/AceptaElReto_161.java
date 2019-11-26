/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Ejercicios_AceptaElReto en 25 nov. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio AceptaElReto_161
 * @version 1.0
 */
// Importación de librerías
import java.util.Scanner;
import java.util.Arrays;

public class AceptaElReto_161 {

    public static void main( String[] args ) {

        // Declaración de variables
        // Entrada de datos
        int totalNum;
        // Salida de datos
        // Operativa
        int contador1;
        // Constantes
        // Inicialización        
        // Creación de objetos
        Scanner entrada = new Scanner( System.in );

        // Entrada de datos y resolución del programa
        totalNum = entrada.nextInt();

        while ( totalNum != 0 ) {
            int[] vector = new int[ totalNum ];

            for ( contador1 = 0; contador1 < totalNum; contador1++ ) {
                vector[ contador1 ] = entrada.nextInt();

            }
            Arrays.sort( vector );
            if ( totalNum % 2 == 0 ) {
                System.out.println( vector[ totalNum / 2 ] + vector[ totalNum / 2 - 1 ] );
            } else {
                System.out.println( vector[ totalNum / 2 ] * 2 );
            }
            totalNum = entrada.nextInt();
        }

    } // fin de main

} // fin de la clase AceptaElReto_161

