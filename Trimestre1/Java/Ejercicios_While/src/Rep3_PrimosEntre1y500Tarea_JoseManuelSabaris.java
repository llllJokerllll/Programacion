// Autor: Jose Manuel Sabarís
// Título: Ejercicio While Práctica 3
// Escribir los números primos comprendidos entre 1 y 500.

public class Rep3_PrimosEntre1y500Tarea_JoseManuelSabaris {
    
    // Aqui creamos una función para saber si el número que invocamos es primo
    // public static boolean esPrimo( int numero ) {
        
        // Declaración de las variables de la función
        // int contador1 = 2;
        // boolean primo = true;
        
        // Proceso de la funcion esPrimo
        // while ( ( primo ) && ( contador1 != numero ) ) {
            // if ( numero % contador1 == 0 ) {
                // primo = false;
            // }
            // contador1++;
        // }
        // return primo; // En caso de ser primo se devuelve dicho número para ser impreso por pantalla.
    // }

    public static void main( String[] args ) {
        
        // Declaración de variables de entrada
        int numero = 500;
        // Declaración de variables del proceso
        int contador1, contador2;
        boolean esPrimo;
        
        // Realizacíon de los procesos y salida de la solución
        System.out.println( "Los números primos comprendidos entre 1 y 500 son: " );
        for ( contador1 = 2; contador1 < numero; contador1++ ) { // Hacemos un ciclo for para ver todos los números primos hasta 500.
            esPrimo = true;
            for ( contador2 = 2; contador2 != contador1; contador2++) {
                if ( contador1 % contador2 == 0 ) {
                    esPrimo = false;
                }
            }                        
            if ( esPrimo ) {
                System.out.print( contador2 + " " );
            }
        }
    } // fin de main   
} // fin de la clase Rep3_PrimosEntre1y500Tarea_JoseManuelSabaris
