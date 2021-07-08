import java.util.Scanner;

public class Ej5App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Entra un numero decimal y te lo convertiré a binario");
		int numero = teclado.nextInt();
		
		
		String convertido = pasarABinario(numero);
		
		String binarioFinal = invertirString(convertido);
		
		System.out.println("El numero "+numero+" en binario es: "+binarioFinal);
	}
	
	public static String pasarABinario(int numero) {
		
		int sig = 0;
		String binario = "";
		do {
			binario +=numero%2;
			sig = numero / 2;
			numero = sig;
			
			
			
		}while(numero/2 != 0);
		
		binario+="1";
		
		
		return binario;
		
	}
	public static String invertirString(String cadena) {
		String cadenaInvertida="";
		
		for (int i=cadena.length()-1;i>=0;i--)
			  cadenaInvertida = cadenaInvertida + cadena.charAt(i);
		
		return cadenaInvertida;
	}
	
	

}
