//Autor: Jose Manuel Sabarís
//Título: Ejercicio bucles 1
Algoritmo login
	
	//Aquí vamos a realizar la comprobación de una contraseña mediante un bucle.
	Definir contrasena Como Caracter;
	Definir acceso Como Caracter;
	
	acceso = "1234";
	
	Escribir "Hola";
	Escribir "Por favor, introduzca los 4 dígitos de la contraseña";
	Leer contrasena;
	
	Mientras contrasena <> acceso Hacer
		Escribir "Contraseña incorrecta, por favor vuelva a introducirla correctamente";
		Leer contrasena;
	Fin Mientras;
	
	Escribir "Bienvenido";
	Escribir "Contraseña correcta, ha iniciado sesión correctamente";
	
FinAlgoritmo
