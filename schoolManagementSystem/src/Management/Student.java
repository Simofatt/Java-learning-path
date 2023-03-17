package Management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Student {
	private int numApoge;
	private String firstName;
	private String lastName;
	private String grade;
	private String mdp ;
	static ArrayList<Student> studentsList = new ArrayList<>();

	public Student(int id, String firstName, String lastName, String grade,String mdp) {
		this.numApoge = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.grade = grade;

	}

	public Student() {
	};


	
	//AJOUTER UN  OBJET ETUDIANT 
	public static void ajouter() throws SQLException {
		@SuppressWarnings("resource")
		Scanner keyboardInput = new Scanner(System.in);
		System.out.print("Combien de compte a ajouter : ");
		int nbreEtudiants = keyboardInput.nextInt();
		for (int i = 0; i < nbreEtudiants; i++) {
			try {
				System.out.println("VEUILLEZ ENTRER LES INFORMATIONS DE L'ETUDIANT  ");
				System.out.print("NUM APOGEE : ");
				int numApoge = keyboardInput.nextInt();
				System.out.print("PRENOM ETUDIANT  : ");
				String firstName = keyboardInput.next();
				System.out.print("NOM ETUDIANT  : ");
				String lastName = keyboardInput.next();
				System.out.print("FILIERE :  ");
				String grade = keyboardInput.next();
				System.out.print("PASSWORD :  ");
				String mdp = keyboardInput.next();
				
				Student student = new Student(numApoge,firstName, lastName, grade,mdp) ;
				try {
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "");
					System.out.println(" ");
					String requete4 = "insert into etudiant(numApoge,nom,prenom,grade, password) values (?,?,?,?,?)";
					PreparedStatement stmt = conn.prepareStatement(requete4);
					stmt.setInt(1, numApoge);
					stmt.setString(2, firstName);
					stmt.setString(3, lastName);
					stmt.setString(4, grade);
					stmt.setString(5, mdp);
					stmt.executeUpdate();
					System.out.println(" ");
					System.out.println("INFORMATIONS BIEN SAISIE!");

				} catch (Exception e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}

			} catch (InputMismatchException e) {
				// code to handle the InputMismatchException
				System.out.println("Invalid input. Please enter a valid integer for the account number.");
			} catch (NumberFormatException e) {
				// code to handle the NumberFormatException
				System.out.println("Invalid input. Please enter a valid name for the account holder.");
			}
		}

	}
	
	//AFFICHER UN OBJET ETUDIANT 
	public static void afficherEtudiants() {
		@SuppressWarnings("resource")
		Scanner keyboardInput = new Scanner(System.in);
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "");
			System.out.println("");
			String requete5 = "select numApoge , nom , prenom , grade from etudiant where numApoge like ?";
			PreparedStatement stmt = conn.prepareStatement(requete5);

			System.out.print("ENTRER LE NUMERO D'APOGE DE L'ETUDIANT A AFFICHER : ");
			stmt.setInt(1, keyboardInput.nextInt());
			ResultSet res = stmt.executeQuery();

			while (res.next()) {
				int numApg = res.getInt("numApoge");
				String firstName = res.getString("prenom");
				String lastName = res.getString("nom");
				String filiere = res.getString("grade");
				Student students = new Student(numApg, firstName, lastName, filiere);
				studentsList.add(students);
			}

			for (int i = 0; i < studentsList.size(); i++) {
				System.out.println(studentsList.get(i).toString());
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}



	public String toString() {
		return "PRENOM : " + firstName + "\n" + "NOM    : " + lastName + "\n" + "L'ID   : " + numApoge + "\n"
				+ "NIVEAU : " + grade;
	}

}
