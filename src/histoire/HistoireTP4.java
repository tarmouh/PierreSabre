package histoire;

import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
//		Humain prof = new Humain("Prof", "Kombucha", 54);
//		prof.direBonjour();
//		prof.acheter("une boisson", 12);
//		prof.boire();
//		prof.acheter("un jeu", 2);
//		prof.acheter("un kimono", 50);
//		Commercant marco = new Commercant("Marco", "th�", 15);
//		marco.direBonjour();
//		marco.seFaireExtorquer();
//		marco.recevoir(15);
//		marco.boire();
		Yakuza yaku = new Yakuza("Yaku le Noir", "whisky", 45, "Warsong");
//		yaku.direBonjour();
//		yaku.extorquer(marco);
		Ronin roro = new Ronin("roro", "shochu", 54);
//		roro.direBonjour();
//		roro.donner(marco);
		roro.provoquer(yaku);
	}

}
