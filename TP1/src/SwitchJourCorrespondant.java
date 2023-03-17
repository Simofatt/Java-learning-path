
import java.util.Scanner;
public class SwitchJourCorrespondant{
	public static void main (String[]  Args) { 
		Scanner KeyboardInput = new Scanner(System.in); 
		System.out.print ("entrer un nombre : "); 
		int DayNum = KeyboardInput.nextInt();
String   DayName =""; 
switch (DayNum) { 
case 0 : DayName = " Monaday " ;
break ; 
case 1 : DayName =" mardi ";
break ; 
case 2 : DayName ="mercredi ";
break ; 
}

		
System.out.print ("le jour correspodant est : " +DayName); 
	
	
			

}
	
	}

