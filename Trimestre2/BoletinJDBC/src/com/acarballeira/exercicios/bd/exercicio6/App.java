/*
 * @Author Jose Manuel Sabarís García
 */
package com.acarballeira.exercicios.bd.exercicio6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class App.
 */
public class App {

    /** The bf. */
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    
    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        
        menu();

    }
    
    /**
     * Menu.
     */
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
                    ArrayList<Cliente> l = (ArrayList<Cliente>) Cliente.obter();
                    for (Cliente elemento : l) {
                        System.out.println(elemento);
                    }
                    break;
                case 2:
                    String nombre2 = "";
                    String apellidos2 = "";
                try {
                    System.out.print("Introduzca el nombre: ");
                    nombre2 = bf.readLine();
                    System.out.print("Introduzca los apellidos: ");
                    apellidos2 = bf.readLine();
                    Cliente.rexistrar(new Cliente(nombre2, apellidos2));
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                    break;
                case 3:
                    int idCliente3 = 0;
                    String nombre3 = "";
                    String apellidos3 = "";
                    System.out.print("Por favor, introduzca el ID del cliente a modificar: ");
                    try {
                        idCliente3 = Integer.parseInt(bf.readLine());
                        System.out.print("Introduzca el nuevo nombre: ");
                        nombre3 = bf.readLine();
                        System.out.print("Introduzca los apellidos: ");
                        apellidos3 = bf.readLine();
                    } catch (NumberFormatException e1) {
                        e1.printStackTrace(System.out);
                    } catch (IOException e1) {
                        e1.printStackTrace(System.out);
                    }
                    Cliente c3 = new Cliente( nombre3, apellidos3);
                    c3.setIdCliente(idCliente3);
                    Cliente.actualizar(c3);  
                    if (Cliente.actualizar(c3)) {
                        System.out.println("Cliente modificado correctamente");
                    } else {
                        System.out.println("Cliente no encontrado");
                    }
                    break;
                case 4:
                    Cliente c4 = new Cliente();
                    int idCliente;
                    System.out.print("Por favor, introduzca el ID del cliente a eliminar: ");
                    try {
                        idCliente = Integer.parseInt(bf.readLine());
                        c4.setIdCliente(idCliente);
                        if ((Cliente.obter(idCliente)) != null) {
                           Cliente.eliminar(c4);
                           if (!Cliente.eliminar(c4)) {
                               System.out.println("Cliente eliminado correctamente");
                           } else {
                               System.out.println("Cliente no encontrado");
                           }
                        }
                    } catch (NumberFormatException e) {
                        e.printStackTrace(System.out);
                    } catch (IOException e) {
                        e.printStackTrace(System.out);
                    }
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
