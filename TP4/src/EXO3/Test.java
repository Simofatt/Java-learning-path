package EXO3;
import java.util.ArrayList;
public class Test {


		
	    public static void main(String[] args) {
	    	
		       
	        ArrayList<employe> employes = new ArrayList<>();
	        ArrayList<employe> respo = new ArrayList<>();
	        ArrayList<employe> inferieurResp1 = new ArrayList<>(); 
	        ArrayList<employe> inferieurResp2 = new ArrayList<>(); 
	        ArrayList<commerciaux> cms = new ArrayList<>();
	        employe emp1 = new employe("Mohamed", "XXX180", 1);
	        employe emp2 = new employe("Ahmed", "XXX190", 1);
	        employe emp3 = new employe("Mouad", "XXX190", 1);
	        employe emp4 = new employe("Abdelali", "XXX180", 1);
	        responsables resp1 = new responsables("Simo", "YYY177", 1, inferieurResp1);
		    responsables resp2 = new responsables("Mohamed", "éXXX180", 1, inferieurResp2);
		    commerciaux cm1 = new commerciaux ("Mouad", "XXX190", 1, 10, "MATIERE PREMIERE") ;
		    Personnel admin1 = new Personnel ( employes , cms) ;
		     
		    
	        employes.add(emp1);
	        employes.add(emp2);
	        employes.add(emp3);
	        employes.add(emp4);
	        employes.add(resp1) ; 
	        employes.add(resp2) ;
	        respo.add(resp1) ; 
		    respo.add(resp2) ; 
            inferieurResp1.add(emp2);
            inferieurResp1.add(emp1);
            inferieurResp1.add(emp3);
            inferieurResp2.add(emp4);
            cms.add(cm1) ; 
	       

	       resp1.afficherEmployesDirects();
	       resp1.afficherEmployesIndirects();
	       System.out.println (cm1.toString()) ; 
	       System.out.println(admin1.calculeSalaireAverser()  ) ; 
	       
	       admin1.afficher();
	       
	     
	       
	       
	      
	       
	    }




}
