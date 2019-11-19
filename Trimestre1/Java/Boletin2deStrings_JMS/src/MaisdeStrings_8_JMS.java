/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Boletin2deStrings_JMS en 19 nov. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio MaisdeStrings_8
 * @version 1.0
 */
// Escriba un programa que lea una frase y a continuación visualice cada palabra de la frase en
// columnas, seguida del número de letras que tiene cada palabra.
// Importación de librerías
import java.util.Scanner;
import java.util.StringTokenizer;

public class MaisdeStrings_8_JMS {

    public static void main( String[] args ) {

        // Declaración de variables
        // Entrada de datos
        String texto;
        // Salida de datos
        String palabra;
        // Operativa
        int contador, pos;
        // Constantes
        // Inicialización
        contador = 0;
        // Creación de objetos
        Scanner entrada = new Scanner( System.in );

        // Entrada de datos 
        System.out.println( "Por favor, introduzca una frase" );
        texto = entrada.nextLine();

        // Resolución del programa
        StringTokenizer st = new StringTokenizer( texto );
        while ( st.hasMoreTokens() ) {
            palabra = st.nextToken();
            System.out.println( palabra + " tiene: " + palabra.length() + " letras" );
        }
        System.out.println( "*-----------------------------------------*" );

        texto = texto.trim();
        if ( texto.isEmpty() ) {
        } else {
            pos = texto.indexOf( " " );
            while ( pos != -1 ) {
                palabra = texto.substring( contador, pos);
                System.out.println( palabra + " tiene: " + palabra.length() + " letras" );
                contador = pos + 1;
                pos = texto.indexOf( " ", pos + 1 );
                if ( pos == -1 ) {
                    palabra = texto.substring( contador, texto.length() );
                    System.out.println( palabra + " tiene: " + palabra.length() + " letras" );
                }
            }
        }

       
    } // fin de main

} // fin de la clase MaisdeStrings_8_JMS

