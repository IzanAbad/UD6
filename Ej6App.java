import java.util.Scanner;

public class Ej6App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Entra un n�mero y te dir� cu�ntas cifras tiene");
		int numero = teclado.nextInt();
		
		int cifras = cantidadCifras(numero);
		
		System.out.println("El numero "+numero+" tiene "+cifras+" cifras.");
	}
	
	public static int cantidadCifras(int numero) {
		
		String cadena = Integer.toString(numero);
		
		int cifras = cadena.length();
		
		return cifras;
		
	}

}
