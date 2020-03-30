import java.util.Scanner;

public class PostVerdad {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String linea;
		int contador = 0;

		while(true) {
			contador = 0;
			linea = s.nextLine();
			if(linea.trim().equals("FIN")) {
				break;
			} 
			for (String palabra : linea.split(" ")) {
				palabra = palabra.toLowerCase();
				if(palabra.contains("a") && palabra.contains("e") && palabra.contains("i") && palabra.contains("o") && palabra.contains("u")) {
					contador++;
				}
			}
			System.out.println(contador);
		}
		s.close();
	}
}
