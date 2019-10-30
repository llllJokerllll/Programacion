// Autor: Jose Manuel Sabarís
// Título: Ejercicio While Opcional 4
// Realizar un algoritmo que determine si una serie de números ingresada por teclado es ascendente.
// El final de la serie viene dado por un número negativo. (Ej: 1, 5, 5, 10, 11, 12, 12, 20,-1 es una serie ascendente).

import java.util.Scanner; // esta clase utiliza la clase Scanner

public class WhileOpcional3_SerieAscendente_JoseManuelSabaris {

    public static void main( String[] args ) {
        
        // crea objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner( System.in );
        
        // Declaración de variables de entrada
        int numero;
        // Declaración de variables del proceso
        int numAnterior;
        // Declaración de variables de salida
        boolean ascendente;
        
        // Inicialización de variables
        ascendente = true;
        numAnterior = 0;
        numero = 0;
        
        // Realizacíon de los procesos
        do {            
            if ( numAnterior > numero ) {
                ascendente = false;
            }
            
            numAnterior = numero;
            
            System.out.print( "Por favor, introduzca un número: " );
            numero = entrada.nextInt();
            
                        
        } while ( numero >= 0 );
    
        // Salida de la solución
        if ( ascendente ) {
            System.out.println( "La serie es ascendente" );
        } else {
            System.out.println( "La serie es descendente" );
        }
    }// fin de main   

} // WhileOpcional3_SerieAscendente_JoseManuelSabaris
    

