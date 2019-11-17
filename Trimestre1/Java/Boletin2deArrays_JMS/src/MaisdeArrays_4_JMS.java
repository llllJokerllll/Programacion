/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Boletin2deArrays_JMS en 17 nov. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio MaisdeArrays_4
 * @version 1.0
 */
// Queremos guardar los nombres y la edades de los alumnos de un curso (máximo de 35 alumnos). 
// Realiza un programa que introduzca el nombre y la edad de cada alumno. 
// El proceso de lectura de datos terminará cuando se introduzca como nombre un asterisco (*).

// Importación de librerías
import java.util.Scanner;

public class MaisdeArrays_4_JMS {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        // Salida de datos
        // Operativa
        int contador;
        // Constantes
        // Inicialización
        contador = 0;
        // Creación de objetos
        Scanner entrada = new Scanner( System.in );
        int[] edades = new int[ 35 ];
        String[] nomAlumno = new String[ 35 ];
        
        // Entrada de datos y resolución del programa
        while ( contador < edades.length ) {
            System.out.println( "Por favor, introduzca el nombre del alumno" );
            nomAlumno[ contador ] = entrada.next();
            if ( nomAlumno[ contador ].equals( "*" ) ) break;
            System.out.println( "Por favor, introduzca la edad del alumno" );
            edades[ contador ] = entrada.nextInt();
            contador++;
        }
        
        // Salida de datos
        System.out.println( "Los alumnos mayores de edad son los siguientes:" );
        for ( contador = 0; contador < nomAlumno.length; contador++ ) {
            if ( edades[ contador ] > 17 ) {
                System.out.println( nomAlumno[ contador ] + " " + edades[ contador ] + " años." );
            }
        }

    } // fin de main
    
} // fin de la clase MaisdeArrays_4_JMS

