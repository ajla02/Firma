package zajednickiPojekat;

import java.util.ArrayList;
import java.util.Scanner;

public class ImplementacijaPonasanja implements Ponasanja {
	static DodjeljivanjeZadataka add1 = new DodjeljivanjeZadataka();
	static ArrayList<Developer> developeri = new ArrayList<Developer>();;
	static ArrayList<Zadatak> zadaci = new ArrayList<Zadatak>();
	static ArrayList<Dizajner> dizajneri = new ArrayList<Dizajner>();

	static Zadatak zadatak1;

	static Scanner unos = new Scanner(System.in);

	@Override
	public void dodavanjeDevelopera(Developer developer) {

		developeri.add(developer);
	}

	@Override
	public void dodajZadatak(Zadatak zadatak) {

		zadaci.add(zadatak);
	}

	@Override
	public boolean dodijeliZadatak(String naziv) {

		if (!add1.provjeraDostupnosti(naziv)) {
			System.out.println("Zadatak je zauzet.");
			return false;
		}
		return true;
	}

	public void dodavanjeDizajnera(Dizajner dizajner) {

		dizajneri.add(dizajner);
	}
}
