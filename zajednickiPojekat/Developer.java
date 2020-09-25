package zajednickiPojekat;

public class Developer extends Uposlenik {

	public String programskiJezik;

	public Developer() {

	}

	public Developer(String ime, String prezime, String password, String programskiJezik) {
		super(ime, prezime, password);
		this.programskiJezik = programskiJezik;
	}

}
