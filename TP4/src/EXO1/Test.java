package EXO1;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	static Scanner keyboardInput = new Scanner(System.in) ; 
	static ArrayList<Utilisateur> users = new ArrayList<> () ; 
	 static boolean isTrue = false; 
	public static void main(String[] args) { 
		
	   Utilisateur user1 = new Utilisateur (1 , "mohamed fatehi " , 2000 , "simofatt" , "6341") ; 
	   Utilisateur  user2 = new Utilisateur (2, "mohamed fatehi " , 2000 , "simofat" , "634") ; 
	 
	   users.add(user1) ; 
	   users.add(user2) ; 
	 
	  
	   System.out.println("SAISIR VOTRE LOGIN :");
	   String login = keyboardInput.next() ; 
	   System.out.println("SAISIR VOTE MDP : ");
	   String mdp = keyboardInput.next() ; 
	   
	 
	
	     boolean isTrue = false;
	        for (Utilisateur user : users) {
	            if (user.getLogin().equals(login) && user.getPassword().equals(mdp)) {
	                isTrue = true;
	                break;
	            }
	        }

	        if (isTrue) {
	            System.out.println("AUTHENTIFICATION SUCESS");
	        } else {
	            System.out.println("FAILED");
	        }
	    }
	
	
	
	}