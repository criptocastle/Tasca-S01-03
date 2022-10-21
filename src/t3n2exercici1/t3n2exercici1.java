package t3n2exercici1;

import java.util.HashSet;
import java.util.Scanner;

public class t3n2exercici1 {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		HashSet<Restaurant> restaurants = new HashSet<Restaurant>();
		Restaurant rest= new Restaurant(null, 0);
		int i = 0;
		
		do {
			
		System.out.println("Introdueix el nom d'un restaurant: ");
		rest.setNom(entrada.nextLine());
		
		System.out.println("Introdueix la puntuació: ");
		rest.setPuntuació(entrada.nextInt());
		
		restaurants.add(rest);
		
		System.out.println();
		
		} while(i >= 0);
		
	}

}
