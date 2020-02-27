package com.acarballeira.exercicios.clases.exercicio1;

import java.io.File;

// TODO: Auto-generated Javadoc
/**
 * The Class Utilidades.
 */
public class Utilidades {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		listaDir("c:/");
		sizeFolder("c:/");
		listaDirDetallado("c:/");
		listarDirExt("c:/", "txt");
		System.out.println(sizeFolderRec("c:/construccion/"));

	}

	/**
	 * Lista dir.
	 *
	 * @param x the x
	 */
	public static void listaDir(String x) {
		File dir = new File(x);
		String[] f = dir.list();

		if (f == null) {
			System.out.println("No hay ficheros en el directorio especificado");
		} else {
			for (int i = 0; i < f.length; i++)
				System.out.println(f[i]);
		}
	}

	/**
	 * Lista dir detallado.
	 *
	 * @param x the x
	 */
	public static void listaDirDetallado(String x) {
		File dir = new File(x);
		File[] f = dir.listFiles();

		if (f == null) {
			System.out.println("No hay ficheros en el directorio especificado");
		} else {
			for (int i = 0; i < f.length; i++) {
				if (f[i].isDirectory()) {
					System.out.printf("d %30s %20s\n", f[i].getName(), "0");
				} else {
					System.out.printf("f %30s %20s\n", f[i].getName(), f[i].length());
				}
			}
		}
	}

	/**
	 * Listar dir ext.
	 *
	 * @param x the x
	 * @param y the y
	 */
	public static void listarDirExt(String x, String y) {
		File dir = new File(x);
		File[] f = dir.listFiles();

		if (f == null) {
			System.out.println("No hay ficheros en el directorio especificado");
		} else {
			for (int i = 0; i < f.length; i++) {
				if (f[i].isFile()) {
					if (f[i].toString().endsWith(y)) {
						System.out.println(f[i].getName());
					} 
				} 
			}
		}
	}

	/**
	 * Size folder.
	 *
	 * @param x the x
	 */
	public static void sizeFolder(String x) {
		File dir = new File(x);
		File[] f = dir.listFiles();
		int aux = 0;

		if (f == null) {
			System.out.println("No hay ficheros en el directorio especificado");
		} else {
			for (int i = 0; i < f.length; i++) {
				if (f[i].isFile()) {
					aux += f[i].length();
				}
			}
			System.out.println(aux);
		}
	}

	/**
	 * Size folder rec.
	 *
	 * @param x the x
	 * @return the int
	 */
	public static int sizeFolderRec(String x) {
        File dir = new File(x);
        File[] f = dir.listFiles();
        int aux = 0;

        if (f == null) {
            System.out.println("No hay ficheros en el directorio especificado");
        } else {
            for (int i = 0; i < f.length; i++) {
                if (f[i].isFile()) {
                    aux += f[i].length();
                } else {
                    aux += sizeFolderRec(f[i].getPath());
                }
            }
        }
        return aux;
    }

}
