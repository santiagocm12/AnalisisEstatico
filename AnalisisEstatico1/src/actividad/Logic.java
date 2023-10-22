package actividad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Logic {

	public static void main(String[] args) {
		//inspirado en un amigo :^)
		
		ArrayList<String> original =  new ArrayList();
		ArrayList<String> orden = new ArrayList();
		Scanner teclado = new Scanner(System.in);
		System.out.println("cuantos casos quiere");
		int casos=teclado.nextInt();

		for(int i=0;i<casos;i++) {
			System.out.println(" ingres el numero de letras que pondra");
			int NUMLetreas= teclado.nextInt(); 
			System.out.println(" ingres las legras con espacios entra cada una");
			for(int n=0;n<NUMLetreas;n++) {
				String letra= teclado.next();
				original.add(letra);
				orden.add(letra);
			}
			
	       Collections.sort(orden);
	        
	        if (original.equals(orden) == true) {
	        	System.out.println("la lista esta ordenada ");
	         for(int m = 0; m < orden.size(); m++) {
	                System.out.print(orden.get(m));
	          }  
	        
	        }else {
	        	
	        	System.out.println("la lista no esta ordenada.");
	      }
		}
	  }





	}


