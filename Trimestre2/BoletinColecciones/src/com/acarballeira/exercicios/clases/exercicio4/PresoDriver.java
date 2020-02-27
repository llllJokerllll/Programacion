/*
 * @Author Jose Manuel Sabarís García
 */
package com.acarballeira.exercicios.clases.exercicio4;

// TODO: Auto-generated Javadoc
/**
 * The Class PresoDriver.
 */
public class PresoDriver {
    
    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
    Preso p1,p2,p3,p4;
    Guardia g1;

    Celda c1 = new Celda("C01",true,5);
    System.out.println(c1);


    g1 = new Guardia("Julio","AGENTE_007");
    System.out.println(g1);


    p1 = new Preso("Martin","Navajas","001",100);
    p2 = new Preso("Pipo","Vive","002",1);
    p3 = new Preso("Luis","xd","003",5);
    p4 = new Preso("Jose","xd","004",5);

    //p1.ano();
    //System.out.println(p1.toString());
    //System.out.println(p2);
    //System.out.println(Preso.numPresos);

    c1.engadirPreso(p1);
    c1.engadirPreso(p2);
    c1.engadirPreso(p3);
    c1.engadirPreso(p4);
    
    System.out.println(c1.getPresos());
    c1.quitarPreso(p3);
    
    System.out.println(c1.getPresos());
    
}

}
