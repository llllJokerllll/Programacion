//Autor: Jose Manuel Sabar�s
//T�tulo: Ejercicio Encerado Colegio
Algoritmo porcentajes
	
	//Aqui vamos a realizar un porcentaje entre ni�os y ni�as en una clase
	Definir neno, nena Como Entero;
	
	Escribir "Hola"
	Escribir "Por favor, introduzca el n�mero de ni�os que hay en la clase";
	Leer neno;
	Escribir "Por favor, introduzca el n�mero de ni�as que hay en la clase";
	Leer nena; 
	
	Escribir "El porcentaje de ni�os en la clase es = " Sin Saltar;
	Escribir neno * 100 / (neno + nena);
	Escribir "El porcentaje de ni�as en la clase es = " Sin Saltar;
	Escribir nena * 100 / (nena + neno);
	Escribir "Hasta otra";
	
	
FinAlgoritmo
