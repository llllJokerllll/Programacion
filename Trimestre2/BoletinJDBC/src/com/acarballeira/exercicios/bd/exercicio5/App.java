package com.acarballeira.exercicios.bd.exercicio5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class App {

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) {
        
        menu();

    }
    
    static void menu() {
        int opcion =  -1;
        while (opcion != 5) {
            System.out.println("CLIENTES");
            System.out.println("=======================");
            System.out.println("1. Listado");
            System.out.println("2. Novo cliente");
            System.out.println("3. Modificar");
            System.out.println("4. Borrar");
            System.out.println("5. Sair");
            System.out.print("Introduzca unha opción: ");
            try {
                opcion = Integer.parseInt(bf.readLine());
            } catch (NumberFormatException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            
            switch (opcion) {
                case 1:
                    Cliente c1 = new Cliente();
                    ArrayList<Cliente> l = (ArrayList<Cliente>) c1.obter();
                    for (Cliente elemento : l) {
                        System.out.println(elemento);
                    }
                    break;
                case 2:
                    int id = -1;
                    System.out.print("Por favor, introduzca el ID del cliente a buscar: ");
                try {
                    id = Integer.parseInt(bf.readLine());
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                    Cliente c2 = new Cliente();
                    System.out.println(c2.obter(id));
                    break;
                case 3:
                    String nombre;
                    String apellidos;
                    Cliente c3 = new Cliente();
                    c3.rexistrar(new Cliente("Jose Manuel", "Sabaris Garcia"));                 
                    //modificar();
                    break;
                case 4:
                    //borrar();
                    break;
                case 5:
                    System.out.println("Hasta outra, grazas por utilizar os nosos servizos");
                    break;
                default:
                    System.out.println("Opción seleccionada incorrecta");
                    break;
            }
            
            
        }
        
    }

}
