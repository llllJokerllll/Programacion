/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio 
 * @version 1.0 
 */
// Se desea escribir un algoritmo que permita determinar si un número n , tiene la característica de ser un número OMIRP. 

import static java.lang.Integer.parseInt; // importamos esta clase para poder pasar de String a Int y darle la vuelta al número
import java.util.Scanner; // el programa utiliza la clase Scanner

public class WhileOpcional5_Omirp_JoseManuelSabaris {

    public static void main( String[] args ) {
        
        // crea el objeto Scanner para oberner la entra de la ventana de comandos
        Scanner entrada = new Scanner( System.in );
        
        // Declaración de variables de entrada
        int numero;
        // Declaración de variables del proceso
        int contador1, contador2, dividendo, resto, digitos, numeroReves;
        boolean esPrimo;
        String revesCaracter, revesResto;
        // Inicialización de variables
        esPrimo = true;
        digitos = 0;
        revesCaracter = "";
        
        // Entrada de datos
        System.out.print( "Por favor, introduzca un número entero: " );
        numero = entrada.nextInt();
        
        // Proceso y salída del programa
        for ( contador1 = 2; contador1 != numero; contador1++) { // primera comprobación para ver si el número dado es primo
                if ( numero % contador1 == 0 ) {
                    esPrimo = false;
                    break; // para el ciclo al saber que no es primo
                }
            }                        
            if ( esPrimo ) {
                System.out.println( "El " + numero + " es un número Primo" );
        } else {
                System.out.println( "El " + numero + " no es un número primo" );
            }
            
        if ( esPrimo ) { // en caso de ser primo procedemos a ir sacando digito a digito para darle la vuelta
            dividendo = numero;
            while ( dividendo > 0 ) {
                resto = dividendo % 10; // sacamos el ultimo dígito
                dividendo = Math.floorDiv( dividendo, 10 ); // reducimos el número -1 dígito
                revesResto = String.valueOf(resto); // convertimos el valor del dígito sacado a String
                revesCaracter = revesCaracter + revesResto; // concatenamos los dígitos pasados a String
                digitos += 1; // contador para saber la cantidad de digitos que tiene el número
            }
            numeroReves = parseInt( revesCaracter ); // pasamos el número del revés de String a Int
            System.out.println( "El número del revés es: " + numeroReves );
            for ( contador2 = 2; contador2 != numeroReves; contador2++ ) { // comprobamos que el número del revés sea primo
                if ( numeroReves % contador2 == 0 ) {
                    esPrimo = false;
                    break; // para el ciclo al saber que no es primo
                }
            } 
            if ( esPrimo ) {
                System.out.println( "El " + numeroReves + " es un número Primo" );
                System.out.println( "El " + numero + " es un número OMIRP" );
            } else {
                System.out.println( "El " + numeroReves + " no es un número Primo" );
                System.out.println( "El " + numero + " no es un número OMIRP" );
            }
        }
    } // fin de main   
    
} // fin de la clase WhileOpcional5_Omirp_JoseManuelSabaris
