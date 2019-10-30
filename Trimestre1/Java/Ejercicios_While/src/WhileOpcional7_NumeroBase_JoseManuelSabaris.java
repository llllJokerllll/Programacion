/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio 
 * @version 1.0 
 */
// Crear un algoritmo para convertir un número de base numérica genérica x a base y.
// La base mínina será base2 y la máxima base10.

import java.util.Scanner; // el programa utiliza la clase Scanner

public class WhileOpcional7_NumeroBase_JoseManuelSabaris {

    public static void main( String[] args ) {
        
        // crea el objeto Scanner para oberner la entra de la ventana de comandos
        Scanner entrada = new Scanner( System.in );
        
        // Declaración de variables de entrada
        int numero, base, baseFinal;
        // Declaración de variables del proceso
        String numeroAux;
        // Declaración de variables de salida
        int numeroFinal;
        // Inicialización de variables

        // Entrada de datos
        System.out.print( "Por favor, introduzca el número: " );
        numero = entrada.nextInt();
        System.out.print( "Por favor, introduzca la base del número: " );
        base = entrada.nextInt();
        System.out.print( "Por favor, introduzca la base objetivo del número: " );
        baseFinal = entrada.nextInt();
        
        // Proceso y salída del programa
        //for(contador = base; contador <= baseFinal; contador++ ){
        numeroAux = Integer.toString( numero );
        numeroFinal = Integer.parseInt( numeroAux, base );
        System.out.println( "" + numero + " de base " + base + " a base " + baseFinal + " es " + Integer.toString( numeroFinal, baseFinal));

    } // fin de main   
    
} // fin de la clase WhileOpcional7_NumeroBase_JoseManuelSabaris
