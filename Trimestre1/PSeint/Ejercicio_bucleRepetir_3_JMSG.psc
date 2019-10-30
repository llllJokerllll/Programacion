//Autor: Jose Manuel Sabarís
//Título: Ejercicio bucle repetir 3
Algoritmo divideCero
	
	//Aquí vamos a dividir 2 números, pero el segundo numero nunca puede ser 0, y mostraremos el resultado.
	Definir num1, num2 Como Reales;
	Definir error Como Caracter;
	Definir resultado Como Real;
	
	Escribir "Hola";
	Escribir "Tiene que introducir 2 números para realizarse una división";
	Escribir "Por favor, introduzca el primer número";
	Leer num1;
	
	Repetir
		Escribir "Por favor, introduzca el segundo número", error;
		Leer num2;
		error <- " distinto de 0";
	Hasta Que num2 <> 0;
	
	resultado <- num1 / num2;
	
	Escribir "El resultado de la división es: ", resultado;
	Escribir "Hasta otra";
	
FinAlgoritmo
