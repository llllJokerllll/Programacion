//Autor: Jose Manuel Sabar�s
//T�tulo: Ejercicio bucles 1
Algoritmo login
	
	//Aqu� vamos a realizar la comprobaci�n de una contrase�a mediante un bucle.
	Definir contrasena Como Caracter;
	Definir acceso Como Caracter;
	
	acceso = "1234";
	
	Escribir "Hola";
	Escribir "Por favor, introduzca los 4 d�gitos de la contrase�a";
	Leer contrasena;
	
	Mientras contrasena <> acceso Hacer
		Escribir "Contrase�a incorrecta, por favor vuelva a introducirla correctamente";
		Leer contrasena;
	Fin Mientras;
	
	Escribir "Bienvenido";
	Escribir "Contrase�a correcta, ha iniciado sesi�n correctamente";
	
FinAlgoritmo
