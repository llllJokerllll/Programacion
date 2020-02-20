/*
 * 
 */
package com.acarballeira.exame.jose_manuel_sabaris.exercicio1.driver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.acarballeira.exame.jose_manuel_sabaris.exercicio1.datos.ContaBancaria;
import com.acarballeira.exame.jose_manuel_sabaris.exercicio1.datos.Tarxeta;
import com.acarballeira.exame.jose_manuel_sabaris.exercicio1.datos.TipoTarxeta;

// TODO: Auto-generated Javadoc
/**
 * The Class App.
 */
public class App {

    /** The banco. */
    static List<ContaBancaria> banco = new ArrayList<>();
    
    /** The br. */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    /** The opcion. */
    static int opcion;
    
    /**
     * The main method.
     *
     * @param Args the arguments
     */
    public static void main(String[] Args) {
        
        crearDatosProba();
        do {
            opcion = menu();
            seleccion(opcion); 
        } while(opcion != 5);
        
        
    }
    
    /**
     * Menu.
     *
     * @return the int
     */
    private static int menu() {
        System.out.print("BANCA ELECTRÓNICA\n======================\n1. Transferencia\n2. Listas tarxetas ordenadas por saldo\n3. Listar contas ordenadas por cliente\n4. Eliminar Tarxeta\n5. Saír\nIntroduzca unha opción: ");
        int opcion = -1;
        boolean acceso = false;
        while( !acceso ) {
            try {
                 opcion = Integer.parseInt(br.readLine());
                 if (opcion >= 0 || opcion <= 5) {
                     acceso = true;
                 }
            } catch (NumberFormatException e) {
                e.printStackTrace(System.out);
            } catch (IOException e) {
                e.printStackTrace(System.out);
            }
        }
        return opcion;   
    }
    
    /**
     * Seleccion.
     *
     * @param opcion the opcion
     */
    private static void seleccion(int opcion) {
        
        switch(opcion) {
            case 1:
                transferencia();
                break;
            case 2:
                listarTarx();
                break;
            case 3:
                listarCont();
                break;
            case 4:
                eliminaTarx();
                break;
            case 5:
                System.out.println("Hasta otra, gracias por confiar en nosotros");
                break;
            default:
                System.out.println("Opción seleccionada incorrecta");
                break;
        }
    }
    
    /**
     * Crear datos proba.
     */
    private static void crearDatosProba() {
        banco.add(new ContaBancaria("Paco", "0012869852746731", 0.09, 1000.0));
        banco.add(new ContaBancaria("Jose", "1587964875281003", 0.10, 500.0));
        banco.add(new ContaBancaria("Carmen", "4878652789654851", 0.15, 300.0));
        banco.add(new Tarxeta("5849871286", "Visa Oro", TipoTarxeta.CREDITO, "Luis", "0012869852746731", 0.13, 11000.0));
        banco.add(new Tarxeta("1587965478", "Master Card", TipoTarxeta.CREDITO, "Antonio", "0012869852745987", 0.11, 2900.0));
        banco.add(new Tarxeta("0025879654", "American Express", TipoTarxeta.FINANCIACION, "Lucia", "0012869852712637", 0.15, 10000.0));
        banco.add(new Tarxeta("6587493214", "Visa Joven", TipoTarxeta.MONEDEIRO, "Anxo", "0012869852778945", 0.07, 1500.0));
        banco.add(new Tarxeta("1158889632", "Maestro", TipoTarxeta.DEBITO, "Manuel", "0012869852749518", 0.08, 600.0));
        banco.add(new Tarxeta("5849487963", "Maestro", TipoTarxeta.DEBITO, "Federico", "0012869852743679", 0.12, 3000.0));
        banco.add(new Tarxeta("5849001889", "Visa Oro", TipoTarxeta.CREDITO, "Ofelia", "0012869852749874", 0.16, 5000.0));
        banco.add(new Tarxeta("4795201488", "Visa", TipoTarxeta.MONEDEIRO, "Pepe", "0012869852746542", 0.05, 100.0));
        System.out.println("Datos introducidos correctamente");
    }
    
    /**
     * Transferencia.
     */
    private static void transferencia() {
        String numA;
        String numB;
        double cantidad;
        
        System.out.print("Por favor introduzca el número de cuenta de cargo: ");
        try {
            numA = br.readLine();
            for (ContaBancaria elemento1 : banco) {
                if (numA.equals(elemento1.getNumeroConta())) {
                    System.out.print("Por favor introduzca el número de cuenta de abono: ");
                    numB = br.readLine();
                    for (ContaBancaria elemento2 : banco) {
                        if (numB.equals(elemento2.getNumeroConta())) {
                            System.out.print("Por favor introduzca la cantidad a transferir: ");
                            cantidad = Double.parseDouble(br.readLine());
                                if (cantidad <= elemento1.getSaldo()) {
                                    elemento1.reintegro(cantidad);
                                    elemento2.ingreso(cantidad);
                                } else {
                                    System.out.println("Saldo insuficiente en la cuenta Origen");
                                }
                                    
                        } else {
                            System.out.println("Número de cuenta destino no encontrado");
                        }
                    }
                } else {
                    System.out.println("Número de cuenta origen no encontrado");
                }
            }
            
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }
    
    /**
     * Listar tarx.
     */
    private static void listarTarx() {
       //banco.sort(new ListarPorSaldo);
    }
    
    /**
     * Listar cont.
     */
    private static void listarCont() {
        //banco.sort(new compare);
    }
    
    /**
     * Elimina tarx.
     */
    private static void eliminaTarx() {
        String numA;
        System.out.print("Por favor introduzca el número de la targeta: ");
        try {
            numA = br.readLine();
            for (ContaBancaria elemento : banco) {
                //if (numA.equalsIgnoreCase(elemento.get))
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
