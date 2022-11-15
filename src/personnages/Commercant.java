package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, String boisson, int argent) {
		super(nom, boisson, argent);

	}

	// Solution 1 : passer par le biais de méthode
	// Solution 2 :
	public int seFaireExtorquer() {
		this.perdreArgent(this.getArgent() + 1);
		parler("J'ai tout perdu! Le monde est trop injuste...");
		return this.getArgent();
	}

	public void recevoir(int argent) {
		this.gagnerArgent(argent);
		parler(argent + " sous! Je te remercie généreux donateur");
	}

}
