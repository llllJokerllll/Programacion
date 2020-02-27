package com.acarballeira.exercicios.clases.drivers;

import com.acarballeira.exercicios.clases.exercicio2.Empleado;
import com.acarballeira.exercicios.clases.exercicio2.Estudiante;
import com.acarballeira.exercicios.clases.exercicio2.Persona;
import com.acarballeira.exercicios.clases.exercicio2.Profesor;

// TODO: Auto-generated Javadoc
/**
 * The Class PruebaColegio.
 */
public class PruebaColegio {

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
    Persona p1 = new Persona("Julio", "Mosquera González", "76767676F", "Casado");
    
    Estudiante est1 = new Estudiante("Jorge", "Macías Rodríguez", "44467676F", "Casado", 5);
    
    Empleado emp1 = new Empleado("Susana", "Gulín Martínez", "33367600D", "Casada", 2015, 33);
    
    Profesor pr1 = new Profesor("Ánxela", "Mosquera", "44455522Q", "Soltera", 2018, 313, "Sistemas");
    
    System.out.println(p1);
    
    System.out.println(est1);
    
    System.out.println(emp1);

    System.out.println(pr1);
    }
}
