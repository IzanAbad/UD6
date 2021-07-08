import java.util.Scanner;

public class Ej3App {

	 public static void main(String[] args) {
		 int n;
         Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese numero");
        n=teclado.nextInt();
        
        if(numeroPrimo(n)) {
        	
        	System.out.println("Es número primo");
        }else {
        	
        	System.out.println("No es número primo");
        }
        
        
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

}
