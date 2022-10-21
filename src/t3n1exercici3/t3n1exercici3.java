package t3n1exercici3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class t3n1exercici3 {
	static Scanner entrada = new Scanner(System.in);
	// static File clas = new File("");

	public static void main(String[] args) {
		String nameUser = "";
		String nameFile = "";
		byte score = 0;

		HashMap<String, String> capitalCities = new HashMap<String, String>();
		BufferedReader br = null; // vull llegir linea a linea el txt
		

		try {
			File countries = new File("/Users/gerardclosa/desktop/countries.txt"); // creo objecte file
			br = new BufferedReader(new FileReader(countries)); // objecte buffered del file
			String line = null;

			// llegir l'arxiu linia a linia
			while ((line = br.readLine()) != null) {

				// parteixo linia per espais en, dos camps en aquest cas 
				String[] parts = line.split(" ");
				String country = parts[0].trim();
				String capital = parts[1].trim();

				// si els camps no estan buits, afegirho a hashmap
				if (!country.equals("") && !capital.equals(""))
					capitalCities.put(country, capital);
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			// finalitzar el buffered reader
			if (br != null) {
				try {
					br.close();

				} catch (Exception e2) {
				}
			}

			
			// System.out.println("No s'ha trobat un arxiu.");

			/*
			 * while (countries.exists()) { // llegir arxiu per a agafar els noms de paisos
			 * i capitals (mentre va llegint) // i anar introduint dins el hashmap
			 * 
			 * for (Map.Entry<String, String> entrada : capitalCities.entrySet()) { String
			 * country = entrada.getKey(); String capital = entrada.getValue();
			 */

		}

		
		
		System.out.println("Ha finalitzat la càrrega de l'arxiu.\n");

		// APP USUARIA

		System.out.println("Introdueix el teu nom: ");
		nameUser = entrada.nextLine();
		System.out.println(capitalCities.get()); //mostrar de forma random els països dins el hashmap
		System.out.println("Escriu la capital del país: ");
		
		
		
		//creacio arxiu
		
		try {
			File arxiu = new File("classificacio.txt");
			if (arxiu.createNewFile()) {
				System.out.println("Arxiu creat: " + arxiu.getName());
			} else {
				System.out.println("Ja existeix l'arxiu.");
			}
		} catch (IOException e) {
			System.out.println("Hi ha hagut un error.");
			e.printStackTrace();
		}
		
		//escriptura en l'arxiu
		
	    try {
	        FileWriter clas = new FileWriter("classificacio.txt");
	        clas.write("Files in Java might be tricky, but it is fun enough!");
	        clas.close();
	        System.out.println("S'ha escrit correctament. ");
	      } catch (IOException e) {
	        System.out.println("Hi ha hagut un error.");
	        e.printStackTrace();
	      }
		
	}

}
