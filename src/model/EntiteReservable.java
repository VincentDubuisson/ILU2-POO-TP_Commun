package model;

public class EntiteReservable<T extends Formulaire> {
	private T formulaire;
	private CalendrierAnnuel calendrier;
	private int numIdendtification;
	
	public EntiteReservable(T formulaire) {
		this.formulaire = formulaire;
		this.calendrier = new CalendrierAnnuel();
	}
	
	public int getNumeroIdentification() {
		return numIdendtification;
	}
	
	public void setNumeroIdentification(int numId) {
		numIdendtification = numId;
	}
	
	public boolean estLibre() {
		return calendrier.estLibre(formulaire.jour, formulaire.mois);
	}
}
