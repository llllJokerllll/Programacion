/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Ejercicios_Programame en 12 dic. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio F_ToBeOrNotToBee
 * @version 1.0
 */
// Importación de librerías
import java.util.Scanner;

public class F_ToBeOrNotToBee {

    public static void main( String[] args ) {

        // Declaración de variables
        // Entrada de datos
        int lado;
        // Salida de datos
        int velutinas, abejasDestro, cuadriculasDestro;
        // Operativa
        // Constantes
        // Inicialización
        velutinas = abejasDestro = cuadriculasDestro = 0;
        // Creación de objetos
        Scanner entrada = new Scanner( System.in );

        // Entrada de datos y resolución del programa
        lado = entrada.nextInt();
        int[][] panalAbejas = new int[ lado ][ lado ];
        int[][] panalVelutina = new int[ lado ][ lado ];
        for ( int i = 0; i < lado; i++ ) {
            for ( int j = 0; j < lado; j++ ) {
                panalAbejas[ i ][ j ] = entrada.nextInt();
            }
        }
        for ( int i = 0; i < lado; i++ ) {
            for ( int j = 0; j < lado; j++ ) {
                panalVelutina[ i ][ j ] = entrada.nextInt();
                velutinas += panalVelutina[ i ][ j ];
                for ( int k = 0; k < panalVelutina[ i ][ j ]; k++ ) {
                    if ( i > 0 ) {
                       if ( panalAbejas[ i - 1 ][ j ] != 0 ) {
                           abejasDestro += panalAbejas[ i - 1 ][ j ];
                           cuadriculasDestro++;
                           panalAbejas[ i - 1 ][ j ] = 0;
                       }
                        if ( j > 0 ) {
                            if ( panalAbejas[ i - 1 ][ j - 1 ] != 0 ) {
                                abejasDestro += panalAbejas[ i - 1 ][ j - 1 ];
                                cuadriculasDestro++;
                                panalAbejas[ i - 1 ][ j - 1 ] = 0;
                            }
                        }

                        if ( j < lado - 1 ) {
                            if ( panalAbejas[ i - 1 ][ j + 1 ] != 0 ) {
                                abejasDestro += panalAbejas[ i - 1 ][ j + 1 ];
                                cuadriculasDestro++;
                                panalAbejas[ i - 1 ][ j - 1 ] = 0;
                            }
                        }
                    }
                    if ( j < lado - 1 ) {
                        if ( panalAbejas[ i ][ j + 1 ] != 0 ) {
                            abejasDestro += panalAbejas[ i ][ j + 1 ];
                            cuadriculasDestro++;
                            panalAbejas[ i ][ j + 1 ] = 0;
                        }
                    }

                    if ( j > 0 ) {
                        if ( panalAbejas[ i ][ j - 1 ] != 0 ) {
                            abejasDestro += panalAbejas[ i ][ j - 1 ];
                            cuadriculasDestro++;
                            panalAbejas[ i ][ j - 1 ] = 0;
                        }
                        if ( i < lado - 1 ) {
                            if ( panalAbejas[ i + 1 ][ j - 1 ] != 0 ) {
                                abejasDestro += panalAbejas[ i + 1 ][ j - 1 ];
                                cuadriculasDestro++;
                                panalAbejas[ i + 1 ][ j - 1 ] = 0;
                            }
                        }
                    }
                    if ( i < lado - 1 ) {
                        if ( panalAbejas[ i + 1 ][ j ] != 0 ) {
                            abejasDestro += panalAbejas[ i + 1 ][ j ];
                            cuadriculasDestro++;
                            panalAbejas[ i + 1 ][ j ] = 0;
                        }
                    }
                    if ( j < lado - 1 && i < lado - 1 ) {
                        if ( panalAbejas[ i + 1 ][ j + 1 ] != 0 ) {
                            abejasDestro += panalAbejas[ i + 1 ][ j + 1 ];
                            cuadriculasDestro++;
                            panalAbejas[ i + 1 ][ j + 1 ] = 0;
                        }
                    }
                }
            }
        }
        // Salida de datos
        System.out.println( velutinas + " " + abejasDestro + " " + cuadriculasDestro );
        
    } // fin de main

} // fin de la clase F_ToBeOrNotToBee

