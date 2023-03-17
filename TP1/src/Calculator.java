import java.util.Scanner;
public class Calculator{
	public static void main (String[]  Args) { 
		Scanner KeyboardInput = new Scanner(System.in); {
		
		System.out.print ("entrer le 1er nombre : "); 
		double number1 = KeyboardInput.nextDouble(); 
		
		System.out.print ("entrer un operateur : "); 
		String   op = KeyboardInput.next();
		
		System.out.print ("entrer le 2eme nombre : "); 
		double number2 = KeyboardInput.nextDouble();
		
		
		double f ; 
		if(op.equals("+")) { 
			System.out.println(+(f = number1 + number2)) ;
		}else if (op.equals("-")) { 
			System.out.println(+(f = number1 - number2)) ;
		}else if (op.equals("/")) { 
			System.out.println(+(f = number1 /number2)) ;
		}else { 
		System.out.println("vous avez entrez un mauvais operateur ");
		}
		
		}
	}
}
		

	