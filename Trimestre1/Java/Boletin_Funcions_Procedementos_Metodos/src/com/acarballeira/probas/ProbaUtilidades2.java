/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Boletin_Funcions_Procedementos_Metodos en 10 dic. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

package com.acarballeira.probas;

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio Funcións/Procedementos/Métodos
 * @version 1.0
 */

// Define unha clase chamada ProbaUtilidades2 dentro do paquete
// com.acarballeira.probas. No seu método main, chama ao método suma, e pásalle como
// parámetros tres argumentos inseridos por liña de comandos. 

// Importación de librerías
import static com.acarballeira.Utilidades.suma;

public class ProbaUtilidades2 {

    public static void main( String[] args ) {

        System.out.println( suma( Integer.parseInt( args[ 0 ] ), Integer.parseInt( args[ 1 ] ), Integer.parseInt( args[ 2 ] ) ) );
        
    } // fin de main
    
} // fin de la clase ProbaUtilidades2

