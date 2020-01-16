/*
 * Documento creado no 2020 por DAWDU10
 * CIFP A Carballeira. Proyecto Examen1_Trimestre en 16 ene. 2020
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio 
 * @version 1.0
 */

// Importación de librerías
import java.io.InputStream;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        // Salida de datos
        int numLinas, numLinasB, numLetras;
        // Operativa
        String lina;
        StringBuilder linaProcesada;
        String[] vectorS;
        String signoPuntuacion;
        // Constantes
        // Inicialización
        numLinas = numLinasB = numLetras = 0;
        // Creación de objetos
        InputStream ip = Ejercicio1.class.getResourceAsStream( "texto.txt" );
        Scanner entrada = new Scanner( ip, "ISO-8859-1" );

        // Entrada de datos y resolución del programa
        while ( entrada.hasNext() ) {
            lina = entrada.nextLine();
            numLinas++;
            if ( !lina.equals( "" )) {
                // Saco epacios en blanco
                lina = lina.trim();
                vectorS = lina.split( "\\s+" );
                linaProcesada = new StringBuilder();
                for ( String s : vectorS ) {
                    // Por si hay un signo de puntiación
                    if ( s.matches( ".*[\\.\\,\\;\\:]$" ) ) { 
                        // Suponemos que solo hay un signo al final.
                        signoPuntuacion = s.substring( s.length() - 1 );
                        s = s.substring( 0, s.length() - 1 );
                    } else {
                        signoPuntuacion = "";
                    }
                    // Solo contamos las letras sin los signos.
                    numLetras += s.length();
                    if ( s.length() > 1 ) {
                        linaProcesada.append( String.valueOf( s.charAt( 0 )).toUpperCase()).append( s.substring( 1, s.length() - 1 )).append( String.valueOf( s.charAt( s.length() - 1)).toUpperCase()).append( signoPuntuacion );
                    } else {
                        linaProcesada.append( String.valueOf( s.charAt( 0 )).toUpperCase()).append( signoPuntuacion );
                    }
                    linaProcesada.append( " " );
                }
                System.out.println( linaProcesada.toString() );
            } else {
                numLinasB++;
            }
        } // fin de while
        
        // Salida de datos
        System.out.printf( "%10s%n", "********** Estadísticas **********" );
        System.out.printf( "|%-30s%4d|%n", "Número de lineas: ", numLinas );
        System.out.printf( "|%-30s%4d|%n", "Número de lineas en Blanco: ", numLinasB );
        System.out.printf( "|%-30s%4d|%n", "Número de letras por linea de media: ", ( numLetras / ( numLinas - numLinasB )) );

    } // fin de main
    
} // fin de la clase Ejercicio1

