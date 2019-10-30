//Autor: Jose Manuel Sabarís
//Título: Ejercicio 16
Algoritmo practicas
	
	//Aquí vamos a realizar en base a 4 notas, la eliminación de la menor y el promedio de las otras 3.
	Definir nota1, nota2, nota3, nota4 Como Real;
	Definir promedio Como Real;
	
	Escribir "Hola";
	Escribir "Tiene que introducir sus 4 notas";
	Escribir "Por favor, introduzca su primera nota";
	Leer nota1;
	Escribir "Por favor, introduzca su segunda nota";
	Leer nota2;
	Escribir "Por favor, introduzca su tercera nota";
	Leer nota3;
	Escribir "Por favor, introduzca su cuarta nota";
	Leer nota4;
	
	Si nota1 < 0 | nota1 > 10 | nota2 < 0 | nota2 > 10 | nota3 < 0 | nota3 > 10 | nota4 < 0 | nota4 > 10 Entonces
		Escribir "Ha introducido alguna nota incorrectamente.";	
	SiNo Si nota1 <= nota2 & nota1 <= nota3 & nota1 <= nota4 Entonces
			promedio <- (nota2 + nota3 + nota4) / 3;
			Escribir "Su promedio es: ", promedio;
		SiNo Si nota2 <= nota3 & nota2 <= nota4 Entonces
				promedio <- (nota1 + nota3 + nota4) / 3;
				Escribir "Su promedio es: ", promedio;
			SiNo Si nota3 <= nota4 Entonces
					promedio <- (nota1 + nota2 + nota4) / 3;
					Escribir "Su promedio es: ", promedio;
				SiNo
					promedio <- (nota1 + nota2 + nota3) / 3;
					Escribir "Su promedio es: ", promedio;
				FinSi;
			FinSi;	
		FinSi;
	FinSi;	
		Escribir "Hasta otra";
		
FinAlgoritmo
