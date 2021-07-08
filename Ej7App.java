import java.util.Scanner;

public class Ej7App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Entra la cantidad  de euros que quieres convertir");
		int cantidad = teclado.nextInt();
		
		System.out.println("Entra el nombre de la moneda a la que quieres convertir");
		String moneda = teclado.next();
		
		
		cambioDivisas(cantidad, moneda);
		
		
	}
	public static void cambioDivisas(int cantidad, String moneda) {
			
		double cambio = 0;
			
		moneda = moneda.toLowerCase();
		
		switch(moneda) {
		case"libras":
			cambio = cantidad * 0.86;
			break;
		case"dolares":
			cambio = cantidad * 1.28611;
			break;
		case"yenes":
			cambio = cantidad * 129.852;
			break;
			
			default:System.out.println("Esta moneda no esta en nuestra base de datos");
				break;
		
		
		}
			
		System.out.println(cantidad+"€ equivalen a "+cambio+" "+moneda);
	
	}
	
}
