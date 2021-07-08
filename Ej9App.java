import java.util.Scanner;

public class Ej9App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la medida del array");
		int x = sc.nextInt();
		
		int array[] = new int [x];
		
		rellenarArrayRand(array, 0, 9);
		
		mostrarArray(array);
		
		int suma = sumarArray(array);
		
		
		System.out.println("\nLa suma total del array es: "+suma);
		
		
	}
	public static int[]rellenarArrayRand(int[]array, int min, int max){
		
		
		Scanner teclado= new Scanner(System.in);
		
		for(int i = 0; i < array.length; i++) {
			
			array[i]= (int) (Math.random() * (max + 1 - min)) + min;
			
		}
		
		
		return array;
	}
	public static void mostrarArray(int[]array){
		
		for(int i=0; i< array.length; i++) {
			
			System.out.print(array[i]+" ");
			
		}
		
		
	}
	public static int sumarArray(int[]array) {
		
		int total =0;
		
		for(int i =0; i< array.length; i++) {
			
			total = array[i] + total;
		}
		
		return total;
		
	}
	
	

}
