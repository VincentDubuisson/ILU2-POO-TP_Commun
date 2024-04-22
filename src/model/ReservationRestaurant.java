package model;

public class ReservationRestaurant extends Reservation {
	private int jour;
	private int mois;
	private int numService;
	private int numTable;

	protected ReservationRestaurant(int jour, int mois, int numService, int numTable) {
		super(jour, mois);
		this.jour = jour;
		this.mois = mois;
		this.numService = numService;
		this.numTable = numTable;
	}
	
	public String toString() {
		StringBuilder chaine = new StringBuilder();
		chaine.append("Le " + jour + "/" + mois + "\nTable " + numTable + " pour le ");
		if (numService == 1) {
			chaine.append("premier service.");
		} else if (numService == 2) {
			chaine.append("deuxième service.");
		}
		return chaine.toString();
	}

}
