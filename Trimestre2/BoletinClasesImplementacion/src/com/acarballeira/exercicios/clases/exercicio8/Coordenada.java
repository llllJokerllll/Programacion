package com.acarballeira.exercicios.clases.exercicio8;

/**
*@title 
*@author Jose Manuel Sabaris Garcia
*@date 24 ene. 2020
*@version 1.0
*/

public class Coordenada {

    private int x;
    private int y;
    
    public Coordenada() {
        
    }
    
    public Coordenada(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Coordenadas [x=" + x + ", y=" + y + "]";
    }
    
    
    
}
