Algoritmo codificacion7
	
	Definir i, j, k Como Entero
	i <- -2;
	k <- 1;
	
	Repetir
		j <- 0;
		Mientras j < 3 Hacer
			k <- j - k - 10;
			Escribir k;
			j <- j + 1;
		FinMientras
		i <- i + 1;
	Hasta Que i == 0;
	
	Escribir j;
	
FinAlgoritmo
