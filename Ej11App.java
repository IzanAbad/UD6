import java.util.Random;
import java.util.Scanner;

public class Ej11App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Entra el tamaño de los arrays");
		int x = sc.nextInt();
		
		int arrayUno[] = new int [x];
		int arrayDos[] = new int [x];
		
		
		arrayUno= rellenarArrayRand(arrayUno, 1, 10);
		mostrarArray(arrayUno);
		System.out.println(" ");
		arrayDos = copiarArray(arrayUno, arrayDos);
	
		arrayDos= shuffleArray(arrayDos);
		mostrarArray(arrayDos);
		System.out.println(" ");
		
		int[]arrayTres = tercerArray(arrayUno, arrayDos);
		mostrarArray(arrayTres);
		
		
	}
	public static int[]rellenarArrayRand(int[]array, int min, int max){
		
		int temp=0;
		Scanner teclado= new Scanner(System.in);
		
		for(int i = 0; i < array.length; i++) {
			
			array[i]= (int) (Math.random() * (max + 1 - min)) + min;
				
		}
		
		
		return array;
	}
	public static int[]copiarArray(int[]arrayUno, int[]arrayDos){
		
		for(int i = 0; i < arrayUno.length; i++) {
			
			arrayDos[i] = arrayUno[i];
			
		}
		
		return arrayDos;
	}
	public static int[] shuffleArray(int[] array){
	    int index;
	    Random random = new Random();
	    for (int i = array.length - 1; i > 0; i--)
	    {
	        index = random.nextInt(i + 1);
	        if (index != i)
	        {
	            array[index] ^= array[i];
	            array[i] ^= array[index];
	            array[index] ^= array[i];
	        }
	    }
	    return array;
	}
	 public static void mostrarArray(int[]array){
			
			for(int i=0; i< array.length; i++) {
				
				System.out.print(array[i]+" ");
				
			}
			
			
		}
	 public static int[]tercerArray(int[]arrayUno, int[]arrayDos){
		 
		 int arrayTres[] = new int [arrayUno.length];
		 
		 for(int i = 0; i < arrayUno.length; i++) {
			 
			 arrayTres[i] = arrayUno[i] * arrayDos[i];
		 }
		 
		 
		 return arrayTres;
	 }

}
