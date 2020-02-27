/*
 * @Author Jose Manuel Sabarís García
 */
package com.acarballeira.exercicios.clases.exercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

// TODO: Auto-generated Javadoc
/**
 * The Class App.
 */
public class App {

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Integer> al = vector();
        
        mostrarArray(al);

        System.out.println("El número máximo es: " + Collections.max(al));
        System.out.println("El número mínimo es: " + Collections.min(al));
        System.out.println("La suma de todos los números es: " + calcularSuma(al));
        System.out.println("La media de todos los números es: " + calcularSuma(al) / al.size());
        
    }

    
    /**
     * Numero aleatorio.
     *
     * @return the int
     */
    public static int numeroAleatorio() {
        Random rd = new Random();
        return rd.nextInt(100 + 1);
    }
    
    /**
     * Tamano vector.
     *
     * @return the int
     */
    public static int tamanoVector() {
        Random rd = new Random();
        return rd.nextInt(20 - 10 + 1) + 10;
    }
    
    /**
     * Vector.
     *
     * @return the array list
     */
    public static ArrayList<Integer> vector() {
        ArrayList<Integer> al = new ArrayList<Integer>();
        
        for (int i = 0; i < tamanoVector(); i++) {
            al.add(numeroAleatorio()); 
        }
        
        return al;
    }
    
    /**
     * Mostrar array.
     *
     * @param vector the vector
     */
    public static void mostrarArray(ArrayList<Integer> vector) {
        for (Integer x : vector) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    
    /**
     * Calcular suma.
     *
     * @param vector the vector
     * @return the int
     */
    public static int calcularSuma(ArrayList<Integer> vector) {
        int suma = 0;
        Iterator it = vector.iterator();
        while (it.hasNext()) {
                 suma = suma + (Integer) it.next();
                //next() devuelve un dato de tipo Object. Hay que convertirlo a Integer
        }
        return suma;
  }
}
