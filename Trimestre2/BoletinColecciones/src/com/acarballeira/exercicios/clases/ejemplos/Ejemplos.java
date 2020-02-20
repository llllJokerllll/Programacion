package com.acarballeira.exercicios.clases.ejemplos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;


class Xogador implements Comparable<Xogador> {
    
    String nome;
    String posicion;
    int dorsal;
    
    public Xogador(String nome, String posicion, int dorsal ) {
        super();
        this.nome = nome;
        this.posicion = posicion;
        this.dorsal = dorsal;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Xogador other = (Xogador) obj;
        return dorsal == other.dorsal && Objects.equals(nome, other.nome) && Objects.equals(posicion, other.posicion);
    }


    @Override
    public String toString() {
        return String.format("Xogador [nome=%s, posicion=%s, dorsal=%s]", nome, posicion, dorsal);
    }



    @Override
    public int compareTo(Xogador o) {
        if (this.dorsal < o.dorsal) {
            return -1;
        } else if (this.dorsal > o.dorsal) {
            return 1;
        } else {
            return this.nome.compareTo(o.nome);
        }
    }
    
}

class CompararNombre implements Comparator<Xogador> {

    @Override
    public int compare(Xogador o1, Xogador o2) {
 
        return o1.nome.compareTo(o2.nome);
    }
    
}

class CompararDorsal implements Comparator<Xogador> {

    @Override
    public int compare(Xogador o1, Xogador o2) {
        
        return o1.dorsal - o2.dorsal;
    }
    
}


public class Ejemplos {

    public static void main(String[] args) {
        
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(9);
        
        System.out.println(lista.size());
               
        Collections.sort(lista);
        
        List<Xogador> equipo = new ArrayList<Xogador>();
        equipo.add(new Xogador("Jose", "Delantero", 9));
        equipo.add(new Xogador("Alex", "Defensa", 9));
        equipo.add(new Xogador("Xavi", "Medio", 19));
        equipo.add(new Xogador("Paul", "Portero", 4));
        equipo.add(new Xogador("Lionel", "Delantero", 5));
        
        //Collections.sort(equipo);
        //equipo.sort(new CompararXogador());
        equipo.sort(new CompararDorsal().thenComparing(new CompararNombre()));
        
        
        for (Xogador x : equipo) {
            System.out.println(x);
        }
        
        for (Integer i : lista) {
            System.out.println(i);
        }
        
        for ( int i = 0; i < lista.size(); i++ ) {
            System.out.println(lista.get(i));
        }
        
        Iterator it = lista.iterator();
        while ( it.hasNext()) {
            System.out.println((Integer)it.next());
        }
        
        Collections.reverse(lista);
        
        lista.forEach((elemento)->System.out.println(elemento));
        
        Set<Integer> conxunto = new HashSet<>();
        conxunto.add(9);
        conxunto.add(5);
        conxunto.add(9);
        conxunto.add(15);
        conxunto.add(5);
        
        conxunto.forEach(elemento->System.out.println(elemento));
        
        Map<Integer, String> mapa = new HashMap<>(); 
        mapa.put(0, "Maria");
        mapa.put(1, "Pepe");
        mapa.put(2, "Luis");
        mapa.put(3, "Tino");
        
        for(Integer i : mapa.keySet()) {
            System.out.println(mapa.get(i));
        }
    }

}
