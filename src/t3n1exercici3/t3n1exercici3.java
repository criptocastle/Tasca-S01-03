package t3n1exercici3;

import java.util.Scanner;

public class t3n1exercici3 {
	static Scanner entrada = new Scanner(System.in);
	// static File clas = new File("");

	public static void main(String[] args) {
		String nameUser;
		byte finalScore = 0;

		// llegir fitxer
		Arxiu.readFile();

		// nom i app
	
		nameUser = getName();
		finalScore = runApp();

		// anotar puntuacio crear + escriure
		Arxiu.createFile();
		Arxiu.writeFile(nameUser, finalScore);

	}

// Mètodes APP USUARIA. Quan acabi amb un usuari, que comenci amb el següent?

	public static String getName() {
		String name;

		System.out.println("Benvingut al test de països i capitals.\n" + "Indica el teu nom: ");
		name = entrada.nextLine();
		System.out.println(name + ", a continuació tens 10 intents per a obtenir la màxima puntuació. Comencem!!");

		return name;
	}
	public static Byte runApp() {
		byte score = 0;
		boolean check = false;
		byte round = 1;
		
		for (int i = 0; i < 10; i++) {
			String randomCountry = Arxiu.randomCountry();// metode pais random
			System.out.println("Intent " + round + ". Capital de " + randomCountry + "?");
			String userAnswr = entrada.nextLine();
			check = Arxiu.capitalCheck(userAnswr, randomCountry);

			if (check) {
				score++;
				System.out.println("Correcte, +1 punt! Punts actuals: " + score + ".");
			} else {
				System.out.println("Has errat. Punts actuals: " + score + ".");
			}
			round++;
		}
		System.out.println("Hem acabat! Puntuació final: " + score + " punts.");

		return score;
	}

}
