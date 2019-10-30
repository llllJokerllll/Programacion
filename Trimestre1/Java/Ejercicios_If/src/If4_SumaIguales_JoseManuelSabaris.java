// Autor: Jose Manuel Sabarís
// Título: Ejercicio If 4
// Siendo los datos tres números enteros, determinar si la suma de cualquier pareja de ellos es igual al número restante.
// Si se cumple esta condición, escribir “Iguales”, en caso contrario escribir “Distintos”.

import java.util.Scanner; // el programa utiliza la clase Scanner

public class If4_SumaIguales_JoseManuelSabaris {
    
    public static void main( String[] args ) {

        // crea el objeto Scanner para oberner la entra de la ventana de comandos
        Scanner entrada = new Scanner( System.in );
        
        // Declaración de variables de entrada
        int numero1, numero2, numero3;
        
        // Declaración de variables de salida
        String resultado;
        
        // Entrada de datos
        System.out.print( "Por favor, introduzca el primer número entero: " ); // indicador
        numero1 = entrada.nextInt(); // lee el primer número del usuario

        System.out.print( "Por favor, introduzca el segundo número entero: " ); // indicador
        numero2 = entrada.nextInt(); // lee el segundo número del usuario

        System.out.print( "Por favor, introduzca el tercer número entero: " ); // indicador
        numero3 = entrada.nextInt(); // lee el tercer número del usuario
        
        // Comprobación y proceso
        if ( ( numero1 + numero2 == numero3 ) || ( numero3 + numero1 == numero2) || ( numero2 + numero3 == numero1 ) ) {
            resultado = "Iguales";
        } else {
            resultado = "Distintos";
        }
        
        // Salida resultado
        System.out.println( resultado );
        
    } // fin del método main
} // fin de la clase If3_SumaIguales_JoseManuelSabaris