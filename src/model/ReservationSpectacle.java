package model;

public class ReservationSpectacle extends Reservation {
	private int numZone;
	private int numPlace;

	protected ReservationSpectacle(int jour, int mois, int numZone, int numPlace) {
		super(jour, mois);
		this.numZone = numZone;
		this.numPlace = numPlace;
	}
	
	public String toString() {
		StringBuilder chaine = new StringBuilder();
		chaine.append("Le " + jour + "/" + mois + "\nPlace n°" + numPlace +  " dans la zone " + numZone);
		return chaine.toString();
	}

}
