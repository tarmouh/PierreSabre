package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, String boisson, int argent) {
		super(nom, boisson, argent);

	}

	// Solution 1 : changer la visibilit� de argent en public
	// Solution 2 : red�finir l'attribut argent
	public int seFaireExtorquer() {
		argent = 0;
		parler("J'ai tout perdu! Le monde est trop injuste...");
		return argent;
	}

	public void recevoir(int argent) {
		this.argent += argent;
		parler(argent + " sous! Je te remercie g�n�reux donateur");
	}

}
