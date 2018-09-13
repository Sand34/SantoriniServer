package main;

import beans.Plateau;

public class GameManager {

	public static void main(String[] args) {

		Plateau plateau = new Plateau();

		GameAction.initJoueur1("s1", "s2", 5, 6, 5, 5);
		GameAction.initJoueur2("p1", "p2", 5, 0, 2, 2);
		GameAction.refreshGrille();
		System.out.println();

		GameAction.deplacer("s1", "gauche");

		GameAction.refreshGrille();

		// Joueur joueur1 = new Joueur();
		//
		// plateau.getPartie().setJoueur1(joueur1);
		// plateau.getPartie().getJoueur1().getPion1().setPseudoPion("s1");
		// plateau.getPartie().getJoueur1().getPion2().setPseudoPion("s2");
		// plateau.getGrille()[5][6] =
		// plateau.getPartie().getJoueur1().getPion1().getPseudoPion();
		//
		// plateau.getGrille()[6][3] =
		// plateau.getPartie().getJoueur1().getPion2().getPseudoPion();

		// Joueur joueur2 = new Joueur();
		// plateau.getPartie().setJoueur2(joueur2);
		// plateau.getPartie().getJoueur2().getPion1().setPseudoPion("c1");
		// plateau.getPartie().getJoueur2().getPion2().setPseudoPion("c2");
		// plateau.getGrille()[0][1] =
		// plateau.getPartie().getJoueur2().getPion1().getPseudoPion();
		// plateau.getGrille()[0][3] =
		// plateau.getPartie().getJoueur2().getPion2().getPseudoPion();

		// plateau.getPartie().getJoueur1().getPion1().construire("b1");
		// plateau.getPartie().getJoueur1().getPion2().construire("b1");
		// plateau.getGrille()[5][5] =
		// plateau.getPartie().getJoueur1().getPion1().afficherConstruction();
		//
		// plateau.getGrille()[0][0] =
		// plateau.getPartie().getJoueur1().getPion2().afficherConstruction();
		//

		// boucle pour parcourir le tableau par les i cad un tableau
		// for (int i = 0; i < plateau.getGrille().length; i++) {
		// // affiche l'index en d�but de ligne
		// System.out.print("index:" + i + " - ");
		// // boucle pour parcourir le tableau i par case
		//
		// for (int j = 0; j < plateau.getGrille()[i].length; j++) {
		//
		// if (plateau.getGrille()[i][j] == null) {
		// plateau.getGrille()[i][j] = "..";
		// }
		// System.out.print(plateau.getGrille()[i][j] + " ");
		//
		// }
		// System.out.println();
		//
		// }

	}
}
