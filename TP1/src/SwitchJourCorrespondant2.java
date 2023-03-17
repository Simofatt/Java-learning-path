import java.util.Scanner; 
public class SwitchJourCorrespondant2 {

	public static void main (String[]  Args) { 
		 
	    System.out.print ( getday(2)); 
	    }
		
	public static String getday(int DayNum  ) {
		
		
String   DayName =""; 
switch (DayNum) { 
case 0 : DayName = " Monaday " ;
break ; 
case 1 : DayName =" mardi ";
break ; 
case 2 : DayName ="mercredi ";
break ; 
}

return DayName ; 
		
	}
	
		}
			
