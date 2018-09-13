package beans;

public class Plateau {
	// ATTRIBUTS
	private Partie partie;
	private String[][] grille;

	// CONSTRUCTEURS
	public Plateau() {
		grille = new String[7][7];
		partie = new Partie();
	}

	// GETTER & SETTER
	public Partie getPartie() {
		return partie;
	}

	public void setPartie(Partie partie) {
		this.partie = partie;
	}

	public String[][] getGrille() {
		return grille;
	}

	public void setGrille(String[][] grille) {
		this.grille = grille;
	}

}