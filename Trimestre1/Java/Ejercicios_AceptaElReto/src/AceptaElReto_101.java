/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Ejercicios_AceptaElReto en 23 nov. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio AceptaElReto_101
 * @version 1.0
 */


// Importación de librerías
import java.util.Scanner;

public class AceptaElReto_101 {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int tLados;
        // Salida de datos
        // Operativa
        int contador1, contador2;
        int sumaVertical, sumaVertical2, sumaHoriz, sumaHoriz2, sumaDiag1, sumaDiag2;
        int cm2, numMax, mitadCuadrado, mitadCuadrado2;
        // Constantes
        // Inicializaciónç
        // Creación de objetos
        Scanner entrada = new Scanner( System.in );
        
        // Entrada de datos, resolución del programa y salida
        while ( true ) {
            tLados = entrada.nextInt();
            if ( tLados == 0 ) break;
            int[][] cuadrado = new int [ tLados ][ tLados ];
            sumaVertical = sumaVertical2 = sumaHoriz = sumaHoriz2 = sumaDiag1 = sumaDiag2 = 0;
            numMax = 0;
            if ( tLados % 2 != 0 ) {
                mitadCuadrado = tLados / 2;
            
                for ( contador1 = 0; contador1 < tLados; contador1++ ) {
                    for ( contador2 = 0; contador2 < tLados; contador2++ ) {
                        cuadrado[ contador1 ][ contador2 ] = entrada.nextInt();
                        if ( cuadrado[ contador1 ][ contador2 ] > numMax ) {
                            numMax = cuadrado[ contador1 ][ contador2 ];
                        }
                        if ( contador1 == contador2 ) {
                            sumaDiag1 += cuadrado[ contador1 ][ contador2 ];
                        }
                        if ( mitadCuadrado == contador2 ) {
                            sumaVertical += cuadrado[ contador1 ][ contador2 ];
                        } 
                        if ( mitadCuadrado == contador1 ) {
                            sumaHoriz += cuadrado[ contador1 ][ contador2 ];
                        }
                        if ( contador1 + contador2 == tLados - 1 ) {
                            sumaDiag2 += cuadrado[ contador1 ][ contador2 ];
                        }
                    }
                }
//                for ( int[] x : cuadrado ) {
//                    for ( int y : x ) {
//                        System.out.print( y  + " " );
//                    }
//                    System.out.println( "" );
//                }
//                System.out.println( sumaDiag1 );
//                System.out.println( sumaDiag2 );
//                System.out.println( sumaHoriz );
//                System.out.println( sumaVertical );
                
                if ( sumaDiag1 == sumaVertical && sumaDiag1 == sumaHoriz && sumaDiag1 == sumaDiag2 ) {
                    cm2 = 4 * sumaHoriz / tLados;
//                    System.out.println( cm2 );
                    if ( numMax <= tLados * tLados && cuadrado[ mitadCuadrado ][ mitadCuadrado ] * 4 == cm2 && cuadrado[ 0 ][ mitadCuadrado ] + cuadrado[ mitadCuadrado ][ 0 ] + cuadrado[ tLados - 1 ][ mitadCuadrado ] + cuadrado[ mitadCuadrado ][ tLados - 1 ] == cm2 && cuadrado[ 0 ][ 0 ] + cuadrado[ 0 ][ tLados - 1 ] + cuadrado[ tLados - 1 ][ 0 ] + cuadrado[ tLados - 1 ][ tLados - 1 ] == cm2 ) {
                        System.out.println( "ESOTERICO" );
                    } else {
                        System.out.println( "DIABOLICO" );
                    }
                } else {
                    System.out.println( "NO" );
                }
            } else {
                mitadCuadrado = tLados / 2;
                mitadCuadrado2 = mitadCuadrado + 1;
                
                for ( contador1 = 0; contador1 < tLados; contador1++ ) {
                    for ( contador2 = 0; contador2 < tLados; contador2++ ) {
                        cuadrado[ contador1 ][ contador2 ] = entrada.nextInt();
                        if ( cuadrado[ contador1 ][ contador2 ] > numMax ) {
                            numMax = cuadrado[ contador1 ][ contador2 ];
                        }
                        if ( contador1 == contador2 ) {
                            sumaDiag1 += cuadrado[ contador1 ][ contador2 ];
                        }
                        if ( mitadCuadrado == contador2 ) {
                            sumaVertical += cuadrado[ contador1 ][ contador2 ];
                        } 
                        if ( mitadCuadrado == contador1 ) {
                            sumaHoriz += cuadrado[ contador1 ][ contador2 ];
                        }
                        if ( contador1 + contador2 == tLados - 1 ) {
                            sumaDiag2 += cuadrado[ contador1 ][ contador2 ];
                        }
                    }
                }
            }
            
        }
        

    } // fin de main
    
} // fin de la clase AceptaElReto_101

