package Trimestre2;

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio 
 * @version 1.0
 */

// Importación de librerías

public class PruebaConstructores {

    public static void main( String[] args ) {
        
        Constructores tiempo = new Constructores();
        
        String salida;
        
        salida = "Hora universal inicial es: " + tiempo.horaUniversal() + "\nHora estandar inicial es: " + tiempo.horaEstandar();
        
        tiempo.cambiarHora( 13, 27, 6 );
        
        salida += "\n\nHora universal despues de cambiada: " + tiempo.horaUniversal() + "\nHora estandar despues de cambiada: " + tiempo.horaEstandar();
        
        tiempo.cambiarHora( 99, 99, 99 );
        
        salida += "\n\nDespues de poner valores inválidos: " + "\nHora universal: " + tiempo.horaUniversal() + "\nHora estandar: " + tiempo.horaEstandar();

        System.out.println( salida );
    } // fin de main
    
} // fin de la clase PruebaConstructores

