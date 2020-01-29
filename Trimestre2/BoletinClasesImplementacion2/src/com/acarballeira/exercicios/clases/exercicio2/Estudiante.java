package com.acarballeira.exercicios.clases.exercicio2;

public class Estudiante extends Persona {

    private int curso;

    public Estudiante(String nombre, String apellidos, String dni, String estadoCivil, int curso) {
        super(nombre, apellidos, dni, estadoCivil);
        this.curso = curso;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return String.format("Estudiante\nCurso: %s\n%s", curso, super.toString());
    }
    
    
}
