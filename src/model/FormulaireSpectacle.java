package model;

public class FormulaireSpectacle extends Formulaire{
	private int numZone;
	private int identification = 0;
	
	public FormulaireSpectacle(int jour, int mois, int numZone) {
		super(jour, mois);
		this.numZone = numZone;
	}
	
	public int getJour() {
		return jour;
	}
	
	public int getMois() {
		return mois;
	}
	
	public int getNumeroZone() {
		return numZone;
	}
	
	public int getIdentificationEntite() {
		return identification;
	}
	
	public void setIdentificationEntite(int id) {
		identification = id;
	}

}
