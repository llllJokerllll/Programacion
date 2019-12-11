/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Boletin_Funcions_Procedementos_Metodos en 10 dic. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

package com.acarballeira.probas;

import java.util.Arrays;

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Funcións/Procedementos/Métodos
 * @version 1.0
 */

// Crea unha clase chamada ArUtilities, dentro do paquete chamado com.acarballeira e
// dentro dela implementa os métodos descritos na parte inferior. Para probar estes
// métodos define unha clase chamada ProbaUtilidades4 dentro do paquete
// com.acarballeira.probas.

// Importación de librerías
import static com.acarballeira.ArUtilities.*;

public class ProbaUtilidades4 {

    public static void main( String[] args ) {
        
        System.out.println( Arrays.toString( xeraVector( 5, 10, 1 ) ) );
        amosaVector( xeraVector( 3, 9, 5 ), '-' );
        System.out.println( minVectorl( xeraVector( 3, 9, 5 ) ) );
        System.out.println( maxVectorl( xeraVector( 3, 9, 5 ) ) );
        System.out.println( Arrays.toString( rotaDereitaVector( xeraVector( 5, 10, 1 ), 2 ) ) );
        System.out.println( procuraLinealArray( xeraVector( 5, 10, 1 ), 2 ) );
        System.out.println( procuraBinariaArray( xeraVector( 10, 20, 1 ), 9 ) );
        System.out.println( tempoExecucionProcura( xeraVector( 10000, 10000, 1 ), -9, 0 ) );
    } // fin de main
    
} // fin de la clase ProbaUtilidades4

