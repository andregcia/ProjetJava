package plateau;

import java.util.Arrays;

import org.hamcrest.Factory;

import pion.SerpentMer;

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
		//tuiles visitables ou non
		initVisitable();
		
		//placement des tuiles de base
		
		//initialise les cases salvatrices
		initSalvatrices();
		
		//placement des serpents initiaux
		initSerpents();
	}

	//TODO
	public void initTuiles(){
		//place les tuiles de façon random
	}

	/**
	 * Créée les serpents et les places aux endroits prévus
	 */
	public void initSerpents(){
		//place les serpents initiaux
		SerpentMer serpent1 = new SerpentMer();
		SerpentMer serpent2 = new SerpentMer();
		SerpentMer serpent3 = new SerpentMer();
		SerpentMer serpent4 = new SerpentMer();
		SerpentMer serpent5 = new SerpentMer();

		tabCases[1][1].ajoutPion(serpent1);
		tabCases[1][11].ajoutPion(serpent2);
		tabCases[5][6].ajoutPion(serpent3);
		tabCases[10][1].ajoutPion(serpent4);
		tabCases[10][11].ajoutPion(serpent5);
	}

	//TODO
	public void initVisitable(){
		// initialise toutes les cases en visitables
		for(int i = 0; i < 12; i++){
			for(int j = 0; j < 13; i++){
				tabCases[i][j] = Case.getMer();
			}
		}
		
		tabCases[0][0] = Case.getHorsJeu();
		tabCases[0][1] = Case.getHorsJeu();
		tabCases[0][3] = Case.getHorsJeu();
		tabCases[0][9] = Case.getHorsJeu();
		tabCases[0][11] = Case.getHorsJeu();
		tabCases[0][12] = Case.getHorsJeu();
		tabCases[1][0] = Case.getHorsJeu();
		tabCases[1][12] = Case.getHorsJeu();
		tabCases[9][0] = Case.getHorsJeu();
		tabCases[9][12] = Case.getHorsJeu();
		tabCases[10][0] = Case.getHorsJeu();
		tabCases[10][12] = Case.getHorsJeu();
		tabCases[11][1] = Case.getHorsJeu();
		tabCases[11][3] = Case.getHorsJeu();
		tabCases[11][9] = Case.getHorsJeu();
		tabCases[11][11] = Case.getHorsJeu();
	}

	//TODO
	public void initSalvatrices(){
		tabCases[0][2] = Case.getSalvatrice();
		tabCases[1][2] = Case.getSalvatrice();
		
		tabCases[0][10] = Case.getSalvatrice();
		tabCases[1][11] = Case.getSalvatrice();
		
		tabCases[10][1] = Case.getSalvatrice();
		tabCases[11][2] = Case.getSalvatrice();
		
		tabCases[10][10] = Case.getSalvatrice();
		tabCases[10][11] = Case.getSalvatrice();
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
