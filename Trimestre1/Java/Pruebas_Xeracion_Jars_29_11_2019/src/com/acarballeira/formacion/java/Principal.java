package com.acarballeira.formacion.java;

public class Principal {
   
    public static void main(String[] args) {
        
        Coche c = new Coche();
        if (args.length == 0) {
            c.cabalos = 130;
            c.marca = "Volkswagen";
            c.modelo = "Golf";
        } else {
            c.cabalos = (short)Integer.parseInt(args[2]);
            c.marca = args[0];
            c.modelo = args[1];
        }
        System.out.println(c);
    }
}
