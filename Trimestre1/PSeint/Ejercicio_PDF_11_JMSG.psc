//Autor: Jose Manuel Sabarís
//Título: Ejercicio 11
Algoritmo comparacionAreas
	
	//Aqui vamos a realizar el resultado de las areas de un réctangulo y de una circulo y comprobar si son iguales.
	Definir base, altura, radio Como Real;
	Definir areaRectangulo, areaCirculo Como Real;
	
	Escribir "Hola";
	Escribir "Tiene que darnos los valores para hallar el area de un rectángulo y el area de un circulo";
	Escribir "Por favor, introduzca el valor de la base del réctangulo";
	Leer base;
	Escribir "Por favor, introduzca el valor de la altura del réctangulo";
	Leer altura;
	Escribir " Por favor, introduzca el valor del radio del circulo";
	Leer radio;
	
	areaRectangulo <- base * altura;
	areaCirculo <- PI * radio^2;
	
	Si areaCirculo == areaRectangulo Entonces
		Escribir "Los resultados de las areas del réctangulo y del circulo son iguales";
	SiNo
		Escribir "Los resultados de las areas del réctangulo y del circulo no son iguales";
	FinSi;
	
	Escribir "Hasta otra";
FinAlgoritmo
