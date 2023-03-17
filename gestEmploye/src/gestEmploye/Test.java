package gestEmploye;

import java.util.ArrayList;

public class Test {
	
    public static void main(String[] args) {
        ArrayList<employe> employes = new ArrayList<>();
        employe emp1 = new employe("Mohamed", "XXX180", 5.5);
        employe emp2 = new employe("Ahmed", "XXX190", 4.5);
        employe emp3 = new employe("Mouad", "XXX190", 4.5);

        employes.add(emp1);
        employes.add(emp2);
        employes.add(emp3);
       
        
        ArrayList<employe> employes2 = new ArrayList<>();
        employe emp4 = new employe("Abdelali", "XXX180", 5.5);
        employes.add(emp4);
       
 
      
        responsables resp1 = new responsables("Simo", "YYY177", 10, employes);
        responsables resp2 = new responsables("Mohamed", "XXX180", 5.5, employes2);
        
      System.out.println(emp4.toString()) ; 

      //  resp1.afficherEmployesDirects();
       
     
      }
       
/*
        Commercial cm1 = new Commercial("Hamid", "XXX1880", 5.5, 20);

       Personnel entreprise = new Personnel();
        entreprise.ajouterEmploye(emp1);
        entreprise.ajouterEmploye(emp2);
        entreprise.ajouterEmploye(emp3);
        entreprise.ajouterEmploye(resp1);
       System.out.print(entreprise.toString());
     
        entreprise.ajouterEmploye(cm1);

		
			*/
	
	}




