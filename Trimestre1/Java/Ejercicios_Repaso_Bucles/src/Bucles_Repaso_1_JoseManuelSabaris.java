/**
 * @author Jose Manuel Sabarís
 * Título: Ejercicio 
 * @version 1.0 
 */
// El usuario de este programa será un profesor, que introducirá las notas de sus 30 alumnos de una en una.
// El algoritmo debe decirle cuántos suspensos y cuántos aprobados hay.

// Importación de librerias
import java.util.Scanner;

public class Bucles_Repaso_1_JoseManuelSabaris {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        int nota;
        // Salida de datos
        int aprobados, suspensos;
        // Operativa+
        Scanner entrada = new Scanner( System.in );
        int contador;
        // Constantes
        int MAX_ALUMNOS;
        // Inicialización
        MAX_ALUMNOS = 30;
        aprobados = suspensos = 0;
        
        // Entrada de datos y comprobación
        System.out.println( "Por favor, introduzca las notas de los alumnos a continuación" );
        for ( contador = 1; contador <= MAX_ALUMNOS; contador++ ) {
            nota = entrada.nextInt();
            if ( nota >= 5 ) {
                aprobados += 1;
            } else {
                suspensos += 1;
            }
        }

        // Salida
        System.out.println( "Hay " + aprobados + " alumnos aprobados y " + suspensos + " suspensos");
        
        
    } // fin de main
    
} // fin de la clase Bucles_Repaso_1_JoseManuelSabaris
