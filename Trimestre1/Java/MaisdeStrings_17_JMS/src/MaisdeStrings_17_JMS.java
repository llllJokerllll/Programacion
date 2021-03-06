/*
 * Documento creado no 2019 por DAWDU10
 * CIFP A Carballeira. Proyecto Boletin2deStrings_JMS en 21 nov. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: Ejercicio 
 * @version 1.0
 */
// . Ler unha cadea de texto e xerar un array coa función split(). Posteriormente, amosar a
// seguinte información: Número de palabras, primeira palabra, última palabra, as palabras
// colocadas en orden inverso, as palabras ordenadas da a á z e as palabras ordenadas da z á a.

// Importación de librerías
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MaisdeStrings_17_JMS {

    public static void main( String[] args ) {
        init();
        // Declaración de variables
        // Entrada de datos
        String texto;
        // Salida de datos
        // Operativa
        int contador1;
        // Constantes
        // Inicialización        
        // Creación de objetos
        Scanner entrada = new Scanner( System.in );
        StringBuilder textoReves = new StringBuilder();
        StringBuilder textoOrdenado = new StringBuilder();
        StringBuilder textoOrdRev = new StringBuilder();
        
        // Entrada de datos
        System.out.println( "Por favor, introduzca su texto" );
        texto = entrada.nextLine();
        
        // Resolución del programa
        String[] textoVector = texto.split( " " );
        String[] palabrasOrdenadas1 = ( String[] ) textoVector.clone();
        Arrays.sort( palabrasOrdenadas1 );
        for ( contador1 = textoVector.length - 1; contador1 >= 0; contador1-- ) {
            textoReves.append( textoVector[ contador1 ] + " " );
            textoOrdRev.append( palabrasOrdenadas1[ contador1 ] + " " );
            
        }
        for ( String x : palabrasOrdenadas1 ) {
            textoOrdenado.append( x + " " );
        }
        
        // Salida de datos
        System.out.println( "El número de palabras es: " + textoVector.length );
        System.out.println( "La primera palabra es: " + textoVector[ 0 ] );
        System.out.println( "La última palabra es: " + textoVector[ textoVector.length - 1 ] );
        System.out.println( "Las palabras del reves es: " + textoReves );
        System.out.println( "Las palabras ordenadas de la a, a la z son: " + textoOrdenado );
        System.out.println( "Las palabras ordenadas de la z, a la a son: " + textoOrdRev );
        
        
    } // fin de main
    
    public static int contarPalabras ( String[] m ) {
        
        return m.length;
    }
    
    public static String primeraPalabra ( String[] m ) {
        
        return m[ 0 ];
    }
    
    public static String ultimaPalabra ( String[] m ) {
        
        return m[ m.length - 1 ];
    }
    
    public static StringBuilder palabrasReves ( String[] m ) {
        StringBuilder pReves = new StringBuilder();
        for ( int i = m.length - 1; i >= 0; i-- ) {
            pReves.append( m[ i ] + " " );
        }
        return pReves;
    }
    
    public static StringBuilder palabrasOrdenadas ( String[] m ) {
        StringBuilder pOrdenadas = new StringBuilder();
        Arrays.sort( m );
        for ( String x : m ) {
            pOrdenadas.append( x + " " );
        }
        return pOrdenadas;
    }
    
    public static StringBuilder palabrasOrdendasReves ( String[] m ) {
        StringBuilder pOrdReves = new StringBuilder();
        Arrays.sort( m );
        for ( int i = m.length - 1; i >= 0; i-- ) {
            pOrdReves.append( m[ i ] + " " );
        }
        return pOrdReves;
    }
    
    static void init() {
        JFrame ventana;
        ventana = new JFrame();
        ventana.setBounds( 100, 100, 600, 500 );
        ventana.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        ventana.setTitle( "Titulo de la ventana" );
        ventana.getContentPane().setLayout( null );
        
        JTextField campoTexto = new JTextField();
        campoTexto.setBounds( 150, 30, 400, 25 );
        
        JLabel etiquetaTexto = new JLabel();
        etiquetaTexto.setText( "Frase" );
        etiquetaTexto.setBounds( 20, 30, 150, 25 );
        
        JButton botonEnviar = new JButton("Enviar");
        botonEnviar.setBounds( 140, 400, 90, 25 );
        JButton botonLimpiar = new JButton("Limpiar");
        botonLimpiar.setBounds( 20, 400, 90, 25);
        
        JLabel numPalabras = new JLabel( "El número de palabras es: " );
        numPalabras.setBounds( 20, 60, 500, 25 );
        JLabel primerPalabra = new JLabel( "La primera palabra es: " );
        primerPalabra.setBounds( 20, 90, 500, 25 );
        JLabel ultPalabra = new JLabel( "La última palabra es: " );
        ultPalabra.setBounds( 20, 120, 500, 25 );
        JLabel revesPalabras = new JLabel( "Las palabras del reves es: " );
        revesPalabras.setBounds( 20, 150, 500, 25 );
        JLabel ordPalabras = new JLabel( "Las palabras ordenadas de la a, a la z son: " );
        ordPalabras.setBounds( 20, 180, 500, 25 );
        JLabel ordRevPalabras = new JLabel( "Las palabras ordenadas de la z, a la a son: " );
        ordRevPalabras.setBounds( 20, 210, 500, 25 );
        
        ventana.getContentPane().add( campoTexto );
        ventana.getContentPane().add( etiquetaTexto );
        ventana.getContentPane().add( numPalabras );
        ventana.getContentPane().add( primerPalabra );
        ventana.getContentPane().add( ultPalabra );
        ventana.getContentPane().add( revesPalabras );
        ventana.getContentPane().add( ordPalabras );
        ventana.getContentPane().add( ordRevPalabras );
        ventana.getContentPane().add( botonEnviar );
        ventana.getContentPane().add( botonLimpiar );
        
        ventana.setVisible( true );
        
        // Acciones
        botonLimpiar.addActionListener( new ActionListener() {
            public void actionPerformed( ActionEvent e ){
                campoTexto.setText( "" );
                numPalabras.setText( "El número de palabras es: " );
                primerPalabra.setText( "La primera palabra es: " );
                ultPalabra.setText( "La última palabra es: " );
                revesPalabras.setText( "Las palabras del reves es: " );
                ordPalabras.setText( "Las palabras ordenadas de la a, a la z son: " );
                ordRevPalabras.setText( "Las palabras ordenadas de la z, a la a son: " );
            }
        });
        
        botonEnviar.addActionListener( new ActionListener() {
            public void actionPerformed( ActionEvent e ){
                String[] palabras = campoTexto.getText().split( " " );
                numPalabras.setText( numPalabras.getText() + " " + contarPalabras( palabras ));
                primerPalabra.setText( primerPalabra.getText() + " " + primeraPalabra( palabras ));
                ultPalabra.setText( ultPalabra.getText() + " " + ultimaPalabra( palabras ));
                revesPalabras.setText( revesPalabras.getText() + " " + palabrasReves( palabras ));
                ordPalabras.setText( ordPalabras.getText() + " " + palabrasOrdenadas( palabras ));
                ordRevPalabras.setText( ordRevPalabras.getText() + " " + palabrasOrdendasReves( palabras ));
            }
            
        });
    }
} // fin de la clase MaisdeStrings_17_JMS

