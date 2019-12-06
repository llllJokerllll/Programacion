/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio
 * @version 1.0
 */
import java.util.Date;

public class EjemploHerencia {

    public static void main( String[] args ) {

        // Creación de objetos
        Empleado empleado1 = new Empleado( "Jose", 5000 );
        empleado1.setEdad( 31 );
        empleado1.setGenero( 'M' );
        empleado1.setDireccion( "Martin Codax" );
        System.out.println( empleado1 );

        Cliente cliente1 = new Cliente( new Date(), true );
        cliente1.setNombre( "Carmen" );
        cliente1.setEdad( 28 );
        cliente1.setGenero( 'F' );
        cliente1.setDireccion( "Martin Codax" );
        System.out.println( cliente1 );

    } // fin de main

} // fin de la clase EjemploHerencia

