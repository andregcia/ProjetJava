package plateau;

import java.util.ArrayList;

import pion.Bete;
import pion.Pion;

public class Case {

	//la case est-elle visitable (pion)
	private boolean visitable;
	//la case est-elle salvatrice (sauve un personnage)
	private boolean salvatrice;
	//tuile sur cette case, null si mer
	private Tuile tuile;
	//liste des pions présents (0.n persos ou betes, 1 barque)
	private ArrayList<Pion> pions; 
	
	//construction d'objet avec factory, plus rapide
	private Case(boolean v, boolean s, Tuile t){
		visitable = v;
		salvatrice = s;
		tuile = t;
		pions = new ArrayList<Pion>();
	}
	
	
	//création case vide, de mer
	public static Case getMer(){
		return new Case(true, false, null);
	}
	
	//création case hors jeu, non visitable
	public static Case getHorsJeu(){
		return new Case(false, false, null);
	}
	
	//création case mer salvatrice
	public static Case getSalvatrice(){
		return new Case(true, true, null);
	}
	
	//création case d'ile
	public static Case getIle(Tuile t){
		return new Case(true, false, t);
	}

	
	
	
	//TODO
	public Tuile supprimerTuile(){
		//verifier si on peut retirer cette tuile
		return tuile;
	}
	
	//TODO
	public void supprimerPion(Pion p){
		//suppression du pion 
		//si barque, on suppr la barque et on prend le contenu de sa liste de passagers
	}
	
	//TODO
	public void ajoutPion(Pion p){
		//ajout d'un pion
		//si barque, on ajoute le pion à sa liste de passagers (embarquerPion(p);)
		//si barque, pas possible de stocker une barque supplémentaires
		//si bete, verifier si nourriture présente
		if(p instanceof Bete){
			pions.add(p);
		}
	}
	
	//TODO
	public void embarquerPion(Pion p){
		//prendre la barque de la liste de pions
		//ajouter le pion p à la liste de passagers de la barque
	}
	
	
	@Override
	public String toString() {
		return "Case [visitable=" + visitable + ", salvatrice=" + salvatrice
				+ ", tuile=" + tuile + ", pions=" + pions + "]";
	}

	public boolean isVisitable() {
		return visitable;
	}

	public void setVisitable(boolean visitable) {
		this.visitable = visitable;
	}

	public boolean isSalvatrice() {
		return salvatrice;
	}

	public void setSalvatrice(boolean salvatrice) {
		this.salvatrice = salvatrice;
	}

	public Tuile getTuile() {
		return tuile;
	}

	public void setTuile(Tuile tuile) {
		this.tuile = tuile;
	}

	public ArrayList<Pion> getPions() {
		return pions;
	}

	public void setPions(ArrayList<Pion> pions) {
		this.pions = pions;
	}
}
