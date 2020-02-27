package com.acarballeira.exercicios.clases.drivers;

import java.util.Scanner;

import com.acarballeira.exercicios.clases.exercicio9.Libro;

// TODO: Auto-generated Javadoc
/**
 * The Class BibliotecaLibros.
 */
public class BibliotecaLibros {

    /** The Constant MAX_LIBROS. */
    private static final int MAX_LIBROS = 10;
    
    /** The biblioteca. */
    private static Libro[] biblioteca; 
    
    /** The Constant INCREMENTO_CODIGO. */
    private final static byte INCREMENTO_CODIGO = 5;
    
    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        
        biblioteca = new Libro[MAX_LIBROS];
        int opcion;
        int contador = 0;
        int contadorCodigo = 0;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.print("\nBIBLIOTECA DA CARBALLEIRA\n=========================\n1. Listado\n2. Novo libro\n3. Modificar\n4. Borrar\n5. Sair\nIntroduzca unha opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
            case 1:
                listar(biblioteca);
                break;
            case 2:
                contadorCodigo += INCREMENTO_CODIGO;
                novoLibro(biblioteca, MAX_LIBROS, contador, contadorCodigo);
                contador++;
                break;
            case 3:
                System.out.print("Por favor, introduzca el código del libro a editar: ");
                editarLibro(sc.nextInt());
                break;
            case 4:
                System.out.print("Por favor, introduzca el código del libro a borrar: ");
                borrarLibro(sc.nextInt());
                break;
            default:
                break;
            }
            
        } while ( opcion != 5 );
        
        sc.close();

    }
    
    /**
     * Listar.
     *
     * @param biblioteca the biblioteca
     */
    public static void listar( Libro[] biblioteca ) {
  
        System.out.println("\nLISTADO\n========");
        for( Libro x : biblioteca ) {
           System.out.println(x);
        }
       
    }

    /**
     * Novo libro.
     *
     * @param biblioteca the biblioteca
     * @param MAX_LIBROS the max libros
     * @param contador the contador
     * @param contadorCodigo the contador codigo
     */
    public static void novoLibro(Libro[] biblioteca, int MAX_LIBROS, int contador, int contadorCodigo) {
        Scanner sc = new Scanner(System.in);
            System.out.print("\nNOVO LIBRO\n===========\nPor favor, introduzca os datos do libro.\nTítulo: ");
            String titulo = sc.nextLine();
            System.out.print("Autor: ");
            String autor = sc.nextLine();
            System.out.print("Editorial: ");
            String editorial = sc.nextLine();
            System.out.print("Número de páxinas: ");
            int numPax = sc.nextInt();
            
            biblioteca[contador] = new Libro(titulo, autor, numPax, editorial, contadorCodigo);
            
    }
    
    /**
     * Editar libro.
     *
     * @param codigo the codigo
     */
    public static void editarLibro(int codigo) {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < biblioteca.length; i++) {
            if (biblioteca[i].getCodigo() == codigo ) {
                System.out.print("\nEDITANDO LIBRO\n===========\nPor favor, introduzca os datos do libro a editar.\nTítulo: ");
                String titulo = sc.nextLine();
                System.out.print("Autor: ");
                String autor = sc.nextLine();
                System.out.print("Editorial: ");
                String editorial = sc.nextLine();
                System.out.print("Número de páxinas: ");
                int numPax = sc.nextInt();
                if (!titulo.equals("")) {
                    biblioteca[i].setTitulo(titulo);
                }
                if (!autor.equals("")) {
                    biblioteca[i].setAutor(autor);
                }
                if (!editorial.equals("")) {
                    biblioteca[i].setEditorial(editorial);
                }
                if (numPax != 0) {
                    biblioteca[i].setNumPax(numPax);
                }

                break;
            }
        }
    }
    
    /**
     * Borrar libro.
     *
     * @param codigo the codigo
     */
    public static void borrarLibro(int codigo) {
        for (int i = 0; i < biblioteca.length; i++) {
            if (biblioteca[i].getCodigo() == codigo ) {
                for (int j = i; j < biblioteca.length - 1; j++) {
                    biblioteca[j] = biblioteca[j + 1];
                }
            }
        }
    }
}


