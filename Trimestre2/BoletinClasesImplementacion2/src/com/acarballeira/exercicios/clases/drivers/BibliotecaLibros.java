package com.acarballeira.exercicios.clases.drivers;

import com.acarballeira.exercicios.clases.exercicio9.Libro;
import java.util.Scanner;

public class BibliotecaLibros {

    private static final int MAX_LIBROS = 10;
    private static Libro[] biblioteca; 
    
    public static void main(String[] args) {
        
        biblioteca = new Libro[MAX_LIBROS];
        int opcion;
        int contador = 0;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.print("\nBIBLIOTECA DA CARBALLEIRA\n=========================\n1. Listado\n2. Novo libro\n3. Modificar\n4. Borrar\n5. Sair\nIntroduzca unha opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
            case 1:
                listar(biblioteca);
                break;
            case 2:
                novoLibro(biblioteca, MAX_LIBROS, contador);
                contador++;
                break;
            }
            
        } while ( opcion != 5 );
        

    }
    
    public static void listar( Libro[] biblioteca ) {
  
        System.out.println("\nLISTADO\n========");
        for( Libro x : biblioteca ) {
           System.out.println(x);
        }
       
    }

    public static Libro[] novoLibro(Libro[] biblioteca, int MAX_LIBROS, int contador) {
        Scanner sc = new Scanner(System.in);
            System.out.print("\nNOVO LIBRO\n===========\nPor favor, introduzca os datos do libro.\nTítulo: ");
            String titulo = sc.nextLine();
            System.out.print("Autor: ");
            String autor = sc.nextLine();
            System.out.print("Editorial: ");
            String editorial = sc.nextLine();
            System.out.print("Número de páxinas: ");
            int numPax = sc.nextInt();
    
            biblioteca[contador] = new Libro(titulo, autor, numPax, editorial);
        
        return biblioteca;
    }
}


