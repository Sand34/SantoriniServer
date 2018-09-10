package beans;

public class Case {

	// ATTRIBUTS
	private Case position;
	private String occupe;

	// CONSTRUCTEUR
	public Case() {
	}

	// GETTER & SETTER
	public Case getPosition() {
		return position;
	}

	public void setPosition(Case here) {
		position = here;
	}

	public String isOccupe() {
		return occupe;
	}

	public void setOccupe(String occupe) {
		this.occupe = occupe;
	}

}
