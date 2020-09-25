package zajednickiPojekat;

public abstract class Uposlenik {
	public String ime;
	public String prezime;
	protected String password;
	public Zadatak zadatak;

	public Uposlenik() {

	}

	public Uposlenik(String ime, String prezime, String password) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.password = password;

	}

}
