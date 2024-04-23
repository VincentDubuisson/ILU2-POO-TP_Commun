package model;

public class FormulaireHotel extends Formulaire {
	private int nbLitsSimples;
	private int nbLitsDoubles;
	private int identification = 0;
	
	public FormulaireHotel(int jour, int mois, int nbLitsSimples, int nbLitsDoubles) {
		super(jour, mois);
		this.nbLitsSimples = nbLitsSimples;
		this.nbLitsDoubles = nbLitsDoubles;
	}
	
	public int getJour() {
		return jour;
	}
	
	public int getMois() {
		return mois;
	}
	
	public int getNombreLitsSimples() {
		return nbLitsSimples;
	}
	
	public int getNombreLitsDoubles() {
		return nbLitsDoubles;
	}
	
	public int getIdentificationEntite() {
		return identification;
	}
	
	public void setIdentificationEntite(int id) {
		identification = id;
	}

}
