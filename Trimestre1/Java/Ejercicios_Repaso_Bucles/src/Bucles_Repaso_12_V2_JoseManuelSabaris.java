
/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio
 * @version 1.0
 */
//

// Importación de librerias
import java.util.Scanner;

public class Bucles_Repaso_12_V2_JoseManuelSabaris {

    public static void main( String[] args ) {

        // Declaración de variables
        // Entrada de datos
        // Salida de datos
        // Operativa
        // Constantes
        // Inicialización
        // Entrada de datos y comprobación
        // Salida
        //Inicialización de variables
        Scanner s = new Scanner( System.in );
        int numero = s.nextInt();
        int linea, columna, digitos;
        //Resolución problema
        //Bucle externo
        for ( linea = 1; linea <= numero; linea++ ) {
            //Espacios
            for ( columna = 1; columna <= numero - linea; columna++ ) {
                System.out.print( " " );
            }
            //digitos
            digitos = linea;
            for ( columna = 1; columna <= linea; columna++ ) {
                System.out.print( ( digitos % 10 ) );
                digitos++;
            }
            digitos -= 2;
            for ( columna = 1; columna <= linea - 1; columna++ ) {
                System.out.print( ( digitos % 10 ) );
                digitos--;
            }
        System.out.println( " " );
        }//fin del bucle externo


    } // fin de main

} // fin de la clase Bucles_Repaso_12_V2_JoseManuelSabaris
