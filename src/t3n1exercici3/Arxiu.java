package t3n1exercici3;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Arxiu {
	
	public Arxiu(String string) {
	}
	
	
	
	
	
	

//mètodes Classe File	
	
public static void ReadFile() {

	try {
		Scanner reader = new Scanner(System.in);
		while (reader.hasNextLine()) {
			String data = reader.nextLine();
			System.out.println(data);
		}

	} catch (FileNotFoundException e) {
		System.out.println("No s'ha trobat un arxiu.");

	}
}
public static void CreateFile() {
	
}
public static void WriteFile() {
	
}
	
}
