package com.acarballeira.exercicios.clases.exercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class Exercicio2.
 */
public class Exercicio2 {

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] array = {4, 3, 6, 8};
        int opcion;
        boolean repetir = false;
        
        do {
            try {
                repetir = false;
                System.out.print("Introduzca un n�mero > 0 e < " + array.length + " ");
                opcion = sc.nextInt();
                System.out.println("Valor na posicion " + opcion + ": " + array[opcion]);
            } catch (InputMismatchException e) {
                sc.nextLine(); // lectura falsa
                opcion = 0;
                System.out.println("Debe introducir un n�mero entero");
                repetir = true;
            } catch (IndexOutOfBoundsException e ) {
                System.out.println("Debe ser un n�mero entero e > 0 e < " + array.length + " ");
                repetir = true;
            } catch (Exception e) {
                System.out.println("Error inesperado " + e.getMessage());
                repetir = true;
            }
        } while (repetir);
        sc.close();
    }

}
