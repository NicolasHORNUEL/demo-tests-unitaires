package dev.utils;

public class Maison {

	private Piece[] tab = new Piece[0]; 
	
	public void ajouterPiece(Piece piece) {
		if ( piece != null && piece.getSuperficie()>0 && piece.getEtage()>=0 ) {
			Piece[] newTab = new Piece[tab.length+1];
			newTab[tab.length] = piece;
			for (int i = 0; i < tab.length; i++) {
				newTab[i] = tab[i];			
			}
			tab = newTab;
		}
	}
	
	public double getSuperficieTotale() {
		double superficieTotale = 0.0;
		for (int i = 0; i < tab.length; i++) {
			superficieTotale += tab[i].getSuperficie();			
		}
		return superficieTotale;
	}
	
	public double getSuperficieParEtage(int etage) {
		double superficieParEtage = 0.0;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i].getEtage()==etage) {
				superficieParEtage += tab[i].getSuperficie();			
			}
		}
		return superficieParEtage;
	}

	public double getSuperficieParType(String typePiece) {
		double superficieParType = 0.0;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i].getClass().getSimpleName()==typePiece) {
				superficieParType += tab[i].getSuperficie();			
			}
		}
		return Math.round(superficieParType * 100.0) / 100.0;
	} 
	
	public int getNombreParType(String typePiece) {
		int nombreParType = 0;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i].getClass().getSimpleName()==typePiece) {
				nombreParType += 1;			
			}
		}
		return nombreParType;
	}  
	
	public Piece[] getTab() {
		return tab;
	}

	public void setTab(Piece[] tab) {
		this.tab = tab;
	}
	
	
}
