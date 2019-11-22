/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Boletin2deStrings_JMS en 21 nov. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio MaisdeStrings_16
 * @version 1.0
 */
// Emprega a clase Scanner para ler as liñas dun ficheiro de texto e amosa o resultado mediante
// consola.

// Importación de librerías
import java.util.Scanner;
import java.io.InputStream;

public class MaisdeStrings_16_JMS {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        InputStream ficheiro = MaisdeStrings_16_JMS.class.getResourceAsStream("texto.txt");
        // Salida de datos
        // Operativa
        // Constantes
        // Inicialización        
        // Creación de objetos
        Scanner entrada = new Scanner( ficheiro );
        
        // Entrada de datos y resolución del programa
        while ( entrada.hasNext() ) {
            System.out.println( entrada.nextLine() );
        }
        
        // Salida de datos
        entrada.close();

    } // fin de main
    
} // fin de la clase MaisdeStrings_16_JMS

