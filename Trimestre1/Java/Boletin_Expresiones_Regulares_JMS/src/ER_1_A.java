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
// Cadea baleira

// Importación de librerías
import java.util.Scanner;

public class ER_1_A {

    public static void main( String[] args ) {
        
        // Declaración de variables
        // Entrada de datos
        String frase;
        // Salida de datos
        // Operativa
        // Constantes
        // Inicialización        
        // Creación de objetos
        Scanner entrada = new Scanner( System.in, "ISO-8859-1" );
        
        // Entrada de datos
        System.out.println( "Por favor, introduzca un texto" );
        frase = entrada.nextLine();
        
        // Resolución del programa
        String vacio = cadenaVacia( frase )? "Es una cadena vacia" : "No es una cadena vacía"; 
        String longitud = tamano( frase ) ? "Tiene el tamaño adecuado" : "No tiene el tamaño adecuado";
        String palabra = unaPalabra( frase ) ? "Tiene una palabra" : "Es mas de una palabra";
        String dPalabras = dosPalabras( frase ) ? "Tiene dos palabras" : "No tiene solamente 2 palabras";
        String nPosDeci = numPos2dec( frase ) ? "Es un número positivo y 2 decimales" : "No es un número positivo y 2 decimales";
        String nPosDeciOp = numPos2decOpcion( frase ) ? "Tiene 1 o 2 decimales" : "No tiene 1 o 2 decimales";
        String nPosDeciOpSigno = numPos2decOpcionSigno( frase ) ? "Tiene 1 o 2 decimales" : "No tiene 1 o 2 decimales";
        String horario = fecha( frase ) ? "Fecha válida" : "Fecha no válida";
        String telefono = numTelefono( frase ) ? "Número de teléfono válido" : "Número de teléfono no válido";
        String cadenaVogais = vocalesSinAcento( frase ) ? "Es cadena de vocales" : "No es una cadena de vocales";
        String iban = esIban( frase ) ? "IBAN válido" : "IBAN inválido";
        String cPostal = codigoPostal( frase ) ? "Código postal válido" : "Código postal inválido";
        String factura = facturas( frase ) ? "Factura Válida" : "Factura Inválida";
        
        // Salida de datos
        System.out.println( vacio );
        System.out.println( longitud );
        System.out.println( palabra );
        System.out.println( dPalabras );
        System.out.println( nPosDeci );
        System.out.println( nPosDeciOp );
        System.out.println( nPosDeciOpSigno );
        System.out.println( horario );
        System.out.println( telefono );
        System.out.println( cadenaVogais );
        System.out.println( iban );
        System.out.println( cPostal );
        System.out.println( factura );
        
    } // fin de main
    
    static boolean cadenaVacia ( String n ) {
        String patron = "^$";
        return n.matches( patron );
        
    }
    
    static boolean tamano ( String n ) {
        String patron = "[A-z0-9]{8,12}";
        return n.matches( patron );
    }
    
    static boolean unaPalabra ( String n ) {
        String patron = "[A-z]+";
        return n.matches( patron );
    }
    
    static boolean dosPalabras ( String n ) {
        String patron = "[A-z]+\\s[A-z]+";
        return n.matches( patron );
    }
    
    static boolean numPos2dec ( String n ) {
        String patron = "[0-9]*,[0-9]{2}";
        return n.matches( patron );
    }
    
    static boolean numPos2decOpcion ( String n ) {
        String patron = "[0-9]*,[0-9]{1,2}?$";
        return n.matches( patron );
    }
    
    static boolean numPos2decOpcionSigno ( String n ) {
        String patron = "^[+-]?[0-9]*,[0-9]{1,2}?$";
        return n.matches( patron );
    }
    
    static boolean fecha ( String n ) {
        String patron = "[0-9]{2}-[0-9]{2}-[0-9]{4}";
        return n.matches( patron );
    }
    
    static boolean numTelefono ( String n ) {
        String patron = "(^\\+34|\\+351)?[0-9]{9,10}";
        return n.matches( patron );
    }
    
    static boolean vocalesSinAcento ( String n ) {
        String patron = "[aeiouAEIOU]{2,}";
        return n.matches( patron );
    }
    
    static boolean esIban ( String n ) {
        String patron = "^ES\\d{2}(\\-\\d{4}){5}";
        return n.matches( patron );
    }
    
    static boolean codigoPostal ( String n ) {
        String patron = "^(32|36|15|27)\\d{3}";
        return n.matches( patron );
    }
    
    static boolean facturas ( String n ) {
        String patron = "^(P-|G-|H-)\\d{4}";
        return n.matches( patron );
    }
    
} // fin de la clase ER_1_A

