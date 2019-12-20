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

public class Ejercicio_3 {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int num;
        // Salida de datos
        // Operativa
        int suma, aux, div;
        // Constantes
        // Inicialización
        div = 1;
        suma = 0;
        // Creación de objetos
        Scanner entrada = new Scanner( System.in );
        
        // Entrada de datos y resolución del programa
        System.out.println( "Por favor, introduzca un número entero positivo" );
        num = entrada.nextInt();
        aux = num;
        
        while ( div != num ) {
            if ( aux % div == 0 ) {
                suma += div;
                div++;
            } else {
                div++;
            }
        }
        System.out.println( suma );
        // Salida de datos
        if ( suma < num ) {
            System.out.println( "Número deficiente" );
        } else {
            System.out.println( "Número eficiente" );
        }

    } // fin de main
    
} // fin de la clase Ejercicio_3

