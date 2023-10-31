package testsFonctionnels;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import cartes.Attaque;
import cartes.Borne;
import cartes.Botte;
import cartes.Carte;
import cartes.JeuDeCartes;
import cartes.Parade;
import cartes.Probleme.Type;
import jeu.Sabot;
import utils.Utils;

public class Tests {

	public static void main(String[] args) {
//		Sabot sabot = new Sabot(7);
//
//		Attaque accident = new Attaque(3, Type.ACCIDENT);
//		Parade reparation = new Parade(3, Type.ACCIDENT);
//		Botte asDuVolant = new Botte(1, Type.ACCIDENT);
//		sabot.ajouterFamillesCarte(accident, reparation, asDuVolant);
//		sabot.ajouterFamillesCarte(accident);
//		sabot.ajouterFamillesCarte(reparation);
//		sabot.ajouterFamillesCarte(asDuVolant);
//		sabot.piocher();
//		sabot.piocher();
//		sabot.piocher();
//		sabot.piocher();
//		sabot.piocher();
//		sabot.piocher();
//		sabot.piocher();
//
//		for(int i = 0 ; i < 7; i++) {
//			sabot.piocher();
//		}
//
//		for (Iterator<Carte> iter = sabot.iterator(); iter.hasNext();) {
//			sabot.piocher();
//			sabot.afficherSabot();
//			System.out.println("\n");
//			sabot.ajouterFamillesCarte(asDuVolant);
//		}
//
//		Carte a1 = new Attaque(3, Type.FEU);
//		Carte p1 = new Parade(2, Type.ESSENCE);
//		System.out.println(p1.equals(p2));
//
//		Carte a2 = new Attaque(3, Type.CREVAISON);
//		Carte a3 = new Attaque(2, Type.CREVAISON);
//		System.out.println(a1.equals(a2));
//
//		Carte b1 = new Botte (1, Type.CREVAISON);
//		Carte b2 = new Botte (1, Type.CREVAISON);
//		System.out.println(b1.equals(b2));
//
//		Carte borne1 = new Borne(10, 100);
//		Carte borne2 = new Borne(10, 50);
//		System.out.println(borne1.equals(borne2));
//		
		JeuDeCartes jeu = new JeuDeCartes();
		List<Carte> list = jeu.createListCard();
//		Utils.extrairev2(list);
//		for (int i = 0; i < 5; i++) {
//			Utils.extraire(list);
//		}
		Utils.melanger(list);
		
//		jeu.checkCountCarte(p1);
//		jeu.checkCountCarte(p2);
		
		
		

	}
}