package com.acarballeira.exercicios.drivers;

import com.acarballeira.exercicios.clases.exercicio1.Arbore;
import com.acarballeira.exercicios.clases.exercicio1.TipoFolla;

// TODO: Auto-generated Javadoc
/**
 * The Class ArboreDriver.
 */
public class ArboreDriver {

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        
        Arbore pino = new Arbore();
        pino.altura = 23.00;
        pino.anoNac = 2000;
        pino.concello = "Ramir�s";
        pino.nomeComun = "Pi�eiro";
        pino.nomeLatino = "Pinus Pinaster";
        pino.hojas = TipoFolla.PERENNE;
        
        Arbore casti = new Arbore();
        casti.altura = 23.00;
        casti.anoNac = 1990;
        casti.concello = "Ramir�s";
        casti.nomeComun = "Pi�eiro";
        casti.nomeLatino = "Castanae Sativa";
        casti.hojas = TipoFolla.CADUCO;
        
        Arbore ami = new Arbore();
        ami.altura = 23.00; 
        ami.anoNac = 2003;
        ami.concello = "Ramir�s";
        ami.nomeComun = "Celanova";
        ami.nomeLatino = "Alnus Glutinosa";
        ami.hojas = TipoFolla.PERENNE;
        
        System.out.println(pino);
        System.out.println(casti);
        System.out.println(ami);

    }

}
