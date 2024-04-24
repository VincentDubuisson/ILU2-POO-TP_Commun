package model;

public abstract class EntiteReservable <F extends Formulaire> {
	protected CalendrierAnnuel calendrier = new CalendrierAnnuel();
	protected int numIdendtification;
	
	public int getNumeroIdentification() {
		return numIdendtification;
	}
	
	public void setNumeroIdentification(int numId) {
		this.numIdendtification = numId;
	}
	
	public boolean estLibre(F formulaire) {
		int jour = formulaire.getJour();
		int mois = formulaire.getMois();
		return calendrier.estLibre(jour, mois);
	}
	
	public abstract boolean compatible(F formulaire);
	
	public abstract Reservation reserver(F formulaire);
}
