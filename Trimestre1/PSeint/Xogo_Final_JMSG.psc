//Autor: Jose Manuel Sabarís
//Título: Ejercicio Encerado Adivinar v5
Algoritmo xogoFinal
	
	//Aquí vamos a realizar un juego de adivina un número al azar, dando una pista y además daremos la posibilidad de volver a jugar las veces que quiera el usuario.
	Definir adivina Como Entero;
	Definir resultado, vueltas Como Entero;
	Definir nmax, noper, intentos Como Entero;
	Definir operacion Como caracter;
	
	nmax <- 101;
	noper <- 2;
		
	Repetir
		resultado <- 1; 
		para vueltas <- 1 hasta noper con paso 1 hacer
			resultado <- resultado * azar(nmax);
		FinPara
		
		Escribir "El numero anterior al correcto es: ", resultado -1;
		
		intentos <- 5;
		Repetir
			Escribir "Introduzca el número entero, te quedan: ", intentos, " intentos";
			Leer adivina;
			intentos <- intentos - 1;
		Hasta Que adivina == resultado | intentos == 0;
		
		Si adivina == resultado Entonces
			Escribir "Eres un crack, resultado correcto";
		SiNo
			Escribir "Vuelva a intentarlo";
		FinSi
		
		Escribir "Quieres volver a jugar? s/n";
		Leer operacion;
		
		Segun operacion Hacer
			"s":
				escribir "Volvemos a empezar a jugar";
			"n":
				Escribir "Gracias por haber jugado, hasta otra";
		FinSegun
		
	Hasta Que operacion == "n" | intentos < 0; 
	
FinAlgoritmo