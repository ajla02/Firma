package zajednickiPojekat;

public class Dizajner extends Uposlenik {

	public String vrstaDizajnera;

	public Dizajner() {

	}

	public Dizajner(String ime, String prezime, String password, String vrstaDizajnera) {
		super(ime, prezime, password);
		this.vrstaDizajnera = vrstaDizajnera;
	}

}
