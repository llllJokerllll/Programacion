/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Boletin2deStrings_JMS en 18 nov. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio MaisdeStrings_2
 * @version 1.0
 */
// Crear un programa que reciba dos números enteros por línea de comandos y un texto.
// El programa debe multiplicar los dos números. Como resultado debe mostrarse el texto
// concatenado consigo mismo el número de veces que indique la multiplicación de los números.

// Importación de librerías

public class MaisdeStrings_2_JMS {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        // Salida de datos
        // Operativa
        int resultado, contador;
        // Constantes
        // Inicialización        
        // Creación de objetos
        StringBuilder salida = new StringBuilder( args[ 2 ] );
        
        // Entrada de datos y resolución del programa
        resultado = Integer.parseInt( args[ 0 ] ) * Integer.parseInt( args[ 1 ] );
        for ( contador = 0; contador < resultado; contador++ ) {
            salida.append( args[ 2 ] );
        }
        
        // Salida de datos
        System.out.println( salida );

    } // fin de main
    
} // fin de la clase MaisdeStrings_2_JMS

