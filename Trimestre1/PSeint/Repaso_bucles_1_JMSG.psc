//Autor: Jose Manuel Sabarís
//Título: Repaso de bucles 1
Proceso sumaHastaCien
	
	//Aquí vamos a calcular la suma de los números ingresados hasta que el valor acumulado sea menor de 100.
	Definir num1, num2 Como Entero;
	Definir resultado Como Entero;
	
	Escribir "Hola";
	Escribir "Por favor, introduzca un número entero";
	Leer num1;
	
	resultado <- num1;
	
	Mientras resultado <= 100 Hacer
		Escribir "Por favor, introduzca otro número entero";
		Leer num2;		
		Si (resultado + num2) > 100 Entonces			
			Escribir "La suma de los números ingresados es: ", resultado;
			resultado <- resultado + num2;
		FinSi
		resultado <- resultado + num2;
	FinMientras
	
	Escribir "Hasta otra";
	
FinProceso