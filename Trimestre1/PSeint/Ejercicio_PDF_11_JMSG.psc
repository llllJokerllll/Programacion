//Autor: Jose Manuel Sabar�s
//T�tulo: Ejercicio 11
Algoritmo comparacionAreas
	
	//Aqui vamos a realizar el resultado de las areas de un r�ctangulo y de una circulo y comprobar si son iguales.
	Definir base, altura, radio Como Real;
	Definir areaRectangulo, areaCirculo Como Real;
	
	Escribir "Hola";
	Escribir "Tiene que darnos los valores para hallar el area de un rect�ngulo y el area de un circulo";
	Escribir "Por favor, introduzca el valor de la base del r�ctangulo";
	Leer base;
	Escribir "Por favor, introduzca el valor de la altura del r�ctangulo";
	Leer altura;
	Escribir " Por favor, introduzca el valor del radio del circulo";
	Leer radio;
	
	areaRectangulo <- base * altura;
	areaCirculo <- PI * radio^2;
	
	Si areaCirculo == areaRectangulo Entonces
		Escribir "Los resultados de las areas del r�ctangulo y del circulo son iguales";
	SiNo
		Escribir "Los resultados de las areas del r�ctangulo y del circulo no son iguales";
	FinSi;
	
	Escribir "Hasta otra";
FinAlgoritmo
