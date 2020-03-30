package acepta.el.reto;

import java.util.Scanner;

public class AceptaElReto_G {

	public static void main(String[] args) {
		
		String texto;
		String[] linea;
		int resultado = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			texto = sc.nextLine();
			if (texto.equals("FIN")) {
				break;
			} else {
				linea = texto.split(" ");
				for (int i = 0; i < linea.length; i++) {
					linea[i].toLowerCase();
					if (linea[i].contains("a") && linea[i].contains("e") && linea[i].contains("i") && linea[i].contains("o") && linea[i].contains("u")) {
						resultado++;
					}
				}
				System.out.println(resultado);
				resultado = 0;
			}
		}
		sc.close();
	}

}
