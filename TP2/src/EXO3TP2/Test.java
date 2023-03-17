package EXO3TP2;

import java.util.ArrayList;

public class Test {
	public static void main (String[] args ) { 
		
		ArrayList<Ratio > ratios = new ArrayList<> () ; 
		Ratio a  = new Ratio (1 , 2) ; 
		Ratio b = new Ratio (1 , 2) ; 
		
	
		System.out.println("ADDITION  est : " + a.addition(b)) ; 
		 System.out.println("PRODUIT  est : " + a.produit(b)) ; 
		 System.out.println("B EST PLUS GRAND QUE A ? : " + a.plusGrand(b)) ; 
		 System.out.println("A EST EGALE A B ? : " + a.egale(b)) ; 
		 ratios.add(a) ; 
		 ratios.add(b) ; 
		 for (Ratio r : ratios ) { 
			 System.out.println(r);
		 }
		 
	}
}
