//Autor: Jose Manuel Sabar�s
//T�tulo: Ejercicio bucle repetir 3
Algoritmo divideCero
	
	//Aqu� vamos a dividir 2 n�meros, pero el segundo numero nunca puede ser 0, y mostraremos el resultado.
	Definir num1, num2 Como Reales;
	Definir error Como Caracter;
	Definir resultado Como Real;
	
	Escribir "Hola";
	Escribir "Tiene que introducir 2 n�meros para realizarse una divisi�n";
	Escribir "Por favor, introduzca el primer n�mero";
	Leer num1;
	
	Repetir
		Escribir "Por favor, introduzca el segundo n�mero", error;
		Leer num2;
		error <- " distinto de 0";
	Hasta Que num2 <> 0;
	
	resultado <- num1 / num2;
	
	Escribir "El resultado de la divisi�n es: ", resultado;
	Escribir "Hasta otra";
	
FinAlgoritmo
