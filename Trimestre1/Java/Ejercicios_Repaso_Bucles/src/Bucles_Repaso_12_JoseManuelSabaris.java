/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio 
 * @version 1.0 
 */
// Hacer un programa que pida un número por teclado y que escriba la siguiente pirámide de dígitos, utilizando bucles anidados para el proceso. Sería para el caso de 10.

// Importación de librerias
import java.util.Scanner;

public class Bucles_Repaso_12_JoseManuelSabaris {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        // Salida de datos
        // Operativa
        // Constantes
        // Inicialización

        
        // Entrada de datos y comprobación

        
        // Salida
        int numero;
        Scanner entrada;
        //variables operativas
        int fila;
        int columna;
        int acum = 1;
        int acum2 = 2;
        int x = 1;
        int j;
        int k;
        int i;
        //salida de datos
        //creacion de objetos
        entrada = new Scanner( System.in );
        //inicializar
        //Entrada de datos
        numero = entrada.nextInt();
        //programa
        numero = ( numero * 2 ) - 1;
        for ( i = 1; i <= numero; i += 2 ) {
            for ( k = 1; k <= numero - i; k += 2 ) {

                System.out.print( " " );

            }
            for ( j = 1; j <= i; j++ ) {
                if ( j == 1 || j == i ) {
                    if ( acum == 10 ) {
                        acum = 0;
                        System.out.print( acum );
                    } else {
                        System.out.print( acum );
                    }
                } else {
                    if ( j <= ( i / 2 ) + 1 ) {
                        acum2++;
                        if ( acum2 == 10 ) {
                            acum2 = 0;
                        }

                        System.out.print( acum2 );
                    } else {

                        if ( acum2 == 0 ) {
                            acum2 = 9;
                            System.out.print( acum2 );
                        } else {
                            acum2 = acum2 - 1;
                            System.out.print( acum2 );
                        }

                    }
                }
            }
            acum++;
            if ( acum == 10 ) {
                acum2 = 0;
            } else {
                acum2 = acum;
            }
            System.out.println();

        }
        
        
    } // fin de main
    
} // fin de la clase Bucles_Repaso_12_JoseManuelSabaris
