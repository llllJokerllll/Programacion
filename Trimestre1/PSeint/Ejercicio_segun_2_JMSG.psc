//Autor: Jose Manuel Sabarís
//Título: Ejercicio Según 2
Proceso diceMes
	
	//Aquí vamos a pedir un número válido de mes y mostraremos al mes que corresponde.
	Definir mes Como Entero;
	
	Escribir "Hola";
	Escribir "Por favor, introduce un número de mes válido";
	Leer mes;
	
	Segun (mes) Hacer
		1: Escribir "Enero";
		2: Escribir "Febrero";
		3: Escribir "Marzo";
		4: Escribir "Abril";
		5: Escribir "Mayo";
		6: Escribir "Junio";
		7: Escribir "Julio";
		8: Escribir "Agosto";
		9: Escribir "Septiémbre";
		10: Escribir "Octubre";
		11: Escribir "Noviembre";
		12: Escribir "Diciembre";
		De Otro Modo: Escribir "Número introducido no válido";
	FinSegun;
	
	Escribir "Hasta otra";
	
FinProceso
