//Autor: Jose Manuel Sabarís
//Título: Ejercicio 26
Algoritmo descubreElDiaSiguiente
	
	//Aquí vamos a dar el dia siguiente de la fecha que nos den por teclado.
	Definir dia, mes, ano Como Entero;
	Definir diaSiguiente, mesSiguiente, anoSiguiente Como Entero;
	Definir bisiesto Como Logico;
	
	Escribir "Hola";
	Escribir "Por favor, introduzca un día";
	Leer dia;
	Escribir "Por favor, introduzca un mes";
	Leer mes;
	Escribir "Por favor, introduzca un año";
	Leer ano;
	
	Si (ano MOD 4 == 0 & ano MOD 100 <> 0) | (ano MOD 400 == 0) Entonces
		bisiesto <- Verdadero;
	SiNo
		bisiesto <- Falso;
	FinSi;
	
	Si dia > 31 | mes > 12 | (mes = 2 & dia > 28 & ~bisiesto) | (dia > 30 & (mes == 4 | mes == 6 | mes == 9 | mes == 11)) Entonces
		Escribir "Fecha erronea";
	SiNo
		diaSiguiente <- dia + 1;
		mesSiguiente <- mes;
		anoSiguiente <- ano;
		
		Si (dia == 31 & (mes == 1 | mes == 3 | mes == 5 | mes == 7 | mes == 8 | mes == 10)) | (dia == 30 & (mes == 4 | mes == 6 | mes == 9 | mes == 11)) | (dia == 28 & mes == 2 & ~bisiesto) | (dia == 29 & mes == 2 & bisiesto) Entonces
			diaSiguiente <- 1;
			mesSiguiente <- mes + 1;
		SiNo Si mes == 12 & dia == 31 Entonces
				diaSiguiente <- 1;
				mesSiguiente <- 1;
				anoSiguiente <- ano + 1;
			FinSi;
		FinSi;
		Escribir "El día siguiente es: ", diaSiguiente, "-", mesSiguiente, "-", anoSiguiente;
	FinSi;
	
	Escribir "Hasta otra";
	
FinAlgoritmo
