package cartes;

public class Botte extends Probleme {

	public Botte(int nombre, Type type) {
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
			return"Vehicule Prioritaire";
		
		case ESSENCE:
			return "Citerne D'essence";
			
		case CREVAISON:
			return "Increvable";
			
		default :
			return "As du Volant";
		}
	}
	
	@Override 
	public boolean equals(Object obj) {
		if( obj instanceof Botte) {
			Botte b = (Botte) obj;
			return type.equals(b.type);
		}
		return false;
	}

	@Override
	public int compareTo(Carte o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
