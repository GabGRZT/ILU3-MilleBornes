package cartes;

public class Parade extends Bataille {

	public Parade(int nombre, Type type) {
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
			return "FeuVert";		
		case ESSENCE:
			return "Plein d'essence";
		case CREVAISON:
			return "Roue de secours";		
		case ACCIDENT:
			return "Reparations";
		default:
			return "";
		}
	}

	@Override 
	public boolean equals(Object obj) {
		if(obj instanceof Parade) {
			Parade p = (Parade) obj;
			return type.equals(p.type);
		}
		return false;
	}
	
	@Override
	public int compareTo(Carte o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
