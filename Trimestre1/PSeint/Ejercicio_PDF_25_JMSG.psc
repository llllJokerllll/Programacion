//Autor: Jose Manuel Sabarís
//Título: Ejercicio 25
Proceso numeroCentral
	
	//Aquí vamos a pedir 3 números enteros distintos y mostrar el que tenga el valor del medio.
	Definir num1, num2, num3 Como Entero;
	Definir numCentro Como Entero;
	
	Escribir "Hola";
	Escribir "Tiene que ingresar 3 números enteros distintos";
	Escribir "Por favor, introduzca el primer número";
	Leer num1;
	Escribir "Por favor, introduzca el segundo número";
	Leer num2;
	Escribir "Por favor, introduzca el tercer número";
	Leer num3;
	
	Si num1 == num2 || num1 == num3 || num2 == num3 Entonces
		Escribir "Lo sentimos, ha introducido algún número igual";
	SiNo Si (num1 > num2 && num1 < num3) || (num1 < num2 && num1 > num3) Entonces
			numCentro <- num1;
		SiNo Si (num2 < num1 && num2 > num3) || (num1 > num2 && num2 < num3) Entonces
				numCentro <- num2;
			SiNo
				numCentro <- num3;
			FinSi;
		FinSi;
		Escribir "El número que ocupa la posición central es: ", numCentro;
	FinSi;
	
	Escribir "Hasta otra";
	
FinProceso
