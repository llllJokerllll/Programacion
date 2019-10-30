// Autor: Jose Manuel Sabarís
// Título: Ejercicio While Práctica
// Analisis de los resultados de un examen, utilizando instrucciones de control anidadas.
import java.util.Scanner; // esta clase utiliza la clase Scanner

public class Ejercicios_While {

    public static void main( String[] args ) {
        
        // crea objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner( System.in );
        
        // iniciailización de las variables en declaraciones
        int aprobados = 0, // número de aprobados
        suspensos = 0, // número de suspensos
        contadorEstudiantes = 1, // contador de estudiantes
        resultado; // un resultado del examen ( obtiene el valor del ususario )
        
        // procesa 10 estudiantes, usando ciclo controlado por contador
        while ( contadorEstudiantes <= 10 ) {
        
            // pide al usuario la entrada y obtiene el valor
            System.out.print( "Escribe el resultado ( 1 = aprobado, 2 = reprobrado ): " );
            resultado = entrada.nextInt();
            
            // if...else anidado en la instrucción while
            if ( resultado == 1 ) {
                // incrementa aprobados;
                aprobados += 1;
            } else {
                // incrementa suspensos;
                suspensos += 1;
            }
            
            // Incrementa el contadorEstudiantes, para que el ciclo termine en un momento dado
            contadorEstudiantes++;
        } // fin de while
        
        // fase de terminación; prepara y muestra los resultados
        if ( aprobados > 8 ) {
            System.out.println( "Bono para el instructor!" );
        } 
    } // fin de main   
} // fin de la clase Ejercicios_While
