// Autor: Jose Manuel Sabarís
// Título: Ejercicio While Práctica 1
// Calcular la suma de los 300 primeros números positivos impares.

public class Rep1_300NumeroPositivosImparesTarea_JoseManuelSabaris {

    public static void main( String[] args ) {
        
        // Declaración de variables del proceso
        int contador, sumaResultado = 0;
        
        // Proceso del programa
        for ( contador = 1; contador <= 300; contador += 2 ) {
            sumaResultado += contador;
        }
        
        // Salida y Resultado
        System.out.println( "La suma total es: " + sumaResultado );
        
    } // fin de main 
} // fin de la clase Rep1_300NumeroPositivosImparesTarea_JoseManuelSabaris
