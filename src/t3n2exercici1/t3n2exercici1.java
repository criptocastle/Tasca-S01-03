package t3n2exercici1;

import java.util.HashSet;
import java.util.Scanner;

public class t3n2exercici1 {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		HashSet<Restaurant> restaurants = new HashSet<Restaurant>();
		Restaurant r1= new Restaurant(null, 0);
		
		int i = 0;
		
		do {
			
		System.out.println("Introdueix el nom d'un restaurant: ");
		r1.setName(entrada.nextLine());
		
		System.out.println("Introdueix la puntuació: ");
		r1.setPuntuació(entrada.nextInt());
		
		restaurants.add(r1);
		
		System.out.println();
		
		} while(i >= 0);
		
	}

}
