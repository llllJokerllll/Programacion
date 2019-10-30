/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio Break/Continue 5
 * @version 1.0 
 */
// Crea un programa en Java que escriba os números pares do 100 ao 130, ambos incluidos, excepto o 116 de 3 formas distintas:
// a. Incrementando 2 en cada iteración e empregando continue.
// b. Incrementando 1 en cada iteración e empregando continue.
// c. Mediante un bucle infinito empregando break e continue.
// As tres solucións deben implementarse mediante un bucle for.

// Importación de librerias

public class brco_5_JoseManuelSabaris {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        // Salida de datos
        int resultado;
        // Operativa
        int contador;
        // Constantes
        int NUM_INICIO, NUM_FINAL, NUM_FALLO;
        // Inicialización
        NUM_INICIO = 100;
        NUM_FINAL = 130;
        NUM_FALLO = 116;
        
        // Entrada de datos, comprobación y salida
        for ( contador = NUM_INICIO; contador <= NUM_FINAL ; contador += 2 ) {
            if ( contador == NUM_FALLO ) continue;
            resultado = contador;
            System.out.print( resultado + " " );
        }
        System.out.println( "" );
        
        for ( contador = NUM_INICIO; contador <= NUM_FINAL ; contador++ ) {
            if ( contador == NUM_FALLO || contador % 2 != 0 ) continue;
            resultado = contador;
            System.out.print( resultado + " " );
        }
        System.out.println( "" );
        
        for ( contador = NUM_INICIO; contador != 0 ; contador++ ) {
            if ( contador == NUM_FALLO || contador % 2 != 0 ) continue;
            resultado = contador;
            System.out.print( resultado + " " );
            
            if ( contador == NUM_FINAL ) break;
        }
        
        
    } // fin de main
    
} // fin de la clase brco_5_JoseManuelSabaris
