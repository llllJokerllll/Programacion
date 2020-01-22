package com.acarballeira;

public class Gato extends Animal implements Mascota {

    private String codigo;
    
    public Gato(Sexo s, String c) {
        super(s);
        this.codigo = c;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public void hazRuido() {
        this.maulla();
        this.ronronea();
        
    }
    
    public void maulla() {
        System.out.println("Miauuuu");
    }
    
    public void ronronea() {
        System.out.println("Mrrrrrr");
    }

    @Override
    public void come(String comida) {
        if ( comida.equals("pescado")) {
            //super.come();
            System.out.println("Hmmmm, gracias");
        } else {
            System.out.println("Lo siento, yo solo como pescado");
        }
        
    }

    @Override
    public void peleaCon(Animal contrincante) {
        if ( this.getSexo() == Sexo.HEMBRA ) {
            System.out.println("No me gusta pelear");
        } else {
            if ( contrincante.getSexo() == Sexo.HEMBRA ) {
                System.out.println("No peleo contra hembras");
            } else {
                System.out.println("Ven aquí que te vas a enterar");
            }
        }
        
    }
    

}
