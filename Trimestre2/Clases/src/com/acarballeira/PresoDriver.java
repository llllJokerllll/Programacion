package com.acarballeira;

public class PresoDriver {

    public static void main(String[] args) {

        Preso p1, p2, p3;
        
        p1 = new Preso();
        p1.nome = "Pablo";
        p1.apodo = "Pableras";
        p1.codigo = "P007";
        p1.anosSentencia = 69;
        
        p2 = new Preso();
        p2.nome = "Jose";
        p2.apodo = "Joker";
        p2.codigo = "P009";
        p2.anosSentencia = 15;
        
        p3 = new Preso();
        p3.nome = "Oscar";
        p3.apodo = "Navaja";
        p3.codigo = "P008";
        p3.anosSentencia = 32;
        
        System.out.println( p1 );
        System.out.println( p2 );
        System.out.println( p3 );
        

    }

}
