package Management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Teacher {
	private int idTeacher;
	private String firstName;
	private String lastName;
	private int salary;

	static ArrayList<Teacher> teachersList = new ArrayList<>();

//CONSTRUCTOR : 
	public Teacher(int id, String firstName, String lastName, int salary) {
		this.idTeacher = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	
	}

//AJOUTER UN OBJET PROF :
	static public void ajouterProf() {
		@SuppressWarnings("resource")
		Scanner keyboardInput = new Scanner(System.in);
		System.out.print("COMBIEN DE PROFS A AJOUTER  : ");
		int nbreProf = keyboardInput.nextInt();
		for (int i = 0; i < nbreProf; i++) {
			try {
				System.out.print("ID PROF: ");
				int idTeacher = keyboardInput.nextInt();
				System.out.print("PRENOM PROFESSEUR  : ");
				String fName = keyboardInput.next();
				System.out.print("NOM PROFESSEUR  : ");
				String lName = keyboardInput.next();
				System.out.print("SALAIRE : ");
				int salary = keyboardInput.nextInt();
				System.out.print("PASSWORD DU COMPTE : ");
				String mdp = keyboardInput.next();

				try {
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "");
					System.out.println(" ");
					String requete4 = "insert into teachers(idTeacher, firstName, lastName, salary, password) values (?,?,?,?,?)";
					PreparedStatement stmt = conn.prepareStatement(requete4);
					stmt.setInt(1, idTeacher);
					stmt.setString(2, fName);
					stmt.setString(3, lName);
					stmt.setInt(4, salary);
					stmt.setString(5, mdp);
					stmt.executeUpdate();
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
	

//AFFICHER PROF:
	public static void afficherProfs() {
		@SuppressWarnings("resource")
		Scanner keyboardInput = new Scanner(System.in);
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "");
			System.out.println(" ");
			String requete5 = "select idTeacher, firstName , lastName , salary from teachers where idTeacher like ?";
			PreparedStatement stmt = conn.prepareStatement(requete5);

			System.out.print(">>>> ENTRER L'ID DU PROFESSEUR A AFFICHER : ");
			stmt.setInt(1, keyboardInput.nextInt());
			ResultSet res = stmt.executeQuery();

			while (res.next()) {
				int idTeacher = res.getInt("idTeacher");
				String firstName = res.getString("firstName");
				String lastName = res.getString("lastName");
				int salary = res.getInt("salary");
				Teacher teachers = new Teacher(idTeacher, firstName, lastName, salary);
				teachersList.add(teachers);
			}

			for (int i = 0; i < teachersList.size(); i++) {
				System.out.println(teachersList.get(i).toString());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public String toString() {
		return "PRENOM : " + firstName + "\n" + "NOM    : " + lastName + "\n" + "ID   : " + idTeacher + "\n"
				+ "SALAIRE : " + salary;

	}

}