package zajednickiPojekat;

public class ProvjeraPodatakaZaPrijavu {

	ProvjeraPodatakaZaPrijavu() {
	}

	public static boolean provjeraPriLogInDeveloper(String ime, String prezime, String password) {
		for (int i = 0; i < ImplementacijaPonasanja.developeri.size(); i++) {
			if (ImplementacijaPonasanja.developeri.get(i).ime.equals(ime)
					&& ImplementacijaPonasanja.developeri.get(i).prezime.equals(prezime)
					&& ImplementacijaPonasanja.developeri.get(i).password.equals(password)) {
				return true;
			}

		}
		return false;
	}

	public static boolean provjeraPriLogInDizajner(String ime, String prezime, String password) {
		for (int i = 0; i < ImplementacijaPonasanja.dizajneri.size(); i++) {
			if (ImplementacijaPonasanja.dizajneri.get(i).ime.equals(ime)
					&& ImplementacijaPonasanja.dizajneri.get(i).prezime.equals(prezime)
					&& ImplementacijaPonasanja.dizajneri.get(i).password.equals(password)) {
				return true;
			}

		}
		return false;
	}

	public boolean provjeraUnikatnostiUnesenogUsernamea1(String ime, String prezime) {
		for (int i = 0; i < ImplementacijaPonasanja.developeri.size(); i++) {
			if (ImplementacijaPonasanja.developeri.get(i).ime.equals(ime)
					&& ImplementacijaPonasanja.developeri.get(i).prezime.equals(prezime)) {
				return true;
			}

		}
		return false;
	}

	public boolean provjeraUnikatnostiUnesenogUsernamea2(String ime, String prezime) {
		for (int i = 0; i < ImplementacijaPonasanja.dizajneri.size(); i++) {
			if (ImplementacijaPonasanja.dizajneri.get(i).ime.equals(ime)
					&& ImplementacijaPonasanja.dizajneri.get(i).prezime.equals(prezime)) {
				return true;
			}

		}
		return false;
	}

}
