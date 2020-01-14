package com.acarballeira;

public class PresoDriver {

    public static void main(String[] args) {

        Preso p1, p2, p3;
        
        p1 = new Preso();
        p1.setNome("Pablo");
        p1.setApodo("Pableras");
        p1.setCodigo("P007");
        p1.setAnosSentencia(69);
        
        p2 = new Preso();
        p2.setNome("Jose");
        p2.setApodo("Joker");
        p2.setCodigo("P009");
        p2.setAnosSentencia(15);
        
        p3 = new Preso();
        p3.setNome("Oscar");
        p3.setApodo("Navaja");
        p3.setCodigo("P008");
        p3.setAnosSentencia(32);
        
        System.out.println( p1 );
        System.out.println( p2 );
        System.out.println( p3 );
        

    }

}
