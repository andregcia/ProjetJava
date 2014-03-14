package pion;

public class Personnage extends Pion implements Nourriture{

	//couleur correspondant au joueur
	private int couleur;
	//valeur du pion personnage (de 1 à 6)
	private int valeur;
	//statut (terre, mer, bateau)
	private int statut;
	
	public Personnage(int c, int val){
		couleur=c;
		valeur=val;
		statut=0; //par defaut
	}

	//TODO
	public void deplacer(){
		
	}
	
	
	//TODO
	public int sauver(){
		return valeur;
	}
	
	
	
	@Override
	public String toString() {
		return "Personnage [couleur=" + couleur + ", valeur=" + valeur
				+ ", statut=" + statut + "]";
	}


	
	public int getCouleur() {
		return couleur;
	}

	public void setCouleur(int couleur) {
		this.couleur = couleur;
	}

	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}

	public int getStatut() {
		return statut;
	}

	public void setStatut(int statut) {
		this.statut = statut;
	}	
}