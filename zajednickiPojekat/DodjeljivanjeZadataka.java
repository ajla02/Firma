package zajednickiPojekat;

import java.util.Scanner;

public class DodjeljivanjeZadataka {

	static String uposlenik;
	static int uposlenikOdabir;
	static Scanner unos = new Scanner(System.in);
	static boolean diz = false, dev = false;

	DodjeljivanjeZadataka() {

	}

	public static String provjeraZaKoga() {
		System.out.println("Unesite za koga zelite kreirati zadatak (dizajner-1 / developer-2): ");
		uposlenikOdabir = unos.nextInt();
		if (uposlenikOdabir == 1)
			diz = true;
		else if (uposlenikOdabir == 2)
			dev = true;

		if (diz) {
			uposlenik = "dizajner";
		} else if (dev) {
			uposlenik = "developer";
		}

		return uposlenik;
	}

	public boolean provjeraDostupnosti(String naziv) {
		for (int i = 0; i < ImplementacijaPonasanja.zadaci.size(); i++) {
			if (ImplementacijaPonasanja.zadaci.get(i).nazivZadatka.equals(naziv)) {
				if (ImplementacijaPonasanja.zadaci.get(i).zauzetost == true)
					return false;
			}
		}
		return true;
	}

}
