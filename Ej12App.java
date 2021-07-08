import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ej12App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Entra el tamaño del array");
		int x = sc.nextInt();
		

		int array[] = new int [x];
		
		array= rellenarArrayRand(array, 1, 300);
		
		
		
		String texto = mostrarArray(array);
		
		int[]arrayFinal = stringToArrayNumerico(texto);
		
		mostrarArraySimple(arrayFinal);
	}
	
	public static int[]rellenarArrayRand(int[]array, int min, int max){
		
		int temp=0;
		Scanner teclado= new Scanner(System.in);
		
		for(int i = 0; i < array.length; i++) {
			
			array[i]= (int) (Math.random() * (max + 1 - min)) + min;
				
		}
		
		
		return array;
	}
	
	 public static String mostrarArray(int[]array){
		 
		 	Scanner sc = new Scanner(System.in);
		 	
		 	String temp="";
			int test=0;
			int aux = 0;
			int numerito =0;
			
			do {
			if(aux == 0 || numerito > 9 || numerito < 1) {
				System.out.println("Entra el numero final(0-9)");
				numerito = sc.nextInt();
			}else {
				
				System.out.println("Prueba con un número diferente");
				numerito = sc.nextInt();
			}
			
			for(int i=0; i< array.length; i++) {
				if(array[i]%10 == numerito) {
				
				temp+=array[i]+"-";
				test++;
				
				}else {
					aux = 1;
				}
				
			}
			}while(test==0);
			
			
			temp = temp.substring(0, temp.length()-1);
			
			return temp;
			
	}
	 
	 public static int[]stringToArrayNumerico(String texto){
		 
		 	
		 	
	        String[] split = texto.split("-");
	        
	        int numerico[]= new int [split.length];
	        
	        for(int i = 0; i< split.length; i++) {
	        	
	        	numerico[i]=Integer.parseInt(split[i]);
	        }
		 
		 return numerico;
		 
	 }
	 public static void mostrarArraySimple(int[]array) {
		 
		 for(int i = 0; i < array.length; i++) {
			 System.out.print(array[i]+" ");
			 
		 }
		 
	 }
	

}

