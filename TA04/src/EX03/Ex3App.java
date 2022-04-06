package EX03;

public class Ex3App {

	public static void main(String[] args) {

		//Declaramos las variables
		int x = 6, y = 4;
		double n = 12.5, m = 8.7;
		
		//Valor de cada variable
		System.out.println("X = " + x);
		System.out.println("Y = " + y);
		System.out.println("N = " + n);
		System.out.println("M = " + m);
		
		//Operaciones de X y Y
		System.out.println("Suma de " + x + " + " + y + " = " + (x+y));
		System.out.println("Diferencia de " + x + " - " + y + " = " + (x-y));
		System.out.println("Producto de " + x + " * " + y + " = " + (x*y));
		System.out.println("Cociente de " + x + " / " + y + " = " + (x/y));
		System.out.println("Resto de " + x + " % " + y + " = " + (x%y));
		
		//Operaciones de N y M
		System.out.println("Suma de " + n + " + " + m + " = " + (n+m));
		System.out.println("Diferencia de " + n + " - " + m + " = " + (n-m));
		System.out.println("Producto de " + n + " * " + m + " = " + (n*m));
		System.out.println("Cociente de " + n + " / " + m + " = " + (n/m));
		System.out.println("Resto de " + n + " % " + m + " = " + (n%m));
		
		//Doble de cada variable
		System.out.println("Doble de " + x + " = " + x*2);
		System.out.println("Doble de " + y + " = " + y*2);
		System.out.println("Doble de " + n + " = " + n*2);
		System.out.println("Doble de " + m + " = " + m*2);
		
		//Suma de todas las variables
		System.out.println("Suma de todas las variables: " + (x+y+n+m));
		System.out.println("Producto de todas las variables: " + (x*y*n*m));
		
	}

}
