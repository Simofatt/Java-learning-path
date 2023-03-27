package TP2;
//SINGLEUTON 
public class test {
public static void main (String [] args ) { 
   CompteBancaire compte1 = new CompteBancaire (777 , 0) ; 
   
   compte1.deposerArgent(10000);
   compte1.retirerArgent(5000);
   
   CompteBancaire compte2 = new CompteBancaire (777 , 0) ;
   compte2.retirerArgent(5000);
   
   CompteBancaire compte3 = new CompteBancaire (777 , 0) ;
   compte3.retirerArgent(-455);
   compte3.deposerArgent(-55);
   
 
   System.out.println(journalisation.getInstance().getLog()); 
   
}
}
//spring avec maven ou gpa 