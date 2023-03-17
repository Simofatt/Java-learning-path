package gestEmploye;
import java.util.ArrayList;

public class Personnel {
    private ArrayList<employe> employes;

    public Personnel() {
        employes = new ArrayList<>();
    }

    public void ajouterEmploye(employe employe) {
        employes.add(employe);
    }

    public double calculeTotalSalaires() {
        double totalSalaires = 0;
        for (employe e : employes) {
            totalSalaires += e.calculeSalaire();
        }
        return totalSalaires;
    }

    public void afficherPersonnel() {
        for (employe e : employes) {
            System.out.println(e);
        }
    }

	@Override
	public String toString() {
		return "Personnel [employes=" + employes + ", calculeTotalSalaires()=" + calculeTotalSalaires()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}


