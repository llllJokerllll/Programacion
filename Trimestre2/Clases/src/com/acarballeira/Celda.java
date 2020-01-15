package com.acarballeira;

import java.util.Arrays;

public class Celda {

    private String nomeCelda;
    private boolean aberta;
    private Preso[] presos;
    private final static int MAX_PRESOS = 5;
    private int numPresosActual = 0;
    
    public Celda(String nomeCelda, boolean aberta) {
        super();
        this.nomeCelda = nomeCelda;
        this.aberta = aberta;
    }

    public String getNomeCelda() {
        return nomeCelda;
    }
    
    public void setNomeCelda(String nomeCelda) {
        this.nomeCelda = nomeCelda;
    }

    public Preso[] getPresos() {
        return presos;
    }

    public void setPresos(Preso[] presos) {
        this.presos = presos;
    }

    public int getNumPresosActual() {
        return numPresosActual;
    }

    public void setNumPresosActual(int numPresosActual) {
        this.numPresosActual = numPresosActual;
    }

    public static int getMaxPresos() {
        return MAX_PRESOS;
    }

    public boolean isAberta() {
        return aberta;
    }

    public void abrir() {
        this.aberta = true;
    }
    
    public void pechar() {
        this.aberta = false;
    }
    
    public void anadirPreso(Preso p) {
        while( numPresosActual < MAX_PRESOS ) {
        presos[numPresosActual++] = p;
        }
    }

    @Override
    public String toString() {
        return "Celda [" + (nomeCelda != null ? "nomeCelda=" + nomeCelda + ", " : "") + "aberta=" + aberta + ", "
                + (presos != null ? "presos=" + Arrays.toString(presos) + ", " : "") + "numPresosActual="
                + numPresosActual + "]";
    }

    
}
