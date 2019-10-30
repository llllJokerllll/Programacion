/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio Break/Continue 1
 * @version 1.0 
 */
// Elaborar un programa Java que calcule e amose a suma dos 100 primeiros números naturales. 
// Non se debe contabilizar a suma dos números, 3, 6 e 5. 
// No caso de que a suma acumule un valor superior a 150 debes deixar de acumular valores.

public class brco_1_JoseManuelSabaris {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        // Salida de datos
        int sumaTotal;
        // Operativa
        int contador;
        // Constantes
        int MAX_NUM;
        int MAX_SUM;
        // Inicialización
        MAX_NUM = 100;
        MAX_SUM = 150;
        sumaTotal = 0;
        
        // Entrada de datos y resolución del programa
        for ( contador = 1; contador != MAX_NUM; contador++ ) {
            if ( contador == 3 || contador == 6 || contador == 5 ) {
                continue;
            } else {
            sumaTotal += contador;
            }
            if ( sumaTotal > MAX_SUM ) break;
        }
        
        System.out.println( sumaTotal );
        
    } // fin de main
    
} // fin de la clase brco_1_JoseManuelSabaris
