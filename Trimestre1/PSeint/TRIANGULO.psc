Algoritmo Triangulo
	//Zona de declaraci�n de variables
	Definir h,i,j,b,n,m como entero;
	//H = ALTURA DEL TRI�NGULO(INTRODUCIDA POR EL USUARIO)
	//i,j,b,n,m:Variables para las vueltas de los bucles
	
	Definir espacio como texto
	espacio<-" ";
	//h = determina la altura total del tri�ngulo(Dato usuario)
	//i = determina la altura actual en la que se encuentra el bucle(fila)
	//m = cantidad de espacios a la izquierda(Antes de que se vea el tri�ngulo)
	
	
	leer h;
	
	Para i<-0 Hasta h-1 Con Paso 1 Hacer
		
		
		Para m<-1 hasta h-i con paso 1 hacer //Espacios al principio
			Escribir Espacio Sin Saltar;
		FinPara
		
		Escribir "*" Sin Saltar;
		
		
		Para n<-1 hasta -(m-i) con paso 1 hacer //1� Diagonal de asteriscos 
			Escribir "*" Sin saltar;
		FinPara
		
		
		si (i>=1)
			Para j<-1 Hasta i con paso 1 Hacer //Asteriscos que faltan
				Escribir "*" Sin saltar;
			FinPara
			
		Finsi
		Escribir ""; //Salto de l�nea
		
	Fin Para
		
FinAlgoritmo
