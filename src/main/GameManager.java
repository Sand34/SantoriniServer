package main;

import beans.Joueur;
import beans.Plateau;

public class GameManager {

	public static void main(String[] args) {

		// on crée un plateau et cela instancie aussi une partie

		Plateau plateau = new Plateau();

		Joueur joueur1 = new Joueur();
		joueur1.setPseudo("Sand");
		System.out.println(joueur1.getPseudo());
		joueur1.getPion1().setCaze(plateau.getGrille()[2][2]);
		plateau.getGrille()[2][2].setOccupe("occupe");
		System.out.print(plateau.getGrille()[2][2].isOccupe());
		// pour afficher la grille

		// boucle pour parcourir le tableau par les i cad un tableau
		for (int i = 0; i < plateau.getGrille().length; i++) {
			// affiche l'index en début de ligne
			System.out.print("index:" + i + " - ");

			// boucle pour parcourir le tableau i par case
			for (int j = 0; j < plateau.getGrille()[i].length; j++) {

				// System.out.print(plateau);
				// System.out.println();
				System.out.print(plateau.getGrille()[i][j] + " ");
			}
			System.out.println();
		}

	}

}
