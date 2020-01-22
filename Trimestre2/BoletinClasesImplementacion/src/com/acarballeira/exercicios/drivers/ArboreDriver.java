package com.acarballeira.exercicios.drivers;

import com.acarballeira.exercicios.clases.exercicio1.Arbore;
import com.acarballeira.exercicios.clases.exercicio1.TipoFolla;

public class ArboreDriver {

    public static void main(String[] args) {
        
        Arbore pino = new Arbore(23.00, 2000, "Ramirás", "Piñeiro", "Pinus Pinaster", TipoFolla.PERENNE);
        Arbore casti = new Arbore(23.00, 1990, "Ramirás", "Piñeiro", "Castanae Sativa", TipoFolla.CADUCO);
        Arbore ami = new Arbore(23.00, 2003, "Ramirás", "Celanova", "Alnus Glutinosa", TipoFolla.PERENNE);
        
        System.out.println(pino);
        System.out.println(casti);
        System.out.println(ami);

    }

}
