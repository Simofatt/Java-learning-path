package EXO3TP2;

public class Ratio{
	private int numera ; 
   private  int denomi ; 
	 
	
	public Ratio (int numera , int denomi ) { 
		this.numera = numera ; 
		this.denomi = denomi ; 
	}
	
	public Ratio addition (Ratio b) { 
		         int numeraAdd =( (this.numera*b.denomi) + (this.denomi*b.numera) )   ; 
				 int denomiAdd = (this.denomi*b.denomi ) ; 
				 
				 return new Ratio(numeraAdd,denomiAdd); 
		 
		
	}
	
	public Ratio produit(Ratio b ) { 
             int numeraPro = this.numera * b.numera; 
             int denomiPro = this.denomi*b.denomi ; 
              return new Ratio (numeraPro , denomiPro ) ; 
	}
	
	
	
	public 	boolean egale (Ratio b ) { 
		int numeraEga = this.numera*b.denomi ; 
		int denomiEga =this.denomi*b.numera ; 
		 if (numeraEga == denomiEga) { 
			 return true ; 
		 }else { 
			 return false ; 
		 }
	}
	
	public boolean plusGrand (Ratio b ) { 
		int numeraPlus = this.numera*b.denomi ; 
		int denomiPlus = this.denomi*b.numera ; 
          if (denomiPlus < numeraPlus ) { 
			 return false ; 
		 }else { 
			 return true ; 
		 }
		
		
	}

	@Override
	public String toString() {
		return "Ratio [" + numera + "/"+ denomi + "]";
	}
}

