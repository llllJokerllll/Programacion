//Autor: Jose Manuel Sabar�s
//T�tulo: Ejercicio 25
Proceso numeroCentral
	
	//Aqu� vamos a pedir 3 n�meros enteros distintos y mostrar el que tenga el valor del medio.
	Definir num1, num2, num3 Como Entero;
	Definir numCentro Como Entero;
	
	Escribir "Hola";
	Escribir "Tiene que ingresar 3 n�meros enteros distintos";
	Escribir "Por favor, introduzca el primer n�mero";
	Leer num1;
	Escribir "Por favor, introduzca el segundo n�mero";
	Leer num2;
	Escribir "Por favor, introduzca el tercer n�mero";
	Leer num3;
	
	Si num1 == num2 || num1 == num3 || num2 == num3 Entonces
		Escribir "Lo sentimos, ha introducido alg�n n�mero igual";
	SiNo Si (num1 > num2 && num1 < num3) || (num1 < num2 && num1 > num3) Entonces
			numCentro <- num1;
		SiNo Si (num2 < num1 && num2 > num3) || (num1 > num2 && num2 < num3) Entonces
				numCentro <- num2;
			SiNo
				numCentro <- num3;
			FinSi;
		FinSi;
		Escribir "El n�mero que ocupa la posici�n central es: ", numCentro;
	FinSi;
	
	Escribir "Hasta otra";
	
FinProceso
