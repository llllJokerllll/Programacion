/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Boletin2deStrings_JMS en 20 nov. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio MaisdeStrings_11
 * @version 1.0
 */
// Crear un programa de cifrado de cadenas, que implemente un algoritmo que tiene como entrada un texto. 
// El texto de entrada no contendrá ni tildes ni eñes.

// Importación de librerías
import java.util.Scanner;

public class MaisdeStrings_11_JMS {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        String texto;
        // Salida de datos
        // Operativa
        // Constantes
        // Inicialización        
        // Creación de objetos
        Scanner entrada = new Scanner( System.in );
        
        // Entrada de datos
        System.out.println( "Por favor, introduzca el texto a codificar" );
        texto = entrada.nextLine();
        
        // Resolución del programa y salida de datos
        cifradoTexto( texto );

    } // fin de main
    
    public static void cifradoTexto ( String texto ) {
        
        // Declaración de variables
        // Entrada de datos
        String textoCodificado;
        // Salida de datos
        // Operativa
        int contador1, contador2, contador3;
        // Constantes
        final String VOCALES1 = "AEIOUaeiou";
        final String VOCALES2 = "0123401234";
        final String CONSONANTES = " BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz";
        final String NUMEROS1 = "0123456789";
        final String NUMEROS2 = "=¡-.$%&/()";     
        // Inicialización
        textoCodificado = "";        
        // Creación de objetos
        
        // Entrada de datos y resolución del programa
        for ( contador1 = 0; contador1 < texto.length(); contador1++ ){
            contador3 = 0;
            for ( contador2 = 0; contador2 < CONSONANTES.length(); contador2++ ) {              
                if ( texto.charAt( contador1 ) == CONSONANTES.charAt( contador2 ) ) {
                    if ( texto.charAt( contador1 ) == ' ' ) {
                        textoCodificado += " ";
                    } else if ( texto.charAt( contador1 ) == 'Z' ) {
                        textoCodificado += 'B';
                    } else if ( texto.charAt( contador1 ) == 'z' ) {
                        textoCodificado += 'b';
                    } else {
                        textoCodificado += CONSONANTES.charAt( contador2 + 1 );
                    }
                } else if ( contador3 < 10 ) {
                    if ( texto.charAt( contador1 ) == VOCALES1.charAt( contador3 ) ) {
                        textoCodificado += VOCALES2.charAt( contador3 );
                    } else if ( texto.charAt( contador1 ) == NUMEROS1.charAt( contador3 ) ) {
                        textoCodificado += NUMEROS2.charAt( contador3 );
                    }
                }
                contador3++;
            }
        }
        
        // Salida de datos
        System.out.println( textoCodificado );
        
    } // fin de cifradoTexto
    
} // fin de la clase MaisdeStrings_11_JMS

