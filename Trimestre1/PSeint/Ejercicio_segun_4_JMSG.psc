//Autor: Jose Manuel Sabar�s
//T�tulo: Ejercicio Seg�n 4
Proceso calculadora
	
	//Aqu� vamos a realizar una calculadora
	Definir num1, num2 Como Real;
	Definir simbolo Como Caracter;
	Definir resultado Como Real;

	Escribir "Hola";
	Escribir "Tiene que introducir 2 n�meros y escoger un s�mbolo para sumar/restar/dividir/multiplicar.";
	Escribir "Por favor, introduzca el primer n�mero";
	Leer num1;
	Escribir "Por favor, introduzca el segundo n�mero";
	Leer num2;
	Escribir "Por favor, introduzca el s�mbolo que le interese";
	Leer simbolo;
	
	Segun (simbolo) Hacer
		"+": resultado <- num1 + num2;
		"-": resultado <- num1 - num2;
		"*": resultado <- num1 * num2;
		"/": resultado <- num1 / num2;
		De Otro Modo: Escribir "S�mbolo introducido no v�lido";
	FinSegun
	
	Escribir "El resultado es: ", resultado;
	Escribir "Hasta otra";
	
FinProceso
