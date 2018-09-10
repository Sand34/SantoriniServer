package beans;

public class Pion {

	// ATTRIBUTS
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

}
