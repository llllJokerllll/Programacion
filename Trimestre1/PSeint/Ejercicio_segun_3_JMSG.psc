//Autor: Jose Manuel Sabar�s
//T�tulo: Ejercicio Seg�n 3
Proceso calcularNota
	
	//Aqu� vamos a pedir un n�mero entero v�lido para una nota, y mostraremos la nota que le es asignada a ese valor.
	Definir nota Como Entero;
	
	Escribir "Hola";
	Escribir "Por favor, introduzca el n�mero entero de su nota.";
	Leer nota;
	
	Segun (nota) Hacer
		1, 2, 3, 4: Escribir "Suspenso";
		5: Escribir "Regular";
		6: Escribir "Bien";
		7, 8: Escribir "Notable";
		9: Escribir "Excelente";
		10: Escribir "Sobresaliente";
		De Otro Modo: Escribir "Nota introducida no v�lida";
	FinSegun;
	
	Escribir "Hasta otra";
	
FinProceso
