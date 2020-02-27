/*
 * @Author Jose Manuel Sabarís García
 */
package com.acarballeira.exercicios.clases.exercicio4;

// TODO: Auto-generated Javadoc
/**
 * The Class Guardia.
 */
public class Guardia extends Persona {

    /** The nip. */
    String nip;

    /**
     * Instantiates a new guardia.
     *
     * @param nombre the nombre
     * @param nip the nip
     */
    public Guardia(String nombre, String nip) {
        super(nombre);
        this.nip = nip;
    }

    /**
     * Gets the nip.
     *
     * @return the nip
     */
    public String getNip() {
        return nip;
    }

    /**
     * Sets the nip.
     *
     * @param nip the new nip
     */
    public void setNip(String nip) {
        this.nip = nip;
    }
    
    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return String.format("Nombre: %s%nNIP: %s%n",nombre, nip);
    }
    
    /**
     * Abrir celda.
     *
     * @param p the p
     * @param codSeguridad the cod seguridad
     */
    public void abrirCelda(Celda p, String codSeguridad) {
        if(!p.isAbierta()) {
            p.abrir(codSeguridad);
        }
    }
    
    /**
     * Cerrar celda.
     *
     * @param p the p
     * @param codSeguridad the cod seguridad
     */
    public void cerrarCelda(Celda p, String codSeguridad) {
        if(p.isAbierta()) {
            p.cerrar(codSeguridad);
        }
    }
    
    
}

