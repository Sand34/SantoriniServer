package beans;

public class Pion {

	// ATTRIBUTS
	private String pseudoPion;
	private Case caze;

	// CONSTRUCTEUR

	public Pion() {
		caze = new Case();
	}

	// GETTER & SETTER
	public void setCaze(Case caze) {
		this.caze = caze;
	}

	public Case getCaze() {
		return caze;
	}

	public String getPseudoPion() {
		return pseudoPion;
	}

	public void setPseudoPion(String pseudoPion) {
		this.pseudoPion = pseudoPion;
	}

	public void deplacerPion() {

	}

	public void construire(String construction) {
		caze.construire(construction);
	}

	public String afficherConstruction() {
		return caze.afficherConstruction();
	}
}
