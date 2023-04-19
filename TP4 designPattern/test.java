package TP4;

public class test {

	public static void main(String[] args) throws CloneNotSupportedException {
		String client1="youssef1";
	//	String client2="youssef2";
		
		Facture f = new Facture(client1) ;
        f.setNumCommande(1);;
        f.informations();

        Facture f2 = (Facture) f.clone();
        f2.informations();

	}

}
