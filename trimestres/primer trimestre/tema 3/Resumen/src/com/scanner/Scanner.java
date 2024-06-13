package com.scanner;

//Uso de la clase Scanner para recoger inputs de usuario en Java - Resumen:

//1. Importar la clase Scanner:
//Necesitamos importar la clase Scanner para utilizarla en el programa.
//Se elige la opción de importar desde el paquete java.util.


//2.Instanciar la clase Scanner:
//Creamos un objeto Scanner usando new Scanner(System.in).
//Es importante cerrar el Scanner con close() cuando ya no se necesite.


//3.Recoger el primer input (nombre):
//Imprimimos un mensaje pidiendo el nombre del cliente.
//Usamos el método nextLine() para recoger el input del usuario y asignarlo a una variable (por ejemplo, nombre).

//4. Recoger el segundo input (edad):
//Solicitamos la edad del cliente.
//Opción 1: Usar nextInt(), seguido de nextLine() para consumir el new line.
//Opción 2: Recoger el input como String con nextLine() y convertirlo a entero con Integer.parseInt().

//5.Recoger el tercer input (ciudad de residencia) y crear un objeto Cliente:
//Solicitamos la ciudad de residencia y asignamos a una variable (por ejemplo, ciudad).
//Creamos un objeto de tipo Cliente con los datos recogidos: Cliente c = new Cliente(nombre, edad, ciudad).

//6.Ejecutar el método que da de alta en la BBDD:
//Usamos la variable de referencia c para llamar al método que da de alta en la base de datos.

//7.Cerrar el Scanner correctamente:
//Es importante cerrar el Scanner con close() cuando ya no se necesite para evitar warnings y liberar recursos.