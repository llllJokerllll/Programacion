package acepta.el.reto;

import java.util.Scanner;

public class AceptaElReto_E {
	
	static final int NUM_TOTAL = 10000;
	
	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		int casos;
		int aux1;
		
		Scanner sc = new Scanner(System.in);
		
		casos = sc.nextInt();
			
		for (int i = 1; i <= casos; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			int contador = 0;
			int[] aux2 = new int[100];
			int[] numeros = new int[NUM_TOTAL];
			
			while (true) {
				aux1 = sc.nextInt();
				if (aux1 == -1) break;
				aux2[contador] = aux1;
				contador++;
			}
			
			numeros[0] = a;
			
			for (int j = 1; j < NUM_TOTAL - 1; j += 2) {
				numeros[j] = numeros[j - 1] + b;
				numeros[j + 1] = numeros[j] + c;
			}
			
			System.out.println("listado " + i + ":");
			for (int k = 0; k < aux2.length; k++) {
				if ((aux2[k] - 1) == -1) break;
				System.out.println(numeros[aux2[k] - 1]);
			}
		}
		sc.close();
	}
}
