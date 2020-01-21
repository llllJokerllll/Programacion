package com.acarballeira.clasesyobjetos;

public class FutbolistaDriver {

    public static void main(String[] args) {
        
        Masajista aspas = new Masajista("Iago Aspas", "Ciclo Superior");
        Entrenador carba = new Entrenador("Ricardo Carballo", 58549);
        Futbolista stoichkov = new Futbolista("Hristo Stoichkov", 8, Demarcacion.DELANTERO);
        
        System.out.println(aspas);
        System.out.println(carba);
        
        System.out.println(stoichkov);
        
        aspas.viajar();
        carba.concentrarse();
        

    }

}
