package EXO2 ;

import java.util.ArrayList;

public class TestForme {
		public static void main(String[] args) {
			ArrayList<Forme> figures = new ArrayList<> (); 
			
		Forme regt = new rectangle(5, 3.5) ; // Création d'un rectangle de 5 cm de longueur et de 3,5 cm de largeur
		Forme square  = new carre(8.2) ; // Création d'un carré de 8,2 cm de coté
		Forme ray = new rayon(4.1) ; // Création d'un cercle de 4,1 cm de rayon
		figures.add(square) ; 
		figures.add(regt ) ;
		figures.add(ray ) ; 
		
		for(Forme fo: figures) { // for-each
		 System.out.println(fo + " : Surface : " + fo.getSurface() + " cm2 ]") ;
		}
		for (int i = 0 ; i<figures.size() ; i++) { 
			 System.out.println(figures.get(i).toString()+ " : Surface : " + figures.get(i).getSurface() + " cm2 ]") ;
			
			
		}
			}
		}

