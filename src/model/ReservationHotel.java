package model;

public class ReservationHotel extends Reservation {
	private int nbLitsSimples;
	private int nbLitsDoubles;
	private int numChambre;

	protected ReservationHotel(int jour, int mois, int nbLitsSimples, int nbLitsDoubles, int numChambre) {
		super(jour, mois);
		this.nbLitsSimples = nbLitsSimples;
		this.nbLitsDoubles = nbLitsDoubles;
		this.numChambre = numChambre;
	}
	
	public String toString() {
		StringBuilder chaine = new StringBuilder();
		chaine.append("Le " + jour + "/" + mois + "\n" + nbLitsSimples +  " lit(s) simple(s) et " + nbLitsDoubles);
		chaine.append(" lit(s) double(s) chambre n°" + numChambre);
		return chaine.toString();
	}

}
