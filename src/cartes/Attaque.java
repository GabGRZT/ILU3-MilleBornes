package cartes;

public class Attaque extends Bataille {

	public Attaque(int nombre, Type type) {
		super(nombre, type);
	}
	
	@Override
	public Type getType() {
		return super.getType();
	}

	@Override
	public String toString() {
		
		switch(getType()) {
		
		case FEU:
			return "FeuRouge";
		case ESSENCE:
			return "PanneEssence";
		case CREVAISON:
			return "Crevaison";
		case ACCIDENT:
			return "Accident";
		default :
			return "";
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Attaque) {
			Attaque a = (Attaque) obj;
			return type.equals(a.type);
		}
		return false;
	}
	
	@Override
	public int compareTo(Carte o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
