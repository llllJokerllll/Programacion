package com.acarballeira.exercicios.clases.exercicio1;

import java.io.File;

public class Utilidades {

	public static void main(String[] args) {
		
		listaDir("c:/");
		sizeFolder("c:/");
		listaDirDetallado("c:/");
		

	}

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

	public static void listaDirDetallado(String x) {
		File dir = new File(x);
		File[] f = dir.listFiles();

		if (f == null) {
			System.out.println("No hay ficheros en el directorio especificado");
		} else {
			for (int i = 0; i < f.length; i++) {
				if (f[i].isDirectory()) {
					System.out.println("d " + f[i].getName() + " 0");
				} else {
					System.out.println("f " + f[i].getName() + " " + f[i].length());
				}
			}
		}
	}

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


}
