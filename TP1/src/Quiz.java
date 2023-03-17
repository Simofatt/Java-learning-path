import java.util.Scanner ; 
public class Quiz {
	public static void main (String []  args ) { 
      String q1 = " the colors of bananas are  : \n" +
	              "(a) Yellow,Green \n (b) Orange \n (c) Red " ; 
      String q2 =" the color of Apples are : \n"
      		+ "(a) Yellow,Green \\n (b) Orange \\n (c) Red" ; 
      
      //Creating an array of objects within class Question 
	Question[] questions = { 
	   new Question	 (q1 , "a"),     //Storing in the object questions[0] a the string q1 and  the string "a" , it will be stored in the class Question as a prompt and answers   
	   new Question  (q2 , "c")      // basically prompt = q2 , answers = c    
		}; 
		TakeTest( questions)  ;    // calling out the fct TakeTest . we dont call Question[] questions because Question[] is there as a references to the class and thr type of questions (array ) 
	}
	 public static void TakeTest( Question[] questions ) {     //creating a fct with the attributes to make a reference to the class Question and his object so we can use it in the fct TackTest
		 Scanner keyboardInput = new Scanner(System.in)  ; 
		 int Score = 0 ;                                       // variable score 
	for (int i=0 ; i<questions.length ; i++ ) {                // de 0 a 1<2
  		 System.out.println(questions[i].prompt  );
		 String answerOfTheUser = keyboardInput.nextLine() ; 
		 if (answerOfTheUser.equals(questions[i].answers))   { 
			 Score ++ ;
		   }
		 }
		 System.out.print("Congrats you got " +Score+"/2");
	 }
	 
}
