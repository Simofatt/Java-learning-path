package exo3;

public class Testratio {
	
		public static void main(String[] args) {
			Ratio r1=new Ratio(55, 7);
			Ratio r2=new Ratio(9, 8);
			
			Ratio a;
			a=r1.addition(r2);
			System.out.println(a.toString());
			a=r2.produit(r1);
			System.out.println(a);
			System.out.println(r1+" = "+r2+" : "+r1.egale(r2));
			System.out.println(r1+" > " +r2+" : "+r1.plusGrand(r2));
			
		}
		}

