package acepta.el.reto;

import java.util.Scanner;

public class AceptaElReto_B {

	public static void main(String[] args) {
		
		int x;
		int y;
		int z;
		int aux;
		int contador;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			aux = 0;
			contador = 0;
			x = sc.nextInt();
			y = sc.nextInt();
			z = sc.nextInt();
			if (x == 0 && y == 0 && z == 0) break;
			if (z >= y) {
				System.out.println("You must work harder!");
			} else if (y >= x) {
				System.out.println(1);
			} else {
				
				while (aux < x) {
					aux += y;
					contador++;
					if (aux < x) {
						aux -= z;
					}
				}
				System.out.println(contador);
			}

		}
		sc.close();
	}

}
