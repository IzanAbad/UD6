import java.util.Scanner;

public class Ej4App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Entra un numero y te calculare el factorial");
		int num = teclado.nextInt();
		
		factorial(num);
		
	}
	public static void factorial(int num) {
		
		int factorial=1;
		for (int i=2;i<=num;i++) {
			
			factorial = factorial * i;
			System.out.println(factorial);
		}
		System.out.println("El factorial de "+num+" es: "+factorial);
		
	}

}
