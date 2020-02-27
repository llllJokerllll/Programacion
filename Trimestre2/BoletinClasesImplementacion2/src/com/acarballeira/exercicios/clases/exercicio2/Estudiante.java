package com.acarballeira.exercicios.clases.exercicio2;

// TODO: Auto-generated Javadoc
/**
 * The Class Estudiante.
 */
public class Estudiante extends Persona {

    /** The curso. */
    private int curso;

    /**
     * Instantiates a new estudiante.
     *
     * @param nombre the nombre
     * @param apellidos the apellidos
     * @param dni the dni
     * @param estadoCivil the estado civil
     * @param curso the curso
     */
    public Estudiante(String nombre, String apellidos, String dni, String estadoCivil, int curso) {
        super(nombre, apellidos, dni, estadoCivil);
        this.curso = curso;
    }

    /**
     * Gets the curso.
     *
     * @return the curso
     */
    public int getCurso() {
        return curso;
    }

    /**
     * Sets the curso.
     *
     * @param curso the new curso
     */
    public void setCurso(int curso) {
        this.curso = curso;
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return String.format("Estudiante\nCurso: %s\n%s", curso, super.toString());
    }
    
    
}
