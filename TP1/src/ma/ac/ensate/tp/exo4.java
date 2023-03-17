package ma.ac.ensate.tp;
import java.util.Scanner; 

public class exo4 {
	public static void main (String[]  Args) {
		
	boolean isTrue = false ; 
	while (isTrue !=true ) { 
		System.out.println ("                1-Somme et produit de deux entiers");
		System.out.println ("                2-Surface d'un carre");
		System.out.println ("                3-Factorielle d'un nombre");
		System.out.println ("                4-Quitter le menu");
			
		Scanner KeyboardInput = new Scanner(System.in);
		System.out.print ("Entrer un nombre : ");
		int nbr= KeyboardInput.nextInt() ; 

		switch (nbr) 
		{ 
			case 1 : 
			    SommeProduit();	
			break ; 
			case  2 :  
				SurfaceCarre();
				break ;
			case  3 : 
				Factorielle();
				break ; 
			 case  4 :  
				System.exit(0); ;
				isTrue = true ; 
			}
	}
	}
		
public static void SommeProduit() { 
	Scanner KeyboardInput = new Scanner(System.in);
	System.out.print ("Entrer le 1er nombre : ");
	 int nbr1 = KeyboardInput.nextInt();

	System.out.print("Entrer le 2eme nombre : ");
	int  nbr2 = KeyboardInput.nextInt();	
	System.out.println("la somme est: " +(nbr1 +nbr2) );  
	System.out.println("le produit  est: " +(nbr1*nbr2) ); 
			
}
public static void SurfaceCarre ( ) { 
	Scanner KeyboardInput = new Scanner (System.in);
	System.out.print("Entrer la longeur du carre: ");
	int L = KeyboardInput.nextInt() ; 
	System.out.print("La surface du carre est : " +(L*L));
	
}
public static void Factorielle() { 
	Scanner KeyboardInput = new Scanner(System.in);
	System.out.print("Entrer un nombre:  "); 
	int nombre= KeyboardInput.nextInt(); 
	int F =1;
	int i ; 
if (nombre >0) { 
	for (i=1; i<=nombre ; i++) { 
		F = F*i; 	
	}
	System.out.print(+F);
	}else { 
		System.out.print("le nombre doit etre positif "); 
	}
	
}
}

