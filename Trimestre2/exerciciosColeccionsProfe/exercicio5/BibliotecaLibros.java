package com.acarballeira.exercicios.clases.exercicio5;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.Iterator;

public class BibliotecaLibros {
    
    private static ArrayList<Libro> biblioteca;
    
    public static void main(String[] args) {

        int opcion;
        
        creaBiblioteca();
        do {
            opcion = opcionMenu();
            executaOpcion(opcion);
        } while (opcion != 5);
             
    }
    
    private static void executaOpcion(int opcion) {
        
        int primeiraLibre;
        String autor, titulo, editorial, numPaxinasString;
        int numPaxinas;
        int codigo, codAux;
        int i;
        
        Scanner sc = new Scanner(System.in);
                
        switch (opcion) {
            case 1:
              System.out.println("\nLISTADO");
              System.out.println("=======");
              for(Libro l : biblioteca) {
                  System.out.println(l);
              }
              break;
              
            case 2:
              System.out.println("\nNOVO LIBRO");
              System.out.println("===========");              
              
              System.out.println("Por favor, introduza os datos do libro.");                
              System.out.print("Título: ");
              titulo = sc.nextLine();                            
              System.out.print("Autor: ");
              autor = sc.nextLine();                            
              System.out.print("Editorial: ");
              editorial = sc.nextLine();              
              System.out.print("Número de páxinas: ");
              numPaxinas = Integer.parseInt(sc.nextLine());  
              biblioteca.add(new Libro(titulo, autor, editorial));
              //Engade o libro ao final. Sería mellor crear o obxecto e logo inserilo, non?
              biblioteca.get(biblioteca.size()-1).setNumPaxinas(numPaxinas);
              break;
              
            case 3:
              System.out.println("\nMODIFICAR");
              System.out.println("===========");
              
              System.out.print("Por favor, introduza o código do libro do que quere cambiar os datos: ");
              codigo = Integer.parseInt(sc.nextLine());
              
              i = 0;
              codAux = -99999999;              
              
              while (codAux != codigo && i < biblioteca.size()) {                
                //O código do primeiro elemento das coleccións comeza por cero
                codAux = biblioteca.get(i).getCodigo();
                i++;
              }
              
              if (codAux != codigo) {
                  System.out.println("No hay ningún libro con el código introducido");
              }
              else {
                  System.out.println("Introduza os novos datos do libro ou INTRO para deixalos igual.");
                  
                  System.out.println("Título: " + biblioteca.get(i).getTitulo());
                  System.out.print("Novo título: ");
                  titulo = sc.nextLine();
                  if (!titulo.equals("")) {
                    biblioteca.get(--i).setTitulo(titulo);
                  }
                  
                  System.out.println("Autor: " + biblioteca.get(i).getAutor());
                  System.out.print("Novo autor: ");
                  autor = sc.nextLine();
                  if (!autor.equals("")) {
                      biblioteca.get(i).setAutor(autor);
                  }
                  
                  System.out.println("Editorial: " + biblioteca.get(i).getEditorial());
                  System.out.print("Nova editorial: ");
                  editorial = sc.nextLine();
                  if (!editorial.equals("")) {
                      biblioteca.get(i).setEditorial(editorial);
                  }
                  
                  System.out.println("Número de páxinas: " + biblioteca.get(i).getNumPaxinas());
                  System.out.print("Novo número de páxinas: ");
                  numPaxinasString = sc.nextLine(); 
                  if (!numPaxinasString.equals("")) {
                      biblioteca.get(i).setNumPaxinas(Integer.parseInt(numPaxinasString));
                  }
              }
                            
              break;
              
            case 4:
              System.out.println("\nBORRAR");
              System.out.println("======");
              
              System.out.print("Por favor, introduzca o código do libro que desexa borrar: ");
              codigo = Integer.parseInt(sc.nextLine());
        
              i = 0;
              codAux = -99999999;              
              while (codAux != codigo && i < biblioteca.size()) {                
                codAux = biblioteca.get(i).getCodigo();
                i++;
              }              
              
              if (codAux != codigo) {
                  System.out.println("No hay ningún libro con el código introducido");
              }
              else {
                  biblioteca.remove(--i);
                  System.out.println("Libro borrado.");
              }                            
              break;
          
            default:
        
        } // switch
    }
    
    private static int opcionMenu() {
        
        Scanner sc = new Scanner(System.in);
        String opc;
        
        System.out.println("\n\nBIBLIOTECA DA CARBALLEIRA");
        System.out.println("======================");
        System.out.println("1. Listado");
        System.out.println("2. Novo libro");
        System.out.println("3. Modificar");
        System.out.println("4. Borrar");
        System.out.println("5. Sair");
        System.out.print("Introduza unha opción: ");
        opc = sc.nextLine();
        
        return Integer.parseInt(opc);

    }
    
    private static int numeroLibros() {
        
        return biblioteca.size();
    }
    
    private static void creaBiblioteca() {
        
        biblioteca = new ArrayList<Libro>();
        
    }

}
