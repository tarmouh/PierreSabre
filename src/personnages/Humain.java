package personnages;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}

	public Humain(String nom, String boisson, int argent) {
		super();
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}

	// parler est protected
	protected void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return nom + " : ";
	}

	public void gagnerArgent(int gain) {
		if (gain > 0) {
			this.argent += gain;
		}

	}

	public void perdreArgent(int perte) {
		if (this.argent >= perte || perte < 0) {
			this.argent -= perte;
		} else {
			this.argent = 0;
		}

	}

	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boisson);

	}

	public void boire() {
		parler("Mmmm, un bon verre de " + boisson + " ! GLOUPS !");
	}

	public void acheter(String bien, int prix) {
		if (this.argent >= prix) {
			parler("j'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous");
			this.perdreArgent(prix);
		} else {
			parler("je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix
					+ " sous");
		}

	}

}
