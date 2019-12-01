/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio 
 * @version 1.0
 */
// Nun programiña no que debes implementar a clase Regex2 recolle un texto inserido polo
// usuario e elimina os espazos en branco iniciais e finais. No caso de que entre as palabras
// inserise máis dun espazo en branco debes eliminalos tamén. Emprega expresións regulares
// e evita empregar o método trim.

// Importación de librerías
import java.util.Scanner;

public class Regex2 {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        String texto;
        // Salida de datos
        String resultado;
        // Operativa
        // Constantes
        // Inicialización        
        // Creación de objetos
        Scanner entrada = new Scanner( System.in );
        
        // Entrada de datos y resolución del programa
        System.out.println( "Por favor, introduzca un texto" );
        texto = entrada.nextLine();
        resultado = quitarEspacios( texto );
        
        // Salida de datos
        System.out.println( "El texto queda así: " + resultado );

    } // fin de main
    
    static String quitarEspacios ( String n ) {
        
        String patron1 = "\\s{2,}";
        String patron2 = "^\\s|\\s$";
        n = n.replaceAll( patron1, " " );
        n = n.replaceAll( patron2, "" );
        
        return n;
    }
    
} // fin de la clase Regex2

