// Autor: Jose Manuel Sabarís
// Título: Ejercicio While Opcional 1
// Leer una lista de números que finaliza cuando se ingresar el número 0 (cero).
// al finalizar emitir el valor máximo de la lista, y la ubicación del máximo dentro de la lista. 

import java.util.Scanner; // esta clase utiliza la clase Scanner

public class WhileOpcional1_MaximoLista_JoseManuelSabaris {
    
    public static void main( String[] args ) {
        
        // crea objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner( System.in );
        
        // Declaración de variables de entrada
        int numero;
        // Declaración de variables del proceso
        int contador = 1;
        // Declaración de variables de salida
        int numMaximo = 0, posNumMax = 0;
        
        // Proceso en donde pedimos numeros al usuario.
        do {
            System.out.print( "Por favor, introduzca un número: " );
            numero = entrada.nextInt();
            
            if ( numero > numMaximo ) { // comprobación de si el numero introducido es el mas alto de la lista
                numMaximo = numero; // se guarda en caso afirmativo el numero como maximo
                posNumMax = contador; // se guarda la posicion del numero maximo
            }
            contador++; // suma posiciones a los números introducidos por el usuario
        } while ( numero != 0 ); // cuando el usuario introduzca 0 finaliza
        
        // Salida del programa con la solución
        System.out.println( "El valor máximo de la lista es el: " + numMaximo + " y su posición es la: " + posNumMax );
        
    } // fin de main   
} // fin de la clase WhileOpcional1_MaximoLista_JoseManuelSabaris
