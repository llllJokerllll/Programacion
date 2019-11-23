/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Ejercicios_AceptaElReto en 23 nov. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio AceptaElReto_171
 * @version 1.0
 */


// Importación de librerías
import java.util.Scanner;

public class AceptaElReto_171 {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int casos;
        // Salida de datos
        int abadias;
        // Operativa
        int contador1, contador2;
        // Constantes
        // Inicialización
        // Creación de objetos
        Scanner entrada = new Scanner( System.in );
        
        // Entrada de datos, resolución del programa y salida
        while ( true ) {
            casos = entrada.nextInt();
            if ( casos == 0 ) break;
            int[] cordillera = new int[ casos ];
            abadias = 1;
        
            for ( contador1 = 0; contador1 < casos; contador1++ ) {
                cordillera[ contador1 ] = entrada.nextInt();
            }
            for ( contador1 = 0; contador1 < casos; contador1++ ) {
                for ( contador2 = contador1 + 1; contador2 < casos; contador2++ ) {
                    if ( cordillera[ contador1 ] <= cordillera[ contador2 ] ) {
                        break;
                    } else if ( contador2 == casos - 1 ) {
                        abadias++;
                    }
                }
            }
            System.out.println( abadias );
        }


    } // fin de main
    
} // fin de la clase AceptaElReto_171

