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

public class Ejercicio_5 {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        String hora;
        // Salida de datos
        int minutosFaltan;
        // Operativa
        String[] horas;
        // Constantes
        final int TOT_MIN_DIA = 1440;
        // Inicialización        
        // Creación de objetos
        Scanner entrada = new Scanner( System.in );
        
        // Entrada de datos y resolución del programa
        System.out.print( "Introduce la hora actual: " );
        hora = entrada.next();
        horas = hora.split( ":" );
        minutosFaltan = TOT_MIN_DIA - ( Integer.parseInt( horas[ 0 ] ) * 60 + Integer.parseInt( horas[ 1 ] ) );
        
        // Salida de datos
        System.out.println( "Faltan " + minutosFaltan + " minutos hasta las campanadas" );

    } // fin de main
    
} // fin de la clase Ejercicio_5

