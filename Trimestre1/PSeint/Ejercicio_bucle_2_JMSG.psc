//Autor: Jose Manuel Sabar�s
//T�tulo: Ejercicio bucles 2
Algoritmo sumacero
	
	//Aqui vamos a sumar dos n�meros mientras ambos no se introduzcan con valor 0
	Definir num1, num2 Como Real;
	Definir total Como Entero;
	
	//num1 = -1;
	//num2 = -1;
	
	Escribir "Hola";
	Escribir "Por favor introduzca un n�mero";
	Leer num1;
	Escribir "Por favor introduzca el segundo n�mero";
	Leer num2;
	
	Mientras (num1 <> 0 o num2 <> 0) Hacer
		total = num1 + num2;
		Escribir "El total de sus n�meros es: ", total;
		Leer num1;
		Leer num2;
	FinMientras;
	
	Escribir "Los dos n�meros son 0";
	Escribir "Hasta otra";
	
FinAlgoritmo
