//Autor: Jose Manuel Sabar�s
//T�tulo: Ejercicio 15
Algoritmo notas
	
	//Aqu� vamos a pedir una nota, y le damos el valor de la nota.
	Definir nota Como Real;
	
	Escribir "Hola";
	Escribir "Por favor, introduzca el n�mero de su nota y le daremos el valor que tiene";
	Leer nota;
	
	Si (nota < 0 o nota > 10) Entonces
		Escribir "Nota incorrecta";
	SiNo Si nota >= 0 y nota < 5 Entonces
			Escribir "S� nota es suspenso";
		SiNo Si nota >= 5 y nota < 7 Entonces
				Escribir "Su nota es aprobado";
			SiNo Si nota >= 7 y nota < 9 Entonces
					Escribir "Su nota es un bien";
				SiNo Si nota >= 9 y nota < 10 Entonces
						Escribir "Su nota es un notable";
					SiNo
						Escribir "Su nota es un sobresaliente";
					FinSi;	
				FinSi;
			FinSi;
		FinSi;
	FinSi;
	
	Escribir "Hasta otra";
	
FinAlgoritmo
