//Autor: Jose Manuel Sabarís
//Título: Ejercicio Según 3
Proceso calcularNota
	
	//Aquí vamos a pedir un número entero válido para una nota, y mostraremos la nota que le es asignada a ese valor.
	Definir nota Como Entero;
	
	Escribir "Hola";
	Escribir "Por favor, introduzca el número entero de su nota.";
	Leer nota;
	
	Segun (nota) Hacer
		1, 2, 3, 4: Escribir "Suspenso";
		5: Escribir "Regular";
		6: Escribir "Bien";
		7, 8: Escribir "Notable";
		9: Escribir "Excelente";
		10: Escribir "Sobresaliente";
		De Otro Modo: Escribir "Nota introducida no válida";
	FinSegun;
	
	Escribir "Hasta otra";
	
FinProceso
