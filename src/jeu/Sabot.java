package jeu;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

import cartes.Carte;

public class Sabot implements Iterable<Carte> {
	private int nbCarte = 0; // capacité du tableau cartes
	private Carte[] cartes;
	private int nbOperations = 0;

	public Sabot(int capacity) {
		this.cartes = new Carte[capacity];
	}

	public int getNbCarte() {
		return nbCarte;
	}

	public class Iterateur implements Iterator<Carte> {
		private int indiceIterator = 0;
		private boolean nextEffectue = false;
		private int nbOperationsRef = nbOperations;


		@Override
		public boolean hasNext() {
			return indiceIterator < nbCarte;
		}

		@Override
		public Carte next() {
			verifConcurrence();
			if (hasNext()) {
				Carte carte = cartes[indiceIterator];
				indiceIterator++;
				nextEffectue = true;
				return carte;
			} else {
				throw new NoSuchElementException();
			}
		}

		private void verifConcurrence() {
			if (nbOperations != nbOperationsRef) {
				throw new ConcurrentModificationException();
			}
		}

		@Override
		public void remove() {
			verifConcurrence();

			if (!nextEffectue) {
				throw new IllegalStateException("remove() ne peut pas être appelé à ce stade.");
			}

			if (indiceIterator > 0) {
				// Si l'itérateur pointe vers un élément valide
				for (int i = indiceIterator - 1; i < nbCarte - 1; i++) {
					cartes[i] = cartes[i + 1];
				}
				cartes[nbCarte - 1] = null;
				nbCarte--;
				indiceIterator--;
				nextEffectue = false;
			} else {
				throw new IllegalStateException("Impossible de supprimer avant d'appeler next()");
			}
			nbOperations++;
			nbOperationsRef++;
		}
	}

	public boolean estVide() {
		return nbCarte == 0;
	}

	private void ajouterCarte(Carte carte) {
		if (nbCarte < cartes.length) {
			cartes[nbCarte] = carte;
			nbCarte++;
			nbOperations++;
		} else {
			throw new ArrayIndexOutOfBoundsException("Sabot plein");
		}
	}

	public void ajouterFamilleCarte(Carte carte) {
		for (int i = 0; i < carte.getNombre(); i++) {
			ajouterCarte(carte);
		}
	}

	public void afficherSabot() {
		for (int i = 0; i < cartes.length; i++) {
			System.out.println("Le sabot contient: " + cartes[i]);
		}
	}

	public void ajouterFamillesCarte(Carte... card) {
		for (int i = 0; i < card.length; i++) {
			ajouterFamilleCarte(card[i]);
		}
		afficherSabot();
		System.out.println("\n");
		
	}

	public Iterator<Carte> iterator() {
		return new Iterateur();
	}

	public void piocher() {
		Sabot.Iterateur iterateur = new Iterateur();
		iterateur.next();
		iterateur.remove();
	}

}
