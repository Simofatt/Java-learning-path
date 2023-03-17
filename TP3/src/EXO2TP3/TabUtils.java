package EXO2TP3;
import java.util.ArrayList;
public class TabUtils {
	


	    
		static ArrayList<Integer> t1 = new ArrayList<> (); 
		static ArrayList<Integer> t2 = new ArrayList<> ();
		
		
	public static ArrayList<Integer> compareTab(ArrayList<Integer> t1,ArrayList<Integer> t2 ) { 
			ArrayList<Integer > t3 = new ArrayList<> () ; 
			for (int  i=0 ; i<t1.size();i++) { 
				if (t1.get(i) ==t2.get(i)) {
					t3.add(i, 0); 
					
				}
				if (t1.get(i) !=t2.get(i)) {
					t3.add(i,1) ; 
				}
			
	    		}
	    		
	    
	 
			return t3  ; 
	    	}


	 

	public static void main (String[] args ) { 
	  t1.add(0,0) ; 
	  t1.add(1,5) ; 
	  
	  t2.add(0,4) ; 
	  t2.add(1,5) ; 
		
		System.out.print(compareTab(t1 , t2));
		
	}
	}

