import java.util.Scanner;

public class Ej2App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Entra la cantidad de numeros que quieres mostrar");
		int num = teclado.nextInt();
		
		System.out.println("Entra el primer numero del rango");
		int min = teclado.nextInt();
		
		System.out.println("Entra el ultimo numero del rango");
		int max = teclado.nextInt();
		
		for(int i = 0; i < num; i++) {
			
			randNum(min, max);
			
		}
		
		
		
	}
	
	public static void randNum(int min, int max) {
		
		
		int numeroAleatorio = (int) (Math.random() * (max + 1 - min)) + min;
		
		System.out.println(numeroAleatorio);
		
	}

}
