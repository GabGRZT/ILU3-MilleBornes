package cartes;

import java.util.ArrayList;
import java.util.List;

import cartes.Probleme.Type;

public class JeuDeCartes {
	private Carte [] typesDeCartes = {new Attaque(5, Type.FEU),new Attaque(3, Type.ESSENCE),
			new Attaque(3, Type.CREVAISON),new Attaque(3, Type.ACCIDENT),
			new Parade(14, Type.FEU), new Parade(6, Type.ESSENCE), 
			new Parade(6, Type.CREVAISON), new Parade(6, Type.ACCIDENT),
			new Botte(1, Type.FEU), new Botte(1, Type.ESSENCE), new Botte(1, Type.CREVAISON), new Botte(1, Type.ACCIDENT),
			new DebutLimite(4), new FinLimite(6),
			new Borne(10, 25), new Borne(10,50), new Borne(10,75), new Borne(12,100),new Borne(4,200)
			};
	
	private List<Carte> listeCartes = new ArrayList<>();
	
	
	public JeuDeCartes () {
		this.listeCartes = createListCard();
	}
	
	
//	public void afficher () {
//		for (int i = 0; i < typesDeCartes.length; i++) {
//			System.out.println(typesDeCartes[i]);
//		}
//	}
	
	public List<Carte> createListCard() {
		for (int i = 0; i < typesDeCartes.length; i++) {
			for (int j = 0; j < typesDeCartes[i].getNombre(); j++){
				listeCartes.add(typesDeCartes[i]);
			}
		}
		return listeCartes;
	}
	
	public boolean checkCountCarte(Carte carte) {
		int count = 0;
		for (Carte carte2 : listeCartes) {
			if(carte2.equals(carte)) {
				count++;
				System.out.println("On a "+count+" cartes.");
			}
		}
		return count == carte.getNombre();	
	}
	
//	public void checkCount() {
//		Carte c1 = new Attaque(5, Type.FEU);
//		if(checkCountCarte(c1)) {
//			
//		}
//	}
}
