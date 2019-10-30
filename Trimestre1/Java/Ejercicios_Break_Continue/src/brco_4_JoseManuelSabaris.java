/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio Break/Continue 4
 * @version 1.0 
 */
// Crea un programa en Java que amose a suma dos números 1000 a 1100 ambos inclusive.
// Debes implementar a solución mediante un bucle while infinito.

// Importación de librerias

public class brco_4_JoseManuelSabaris {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        // Salida de datos
        int sumaTotal;
        // Operativa
        int contador;
        // Constantes
        int NUM_INICIO, NUM_FINAL;
        // Inicialización
        NUM_INICIO = 1000;
        NUM_FINAL = 1100;
        sumaTotal = 0;
        contador = 0;
        
        // Entrada de datos y comprobación
        while ( NUM_INICIO > 0 ) {
            sumaTotal += NUM_INICIO + contador;
            if ( contador == 100 ) break;
            contador++;
        }
        
        // Salida
        System.out.println( "La suma total es: " + sumaTotal );

               
    } // fin de main
    
} // fin de la clase brco_4_JoseManuelSabaris
