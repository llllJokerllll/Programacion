/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Boletin2deStrings_JMS en 21 nov. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio MaisdeStrings_15
 * @version 1.0
 */
// Emprega JOptionPane para ler o nome, apelidos e idade dunha persoa. A idade debe
// almacenarse nun int. Amosa os anteriores valores mediante un JOptionPane igualmente.

// Importación de librerías
import javax.swing.JOptionPane;

public class MaisdeStrings_15_JMS {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        String nombre, apellidos;
        int edad;
        // Salida de datos
        // Operativa
        // Constantes
        // Inicialización        
        // Creación de objetos
        
        // Entrada de datos
        nombre = JOptionPane.showInputDialog("Por favor, ingrese aquí su nombre: ");
        apellidos = JOptionPane.showInputDialog("Por favor, ingrese aquí sus apellidos: ");
        edad = Integer.parseInt( JOptionPane.showInputDialog("Por favor, ingrese aquí su edad: ") );
        
        // Resolución del programa

        
        // Salida de datos
        JOptionPane.showMessageDialog( null, "Los datos introducidos son los siguientes: \nNombre: " + nombre + "\nApellidos: " + apellidos + "\nEdad: " + edad );

    } // fin de main
    
} // fin de la clase MaisdeStrings_15_JMS

