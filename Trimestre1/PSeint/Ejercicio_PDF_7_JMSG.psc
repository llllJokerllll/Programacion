//Autor: Jose Manuel Sabar�s
//T�tulo: Ejercicio 7
Algoritmo ordenacion
	
	//Aqui vamos a realizar la ordenaci�n de 3 n�meros dados, de mayor a menos y de menor a mayor.
	Definir a, b, c Como Enteros;
	
	Escribir "Hola";
	Escribir "Tiene que introducir 3 n�meros, y se los ordenaremos de mayor a menor y de menor a mayor";
	Escribir "Introduzca el primero n�mero";
	Leer a;
	Escribir "Introduzca el segundo n�mero";
	Leer b;
	Escribir "Introduzca el tercer n�mero";
	Leer c;
	
	Si (a >= b) y (a >= c) Entonces
		Si b >= c Entonces
			Escribir "Los n�meros ordenados de mayor a menor son: ", a, "-", b, "-", c;
			Escribir "Los n�meros ordenados de menor a mayor son: ", c, "-", b, "-", a;
		SiNo
			Escribir "Los n�meros ordenados de mayor a menor son: ", a, "-", c, "-", b;
			Escribir "Los n�meros ordenados de menor a mayot son: ", b, "-", c, "-", a;
		FinSi;
	SiNo Si (b >= a) y (b >= c) Entonces
			Si a >= c Entonces
				Escribir "Los n�meros ordenados de mayor a menor son: ", b, "-", a, "-", c;	
				Escribir "Los n�meros ordenados de menor a mayor son: ", c, "-", a, "-", b;
			SiNo
				Escribir "Los n�meros ordenados de mayor a menor son: ", b, "-", c, "-", a;
				Escribir "Los n�meros ordenados de menor a mayor son: ", a, "-", c, "-", b;
			FinSi;
		SiNo Si (c >= a) y (c >= b) Entonces
				Si a >= b Entonces
					Escribir "Los n�meros ordenados de mayor a menor son: ", c, "-", a, "-", b;
					Escribir "Los n�meros ordenados de menor a mayor son: ", b, "-", a, "-", c;
				SiNo
					Escribir "Los n�meros ordenados de mayor a menor son: ", c, "-", b, "-", a;
					Escribir "Los n�meros ordenados de menor a mayor son: ", a, "-", b, "-", c;
				FinSi;
			FinSi;		
		FinSi;	
	FinSi;
	
	Escribir "Hasta otra";
	
FinAlgoritmo
