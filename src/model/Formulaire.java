package model;

public abstract class Formulaire {
	protected int jour;
	protected int mois;
	
	protected Formulaire(int jour, int mois) {
		this.jour = jour;
        this.mois = mois;
	}
	
	public abstract int getJour();
	
	public abstract int getMois();

}
