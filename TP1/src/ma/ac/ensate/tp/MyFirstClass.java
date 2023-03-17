package ma.ac.ensate.tp;
import java.util.Scanner;


public class MyFirstClass {
		public static void main (String[]  Args) {
			Scanner KeyboardInput = new Scanner(System.in);
			System.out.print ("Entrer le 1er nombre : ");
			int nbr1 = KeyboardInput.nextInt();

			System.out.print("Entrer le 2eme nombre : ");
			int nbr2 = KeyboardInput.nextInt();	
			System.out.println("la somme est: "+ calculeProduit(nbr2,nbr1) );  
			System.out.println("le produit  est: "+ calculeSomme(nbr2,nbr1) ); 
					
			}
	
public static int calculeProduit(int nbre1 , int nbre2 ) {
	return nbre1*nbre2 ; 
	
	
}
public static int calculeSomme(int nbre1 , int nbre2 ) {
	return nbre1*nbre2 ; 
	
	
}
}
