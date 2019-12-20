/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Examen_Distancia1_2018 en 20 dic. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

package examen_distancia1_2018;

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio 
 * @version 1.0
 */

// Importación de librerías
import java.util.Scanner;

public class Ejercicio_1 {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int num;
        // Salida de datos
        int unaCifra, dosCifras, tresCifras;
        // Operativa
        // Constantes
        // Inicialización
        unaCifra = dosCifras = tresCifras = 0;
        // Creación de objetos
        Scanner entrada = new Scanner( System.in );
        
        // Entrada de datos y resolución del programa
        do {
            System.out.print( "Introduce un número entero, teclea el valor -1 para finalizar el programa: " );
            num = entrada.nextInt();
            if ( Integer.toString( num ).length() == 1 && num >= 0 ) {
                unaCifra++;
            } else if ( Integer.toString( num ).length() == 2 && num >= 0 ) {
                dosCifras++;
            } else if ( Integer.toString( num ).length() > 2 && num >= 0 ) {
                tresCifras++;
            }
            
        } while ( num != -1 );
        
        // Salida de datos
        System.out.println( "Has tecleado " + unaCifra + ( unaCifra == 1 ? " número de una cifra" : " números de una cifra" ) );
        System.out.println( "Has tecleado " + dosCifras + ( dosCifras == 1 ? " número de una cifra" : " números de una cifra" ) );
        System.out.println( "Has tecleado " + tresCifras + ( tresCifras == 1 ? " número de una cifra" : " números de una cifra" ) );


    } // fin de main
    
} // fin de la clase Ejercicio_1

