Algoritmo sin_titulo
	
	//Declaraci�n de variables
	Definir n1, n2, n3, n4, max, min como entero;
	
	//Petici�n de datos
	Escribir "Introduzca el primer n�mero";
	Leer n1;
	Escribir "Introduzca el segundo n�mero";
	Leer n2;
	Escribir "Introduzca el tercer n�mero";
	Leer n3;
	Escribir "Introduzca el cuarto n�mero";
	Leer n4;
	
	//Operaci�ns
	//Comprobo que non haxa ning�n igual
	Si n1 = n2 | n1 = n3 | n2 = n3 | n1 = n4 | n2 = n4 | n3 = n4 Entonces
		Escribir "Error: hai dous n�meros iguais";
	SiNo
		Si n1 > n2 & n1 > n3 & n1 > n4 Entonces
			max = n1;
		SiNo
			Si n2 > n1 & n2 > n3 & n2 > n4 Entonces
				max = n2;
			SiNo
				Si n3 > n1 & n3 > n2 & n3 > n4 Entonces
					max = n3;
				SiNo
					max = n4;
				FinSi
			FinSi
		FinSi
		
		Si n1 < n2 & n1 < n3 & n1 < n4 Entonces
			min = n1;
		SiNo
			Si n2 < n1 & n2 < n3 & n2 < n4 Entonces
				min = n2;
			SiNo
				Si n3 < n1 & n3 < n2 & n3 < n4 Entonces
					min = n3;
				SiNo
					min = n4;
				FinSi
			FinSi
		FinSi
	Fin Si
	
	
	//Resultado
	Escribir "Suma: ", max + min;	
	
FinAlgoritmo
