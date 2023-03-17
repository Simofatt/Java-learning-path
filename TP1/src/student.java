//Creating a class student with different attributes 
public class student {
 String FirstName ; 
 String LastName ; 
 int Age ; 
 private double gpa ; 
 static public int count = 0 ;       // creating a static attributes reserved for the class not the object 
  
 

// creating a constructor that will store informations in variables with different names than the class student 
public student (String Fname , String Lname , int Age ,double gpa  ) { //no void no static , the mtd returns no values cause it's the same name of the class so it's a constructor 
	this.FirstName = Fname ;           // setting the variables of the constructor to the variables of the class 
	this.LastName = Lname ;  
	this.Age = Age ;               
    this.gpa = gpa ;      // le gpa ne doit pas etre <0 ou >0 
	count ++ ; 
	System.out.println(+count) ; // on peut acceder a count a travers cette class 
	
}
public  int  GetCount () { 
	return count ;                     // pour acceder a count a travers l'autre class 
}
//SETTERS TO GPA 
public void SetGpa(double gpa ) {       // on a pas static car la methods appartient a l'objet de la classe student 
	if (gpa <0 || gpa >20) { 
	   this.gpa = 0 ;  
	}else { 
		this.gpa = gpa ; 
	}
}
//GETTERS TO GPA 
public double GetGpa() {  
	return gpa ; 
}







public boolean Admis () {        //create a fct inside my class student to know if the student pass the year or not  
	if (gpa >= 12 ) { 
		return true ; 
	}else { 
		return false ; 
	}
}
}



