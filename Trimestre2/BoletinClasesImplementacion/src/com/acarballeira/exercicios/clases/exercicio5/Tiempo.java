package com.acarballeira.exercicios.clases.exercicio5;

public class Tiempo {

    private int hora;
    private int minuto;
    private int segundo;
    
    public Tiempo() {
        
    }

    public Tiempo(int hora, int minuto, int segundo) {
        super();
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public Tiempo(int hora, int minuto) {
        super();
        this.hora = hora;
        this.minuto = minuto;
    }

    public Tiempo(int hora) {
        super();
        this.hora = hora;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
    
    public String amosaTiempo() {
        String res = "";
        
        if ( this.hora < 10 ) {
            res += "0" + this.hora + ":";
        } else {
            res += this.hora + ":";
        }
        if ( this.minuto < 10 ) {
            res += "0" + this.minuto + ":";
        } else {
            res += this.minuto + ":";
        }
        if ( this.segundo < 10 ) {
            res += "0" + this.segundo;
        } else {
            res += this.segundo;
        }
        
        return res;
    }

    @Override
    public String toString() {
        return amosaTiempo();
    }
    
    
}
