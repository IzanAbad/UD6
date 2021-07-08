import java.util.Scanner;

public class Ej10App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Entra el tamaño del array");
		int x = sc.nextInt();
		
		int array[] = new int [x];
		
		array = rellenarArrayRand(array, 0, 23);
		
		mostrarArray(array);
		
		int mayor = numeroMasGrandeArray(array);
		
		System.out.println("\nNúmero más grande: "+mayor);
		
	}
	
	public static int[]rellenarArrayRand(int[]array, int min, int max){
		
		int temp=0;
		Scanner teclado= new Scanner(System.in);
		
		for(int i = 0; i < array.length; i++) {
			
			
			
			do {
				
			temp= (int) (Math.random() * (max + 1 - min)) + min;
				
			}while(!numeroPrimo(temp));
			
			array[i] = temp;
			
			
		}
		
		
		return array;
	}
	public static int numeroMasGrandeArray(int[]array) {
		int mayor =0;
		
		for(int i =0; i < array.length; i++) {
			
			if(array[i] > mayor) {
				
				mayor = array[i];
			}
			
		}
		
		return mayor;
	}
 public static boolean numeroPrimo(int n) {
		 
		 int a=0;
		 
		 for(int i=1;i<(n+1);i++){
	        	
		        if(n%i==0){
		            a++;
		           }
		        }
		        if(a!=2){
		        	
		            return false;
		             
		           }else{
		        	   
		               return true;
		        }
		        
		 
	 }
 public static void mostrarArray(int[]array){
		
		for(int i=0; i< array.length; i++) {
			
			System.out.print(array[i]+" ");
			
		}
		
		
	}

}
