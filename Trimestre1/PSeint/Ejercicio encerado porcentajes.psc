//Autor: Jose Manuel Sabarís
//Título: Ejercicio Encerado Colegio
Algoritmo porcentajes
	
	//Aqui vamos a realizar un porcentaje entre niños y niñas en una clase
	Definir neno, nena Como Entero;
	
	Escribir "Hola"
	Escribir "Por favor, introduzca el número de niños que hay en la clase";
	Leer neno;
	Escribir "Por favor, introduzca el número de niñas que hay en la clase";
	Leer nena; 
	
	Escribir "El porcentaje de niños en la clase es = " Sin Saltar;
	Escribir neno * 100 / (neno + nena);
	Escribir "El porcentaje de niñas en la clase es = " Sin Saltar;
	Escribir nena * 100 / (nena + neno);
	Escribir "Hasta otra";
	
	
FinAlgoritmo
