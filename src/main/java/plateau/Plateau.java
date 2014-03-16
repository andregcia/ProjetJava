package plateau;

import java.util.Arrays;
import pion.Constantes;

public class Plateau {

	//plateau de jeu
	private Case[][] tabCases;
	
	//TODO singleton ?
	public Plateau(){
		tabCases = new Case[12][13];
	}
	
	//TODO
	//threader l'initialisation du jeu ?
	
	//TODO
	public void init(){
		//initialisation du jeu
		//placement des tuiles de base
		//tuiles non visitables, salvatrices
		//placement des serpents initiaux
	}
	
	//TODO
	public void initTuiles(){
		//place les tuiles de façon random
	}
	
	//TODO
	public void initSerpents(){
		//place les serpents initiaux
	}
	
	//TODO
	public void initVisitable(){
		//initialise les tuiles non visitables dans les coins
	}
	
	//TODO
	public void initSalvatrices(){
		//initialise les tuiles des iles salvatrices
	}


	@Override
	public String toString() {
		return "Plateau [tabCases=" + Arrays.toString(tabCases) + "]";
	}


	public Case[][] getTabCases() {
		return tabCases;
	}


	public void setTabCases(Case[][] tabCases) {
		this.tabCases = tabCases;
	}
}
