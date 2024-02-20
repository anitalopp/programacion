package Conversores;

public class Conversores {
//	De int a String:
	int numero = 10;
	String cadena = String.valueOf(numero);
	// O usando concatenación de cadena vacía
	String cadena = numero + "";
	
//	De String a int:
	String cadena = "10";
	int numero = Integer.parseInt(cadena);
	
//	De String a Integer:
	String cadena = "10";
	Integer numero = new Integer(cadena);
	
//	De String a double:
	String cadena = "3.14";
	double numero = Double.parseDouble(cadena);

//	De double a String:
	double numero = 3.14;
	String cadena = String.valueOf(numero);
	// O usando concatenación de cadena vacía
	String cadena = numero + "";
	
//	De String a boolean:
	String cadena = "true";
	boolean valor = Boolean.parseBoolean(cadena);
	
//	De boolean a String:
	boolean valor = true;
	String cadena = Boolean.toString(valor);
	
//	De String a otros tipos numéricos (byte, short, long, float):
	String cadena = "123";
	byte byteValue = Byte.parseByte(cadena);
	short shortValue = Short.parseShort(cadena);
	long longValue = Long.parseLong(cadena);
	float floatValue = Float.parseFloat(cadena);

}
