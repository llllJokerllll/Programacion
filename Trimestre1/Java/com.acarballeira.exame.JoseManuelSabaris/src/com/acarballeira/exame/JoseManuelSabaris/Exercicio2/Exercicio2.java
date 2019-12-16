/*
 * Documento creado no 2019 por DAWDU110.
 * CIFP A Carballeira. Proxecto com.acarballeira.exame.JoseManuelSabaris no 13 dic. 2019.
 * Contido con licenciamento Creative Commons CC BY-NC-SA
 * Cualificación: ?
 */

package com.acarballeira.exame.JoseManuelSabaris.Exercicio2;

/**
 * TODO - Descrición da clase
 * Plantilla de exame
 * @author Jose Manuel Sabaris Garcia "Josemsabaris@gmail.com"
 * @version 1.0
 */
// Importación de librerias
import java.io.InputStream;
import java.util.Scanner;

public class Exercicio2 {

    public static void main( String[] args ) {
        
        // Definición de variables
        // Variables de entrada
        // Variables de salida
        // Variables de operaciones
        String texto;
        String patron1 = "^[A-z]+[A-z]+$";
        String patron2 = "\\s+$";
        // Variables constantes
        // Creacion de objetos
        InputStream leer = Exercicio2.class.getResourceAsStream( "texto.txt" );
        Scanner entrada = new Scanner( leer, "ISO-8859-1" );
        // Inicialización de variables
        
        
        // Entrada de datos        
        while ( entrada.hasNext() ) {
            texto = entrada.nextLine();
            texto = texto.replaceAll( patron1, patron1.toUpperCase() ).replaceAll( patron2 , "" );
            System.out.println( texto );
        }
        
        // Resolución del problema
        
        
        // Salida de datos
        
    } // fin de main
    
} // fin de class Ekercicio2
