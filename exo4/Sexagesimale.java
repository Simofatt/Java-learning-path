package exo4;

public class Sexagesimale {
		
		int heures;
		int minutes;
		int secondes;
		double hours;
		
		
		public Sexagesimale(int heures,int minutes,int secondes) {
			
			this.heures = heures;
			this.minutes = minutes;
			this.secondes = secondes;
		}
		
		public Sexagesimale(double hours) {
			this.hours = hours;
		}
		
		public double getDec() {
			
		
			double h = (double)heures;
			double m = (double)minutes/60;
			double s = (double)secondes/3600;


			return h+m+s;
		}

		
		public int getH() {
			
			return (int)hours;
		}
		public int getM() {
		
			return (int)((hours-this.getH())*60);
		}
		
		public int getS() {
			return (int)((((this.hours-this.getH())*60)-this.getM())*60);
		}
		
		
		
		
	}
