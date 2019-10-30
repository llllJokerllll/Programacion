//Autor: Jose Manuel Sabarís
//Título: Ejercicio 14
Algoritmo bisiesto
	
	//Aquí vamos a realizar la comprobación de si un año fué, es o será bisiesto.
	Definir anoEntrada Como Entero;
	
	Escribir "Hola";
	Escribir "Escriba un año en número y le diremos si fué, es o será bisiesto";
	Leer anoEntrada;
	
	Si ((anoEntrada % 4 == 0 & anoEntrada % 100 <> 0) | anoEntrada % 400 == 0) Entonces
		Escribir "El año introducido fué, es o será bisiesto";
	SiNo
		Escribir "El año introducido no fué, no es ni será bisiesto";
	FinSi;
	
	Escribir "Hasta otra";
	
FinAlgoritmo
