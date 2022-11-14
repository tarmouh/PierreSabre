package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;

	public int getReputation() {
		return reputation;
	}

	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
	}

	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int argentVole = victime.argent;
		victime.seFaireExtorquer();
		parler("J'ai piqué les " + argentVole + " sous de " + victime.getNom() + " ce qui me fait "
				+ (this.argent + argentVole) + " sous dans ma poche. Hi ! Hi !");
		this.argent += argentVole;

		reputation += 1;

	}

	public int perdre() {
		int argentPerdu = this.argent;
		this.argent = 0;
		reputation -= 0;
		parler("J'ai perdu mon duel et mes " + argentPerdu + " sous, snif... J'ai déshonoré le clan de " + this.clan);
		return argentPerdu;
	}

	public void gagner(int gain) {
		this.argent += gain;
		this.reputation += 1;
		parler("Ce ronin pensait vraiment battre Yaku Le Noir du clan de " + this.clan
				+ " ? \n Je l'ai dépouillé de ses " + gain + " sous.");

	}

}
