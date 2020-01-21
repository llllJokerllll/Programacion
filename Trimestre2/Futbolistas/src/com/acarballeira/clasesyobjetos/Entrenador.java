package com.acarballeira.clasesyobjetos;

public class Entrenador extends Miembro_Staff {

    private int ID_federacion;

    public Entrenador(String nome, int iD_federacion) {
        super();
        this.nome = nome;
        ID_federacion = iD_federacion;
    }

    public int getID_federacion() {
        return ID_federacion;
    }

    public void setID_federacion(int iD_federacion) {
        ID_federacion = iD_federacion;
    }

    public void dirigePartido() {
        System.out.println("Vamos vamos vamos, pasala chupón!!!");
    }
    
    public void entrenar() {
        System.out.println("Viendo partidos de otros equipos");
    }
    
    @Override
    public String toString() {
        return super.toString() + "Entrenador [ID_federacion=" + ID_federacion + "]";
    }
    
    
}
