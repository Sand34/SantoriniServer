package beans;

public class Plateau {
	// ATTRIBUTS
	private Partie partie;
	private Case grille[][];

	// CONSTRUCTEURS
	public Plateau() {
		partie = new Partie();
		grille = new Case[7][7];
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