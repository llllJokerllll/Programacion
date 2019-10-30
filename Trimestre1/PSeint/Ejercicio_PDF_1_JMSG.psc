//Autor: Jose Manuel Sabarís
//Título: Ejercicio 1
Algoritmo signo
	
	//Aqui vamos a realizar la comprobación de si el número dado es positivo, negativo o 0.
	Definir num1 Como Entero;
	
	Escribir "Hola";
	Escribir "Por favor, introduzca un número para ver si es positivo o negativo";
	Leer num1;
	
	Si num1 == 0 Entonces
		Escribir "El número que ha ingresado es 0";
		SiNo Si num1 > 0 Entonces
			Escribir "El número que ha ingresado es Positivo";
		SiNo 
			Escribir "El número que ha ingresado es Negativo";
		FinSi;
	Fin Si;
	
	Escribir "Hasta otra";
	
FinAlgoritmo
