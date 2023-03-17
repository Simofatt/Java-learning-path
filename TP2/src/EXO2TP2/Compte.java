package EXO2TP2;

public class Compte {
		int solde = 0;
		String nom;

		public Compte(String nom) {
			this.nom = nom;
		}

		public Compte() {};

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		
		
		public void deposer(int montant) {
			this.solde += montant;

		}

		void retirer(int montant) {

			if (solde <= montant) {
				System.out.println("SOLDE INSSUFISANT ");
			} else
				this.solde -= montant;
		}

		public void virerVers(Compte destination, int montant) {
			destination.deposer(montant);
			this.retirer(montant);

		}
		
		

		public String toString() {
			return "Compte [solde= " + solde + "  NOM DU TITULAIRE: " + this.nom + "]";
		}

	}
