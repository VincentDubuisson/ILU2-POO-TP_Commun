package model;

public class FormulaireRestaurant extends Formulaire {
	private int nbPersons;
	private int numService;
	private int identification;
	
	public FormulaireRestaurant(int jour, int mois, int nbPersons, int numService) {
		super(jour, mois);
		this.nbPersons = nbPersons;
		this.numService = numService;
	}
	
	public int getJour() {
		return jour;
	}
	
	public int getMois() {
		return mois;
	}
	
	public int getNombrePersonnes() {
		return nbPersons;
	}
	
	public int getNumService() {
		return numService;
	}
	
	public int getIdentificationEntite() {
		return identification;
	}
	
	public void setIdentificationEntite(int id) {
		this.identification = id;
	}

}
