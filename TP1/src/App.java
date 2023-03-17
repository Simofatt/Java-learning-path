
import java.util.Scanner;
public class App{
	public static void main (String[]  Args) { 
		for ( int i=1; i<=6 ; i++) { 
			for (int j = 1 ; j<=i ; j++) { 
			System.out.print("@"); 
		}
			System.out.println(); 
	}
		
		
		
		System.out.println("") ; 
		System.out.println("@") ; 
		for( int i=5;i>=1;i--) { 
			System.out.print("@" ) ; 
			for ( int j=5 ; j>=i ; j-- ) { 
			System.out.print(" ") ; 
			}
			System.out.println("@");
		}
		for ( int k =0; k<5 ; k++) { 
			System.out.print("@ ");
			
		}
		System.out.println(" "); 
		
		
		//THE USER ENTERS THE HEIGHT AND WIDH OF A CUBE AND IT'S PRINTS THE THE CUBE AS A "B" ; 
		System.out.println("   "); 
		Scanner keyboardInput = new Scanner(System.in) ; 
		System.out.print("Entrer the height : ");
		int H= keyboardInput.nextInt();
		System.out.print("Entrer the widht : "); 	
		int W =keyboardInput.nextInt();
		if ( H <=0 || W<=0) { 
			System.out.print("Operation invalide "); 
		}else { 
		
		for (int i=1 ; i<=H ; i++) {
		for (int j =1;j<=W ;j++) { 
		     System.out.print("B");	
			}
		     System.out.println(" "); 
		}
		}
		System.out.println(" "); 

	
	
	//THE USER ENTRES 10 NUMBERS AND IT OUTPUT THE LARGEST NUMBER AND THE SMALLEST ONE 
		
		System.out.print(""); 
	   System.out.print("The number 1 : ");
	   int a = keyboardInput.nextInt() ; 
	   int i = 2 ; 
	   int  small = a ; 
	   int  large =a; 
	    while ( i<=5) { 
		  System.out.print("The number " +i+ " : "); 
	      int b = keyboardInput.nextInt(); 
	    if (b<a) { 
		  small = b ;   
	    }else if ( b>a ) { 
		  large = b ;
	    }
	    i++;
	    }
	     System.out.println("The smallest number is :" +small ); 
	     System.out.print("The largest number is : " +large); 
	     
	     
	     
	     
	    
	    
	
	
	
	
	
	}
	
	
	

}
			
		

	
		
			


	


