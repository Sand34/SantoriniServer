package beans;

public class Joueur {

	// ATTRIBUTS
	private String pseudo;
	private Pion pion1;
	private Pion pion2;

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

	public void construire(String construction) {
		pion1.construire(construction);
	}

	public void setPion1(Pion pion1) {
		this.pion1 = pion1;
	}

	public void setPion2(Pion pion2) {
		this.pion2 = pion2;
	}

}
