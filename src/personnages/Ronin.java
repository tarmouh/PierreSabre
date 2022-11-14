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

	public void provoquer(Yakuza adversaire) {
		int force = this.honneur * 2;

		if (force >= adversaire.getReputation()) {
			parler("Je t'ai trouvé vermine, tu vas payer Pour ce que tu as fait à ce pauvre marchand!");
			parler("Je t'ai eu petit Yakuza");
			this.argent += adversaire.perdre();
		} else {
			honneur -= 1;
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont pris un coup");
			adversaire.gagner(this.argent);
			this.argent = 0;
		}
	}

}
