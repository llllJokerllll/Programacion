package com.acarballeira.exercicios.clases.exercicio5;

import java.util.HashMap;
import java.util.Scanner;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class BibliotecaLibrosSet {
    
    private static HashMap<Integer, Libro> biblioteca;
    
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
              /*Iterator it = biblioteca.values().iterator();
              while(it.hasNext()) {
                  Libro l = (Libro)it.next();
                  System.out.println(l);
              }*/
              for(Libro l : biblioteca.values()) {
                  System.out.println(l);
              }
              
              /*for (Map.Entry<Integer, Object> entry : biblioteca.entrySet()) {
                  Integer key = entry.getKey();
                  Object value = entry.getValue();
                  
              }*/
              
              Iterator<Entry<Integer, Libro>> it = biblioteca.entrySet().iterator();
              while(it.hasNext()) {
                  Libro l = (Libro)it.next().getValue();
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
              Libro l = (new Libro(titulo, autor, editorial));
              l.setNumPaxinas(numPaxinas);
              biblioteca.put(l.getCodigo(), l);
              break;
              
            case 3:
              System.out.println("\nMODIFICAR");
              System.out.println("===========");
              
              System.out.print("Por favor, introduza o código do libro do que quere cambiar os datos: ");
              codigo = Integer.parseInt(sc.nextLine());
              
              Libro l2 = (Libro)biblioteca.get(codigo);
              if (l2 == null) {
                  System.out.println("No hay ningún libro con el código introducido");
              }
              else {
                  System.out.println("Introduza os novos datos do libro ou INTRO para deixalos igual.");
                  
                  System.out.println("Título: " + l2.getTitulo());
                  System.out.print("Novo título: ");
                  titulo = sc.nextLine();
                  if (!titulo.equals("")) {
                    l2.setTitulo(titulo);
                  }
                  
                  System.out.println("Autor: " + l2.getAutor());
                  System.out.print("Novo autor: ");
                  autor = sc.nextLine();
                  if (!autor.equals("")) {
                      l2.setAutor(autor);
                  }
                  
                  System.out.println("Editorial: " + l2.getEditorial());
                  System.out.print("Nova editorial: ");
                  editorial = sc.nextLine();
                  if (!editorial.equals("")) {
                     l2.setEditorial(editorial);
                  }
                  
                  System.out.println("Número de páxinas: " + l2.getNumPaxinas());
                  System.out.print("Novo número de páxinas: ");
                  numPaxinasString = sc.nextLine(); 
                  if (!numPaxinasString.equals("")) {
                      l2.setNumPaxinas(Integer.parseInt(numPaxinasString));
                  }
              }
                            
              break;
              
            case 4:
              System.out.println("\nBORRAR");
              System.out.println("======");
              
              System.out.print("Por favor, introduzca o código do libro que desexa borrar: ");
              codigo = Integer.parseInt(sc.nextLine());
              
              if (biblioteca.remove(codigo) == null) {
                  System.out.println("No hay ningún libro con el código introducido");
              }
              else {                  
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
        
        biblioteca = new HashMap<Integer,Libro>();
        
    }

}
