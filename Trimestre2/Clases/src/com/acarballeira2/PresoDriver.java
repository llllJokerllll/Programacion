package com.acarballeira2;

import com.acarballeira.Preso;

public class PresoDriver {

    public static void main(String[] args) {

        Preso p1, p2, p3;
        
        p1 = new Preso("Pablo","Pableras","P007",69);
        
        p2 = new Preso("Jose","Joker","P009",15);
        
        p3 = new Preso("Oscar","Navaja","P008",32);
        
        System.out.println( p1 );
        System.out.println( p2 );
        System.out.println( p3 );
        

    }

}
