package cartes;

public class Borne extends Carte {
	private Integer km;
	
	public Borne(int nombre, int km) {
		super(nombre);
		this.km = km;
	}
	
	@Override
	public String toString() {
		return "Carte "+km+"km/h";
	}
	
	public int getKm() {
		return km;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Borne) {
			Borne b = (Borne) obj;
			return km.equals(b.getKm());
		}
		return false;
	}
}
