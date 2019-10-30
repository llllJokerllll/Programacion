//Autor: Jose Manuel Sabarís
//Título: Ejercicio Según 4
Proceso calculadora
	
	//Aquí vamos a realizar una calculadora
	Definir num1, num2 Como Real;
	Definir simbolo Como Caracter;
	Definir resultado Como Real;

	Escribir "Hola";
	Escribir "Tiene que introducir 2 números y escoger un símbolo para sumar/restar/dividir/multiplicar.";
	Escribir "Por favor, introduzca el primer número";
	Leer num1;
	Escribir "Por favor, introduzca el segundo número";
	Leer num2;
	Escribir "Por favor, introduzca el símbolo que le interese";
	Leer simbolo;
	
	Segun (simbolo) Hacer
		"+": resultado <- num1 + num2;
		"-": resultado <- num1 - num2;
		"*": resultado <- num1 * num2;
		"/": resultado <- num1 / num2;
		De Otro Modo: Escribir "Símbolo introducido no válido";
	FinSegun
	
	Escribir "El resultado es: ", resultado;
	Escribir "Hasta otra";
	
FinProceso
