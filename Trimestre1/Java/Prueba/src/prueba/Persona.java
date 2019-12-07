/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Prueba en 5 dic. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

package prueba;

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Practica Clases en Java
 * @version 1.0
 */

// Importación de librerías

public class Persona {

    private int idPersona;
    private String nombre;
    private int edad;
    private static int contadorPersonas;
    
    private Persona() {
        // super(); se manda a llamar ede manera automática
        this.idPersona = ++contadorPersonas;
    }

    // Constructor completo - sobrecarga
    public Persona( String nombre, int edad ) {
        this();
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre( String nombre ) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad( int edad ) {
        this.edad = edad;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }   
    
    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    
} // fin de la clase Persona

