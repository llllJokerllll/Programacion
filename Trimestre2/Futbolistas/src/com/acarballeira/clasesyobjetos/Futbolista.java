package com.acarballeira.clasesyobjetos;

public class Futbolista extends Miembro_Staff {

    private int dorsal;
    private Demarcacion posicion;
    
    public Futbolista(String nome, int dorsal, Demarcacion posicion) {
        super();
        this.nome = nome;
        this.dorsal = dorsal;
        this.posicion = posicion;
    }
    
    public int getDorsal() {
        return dorsal;
    }
    
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    
    public Demarcacion getPosicion() {
        return posicion;
    }
    
    public void setPosicion(Demarcacion posicion) {
        this.posicion = posicion;
    }

    public void juegaPartido() {
        System.out.println("Vamos a ganar este partido!!!");
    }
    
    public void entrena() {
        System.out.println("Entrenando duro en el gym");
    }
    
    @Override
    public String toString() {
        return super.toString() + ", " + "dorsal=" + dorsal + ", "
                + (posicion != null ? "posicion=" + posicion : "") + "]";
    }
      
}
