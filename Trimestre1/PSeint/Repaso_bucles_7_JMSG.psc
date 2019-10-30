//Autor: Jose Manuel Sabarís
//Título: Repaso de bucles 7
Proceso divisionSegundoGrado
	
	//Aquí vamos a resolver una ecuación de segundo grado pidiendo A, B, C y X, cuando X sea 99 termina el programa.
	Definir a, b, c Como Entero;
	Definir X Como Entero;
	Definir resultado Como Real;
	
	Escribir "Hola";
	Escribir "Tiene que introducir los siguientes valores para realizar una ecuación de segundo grado";
	Escribir "Por favor, introduzca el valor de A";
	Leer a;
	Escribir "Por favor, introduzca el valor de B";
	Leer b;
	Escribir "Por favor, introduzca el valor de C";
	Leer c;
	Escribir "Por favor, introduzca el valor de X";
	Leer x;
	
	Si x <> 99 Entonces
		Mientras x <> 99 Hacer
			resultado <- a * x ^ 2 + b * x + c;
			Escribir "El resultado de su ecuación es: ", resultado;
			Escribir "Introduzca un nuevo valor para X o 99 para finalizar el programa";
			Leer x;
		FinMientras
	FinSi
	
	Escribir "Hasta otra";
	
FinProceso
