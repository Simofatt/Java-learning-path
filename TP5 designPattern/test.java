package TP5;

public class test {
public static void main (String [] args ) {
	
	repertoire root = new repertoire("disque local") ; 
	
	repertoire rep1 = new repertoire("image") ; 
	repertoire rep2 = new repertoire("document") ;
	
	
	
	root.addComposants(rep1) ; 
	root.addComposants(rep2);
	
	
	fichier fich1 = new fichier("file1") ; 
	fichier fich2 = new fichier("file2") ; 
	raccourcie raccFich1 = new raccourcie("raccourcie du fich1");
	
	rep1.addComposants(fich1);
	rep1.addComposants(fich2);
	rep1.addComposants(raccFich1);
	rep2.addComposants(fich2);
 
	
	root.afficher(); 
}
}
