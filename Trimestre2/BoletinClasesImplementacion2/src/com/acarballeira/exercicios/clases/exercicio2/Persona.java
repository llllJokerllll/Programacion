package com.acarballeira.exercicios.clases.exercicio2;

public class Persona {

    private String nombre;
    private String apellidos;
    private String dni;
    private String estadoCivil;
    
    public Persona(String nombre, String apellidos, String dni, String estadoCivil) {
        super();
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.estadoCivil = estadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return String.format("Datos personales\nNombre: %s\nApellidos: %s\nDni: %s\nEstadoCivil: %s\n", nombre, apellidos, dni,
                estadoCivil);
    }
    
    
}
