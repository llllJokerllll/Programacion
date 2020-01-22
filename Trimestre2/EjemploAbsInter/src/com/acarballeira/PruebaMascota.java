package com.acarballeira;

public class PruebaMascota {

    public static void main(String[] args) {

       Mascota garfield = new Gato(Sexo.MACHO, "34569");
       Mascota lisa = new Gato(Sexo.HEMBRA, "96059");
       Mascota kuki = new Gato(Sexo.HEMBRA, "234678");
       Mascota ayo = new Gato(Sexo.MACHO, "778950");
       
       System.out.println(garfield.getCodigo());
       System.out.println(lisa.getCodigo());
       System.out.println(kuki.getCodigo());
       System.out.println(ayo.getCodigo());
       garfield.come("pescado");
       lisa.come("hamburguesa");
       kuki.come("pescado");
       lisa.peleaCon((Gato)garfield);
       ayo.peleaCon((Gato)kuki);

    }

}
