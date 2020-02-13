package com.acarballeira.exercicios.clases.exercicio4;

public class Guardia extends Persona {

    String nip;

    public Guardia(String nombre, String nip) {
        super(nombre);
        this.nip = nip;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
    
    @Override
    public String toString() {
        return String.format("Nombre: %s%nNIP: %s%n",nombre, nip);
    }
    
    public void abrirCelda(Celda p, String codSeguridad) {
        if(!p.isAbierta()) {
            p.abrir(codSeguridad);
        }
    }
    
    public void cerrarCelda(Celda p, String codSeguridad) {
        if(p.isAbierta()) {
            p.cerrar(codSeguridad);
        }
    }
    
    
}

