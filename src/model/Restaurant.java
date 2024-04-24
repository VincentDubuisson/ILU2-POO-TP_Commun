package model;

public class Restaurant {
	
	public Restaurant() {
		
	}
	
	
	// CLASSE INTERNE
	public class Table extends EntiteReservable<FormulaireRestaurant> {
		private int nbChaises;
		private CalendrierAnnuel calendrierDeuxiemeService = new CalendrierAnnuel();
		
		public Table(int nbChaises) {
			super(calendrier);
			this.nbChaises = nbChaises;
		}
		
		public Reservation reserver(FormulaireRestaurant formulaireRestaurant) {
			return new ReservationRestaurant(formulaireRestaurant.getJour(), formulaireRestaurant.getMois(),
					formulaireRestaurant.getNumService(), formulaireRestaurant.getNombrePersonnes());
		}
		
		public boolean compatible(FormulaireRestaurant formulaireRestaurant) {
			int nbPersons = formulaireRestaurant.getNombrePersonnes();
			int jour = formulaireRestaurant.getJour();
			int mois = formulaireRestaurant.getMois();
			int service = formulaireRestaurant.getNumService();
			
			if (nbChaises == nbPersons || nbChaises+1 == nbPersons) {
				;
			}
			return true;
		}

	}

}
