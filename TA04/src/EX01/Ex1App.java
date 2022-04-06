package EX01;

public class Ex1App {

	public static void main(String[] args) {

		//Declaramos dos variables
		int num1 = 13;
		double num2 = 5.5;
		
		//Declaramos los resultados de las operaciones
		double suma;
		double resta;
		double multiplicacion;
		double division;
		double modulo;
		
		//Hacemos las operaciones
		suma = (num1 + num2);
		resta = (num1 - num2);
		multiplicacion = (num1 * num2);
		division = num1 / num2;
		modulo = num1 % num2;
		
		//Imprimimos por consola el resultado
		System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
		System.out.println("La resta de " + num1 + " y " + num2 + " es: " + resta);
		System.out.println("La multiplicacion de " + num1 + " y " + num2 + " es: " + multiplicacion);
		System.out.println("La division de " + num1 + " y " + num2 + " es: " + division);
		System.out.println("El modulo de " + num1 + " y " + num2 + " es: " + modulo);
	}

}
