package zajednickiPojekat;

import java.util.Scanner;

public class Main {
	static Scanner unos;
	static ImplementacijaPonasanja dodjeljivanje;
	static DodavanjeZadatka add = new DodavanjeZadatka();
	static ValidacijaPriRegistrovanju validacija = new ValidacijaPriRegistrovanju();
	static ProvjeraPodatakaZaPrijavu provjera = new ProvjeraPodatakaZaPrijavu();

	static Zadatak zadatak1;
	static String imeUnos, prezimeUnos, passwordUnos;
	static String programskiJezikUnos;
	static String ime2Unos, prezime2Unos, password2Unos;
	static String vrstaDizajneraUnos;
	static String nazivZadatkaUnos;
	static String imeLogIn, prezimeLogIn, passwordLogIn;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		unos = new Scanner(System.in);
		System.out.println("Dobrodosli.");
		menu: while (true) {

			System.out.println("Odaberite opciju: ");
			System.out.println("Za registraciju unesite 1");
			System.out.println("Za prijavu unesite 2");
			System.out.println("Za izlaz unesite 0");
			int opcija1 = unos.nextInt();
			if (opcija1 == 1) {
				System.out.println("Ukoliko se zelite registrovati kao developer, unesite 1.");
				System.out.println("Ukoliko se zelite registrovati kao dizajner, unesite 2.");
				int opcija2 = unos.nextInt();
				if (opcija2 == 1) {

					kreiranjeDevelopera();
					continue menu;
				}
				if (opcija2 == 2) {

					kreiranjeDizajnera();
					continue menu;
				}

			}
			if (opcija1 == 2) {
				podaci: while (true) {
					System.out.println("Unesite ime: ");
					unos.nextLine();
					imeLogIn = unos.nextLine();
					System.out.println("Unesite prezime: ");
					prezimeLogIn = unos.nextLine();
					System.out.println("Unesite password: ");
					passwordLogIn = unos.nextLine();

					if (ProvjeraPodatakaZaPrijavu.provjeraPriLogInDeveloper(imeLogIn, prezimeLogIn, passwordLogIn)
							|| ProvjeraPodatakaZaPrijavu.provjeraPriLogInDizajner(imeLogIn, prezimeLogIn,
									passwordLogIn)) {
						System.out.println("Kreacija zadatka");
						logedIn();
						break;
					} else {
						System.out.println("Nesto nije uredu, pokusajte ponovo.");
						continue podaci;
					}
				}

			}

			if (opcija1 == 0)
				break;
			unos.close();
			break;

		}
	}

//metoda za kreiranje developera
	public static void kreiranjeDevelopera() {

		ime: while (true) {
			System.out.println("Unesite ime: ");
			unos.nextLine();
			imeUnos = unos.nextLine();

			if (!validacija.validacijaDuzineImena(imeUnos)) {

				System.out.println("Ime mora biti duze od 3 karaktera.");
				System.out.println("Pokusajte ponovo.");
				continue ime;
			} else
				break;
		}

		prezime: while (true) {

			System.out.println("Unesite prezime: ");
			prezimeUnos = unos.nextLine();
			if (!validacija.validacijaDuzinePrezimena(prezimeUnos))

			{
				System.out.println("Prezime mora biti duze od 5 karaktera.");
				System.out.println("Pokusajte ponovo.");
				continue prezime;
			} else
				break;
		}
		sifra: while (true) {
			System.out.println("Unesite password: ");
			passwordUnos = unos.nextLine();
			if (!validacija.validacijaDuzinePassworda(passwordUnos)) {
				System.out.println("Password mora imati i velika i mala slova.");
				System.out.println("Molimo, pokusajte ponovo.");
				continue sifra;
			} else
				break;
		}

		username: while (true) {
			if (provjera.provjeraUnikatnostiUnesenogUsernamea1(imeUnos, prezimeUnos)
					|| provjera.provjeraUnikatnostiUnesenogUsernamea1(imeUnos, prezimeUnos)) {
				System.out.println("Username vec postoji, pokusajte ponovo.");
				continue username;
			} else
				break;
		}
		System.out.println("Unesite ime programskog jezika: ");
		programskiJezikUnos = unos.nextLine();

		Developer developer1 = new Developer(imeUnos, prezimeUnos, passwordUnos, programskiJezikUnos);
		dodjeljivanje = new ImplementacijaPonasanja();
		dodjeljivanje.dodavanjeDevelopera(developer1);
		System.out.println("Uspjesno ste kreirali developera.");

	}

	// metoda za kreiranje dizajnera
	public static void kreiranjeDizajnera() {

		ValidacijaPriRegistrovanju validacija = new ValidacijaPriRegistrovanju();
		ime2: while (true) {
			System.out.println("Unesite ime: ");
			unos.nextLine();
			ime2Unos = unos.nextLine();
			if (!validacija.validacijaDuzineImena(ime2Unos)) {
				System.out.println("Ime mora biti duze od 4 karaktera.");
				System.out.println("Pokusajte ponovo.");
				continue ime2;
			} else
				break;
		}

		prezime2: while (true) {
			System.out.println("Unesite prezime: ");
			prezime2Unos = unos.nextLine();
			if (!validacija.validacijaDuzinePrezimena(prezime2Unos))

			{

				System.out.println("Prezime mora biti duze od 5 karaktera.");
				System.out.println("Pokusajte ponovo.");
				continue prezime2;
			} else
				break;
		}
		sifra2: while (true) {
			System.out.println("Unesite password: ");
			password2Unos = unos.nextLine();

			if (!validacija.validacijaDuzinePassworda(password2Unos)) {
				System.out.println("Password mora imati i velika i mala slova.");
				System.out.println("Molimo, pokusajte ponovo.");
				continue sifra2;
			} else
				break;
		}
		ProvjeraPodatakaZaPrijavu provjera = new ProvjeraPodatakaZaPrijavu();
		username2: while (true) {
			if (provjera.provjeraUnikatnostiUnesenogUsernamea1(imeUnos, prezimeUnos)
					|| provjera.provjeraUnikatnostiUnesenogUsernamea1(imeUnos, prezimeUnos)) {
				System.out.println("Username vec postoji, pokusajte ponovo.");
				continue username2;
			} else
				break;
		}
		System.out.println("Unesite vrstu dizajnera: ");
		vrstaDizajneraUnos = unos.nextLine();

		Dizajner dizajner1 = new Dizajner(ime2Unos, prezime2Unos, password2Unos, vrstaDizajneraUnos);
		dodjeljivanje = new ImplementacijaPonasanja();
		dodjeljivanje.dodavanjeDizajnera(dizajner1);
		System.out.println("Uspjesno ste kreirali dizajnera.");
	}

//metoda za kreiranje zadatka
	public static void kreiranjeZadatka() {

		kreirajponovo: while (true) {
			System.out.println("Unesite ime zadatka: ");
			nazivZadatkaUnos = unos.nextLine();

			zadatak1 = new Zadatak(nazivZadatkaUnos);

			if (add.provjeraPostojanjaZadatka(nazivZadatkaUnos)) {
				System.out.println("Zadatak vec postoji.");
				continue kreirajponovo;
			} else
				break;

		}
		if (DodjeljivanjeZadataka.provjeraZaKoga().equals("dizajner")) {
			for (int i = 0; i < ImplementacijaPonasanja.dizajneri.size(); i++) {
				ImplementacijaPonasanja.dizajneri.get(i).zadatak = zadatak1;
				for (int j = 0; j < ImplementacijaPonasanja.zadaci.size(); j++) {
					if (ImplementacijaPonasanja.zadaci.get(i).nazivZadatka.equals(nazivZadatkaUnos))
						ImplementacijaPonasanja.zadaci.get(i).zauzetost = true;
				}

			}
		} else if (DodjeljivanjeZadataka.provjeraZaKoga().equals("developer")) {
			for (int i = 0; i < ImplementacijaPonasanja.developeri.size(); i++) {
				ImplementacijaPonasanja.developeri.get(i).zadatak = zadatak1;
				for (int j = 0; j < ImplementacijaPonasanja.zadaci.size(); j++) {
					if (ImplementacijaPonasanja.zadaci.get(i).nazivZadatka.equals(nazivZadatkaUnos))
						ImplementacijaPonasanja.zadaci.get(i).zauzetost = true;
				}
			}
		}

	}

//metoda logedIn
	public static void logedIn() {
		if (dodjeljivanje.dodijeliZadatak(nazivZadatkaUnos))
			kreiranjeZadatka();
		ImplementacijaPonasanja.zadaci.add(zadatak1);
		System.out.println("Uspjesno ste dodijelili zadatak uposleniku.");
	}
}
