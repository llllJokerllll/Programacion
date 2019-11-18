/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Str3_Encuentra_JMS en 18 nov. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio Str2_Espello
 * @version 1.0
 */
// Cadena espejo. Crea un programa que reciba una cadena de caracteres y la devuelva
// invertida con efecto espejo, esto es, se concatena a la palabra original su inversa,
// compartiendo la última letra, que hará de espejo, por lo que la palabra obtenida se lee
// igual hacia adelante que hacia atrás. Por ejemplo, al introducir “teclado” devolverá
// “tecladodalcet” y al introducir “goma” devolverá “gomamog”.

// Importación de librerías
import java.util.Scanner;

public class Str2_Espello_JMS {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        String cadena1, cadena2;
        // Salida de datos
        // Operativa
        int contador;
        // Constantes
        // Inicialización
        cadena2 = "";        
        // Creación de objetos
        Scanner entrada = new Scanner( System.in );
        
        // Entrada de datos y resolución del programa
        System.out.println( "Por favor, introduzca una cadena de caraceteres" );
        cadena1 = entrada.nextLine();
        
        for ( contador = ( cadena1.length() - 2 ); contador >= 0; contador-- ) {
            cadena2 += cadena1.charAt( contador );
        }
        
        // Salida de datos
        System.out.println( cadena1.concat( cadena2 ) );

    } // fin de main
    
} // fin de la clase Str2_Espello_JMS

