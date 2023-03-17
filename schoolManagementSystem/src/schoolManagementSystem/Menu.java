package schoolManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Management.Student;
import Management.Teacher;



public class Menu {
	static Scanner keyboardInput = new Scanner(System.in);
    static int id;
    static String password;
	static int login;
	static boolean loop;

	public static void MenuPrincipal() {

		System.out.println("                           **********\t\tCHOISIR CE QUE VOUS REPRESENTEZ : \t\t************");
		System.out.println(" ");
		System.out.println("1- ETUDIANT        ");
		System.out.println("2- PROFESSEUR       ");
		System.out.println("3- ADMINISTRATION  ");
		System.out.println(" ");
		System.out.print(">>>> VEUILLEZ ENTRER UN NOMBRE SELON VOS SOUHAITS:  ");
		int choise = keyboardInput.nextInt();
		switch (choise) {

		case 1:
			try {

				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "");
				System.out.println(" ");
				String requete = "Select numApoge, password from etudiant";
				PreparedStatement stmt = conn.prepareStatement(requete);
				ResultSet res = stmt.executeQuery();
				System.out.print(">>>> ENTRER VOTE LOGIN : ");
				int login = keyboardInput.nextInt();
				System.out.print(">>>> ENTRER VOTE MOT DE PASSE  : ");
				String mdp = keyboardInput.next();

				while (res.next()) {
					id = res.getInt("numApoge");
					password = res.getString(("password"));
					if (login == id && mdp.equals(password)) {
						menuStudent() ; 
					} else{
						loop =false;
					}
				}
				 if(loop == false )  { 
					System.out.println(" ");
					System.out.println("XXXXXX     LOGIN OU MOT DE PASSE EST INCORRECT      XXXXXX ");
					MenuPrincipal() ;
					
				}

			} catch (SQLException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			break;
		case 2:
			try {
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "");
				System.out.println(" ");
				String requete2 = "Select idTeacher, password from teachers";
				PreparedStatement stmt = conn.prepareStatement(requete2);
				ResultSet res = stmt.executeQuery();
				System.out.print(">>>> ENTRER VOTE LOGIN : ");
				login = keyboardInput.nextInt();
				System.out.print(">>>> ENTRER VOTE MOT DE PASSE  : ");
				String mdp = keyboardInput.next();
				while (res.next()) {
					int idTeacher = res.getInt("idTeacher");
					String passwordTeacher = res.getString(("password"));
					if (login == idTeacher && mdp.equals(passwordTeacher)) {
						menuTeacher();
					} else {
						System.out.println("*********** LOGIN OU MOT DE PASSE EST INCORRECT *********** ");
					}
				}
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			break;
		case 3:
			try {
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "");
				System.out.println(" ");
				String requete3 = "Select login, password from admin";
				PreparedStatement stmt = conn.prepareStatement(requete3);
				ResultSet res = stmt.executeQuery();
				System.out.print(">>>> ENTRER VOTE LOGIN : ");
				String login = keyboardInput.next();
				System.out.print(">>>> ENTRER VOTE MOT DE PASSE : ");
				String mdp = keyboardInput.next();
				while (res.next()) {
					String loginAdmin = res.getString("login");
					String passwordAdmin = res.getString(("password"));
					if (login.equals(loginAdmin) && mdp.equals(passwordAdmin)) {
						menuAdmin();
					} else {
						System.out.println("*********** LOGIN OU MOT DE PASSE EST INCORRECT *********** ");
					}
				}
				break;
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}

	}

	public static void menuAdmin() throws SQLException {

		boolean isTrue = true;
		while (isTrue != false) {
			System.out.println(" ");
			System.out.println(
					"                             **********\t\tCHOISIR CE QUE VOUS VOULLEZ FAIRE: \t\t************");
			System.out.println(" ");
			System.out.println("1. AJOUTER UN ETUDIANT");
			System.out.println("2. AJOUTER UN PROFESSEUR");
			System.out.println("3. RECHERCHE D'UN ETUDIANT");
			System.out.println("4. AFFICHER PROFESSEURS");
			System.out.println("5. Quitter le programme");
			System.out.println(" ");
			System.out.print(">>>> VEUILLEZ ENTRER UN NOMBRE SELON VOS SOUHAITS :  ");
			int nbre = keyboardInput.nextInt();
			switch (nbre) {
			case 1:
				Student.ajouter();
				break;
			case 2:
				Teacher.ajouterProf();
				break;
			case 3:
				Student.afficherEtudiants();
				break;
			case 4:
				Teacher.afficherProfs();
				break;
			case 5:
				System.exit(0);
				isTrue = false;
				break;
			}
		}
	}

	public static void menuStudent() {
		loop = false;
		while (loop != true) {
			ArrayList<Student> studentsList = new ArrayList<>();
			System.out.println(" ");
			System.out
					.println("                     **********\t\tCHOISIR CE QUE VOUS VOULLEZ FAIRE: \t\t************");
			System.out.println(" ");
			System.out.println("1. AFFICHER MES INFORMATIONS");
			System.out.println("2. AFFICHER MES NOTES ");
			System.out.println("3. Quitter le programme");
			System.out.println(" ");
			System.out.print(">>>> ENTRER UN NOMBRE : ");
			int choise = keyboardInput.nextInt();

			switch (choise) {
			case 1:
				try {
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "");
					System.out.println("");
					String requete = "select numApoge , nom , prenom , grade from etudiant where numApoge like ?";
					PreparedStatement stmt = conn.prepareStatement(requete);
					stmt.setInt(1, id);
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
				break;
			case 2:
				try {
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "");
					String requete = "select notes , module from note where numApoge like ?";
					PreparedStatement stmt = conn.prepareStatement(requete);
					stmt.setInt(1, id);
					ResultSet res = stmt.executeQuery();
					while (res.next()) {
						float notes = res.getFloat("notes");
						String module = res.getString("module");
						System.out.println(module + " : " + notes);
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
				break;
			case 3:
				System.exit(0);
				loop = true;
				break;
			}
		}

	}

	public static void menuTeacher() {
		loop = false;
		while (loop != true) {
			ArrayList<Teacher> teachersList = new ArrayList<>();
			System.out.println(" ");
			System.out.println(
					"                            **********\t\tCHOISIR CE QUE VOUS VOULLEZ FAIRE: \t\t************");
			System.out.println(" ");
			System.out.println("1. AFFICHER MES INFORMATIONS");
			System.out.println("2. AFFICHER LE CALENDRIER DE MES COURS");
			System.out.println("3. AJOUTER UNE NOTE");
			System.out.println("4. Quitter le programme");
			System.out.println(" ");
			System.out.print(">>>>  ENTRER UNE CHIFFRE : ");
			int choise = keyboardInput.nextInt();

			switch (choise) {
			case 1:
				try {
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "");
					System.out.println(" ");
					String requete5 = "select idTeacher, firstName , lastName , salary from teachers where idTeacher like ?";
					PreparedStatement stmt = conn.prepareStatement(requete5);
					stmt.setInt(1, login);
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
				break;
			case 2:
				try {
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "");
					System.out.println("");
					String requete5 = "select jours, module , horaire , Filiere from cours where idTeacher like ?";
					PreparedStatement stmt = conn.prepareStatement(requete5);
					stmt.setInt(1, login);
					ResultSet res = stmt.executeQuery();
					while (res.next()) {
						String day = res.getString("jours");
						String module = res.getString("module");
						String time = res.getString("horaire");
						String filiere = res.getString("Filiere");
						System.out.println(day + "     " + module + "     " + time + "     " + filiere);
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
				break;
			case 3:
				try {
					System.out.print("NUM APOGEE :");
					int num = keyboardInput.nextInt();
					System.out.print("MODULE:");
					String module = keyboardInput.next();
					System.out.print("NOTE: ");
					int notes = keyboardInput.nextInt();
					if (num < 0 || notes < 0) {
						throw new InputMismatchException();
					}

					try {
						Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "");
						String requete = "insert into note(numApoge, module,notes) values (?,?,?)";
						PreparedStatement stmt = conn.prepareStatement(requete);
						stmt.setInt(1, num);
						stmt.setString(2, module);
						stmt.setInt(3, notes);
						stmt.executeUpdate();
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
				break;
			case 4:
				System.exit(0);
				loop = true;
				break;
			}
		}
	}
}
