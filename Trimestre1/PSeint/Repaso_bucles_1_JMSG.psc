//Autor: Jose Manuel Sabar�s
//T�tulo: Repaso de bucles 1
Proceso sumaHastaCien
	
	//Aqu� vamos a calcular la suma de los n�meros ingresados hasta que el valor acumulado sea menor de 100.
	Definir num1, num2 Como Entero;
	Definir resultado Como Entero;
	
	Escribir "Hola";
	Escribir "Por favor, introduzca un n�mero entero";
	Leer num1;
	
	resultado <- num1;
	
	Mientras resultado <= 100 Hacer
		Escribir "Por favor, introduzca otro n�mero entero";
		Leer num2;		
		Si (resultado + num2) > 100 Entonces			
			Escribir "La suma de los n�meros ingresados es: ", resultado;
			resultado <- resultado + num2;
		FinSi
		resultado <- resultado + num2;
	FinMientras
	
	Escribir "Hasta otra";
	
FinProceso