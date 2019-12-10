/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Ejercicios_AceptaElReto en 26 nov. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio AceptaElReto_168
 * @version 1.0
 */

// Importación de librerías
import java.util.Scanner;
import java.util.Arrays;

public class AceptaElReto_168 {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int casos;
        // Salida de datos
        int resultado;
        // Operativa
        int contador1;
        // Constantes
        // Inicialización        
        // Creación de objetos
        Scanner entrada = new Scanner ( System.in );
        
        // Entrada de datos y resolución del programa
        casos = entrada.nextInt();
        
        while ( casos != 0 ) {
            int[] puzzle = new int[ casos - 1 ];
            resultado = 1;
            for ( contador1 = 0; contador1 < casos - 1; contador1++ ) {
                puzzle[ contador1 ] = entrada.nextInt();
            }
            
            Arrays.sort( puzzle );
            for ( contador1 = 0; contador1 < casos - 1; contador1++ ) {
                    if ( puzzle[ contador1 ] == resultado ) {
                        resultado++;
                    } else {
                        break;
                    }
                }
            System.out.println( resultado );
            casos = entrada.nextInt();
        }


    } // fin de main
    
} // fin de la clase AceptaElReto_168

