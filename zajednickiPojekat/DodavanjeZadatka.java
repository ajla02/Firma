package zajednickiPojekat;

public class DodavanjeZadatka {

	public boolean provjeraPostojanjaZadatka(String nazivZadatkaUnosZaDodjelu) {
		for (int i = 0; i < ImplementacijaPonasanja.zadaci.size(); i++) {
			if (ImplementacijaPonasanja.zadaci.get(i).nazivZadatka.equals(nazivZadatkaUnosZaDodjelu)) {
				return true;
			}

		}
		return false;
	}
}
