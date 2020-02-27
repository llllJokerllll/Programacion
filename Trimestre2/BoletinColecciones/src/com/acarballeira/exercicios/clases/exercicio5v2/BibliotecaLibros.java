/*
 * @Author Jose Manuel Sabarís García
 */
package com.acarballeira.exercicios.clases.exercicio5v2;

import java.util.HashMap;
import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class BibliotecaLibros.
 */
public class BibliotecaLibros {
    
    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        
        HashMap<Integer, Libro> biblioteca = new HashMap<Integer, Libro>();
        int opcion;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.print("\nBIBLIOTECA DA CARBALLEIRA\n=========================\n1. Listado\n2. Novo libro\n3. Modificar\n4. Borrar\n5. Sair\nIntroduzca unha opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
            case 1:
                listar(biblioteca);
                break;
            case 2:
                novoLibro(biblioteca);
                break;
            case 3:
                System.out.print("Por favor, introduzca el código del libro a editar: ");
                editarLibro(biblioteca, sc.nextInt());
                break;
            case 4:
                System.out.print("Por favor, introduzca el código del libro a borrar: ");
                borrarLibro(biblioteca, sc.nextInt());
                break;
            default:
                break;
            }
            
        } while ( opcion != 5 );
        
        sc.close();
        
    }
    
    /**
     * Listar.
     *
     * @param biblioteca the biblioteca
     */
    public static void listar(HashMap<Integer, Libro> biblioteca) {
  
        System.out.println("\nLISTADO\n========");
        for( Object Libro : biblioteca.keySet() ) {
           System.out.println(biblioteca.get(Libro));
        }
       
    }

    /**
     * Novo libro.
     *
     * @param biblioteca the biblioteca
     */
    public static void novoLibro(HashMap<Integer, Libro> biblioteca) {
        Scanner sc = new Scanner(System.in);
            System.out.print("\nNOVO LIBRO\n===========\nPor favor, introduzca os datos do libro.\nTítulo: ");
            String titulo = sc.nextLine();
            System.out.print("Autor: ");
            String autor = sc.nextLine();
            System.out.print("Editorial: ");
            String editorial = sc.nextLine();
            System.out.print("Número de páxinas: ");
            int numPax = sc.nextInt();
            Libro res = new Libro(titulo, autor, numPax, editorial);
            
            biblioteca.put(res.getCodigo(), res);
            
    }
    
    /**
     * Editar libro.
     *
     * @param biblioteca the biblioteca
     * @param codigo the codigo
     */
    public static void editarLibro(HashMap<Integer, Libro> biblioteca, int codigo) {
        Scanner sc = new Scanner(System.in);
        
        Libro l = (Libro) biblioteca.get(codigo);
        if (l!= null) {
            System.out.print("\nEDITANDO LIBRO\n===========\nPor favor, introduzca os datos do libro a editar.\nTítulo: ");
            String titulo = sc.nextLine();
            System.out.print("Autor: ");
            String autor = sc.nextLine();
            System.out.print("Editorial: ");
            String editorial = sc.nextLine();
            System.out.print("Número de páxinas: ");
            int numPax = sc.nextInt();
            
            if (!titulo.equals("")) {
                l.setTitulo(titulo);
            }
            if (!autor.equals("")) {
                l.setAutor(autor);
            }
            if (!editorial.equals("")) {
                l.setEditorial(editorial);
            }
            if (numPax != 0) {
                l.setNumPax(numPax);
            }
            
            biblioteca.put(codigo, l);

        } else {
            System.out.println("ERROR, código del libro erroneo");
        }
    }
    
    /**
     * Borrar libro.
     *
     * @param biblioteca the biblioteca
     * @param codigo the codigo
     */
    public static void borrarLibro(HashMap<Integer, Libro> biblioteca, int codigo) {
        Libro l = (Libro) biblioteca.get(codigo);
        if (l!= null) {
           biblioteca.remove(codigo);
            
        }
    }
}


