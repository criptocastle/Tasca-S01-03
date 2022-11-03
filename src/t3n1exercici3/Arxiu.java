package t3n1exercici3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;

public class Arxiu {

	static HashMap<String, String> capitalCities = new HashMap<String, String>();
	static BufferedReader br = null; // vull llegir linea a linea el txt, creo buffered reader

	public static void readFile() { //obtenir HashMap del txt

		try {
			// creo objecte file per llegir l'arxiu .txt

			File countries = new File("/Users/gerardclosa/eclipse-workspace/s103_Collections/countries.txt");
			System.out.println("Ha finalitzat la càrrega de l'arxiu.\n");

			// objecte buffered del file

			br = new BufferedReader(new FileReader(countries));
			String line;

			// llegir l'arxiu linia a linia
			// parteixo linia per espais en dos camps en aquest cas

			while ((line = br.readLine()) != null) {
				String[] parts = line.split(" ");
				String country = parts[0].trim();
				String capital = parts[1].trim();

			// si els camps no estan buits, afegirho a HashMap.
				if (!country.equals("") && !capital.equals("")) {
					capitalCities.put(country, capital);
				}
			}

		} catch (Exception e) {
			//System.out.println("No s'ha trobat cap arxiu a llegir.");

		} finally {
			
			// sempre finalitzar el buffered reader
			if (br != null)
				try {
					br.close();
				} catch (Exception e) {};
		}

	}

	public static void createFile() {
		// creacio file: només vull que es crei un arxiu classificació i s'hi guardin
		// totes les dades d'usuari i puntuacions, sino sobreescriu

		try {
			File create = new File("classificacio.txt");
			if (create.createNewFile()) {
				System.out.println("Arxiu creat: " + create.getName());
			} else {
				System.out.println("Ja existeix l'arxiu.");
			}
		} catch (IOException e) {
			System.out.println("Hi ha hagut un error.");
			e.printStackTrace();
		}

	}

	public static void writeFile(String nameUser, byte scoreUser) {
		// escriptura de nom i puntuació en el file, els passem com a nous parametres

		try {
			FileWriter userData = new FileWriter("classificacio.txt", true); //amb el TRUE, li donem l'opció seguir escrivint en el mateix arxiu
			userData.write(nameUser + "/ " + scoreUser + " punts.\n"); // aquí hi vull escriure el nom d'usuari i la
																		// puntuació obtinguda
			userData.close();
			System.out.println("S'ha escrit correctament.");

		} catch (IOException e) {
			System.out.println("Hi ha hagut un error.");
			// e.printStackTrace();
		}
	}

	public static String randomCountry() {
		Random random = new Random();

		// crear array amb els valors del HashMap per poder aplicar metode random
		Object[] randomCountries = capitalCities.keySet().toArray();
		String randomCountry = (String) randomCountries[random.nextInt(randomCountries.length)]; // casting a String

		return randomCountry;
	}

	public static boolean capitalCheck(String userAnswr, String randomCountry) {
		boolean check = false;
		
		// recorrer hashmap
		for (String capitals : capitalCities.keySet()) {
			if (randomCountry.equalsIgnoreCase(capitalCities.get(capitals))) {
				if (userAnswr.equalsIgnoreCase(capitals)) {
					check = true;
				}
			}
		}

		return check;
	}
}
