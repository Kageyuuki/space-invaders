package fr.unilim.iut.spaceinvaders.models;

public class Vaisseau {

	int x;
	int y;

	public Vaisseau(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public boolean occupeLaPosition(int x, int y) {
		return (this.x==x) && (this.y==y);
	}
	
	public void seDeplacerVersLaDroite() {
	      this.x = this.x + 1 ;
 }
	
	public int abscisse() {
        return this.x;
	}

	public void seDeplacerVersLaGauche() {
		// TODO Auto-generated method stub
		this.x = this.x - 1 ;
	}
	
	
}
