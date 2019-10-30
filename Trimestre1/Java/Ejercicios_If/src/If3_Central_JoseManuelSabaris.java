// Autor: Jose Manuel Sabarís
// Título: Ejercicio If 3
// Se tiene como datos 3 valores numéricos distintos, en caso contraro el programa debe terminar.
// Determinar y mostrar el número que ocupa la posición del centro, al ordenar los mismos de menor a mayor.

import java.util.Scanner; // el programa utiliza la clase Scanner

public class If3_Central_JoseManuelSabaris {

    public static void main( String[] args ) {

        // crea el objeto Scanner para oberner la entra de la ventana de comandos
        Scanner entrada = new Scanner( System.in );

        // Declaración de variables de entrada
        int numero1, numero2, numero3;

        //Declaración de variables de salida
        int numeroCentral;

        // Entrada de datos
        System.out.print( "Por favor, introduzca el primer número entero: " ); // indicador
        numero1 = entrada.nextInt(); // lee el primer número del usuario

        System.out.print( "Por favor, introduzca el segundo número entero: " ); // indicador
        numero2 = entrada.nextInt(); // lee el segundo número del usuario

        System.out.print( "Por favor, introduzca el tercer número entero: " ); // indicador
        numero3 = entrada.nextInt(); // lee el tercer número del usuario

        // Comprobación y proceso
        if ( numero1 == numero2 || numero1 == numero3 || numero2 == numero3 ) {
            System.err.println( "ERROR, alguno de los números que ha introducido son iguales" );
        } else {
            if ( numero1 > numero2 && numero1 < numero3 || numero1 < numero2 && numero1 > numero3 ) {
                numeroCentral = numero1;
            } else if ( numero2 > numero3 && numero2 < numero1 || numero2 < numero3 && numero2 > numero1 ) {
                numeroCentral = numero2;    
            } else {
                numeroCentral = numero3;
            }
        
        // Salida resultado
            System.out.println( "El número introducido que ocupa la posición central es: " + numeroCentral );
        }
    } // fin del método main
} // fin de la clase If2_Suma_JoseManuelSabaris
