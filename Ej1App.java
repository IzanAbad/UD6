import java.util.Scanner;

public class Ej1App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double resultado = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("De que figura quieres calcular el area?(Circulo, Triangulo o Cuadrado");
		String figura = teclado.next();
		
		figura = figura.toLowerCase();
		
		switch(figura) {
		case"circulo":
			
			System.out.println("Entra el radio del circulo");
			int radio = teclado.nextInt();
			
			resultado = areaCirculo(radio);
			break;
		case"triangulo":
			
			System.out.println("Entra la base del triangulo");
			int base = teclado.nextInt();
			
			System.out.println("Entra la altura del triangulo");
			int altura = teclado.nextInt();
			
			resultado = areaTriangulo(base, altura);
			break;
		case"cuadrado":
			
			System.out.println("Entra el lado del cuadrado");
			int lado = teclado.nextInt();
			
			resultado = areaCuadrado(lado);
			break;
			
			default:System.out.println("La figura entrada no es válida");
				break;
		
		
		}
		
		System.out.println("Area del "+figura+": "+resultado);
		
		
	}
	
	public static double areaCirculo(int radio) {
		
		double resultado = (Math.pow(radio, 2)* 3.14);
		
		
		return resultado;
	}
	public static double areaTriangulo(int base, int altura) {
		
		double resultado = (base * altura)/2;
		
		return resultado;
	}
	
	public static double areaCuadrado(int lado) {
		
		
		double resultado = lado * lado;
		
		return resultado;
		
	}

}
