package cartes;

public abstract class Bataille extends Probleme {

	protected Bataille(int nombre, Type type) {
		super(nombre, type);
	}

	@Override
	public String toString() {
		switch(getType()) {
		
		case FEU:
			return "Feu";
		case ESSENCE:
			return "Essence";
		case CREVAISON:
			return "Crevaison";
		case ACCIDENT:
			return "Accident";
		default:
			return "Pas de soucis";
		}
	}
}
