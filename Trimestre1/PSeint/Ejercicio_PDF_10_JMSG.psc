//Autor: Jose Manuel Sabarís
//Título: Ejercicio 10
Algoritmo sumahoras
	
	//Aqui vamos a realizar la suma de dos fechas con dia, horas, minutos y segundos.
	Definir h1, h2, m1, m2, s1, s2 Como Enteros;
	Definir rd, rh, rm, rs Como Enteros;
	
	Escribir "Hola";
	Escribir "Introduzca dos horas del día diferentes y se las sumaremos";
	Escribir "Introduzca una hora";
	Leer h1;
	Escribir "Introduzca los minutos";
	Leer m1;
	Escribir "Introduzca los segundos";
	Leer s1;
	Escribir "Introduzca otra hora";
	Leer h2;
	Escribir "Introduzca los minutos";
	Leer m2;
	Escribir "Introduzca los segundos";
	Leer s2;
	
	rs <- s1 + s2;
	Si rs > 59 Entonces
		rs <- rs - 60;
		m1 <- m1 + 1;
	FinSi;
	
	rm <- m1 + m2;
	Si rm > 59 Entonces
		rm <- rm - 60;
		h1 <- h1 + 1;
	FinSi;
	
	rh <- h1 + h2;
	Si rh > 23 Entonces
		rh <- rh - 24;
		rd <- rd + 1;
	FinSi;
	
	Si rd < 1 Entonces
		Escribir "La suma de sus horas es: ", rh, ":", rm, ":", rs;
	SiNo
		Escribir "La suma de sus horas es: ", rd, ":", rh, ":", rm, ":", rs;
	FinSi;
	
	Escribir "Hasta otra";
	
FinAlgoritmo
