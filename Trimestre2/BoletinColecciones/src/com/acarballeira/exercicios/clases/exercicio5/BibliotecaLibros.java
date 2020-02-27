/*
 * @Author Jose Manuel Sabarís García
 */
package com.acarballeira.exercicios.clases.exercicio5;

import java.util.ArrayList;
import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class BibliotecaLibros.
 */
public class BibliotecaLibros {
 
    /** The Constant INCREMENTO_CODIGO. */
    private final static byte INCREMENTO_CODIGO = 5;
    
    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Libro> biblioteca = new ArrayList<Libro>();
        int opcion;
        int contador = 0;
        int contadorCodigo = 0;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.print("\nBIBLIOTECA DA CARBALLEIRA\n=========================\n1. Listado\n2. Novo libro\n3. Modificar\n4. Borrar\n5. Sair\nIntroduzca unha opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
            case 1:
                listar(biblioteca);
                break;
            case 2:
                contadorCodigo += INCREMENTO_CODIGO;
                novoLibro(biblioteca, contador, contadorCodigo);
                contador++;
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
    public static void listar(ArrayList<Libro> biblioteca) {
  
        System.out.println("\nLISTADO\n========");
        for( Libro x : biblioteca ) {
           System.out.println(x);
        }
       
    }

    /**
     * Novo libro.
     *
     * @param biblioteca the biblioteca
     * @param contador the contador
     * @param contadorCodigo the contador codigo
     */
    public static void novoLibro(ArrayList<Libro> biblioteca, int contador, int contadorCodigo) {
        Scanner sc = new Scanner(System.in);
            System.out.print("\nNOVO LIBRO\n===========\nPor favor, introduzca os datos do libro.\nTítulo: ");
            String titulo = sc.nextLine();
            System.out.print("Autor: ");
            String autor = sc.nextLine();
            System.out.print("Editorial: ");
            String editorial = sc.nextLine();
            System.out.print("Número de páxinas: ");
            int numPax = sc.nextInt();
            
            biblioteca.add(new Libro(titulo, autor, numPax, editorial, contadorCodigo));
            
    }
    
    /**
     * Editar libro.
     *
     * @param biblioteca the biblioteca
     * @param codigo the codigo
     */
    public static void editarLibro(ArrayList<Libro> biblioteca, int codigo) {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < biblioteca.size(); i++) {
            if (biblioteca.get(i).codigo == codigo ) {
                System.out.print("\nEDITANDO LIBRO\n===========\nPor favor, introduzca os datos do libro a editar.\nTítulo: ");
                String titulo = sc.nextLine();
                System.out.print("Autor: ");
                String autor = sc.nextLine();
                System.out.print("Editorial: ");
                String editorial = sc.nextLine();
                System.out.print("Número de páxinas: ");
                int numPax = sc.nextInt();
                if (!titulo.equals("")) {
                    biblioteca.get(i).titulo = titulo;
                }
                if (!autor.equals("")) {
                    biblioteca.get(i).autor = autor;
                }
                if (!editorial.equals("")) {
                    biblioteca.get(i).editorial = editorial;
                }
                if (numPax != 0) {
                    biblioteca.get(i).numPax = numPax;
                }

                break;
            }
        }
    }
    
    /**
     * Borrar libro.
     *
     * @param biblioteca the biblioteca
     * @param codigo the codigo
     */
    public static void borrarLibro(ArrayList<Libro> biblioteca, int codigo) {
        for (int i = 0; i < biblioteca.size(); i++) {
            if (biblioteca.get(i).codigo == codigo ) {
                biblioteca.remove(i);
            }
        }
    }
}


