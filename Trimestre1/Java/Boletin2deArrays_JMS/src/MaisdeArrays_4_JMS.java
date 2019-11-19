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
        String resultado;
        // Operativa
        int contador, contador2, edadMax;
        // Constantes
        // Inicialización
        contador = edadMax = 0;
        resultado = "Los alumnos que tienen mayor edad son: \n";
        // Creación de objetos
        Scanner entrada = new Scanner( System.in );
        int[] edades = new int[ 35 ];
        String[] nomAlumno = new String[ 35 ];
        
        // Entrada de datos y resolución del programa
        while ( contador < edades.length ) {
            System.out.println( "Por favor, introduzca el nombre del alumno" );
            nomAlumno[ contador ] = entrada.next();
            if ( nomAlumno[ contador ].equals( "*" ) ) {
                break;
            }
            System.out.println( "Por favor, introduzca la edad del alumno" );
            edades[ contador ] = entrada.nextInt();
            if ( edadMax < edades[ contador ] ) {
                edadMax = edades[ contador ];
            }
            contador++;
        }
        
        // Salida de datos
        System.out.println( "Los alumnos mayores de edad son los siguientes:" );
        for ( contador2 = 0; contador2 < contador; contador2++ ) {
            if ( edades[ contador2 ] > 17 ) {
                System.out.println( nomAlumno[ contador2 ] + " " + edades[ contador2 ] + " años." );
            }
            if ( edades[ contador2 ] == edadMax ) {
                resultado += nomAlumno[ contador2 ] + " " + edades[ contador2 ] + "\n";
            }
        }
        System.out.println( resultado );

    } // fin de main
    
} // fin de la clase MaisdeArrays_4_JMS

