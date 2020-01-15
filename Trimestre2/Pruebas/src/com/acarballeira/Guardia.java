package com.acarballeira;

public class Guardia extends Persona {
    String nip;

    public Guardia(String nombre, String nip) {
        super(nombre);
        this.nip = nip;
    }
    
    public String toString() {
        return String.format("Nombre: %s\nNIP: %s\n",nombre, nip);
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
    
    
}
