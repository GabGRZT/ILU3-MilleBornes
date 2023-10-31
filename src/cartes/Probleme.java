package cartes;

public abstract class Probleme extends Carte implements Comparable <Carte> {
	protected Type type; 
	
	public enum Type { FEU, ESSENCE, CREVAISON, ACCIDENT}
	
	protected Probleme(int nombre, Type type) {
		super(nombre);
		this.type = type;
	}

	public Type getType() {
		return type;
	}	
	
	@Override 
	public boolean equals(Object obj) {
		if(obj instanceof Carte) {
			Probleme p = (Probleme) obj;
			return type.equals(p.type);
		}
		return false;
	}
}
