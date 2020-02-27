/*
 * 
 */
package com.acarballeira.exame.jose_manuel_sabaris.exercicio1.driver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
    
    static final String FICHEIRO = "c:/cursos/transferencias.dat";
    
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
        banco.add(new ContaBancaria("Paco", "01", 0.09, 1000.0));
        banco.add(new ContaBancaria("Jose", "02", 0.10, 500.0));
        banco.add(new ContaBancaria("Carmen", "03", 0.15, 300.0));
        banco.add(new Tarxeta("5849871286", "Visa Oro", TipoTarxeta.CREDITO, "Luis", "04", 0.13, 11000.0));
        banco.add(new Tarxeta("1587965478", "Master Card", TipoTarxeta.CREDITO, "Antonio", "05", 0.11, 2900.0));
        banco.add(new Tarxeta("0025879654", "American Express", TipoTarxeta.FINANCIACION, "Lucia", "06", 0.15, 10000.0));
        banco.add(new Tarxeta("6587493214", "Visa Joven", TipoTarxeta.MONEDEIRO, "Anxo", "07", 0.07, 1500.0));
        banco.add(new Tarxeta("1158889632", "Maestro", TipoTarxeta.DEBITO, "Manuel", "08", 0.08, 600.0));
        banco.add(new Tarxeta("5849487963", "Maestro", TipoTarxeta.DEBITO, "Federico", "09", 0.12, 3000.0));
        banco.add(new Tarxeta("5849001889", "Visa Oro", TipoTarxeta.CREDITO, "Ofelia", "10", 0.16, 5000.0));
        banco.add(new Tarxeta("4795201488", "Visa", TipoTarxeta.MONEDEIRO, "Pepe", "11", 0.05, 100.0));
        System.out.println("Datos introducidos correctamente");
    }
    
    /**
     * Transferencia.
     */
    private static void transferencia() {
        String numA = "";
        String numB = "";
        double cantidad = 0.0;
        FileWriter fw;
        BufferedWriter bw = null;
        String aux , aux2 = "";
        LocalDateTime data = LocalDateTime.now();
        
        System.out.print("Por favor introduzca el número de cuenta de cargo: ");
        try {
        	fw = new FileWriter(FICHEIRO, true); //Append ao final
            bw = new BufferedWriter(fw);
            
            numA = br.readLine();
            INICIO:for (ContaBancaria elemento1 : banco) {
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
                                    aux2 = " - Resultado de la operación: Correcto.";
                                    break INICIO;
                                } else {
                                    System.out.println("Saldo insuficiente en la cuenta Origen");
                                    aux2 = " - Resultado de la operación: Saldo insuficiente en la cuenta Origen.";
                                }
                                    
                        } else {
                            System.out.println("Número de cuenta destino no encontrado");
                            aux2 = " - Resultado de la operación: Número de cuenta destino no encontrado.";
                        }
                    }
                } else {
                    System.out.println("Número de cuenta origen no encontrado");
                    aux2 = " - Resultado de la operación: Número de cuenta origen no encontrado.";
                }
            }
            
            
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
        aux = data.format(DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss")) + " Conta cargo: " + numA + " - Conta abono: " + numB + ". Cantidade: " + cantidad;   
        try {
			bw.write(aux + aux2);
			bw.newLine();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace(System.out);
		}
        
    }
    
    /**
     * Listar tarx.
     */
    private static void listarTarx() {
    	banco.sort(new Comparator<ContaBancaria>() {

            @Override
            public int compare(ContaBancaria o1, ContaBancaria o2) {
                return (int) - (o1.getSaldo() - o2.getSaldo());
            }
            
        });
        
        for(ContaBancaria c : banco) {
            if (c.getClass().getSimpleName().equals("Tarxeta")) { //Pode facerse con instanceof
                System.out.println(c);
            }
            
        }
    }
    
    /**
     * Listar cont.
     */
    private static void listarCont() {
    	banco.sort(new Comparator<ContaBancaria>() {

            @Override
            public int compare(ContaBancaria o1, ContaBancaria o2) {
                return o1.getNomeCliente().compareTo(o2.getNomeCliente());
            }
            
        });
                
        for(ContaBancaria c : banco) {            
                System.out.println(c);                                        
        }
    }
    
    /**
     * Elimina tarx.
     */
    private static boolean eliminaTarx() {
        String numA;
        int i = 0;
        System.out.print("Por favor introduzca el número de la targeta: ");
        try {
            numA = br.readLine();
            for (ContaBancaria elemento : banco) {
            	if (elemento instanceof Tarxeta && ((Tarxeta) elemento).getNumero().equals(numA)) {
                    banco.remove(i);
                    return true;
                }
                i++;
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return false;
    }
}
