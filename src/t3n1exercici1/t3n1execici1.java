package t3n1exercici1;

import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class t3n1execici1 {
	static ArrayList<Month> months = new ArrayList<Month>(); // intanciar array mesos
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		Month Gener = new Month("Gener"); // instanciar objecte mes 12
		Month Febrer = new Month("Febrer");
		Month Marc = new Month("Març");
		Month Abril = new Month("Abril");
		Month Maig = new Month("Maig");
		Month Juny = new Month("Juny");
		Month Juliol = new Month("Juliol");
		Month Agost = new Month("Agost");
		Month Setembre = new Month("Setembre");
		Month Octubre = new Month("Octubre");
		Month Novembre = new Month("Novembre");
		Month Desembre = new Month("Desembre");

		// afegir mesos a l'ArrayList (11)
		months.add(Gener);
		months.add(Febrer);
		months.add(Marc);
		months.add(Abril);
		months.add(Maig);
		months.add(Juny);
		months.add(Juliol);
		months.add(Setembre);
		months.add(Octubre);
		months.add(Novembre);
		months.add(Desembre);

		months.add(7, Agost);
		
		for (Month monthList : months) {
			System.out.println(monthList.getName());
			}
			System.out.println();
			
			

			Set<Month> months2 = new HashSet<Month>(); // Convertir ArrayList a HashSet
			months2.add(Gener);
			months2.add(Gener);
			months2.add(Gener);
			months2.add(Abril);
			months2.add(Maig);
			months2.add(Maig);
			months2.add(Maig);
			months2.add(Maig);
			months2.add(Maig);
			months2.add(Desembre);
			months2.add(Desembre);

			for (Month monthList2 : months2) {
				System.out.println(monthList2.getName());

			
			}

		}

	}


/*
 * for(int i = 0; i <= months.size(); i++) { month = months.get(i);
 * System.out.println("Introdueix el nom del mes " + months.get(i) + " : ");
 * month = entrada.nextLine(); //? months.add(month); i++; }
 */