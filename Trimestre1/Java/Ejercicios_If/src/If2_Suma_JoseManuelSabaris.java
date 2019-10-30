// Autor: Jose Manuel Sabarís
// Título: Ejercicio If 2
// Se tiene como datos 4 valores numéricos distintos, en caso contraro el programa debe terminar.
// Calcular y mostrar la suma del mayor número y el menor número de los 4 datos.

import java.util.Scanner; // el programa utiliza la clase Scanner

public class If2_Suma_JoseManuelSabaris {

    public static void main( String[] args ) {

        // crea el objeto Scanner para oberner la entra de la ventana de comandos
        Scanner entrada = new Scanner( System.in );

        // Declaración de variables de entrada
        int numero1, numero2, numero3, numero4;

        //Declaración de variables de salida
        int numeroMayor, numeroMenor;

        // Entrada de datos
        System.out.print( "Por favor, introduzca el primer número entero: " ); // indicador
        numero1 = entrada.nextInt(); // lee el primer número del usuario

        System.out.print( "Por favor, introduzca el segundo número entero: " ); // indicador
        numero2 = entrada.nextInt(); // lee el segundo número del usuario

        System.out.print( "Por favor, introduzca el tercer número entero: " ); // indicador
        numero3 = entrada.nextInt(); // lee el tercer número del usuario

        System.out.print( "Por favor, introduzca el cuarto número entero: " ); // indicador
        numero4 = entrada.nextInt(); // lee el cuarto número del usuario

        // Comprobación y proceso
        if ( numero1 == numero2 || numero1 == numero3 || numero1 == numero4 || numero2 == numero3 || numero2 == numero4 || numero3 == numero4 ) {
            System.err.println( "ERROR, alguno de los números que ha introducido son iguales" );
        } else {
            if ( numero1 > numero2 && numero1 > numero3 && numero1 > numero4 ) {
                numeroMayor = numero1;
            } else if ( numero2 > numero3 && numero2 > numero4 ) {
                numeroMayor = numero2;
            } else if ( numero3 > numero4 ) {
                numeroMayor = numero3;
            } else {
                numeroMayor = numero4;
            }
            if ( numero1 < numero2 && numero1 < numero3 && numero1 < numero4 ) {
                numeroMenor = numero1;
            } else if ( numero2 < numero3 && numero2 < numero4 ) {
                numeroMenor = numero2;
            } else if ( numero3 < numero4 ) {
                numeroMenor = numero3;
            } else {
                numeroMenor = numero4;
            }

            // Salida resultado
            System.out.println( "La suma del número mayor y menor introducidos es: " + ( numeroMayor + numeroMenor ) );
        }
    } // fin del método main
} // fin de la clase If2_Suma_JoseManuelSabaris
