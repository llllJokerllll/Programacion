package com.acarballeira.proba10.modelo;

public class Operacion {
    
    int oper1;
    int oper2;
    public Operacion(int oper1, int oper2) {
        super();
        this.oper1 = oper1;
        this.oper2 = oper2;
    }
    public int getOper1() {
        return oper1;
    }
    public void setOper1(int oper1) {
        this.oper1 = oper1;
    }
    public int getOper2() {
        return oper2;
    }
    public void setOper2(int oper2) {
        this.oper2 = oper2;
    }
    
    public int sumar() {
        return this.oper1+this.oper2;
    }
    
    public int restar() {
        return this.oper1-this.oper2;
    }
    
    public int multi() {
        return this.oper1*this.oper2;
    }
    
    public int div() {
        return this.oper1/this.oper2;
    }

}
