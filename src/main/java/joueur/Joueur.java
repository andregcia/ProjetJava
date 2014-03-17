package joueur;

import java.util.ArrayList;

import pion.Nourriture;
import pion.Pion;
import plateau.Verso;
import util.Couleur;

public class Joueur {

	//couleur du joueur
	private Couleur couleur;
	//score du joueur, cumulé grâce à la valeur de chaque pion personnage
	private int score;
	//liste des pions controlés par le joueur (personnage, bateau)
	private ArrayList<Nourriture> pions;
	//liste des tuiles possédées par le joueur dans sa main
	private ArrayList<Verso> main;
	
	public Joueur(Couleur c){
		couleur=c;
		score=0;
		pions=new ArrayList<Nourriture>();
		main=new ArrayList<Verso>();
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
	public Verso retirerTuile(){
		//retire une tuile du plateau 
		//retourne la TuileVerso correspondante
		return test;
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


	public Couleur getCouleur() {
		return couleur;
	}


	public void setCouleur(Couleur couleur) {
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


	public ArrayList<Verso> getMain() {
		return main;
	}


	public void setMain(ArrayList<Verso> main) {
		this.main = main;
	}
}
