package beans;

public class Case {

	// ATTRIBUTS
	private String position;
	private boolean occupe = true;

	// CONSTRUCTEUR
	public Case() {
	}

	// GETTER & SETTER
	public String getPosition() {
		return position;
	}

	public void setPosition(String string) {
		position = string;
	}

	// public Plateau getPlateau() {
	// return plateau;
	// }

	public boolean isOccupe() {
		return occupe;
	}

	public void setOccupe(boolean occupe) {
		this.occupe = occupe;
	}

}
