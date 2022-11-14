package personnages;

public class Ronin extends Humain {
	private int honneur = 1;

	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);

	}

	public void donner(Commercant beneficiaire) {
		int argentDonnation = (this.argent * 10) / 100;
		parler(beneficiaire.getNom() + " prend ces " + argentDonnation + " sous.");
		beneficiaire.recevoir(argentDonnation);
	}

}
