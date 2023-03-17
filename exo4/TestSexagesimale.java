package exo4;

public class TestSexagesimale {
	

		public static void main(String[] args) {
			
			//1 ere Solution(Sexagesimale vers deciamale) 	
			
			Sexagesimale H1 = new Sexagesimale(12.57);
			System.out.println(H1.hours + " heures correspond a " + H1.getH() + "h:" + H1.getM() + "min:" + H1.getS() + "sec");
			
		
			
			Sexagesimale H2 = new Sexagesimale(12,34,12);
			System.out.println(H2.hours + "h:" + H2.minutes + "min:" +  H2.secondes +  "sec Correspond a " + H2.getDec() + " Heures.");
			

		}

	}


