package com.acarballeira.exercicios.clases.exercicio8;

public class Espanol extends Persona implements Hablador {

    public Espanol(String nombre, String apellidos) {
        super(nombre, apellidos);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void saluda() {
        System.out.println("Hola");
    }
}
