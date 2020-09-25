package zajednickiPojekat;

public interface Ponasanja {
	public void dodavanjeDevelopera(Developer developer);

	public void dodajZadatak(Zadatak zadatak);

	public boolean dodijeliZadatak(String naziv);
}
