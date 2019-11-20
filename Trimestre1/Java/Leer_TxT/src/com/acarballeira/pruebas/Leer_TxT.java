/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Leer_TxT en 15 nov. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

package com.acarballeira.pruebas;

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio 
 * @version 1.0
 */
//

// Importación de librerías
import java.util.Scanner;
import java.io.InputStream;

public class Leer_TxT {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        InputStream ficheiro = Leer_TxT.class.getResourceAsStream("texto.txt");
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
    
} // fin de la clase Leer_TxT

