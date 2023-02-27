package exo3;


	public class Ratio {
		
			private int numera; 
			private int denomi; 
			
			public Ratio(int numera, int denomi) {
				this.numera=numera;
				if(denomi!=0)
					this.denomi=denomi;
				else
					System.out.println("Le dénominateur doit être different de 0");
			}
			public Ratio produit(Ratio a) {
				int n, d;
				n=this.numera*a.numera;
				d=this.denomi*a.denomi;
				return new Ratio(n, d);		
			}
			public Ratio addition(Ratio a) {
				int n, d;
				n=(this.numera*a.denomi)+(this.denomi*a.numera);
				d=this.denomi*a.denomi;
				return new Ratio(n, d);
			}
			public boolean plusGrand(Ratio a) {
				boolean grand;
				grand=(this.numera*a.denomi>this.denomi*a.numera) ? true: false;
				return grand;
				
			}
			public boolean egale(Ratio a) {
				boolean eg;
				eg=(this.numera*a.denomi==this.denomi*a.numera) ? true: false;
				return eg;
				
			}
			
			public String toString() {
				return numera + "/" + denomi;
			}
		}