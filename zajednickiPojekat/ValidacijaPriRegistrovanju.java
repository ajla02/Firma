package zajednickiPojekat;

public class ValidacijaPriRegistrovanju {

	static boolean velikaSlova = false;

	ValidacijaPriRegistrovanju() {

	}

	public boolean validacijaDuzineImena(String ime) {

		if (ime.length() < 4) {
			return false;
		}
		return true;
	}

	public boolean validacijaDuzinePassworda(String password1) {

		char ch;
		boolean velikaSlova = false;
		boolean malaSlova = false;

		for (int i = 0; i < password1.length(); i++) {
			ch = password1.charAt(i);
			if (Character.isUpperCase(ch)) {
				velikaSlova = true;
			} else if (Character.isLowerCase(ch)) {
				malaSlova = true;
			}
			if (velikaSlova && malaSlova)
				return true;
		}
		return false;
	}

	public boolean validacijaDuzinePrezimena(String prezime) {
		if (prezime.length() > 5) {
			return true;
		}
		return false;

	}
}
