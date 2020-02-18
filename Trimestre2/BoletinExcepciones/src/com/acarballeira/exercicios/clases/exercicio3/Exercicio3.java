package com.acarballeira.exercicios.clases.exercicio3;

public class Exercicio3 {

    public static void main(String[] args) {
       
        try {
            throw new ExcepcionPropia("Fallo propio");
        } catch (ExcepcionPropia e) {
            System.out.println(e.getMessage() + " " + e.getMensaxe());
        }
    }

}
