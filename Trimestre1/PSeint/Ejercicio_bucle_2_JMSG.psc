//Autor: Jose Manuel Sabarís
//Título: Ejercicio bucles 2
Algoritmo sumacero
	
	//Aqui vamos a sumar dos números mientras ambos no se introduzcan con valor 0
	Definir num1, num2 Como Real;
	Definir total Como Entero;
	
	//num1 = -1;
	//num2 = -1;
	
	Escribir "Hola";
	Escribir "Por favor introduzca un número";
	Leer num1;
	Escribir "Por favor introduzca el segundo número";
	Leer num2;
	
	Mientras (num1 <> 0 o num2 <> 0) Hacer
		total = num1 + num2;
		Escribir "El total de sus números es: ", total;
		Leer num1;
		Leer num2;
	FinMientras;
	
	Escribir "Los dos números son 0";
	Escribir "Hasta otra";
	
FinAlgoritmo
