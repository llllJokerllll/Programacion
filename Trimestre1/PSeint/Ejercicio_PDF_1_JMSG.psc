//Autor: Jose Manuel Sabar�s
//T�tulo: Ejercicio 1
Algoritmo signo
	
	//Aqui vamos a realizar la comprobaci�n de si el n�mero dado es positivo, negativo o 0.
	Definir num1 Como Entero;
	
	Escribir "Hola";
	Escribir "Por favor, introduzca un n�mero para ver si es positivo o negativo";
	Leer num1;
	
	Si num1 == 0 Entonces
		Escribir "El n�mero que ha ingresado es 0";
		SiNo Si num1 > 0 Entonces
			Escribir "El n�mero que ha ingresado es Positivo";
		SiNo 
			Escribir "El n�mero que ha ingresado es Negativo";
		FinSi;
	Fin Si;
	
	Escribir "Hasta otra";
	
FinAlgoritmo
