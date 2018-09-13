package beans;

public class Case {

	// ATTRIBUTS
	private String position; // = new String[7][7];
	private boolean occupe = false;
	private Building building;

	// CONSTRUCTEUR
	public Case() {
		building = new Building();
	}

	// GETTER & SETTER

	public Building getBuilding() {
		return building;
	}

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

	public void construire(String construction) {
		building.setConstruction(construction);
	}

	public String afficherConstruction() {
		return building.getConstruction();
	}

}
