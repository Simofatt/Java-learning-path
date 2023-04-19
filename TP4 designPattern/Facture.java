package TP4;

public class Facture extends Prototype {
	
		private int numCommande;
		private String client;
		public Facture(String client) {
			this.client=client;
		}
		public void setNumCommande(int numCommande) {
			this.numCommande = numCommande;
		}
		
		@Override
		public void informations() {
			System.out.println("Facture -> numCommande="+this.numCommande+" client="+this.client);
			
		}
		
		
	}
