//Autor: Jose Manuel Sabar�s
//T�tulo: Ejercicio 2
Algoritmo calcular
	
	//Aqui vamos a realizar una suma o una multiplicaci�n segun el valor de los 2 numero dados.
	Definir a Como Entero;
	Definir b Como Entero;
	Definir suma Como Entero;
	Definir producto como Entero;
	
	Escribir "Hola";
	Escribir "Por favor, introduzca un numero";
	Leer a;
	Escribir "Por favor, introduzca un segundo numero";
	Leer b;
	
	Si a > b Entonces
		suma <- a + b;
		Escribir "El resultado de la suma de sus n�meros es: ", suma;
	SiNo
		producto <- a * b;
		Escribir "El resultado de la multiplicaci�n de sus n�meros es: ", producto;
	FinSi
	
	Escribir "Hasta otra";
	
FinAlgoritmo
