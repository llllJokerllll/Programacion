/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Str3_Encuentra_JMS en 18 nov. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio Str3_Encuentra
 * @version 1.0
 */
// Encuentra cadena. Diseña un programa en Java que solicite al usuario una cadena en la
// que buscará y otra que será la cadena buscada. El programa indicará cuantas veces
// aparece la segunda cadena en la primera.


// Importación de librerías
import java.util.Scanner;

public class Str3_Encuentra_JMS {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        String cadena1, cadena2;
        // Salida de datos
        int contador;
        // Operativa
        int posicion;
        // Constantes
        // Inicialización
        contador = 0;
        // Creación de objetos
        Scanner entrada = new Scanner( System.in );
        
        // Entrada de datos y resolución del programa
        System.out.println( "Por favor, introduzca una cadena de caraceteres" );
        cadena1 = entrada.nextLine();
        System.out.println( "Por favor, introduzca una cadena de caraceteres" );
        cadena2 = entrada.nextLine();
        
        posicion = cadena1.indexOf( cadena2 );
        while ( posicion != -1 ) {
            contador++;
            posicion = cadena1.indexOf( cadena2, posicion + 1 );
        }
        
        // Salida de datos
        System.out.println( "La segunda cadena aparece " + contador + " veces en la primera cadena" );

    } // fin de main
    
} // fin de la clase Str3_Encuentra_JMS

