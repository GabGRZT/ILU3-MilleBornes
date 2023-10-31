package utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

import cartes.Attaque;
import cartes.Carte;
import cartes.JeuDeCartes;
import cartes.Probleme.Type;
import jeu.Sabot.Iterateur;

public class Utils{
	
	public static Carte getRandomElement(List<Carte> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }

        Random random = new Random();
        int randomIndex = random.nextInt(list.size());

        return list.get(randomIndex);
    }
	
	//Version 1 de extraire(List list)
	public static Carte extraire(List <Carte> list) {
		Carte carte = getRandomElement(list);
		System.out.println("Carte a retire : "+carte);
		boolean reponse = list.remove(carte);
		System.out.println("La carte "+carte+" a ete retiree :"+reponse+"\n");
		System.out.println("Affichage de la liste mise a jour : \n"+list+"\n");
		return carte;
	}
	
	//Version 2 de extraire(List list)
//	public static Carte extrairev2(List<Carte> list) {
//		Carte carte = getRandomElement(list);
//		System.out.println("Carte a retire : "+carte);
//		ListIterator<Carte> iterator = list.listIterator();
//		boolean reponse = iterator.remove();
//		System.out.println("La carte "+carte+" a ete retiree :"+reponse+"\n");			
//		System.out.println("Affichage de la liste mise a jour : \n"+list+"\n");
//		return carte;
//	}
	
	public static List<Carte> melanger(List<Carte>list) {
		JeuDeCartes jeu = new JeuDeCartes();
		List<Carte> list1 = jeu.createListCard();
		for (Carte carte : list1) {
			extraire(list);
		}
		return list;
	}
	
	public static boolean verifierMelange(List<Carte> list1, List<Carte>list2) {
		for (Carte c1 : list1) {
			if (Collections.frequency(list1, c1) == Collections.frequency(list2, c1)) {
				return true;
			}
		}
		return false;
	}
	
	public static List<Carte> rassembler(List<Carte> list) {
		List<Carte>listCons = new ArrayList<>();
		for (Carte carte : list) {
			if (carte.equals()) {
				listCons.add(carte);
			}
		}
		return listCons;
		
	}
	
	public static boolean verifierRassemblement(List<Carte>list) {
		for(ListIterator iter1 = list.listIterator();iter1.hasNext();){
			
		}
		for(ListIterator iter2 = list.listIterator();iter2.hasPrevious();) {
			
		}
		
		return false;
		
	}
}
