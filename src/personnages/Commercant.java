package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, String boisson, int argent) {
		super(nom, boisson, argent);

	}

	// Solution 1 : passer par le biais de méthode
	// Solution 2 :
	public int seFaireExtorquer() {
		int argentPerdu = this.getArgent();
		this.perdreArgent(this.getArgent());
		parler("J'ai tout perdu! Le monde est trop injuste...");
		return argentPerdu;
	}

	public void recevoir(int argent) {
		this.gagnerArgent(argent);
		parler(argent + " sous! Je te remercie généreux donateur");
	}

}
