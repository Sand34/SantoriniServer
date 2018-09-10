package beans;

public class Plateau {
	// ATTRIBUTS
	private Partie partie;
	private Case grille[][];

	// CONSTRUCTEURS
	public Plateau() {
		grille = new Case[7][7];
		partie = new Partie();
	}

	// GETTER & SETTER
	public Partie getPartie() {
		return partie;
	}

	public void setPartie(Partie partie) {
		this.partie = partie;
	}

	public Case[][] getGrille() {
		return grille;
	}

	public void setGrille(Case[][] grille) {
		this.grille = grille;
	}

}