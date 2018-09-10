package main;

import beans.Case;
import beans.Plateau;

public class GameManager {

	public static void main(String[] args) {

		// on crée un plateau et cela instancie aussi une partie
		Plateau plateau = new Plateau();
		Case[][] caseGrille = new Case[7][7];

		// Case caseDegrille = new Case();

		// pour afficher la grille

		// boucle pour parcourir le tableau par les i cad un tableau
		for (int i = 0; i < plateau.getGrille().length; i++) {
			// affiche l'index en début de ligne
			System.out.print("index:" + i + " - ");
			// boucle pour parcourir le tableau i par case
			for (int j = 0; j < plateau.getGrille()[i].length; j++) {
				// Case caseDegrille = new Case();
				plateau.setGrille(caseGrille);
				System.out.print(plateau.getGrille()[i][j] + " ");

			}
			System.out.println();

		}

	}

}
