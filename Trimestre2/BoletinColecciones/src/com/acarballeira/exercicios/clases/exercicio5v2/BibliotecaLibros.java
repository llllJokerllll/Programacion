package com.acarballeira.exercicios.clases.exercicio5v2;

import java.util.HashMap;
import java.util.Scanner;

public class BibliotecaLibros {
 
    private final static byte INCREMENTO_CODIGO = 5;
    
    public static void main(String[] args) {
        
        HashMap<Integer, Libro> biblioteca = new HashMap<Integer, Libro>();
        int opcion;
        int contadorCodigo = 0;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.print("\nBIBLIOTECA DA CARBALLEIRA\n=========================\n1. Listado\n2. Novo libro\n3. Modificar\n4. Borrar\n5. Sair\nIntroduzca unha opci�n: ");
            opcion = sc.nextInt();
            switch (opcion) {
            case 1:
                listar(biblioteca);
                break;
            case 2:
                contadorCodigo += INCREMENTO_CODIGO;
                novoLibro(biblioteca, contadorCodigo);
                break;
            case 3:
                System.out.print("Por favor, introduzca el c�digo del libro a editar: ");
                editarLibro(biblioteca, sc.nextInt());
                break;
            case 4:
                System.out.print("Por favor, introduzca el c�digo del libro a borrar: ");
                borrarLibro(biblioteca, sc.nextInt());
                break;
            default:
                break;
            }
            
        } while ( opcion != 5 );
        
        sc.close();

    }
    
    public static void listar(HashMap<Integer, Libro> biblioteca) {
  
        System.out.println("\nLISTADO\n========");
        for( Object Libro : biblioteca.keySet() ) {
           System.out.println(biblioteca.get(Libro));
        }
       
    }

    public static void novoLibro(HashMap<Integer, Libro> biblioteca, int contadorCodigo) {
        Scanner sc = new Scanner(System.in);
            System.out.print("\nNOVO LIBRO\n===========\nPor favor, introduzca os datos do libro.\nT�tulo: ");
            String titulo = sc.nextLine();
            System.out.print("Autor: ");
            String autor = sc.nextLine();
            System.out.print("Editorial: ");
            String editorial = sc.nextLine();
            System.out.print("N�mero de p�xinas: ");
            int numPax = sc.nextInt();
            
            biblioteca.put(contadorCodigo, new Libro(titulo, autor, numPax, editorial, contadorCodigo));
            
    }
    
    public static void editarLibro(HashMap<Integer, Libro> biblioteca, int codigo) {
        Scanner sc = new Scanner(System.in);
        
        Libro l = (Libro) biblioteca.get(codigo);
        if (l!= null) {
            System.out.print("\nEDITANDO LIBRO\n===========\nPor favor, introduzca os datos do libro a editar.\nT�tulo: ");
            String titulo = sc.nextLine();
            System.out.print("Autor: ");
            String autor = sc.nextLine();
            System.out.print("Editorial: ");
            String editorial = sc.nextLine();
            System.out.print("N�mero de p�xinas: ");
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
            System.out.println("ERROR, c�digo del libro erroneo");
        }
    }
    
    public static void borrarLibro(HashMap<Integer, Libro> biblioteca, int codigo) {
        Libro l = (Libro) biblioteca.get(codigo);
        if (l!= null) {
           biblioteca.remove(codigo);
            
        }
    }
}


