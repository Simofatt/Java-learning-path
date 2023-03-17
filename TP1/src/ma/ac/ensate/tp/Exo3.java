package ma.ac.ensate.tp;

import java.util.Scanner; 

public class Exo3 {
	public static void Factorielle () {
		
		Scanner KeyboardInput = new Scanner(System.in);
		System.out.print("Entrer un nombre:  "); 
		int nombre= KeyboardInput.nextInt(); 
		
		int F =1 ; 
	if (nombre >0) { 
		for (int i=1; i<=nombre ; i++) { 
			F = F*i; 
		}
		System.out.print(+F); 
		

		}else { 
			System.out.print("le nombre doit etre positif "); 
		}
	}

}
