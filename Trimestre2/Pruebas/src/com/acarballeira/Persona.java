package com.acarballeira;

public class Persona {
    protected String nombre;
    
    public Persona() {
    }
    
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return("Nombre: " + nombre + "\n");
    }

}
