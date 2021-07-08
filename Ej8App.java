import java.util.Scanner;

public class Ej8App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int array[] = new int [10];
		
		
		array = rellenarArray(array);
		
		mostrarArray(array);
		
	}
	public static int[]rellenarArray(int[]array){
		
		
		Scanner teclado= new Scanner(System.in);
		
		for(int i = 0; i < array.length; i++) {
			
			System.out.println("Entra el numero para la posición "+i);
			array[i] = teclado.nextInt();
			
		}
		
		
		return array;
	}
	public static void mostrarArray(int[]array){
		
		for(int i=0; i< array.length; i++) {
			
			System.out.print(array[i]+" ");
			
		}
		
		
	}

}
