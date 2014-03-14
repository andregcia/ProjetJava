package joueur;

import java.util.ArrayList;

import pion.Nourriture;
import pion.Pion;

public class Joueur {

	//couleur du joueur
	private int couleur;
	//score du joueur, cumulé grâce à la valeur de chaque pion personnage
	private int score;
	//liste des pions controlés par le joueur (personnage, bateau)
	private ArrayList<Nourriture> pions;
	//liste des tuiles possédées par le joueur dans sa main
	private ArrayList<TuileVerso> main;
	
	public Joueur(int c){
		couleur=c;
		score=0;
		pions=new ArrayList<Nourriture>();
		main=new ArrayList<TuileVerso>();
	}

	//TODO
	public void jouer(){
		//methode generale composant le tour d'un joueur
		//appelle les différentes méthodes composant un tour
	}
	
	//TODO
	public void deplacerPion(){
		//deplacement de pion
	}
	
	//TODO
		public void retirerPion(){
			//suppression de pion
		}
	
	//TODO
	public void jouerTuile(int choix){
		//utilisation d'une tuile de la main
	}
	
	//TODO
	public TuileVerso retirerTuile(){
		//retire une tuile du plateau 
		//retourne la TuileVerso correspondante
	}
	
	//TODO
	public Pion jouerDe(){
		//methode random dé
		return test;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Joueur [couleur=" + couleur + ", score=" + score + ", pions="
				+ pions + "]";
	}


	public int getCouleur() {
		return couleur;
	}


	public void setCouleur(int couleur) {
		this.couleur = couleur;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}


	public ArrayList<Nourriture> getPions() {
		return pions;
	}


	public void setPions(ArrayList<Nourriture> pions) {
		this.pions = pions;
	}


	public ArrayList<TuileVerso> getMain() {
		return main;
	}


	public void setMain(ArrayList<TuileVerso> main) {
		this.main = main;
	}
}
