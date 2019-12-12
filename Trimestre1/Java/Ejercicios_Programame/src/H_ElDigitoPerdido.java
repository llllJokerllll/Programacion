/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Ejercicios_Programame en 12 dic. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio 
 * @version 1.0
 */
// Importación de librerías
import java.util.Scanner;
import java.util.Arrays;

public class H_ElDigitoPerdido {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int casos;
        String numTarjeta;
        // Salida de datos
        int resultado;
        // Operativa
        int[] operaciones = new int [ 16 ];
        String aux2;
        int suma;
        boolean par;
        // Constantes
        // Inicialización        
        // Creación de objetos
        Scanner entrada = new Scanner( System.in );
        
        // Entrada de datos y resolución del programa
        casos = entrada.nextInt();
        
        for ( int i = 0; i < casos; i++ ) {
            numTarjeta = entrada.next();
            suma = 0;
            resultado = 0;
            par = false;
            for ( int j = 0; j < 16; j++ ) {
                if ( numTarjeta.charAt( j ) != '?' ) {
                    operaciones[ j ] = Integer.parseInt( numTarjeta.substring( j, j + 1 ) );
                } else {
                    operaciones[ j ] = 0;
                    par = j % 2 == 0;
                }
            }
            for ( int j = 0; j < 16; j += 2 ) {
                operaciones[ j ] *= 2;
            }
            for ( int j = 0; j < 16; j++ ) {
                if ( operaciones[ j ] > 9 ) {
                    aux2 = "" + operaciones[ j ];
                    operaciones[ j ] = Integer.parseInt( aux2.substring( 0, 1) ) + Integer.parseInt( aux2.substring( 1 ) );
                }
            }
            System.out.println( Arrays.toString( operaciones ) );
            for( int j : operaciones ) {
                suma += j;
            }
            while ( ( suma + resultado ) % 10 != 0 ) {
                resultado++;
                
            }
            if ( !par ) {
               System.out.println( resultado ); 
            } else {
                switch ( resultado ) {
                    case 0:
                        System.out.println( 0 );
                        break;
                        case 1:
                        System.out.println( 5 );
                        break;
                        case 2:
                        System.out.println( 1 );
                        break;
                        case 3:
                        System.out.println( 6 );
                        break;
                        case 4:
                        System.out.println( 2 );
                        break;
                        case 5:
                        System.out.println( 7 );
                        break;
                        case 6:
                        System.out.println( 3 );
                        break;
                        case 7:
                        System.out.println( 8 );
                        break;
                        case 8:
                        System.out.println( 4 );
                        break;
                        case 9:
                        System.out.println( 9 );
                        break;
                }
            }
            
        }


    } // fin de main
    
} // fin de la clase H_ElDigitoPerdido

