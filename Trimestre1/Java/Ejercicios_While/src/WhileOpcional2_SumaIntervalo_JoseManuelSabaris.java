// Autor: Jose Manuel Sabarís
// Título: Ejercicio While Opcional 2
// Escribir un programa que permite ingresar dos valores A y B que determinan un
// intervalo, luego ir acumulando los valores que se ingresan a continuación siempre y
// cuando estos pertenezcan al intervalo.
// El ingreso de números finaliza cuando ingresa el 99.

import java.util.Scanner; // esta clase utiliza la clase Scanner

public class WhileOpcional2_SumaIntervalo_JoseManuelSabaris {

    public static void main( String[] args ) {
        
        // crea objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner( System.in );
        
        // Declaración de variables de entrada
        int A, B, C = 0;
        // Declaración e inicialización de variables de salida
        int sumaIntervalo = 0;
        
        // Entrada de datos
        System.out.print( "Por favor, introduzca el primer número: " );
        A = entrada.nextInt();
        System.out.print( "Por favor, introduzca el segundo número: " );
        B = entrada.nextInt();
        
        // Comprobación y proceso del programa
        while ( A != 99 && B != 99 && C != 99 ) {
            System.out.print( "Por favor, introduzca un número: " );
            C = entrada.nextInt();
            
            if ( ( C > A && C < B ) || ( C < A && C > B ) ) {
                sumaIntervalo += C;
            }
        }
        // Salida de la solución
        System.out.println( "La suma de los números dentro del intervalo es: " + sumaIntervalo );
        
    } // fin de main 
    
} // fin de la clase WhileOpcional2_SumaIntervalo_JoseManuelSabaris
