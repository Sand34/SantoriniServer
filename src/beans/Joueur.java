package beans;

public class Joueur {

	// ATTRIBUTS
	private String pseudo;
	private Pion pion1;
	private Pion pion2;

	// CONSTRUCTEUR
	// public Joueur() {
	// super();
	// }

	public Joueur() {
		pion1 = new Pion();
		pion2 = new Pion();
	}

	// GETTER & SETTER

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public Pion getPion1() {
		return pion1;
	}

	public Pion getPion2() {
		return pion2;
	}

}
