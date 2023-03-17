
public class appstudent { 
	public static void main (String[]  Args)  { 
	/*
	student  Student1 = new student("Simo" , "Fatehi " , 22  , 12.22 , true ) ; giving  values of the object student1 
	that will be stored in the student class
	student  Student2 = new student("omar" , "papaish " , 23 , 15 , true ) ;       
	System.out.print(Student2.LastName) ; 
	*/
		
		// 2eme method possible : c'est de stocker les objects de la class student dans un tableau 
		student [] students  = { 
				   new student ("Simo" , "Fatehi " , 22  , 12.22  ),   // [0] definie le 1er object  
				   new student ("omar" , "papaish " , 23 , 12 )        // Le 2eme object accessible avec [1]
		};
		
		students[1].SetGpa(22);
		System.out.println(students[1].LastName);		
		System.out.println(students[1].Admis());
		System.out.println(students[1].GetGpa());
		//System.out.println(+count);                      // pour appeler le count dans l'autre class on doit 
		System.out.println(students[1].GetCount());		   // on peut pas faire appel a count directement de la class car elle est static pour la class et non l'objet de la class
		                                                   //On a creer un fct getcount() qui return count dans la class student
	}
	
	
	
	
	}
	

 