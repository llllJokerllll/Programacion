package com.acarballeira.exercicios.clases.exercicio6;

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
    
    public String iniTiempo() {
        if ( segundo > 58 ) {
            segundo = 0;
            if ( minuto > 58 ) {
                minuto = 0;
                if ( hora > 22 ) {
                    hora = 0;
                } else {
                    hora++;
                }
            } else {
                minuto++;
            }
        } else {
            segundo++;
        }
        
        return amosaTiempo();
    }

    @Override
    public String toString() {
        return amosaTiempo();
    }

   
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Tiempo other = (Tiempo) obj;
        if (hora != other.hora)
            return false;
        if (minuto != other.minuto)
            return false;
        if (segundo != other.segundo)
            return false;
        return true;
    }
    
    
    
    
}
