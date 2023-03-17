import java.util.Scanner;

public class Test {
	public static void test(Utilisateur[] users) {
		Scanner keyboardInput = new Scanner(System.in);
		System.out.print("Entrer votre login : ");
		String login = keyboardInput.nextLine();
		System.out.print("Entrer votre password : ");
		String password = keyboardInput.nextLine();

		boolean isTrue = false;
		while (isTrue != true) {
			for (int i = 0; i < users.length; i++) {
				if (login.equals(users[i].getLogin()) && password.equals(users[i].getPassword())) {

					isTrue = true;

				}

			}
			if (isTrue == true) {
				System.out.print("Authentification réussie :) ");

			} else {
				System.out.print("Authentification Failed  :( ");
			}
		}
	}

	public static void main(String[] args) {

		Utilisateur[] users = { new Utilisateur(1, "mohamed fatehi ", 10000, "simofatt", "mofatt"),
				new Utilisateur(2, "ziko ", 15500, "zikoInfo", "ziko123")

		};
		test(users);

	}
}
