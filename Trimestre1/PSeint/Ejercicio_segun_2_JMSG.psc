//Autor: Jose Manuel Sabar�s
//T�tulo: Ejercicio Seg�n 2
Proceso diceMes
	
	//Aqu� vamos a pedir un n�mero v�lido de mes y mostraremos al mes que corresponde.
	Definir mes Como Entero;
	
	Escribir "Hola";
	Escribir "Por favor, introduce un n�mero de mes v�lido";
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
		9: Escribir "Septi�mbre";
		10: Escribir "Octubre";
		11: Escribir "Noviembre";
		12: Escribir "Diciembre";
		De Otro Modo: Escribir "N�mero introducido no v�lido";
	FinSegun;
	
	Escribir "Hasta otra";
	
FinProceso
