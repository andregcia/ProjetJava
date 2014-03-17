package plateau;

import java.util.ArrayList;
import java.util.Arrays;
import pion.Constantes;

import util.Creation;
import util.Environnement;
import util.Mouvement;
import util.Protection;
import util.TypeEffet;

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
		
		this.initTuiles();
		
		//tuiles non visitables, salvatrices
		//placement des serpents initiaux
		initSerpents();
	}
	
	//place les tuiles de façon aléatoire 
	public void initTuiles(){
		//initialisation des Tuiles
		Tuile touteTuile [] = new Tuile [40]; 
		//les 16 tuiles plages
		touteTuile[0] = new Tuile (Environnement.PLAGE, new Verso(TypeEffet.DIRECT,Creation.BALEINE));
		touteTuile[1] = new Tuile (Environnement.PLAGE, new Verso(TypeEffet.DIRECT,Creation.BALEINE));
		touteTuile[2] = new Tuile (Environnement.PLAGE, new Verso(TypeEffet.DIRECT,Creation.BALEINE));
		touteTuile[3] = new Tuile (Environnement.PLAGE, new Verso(TypeEffet.DIRECT,Creation.BALEINE));
		touteTuile[4] = new Tuile (Environnement.PLAGE, new Verso(TypeEffet.DIRECT,Creation.REQUIN));
		touteTuile[5] = new Tuile (Environnement.PLAGE, new Verso(TypeEffet.DIRECT,Creation.REQUIN));
		touteTuile[6] = new Tuile (Environnement.PLAGE, new Verso(TypeEffet.DIRECT,Creation.REQUIN));
		touteTuile[7] = new Tuile (Environnement.PLAGE, new Verso(TypeEffet.DEBUT_TOUR,Mouvement.BARQUE));
		touteTuile[8] = new Tuile (Environnement.PLAGE, new Verso(TypeEffet.DEBUT_TOUR,Mouvement.BARQUE));
		touteTuile[9] = new Tuile (Environnement.PLAGE, new Verso(TypeEffet.DEBUT_TOUR,Mouvement.NAGEUR));
		touteTuile[10] = new Tuile (Environnement.PLAGE, new Verso(TypeEffet.DEBUT_TOUR,Mouvement.NAGEUR));
		touteTuile[11] = new Tuile (Environnement.PLAGE, new Verso(TypeEffet.DEBUT_TOUR,Mouvement.NAGEUR));
		touteTuile[12] = new Tuile (Environnement.PLAGE, new Verso(TypeEffet.DEBUT_TOUR,Mouvement.SERPENT));
		touteTuile[13] = new Tuile (Environnement.PLAGE, new Verso(TypeEffet.DEBUT_TOUR,Mouvement.REQUIN));
		touteTuile[14] = new Tuile (Environnement.PLAGE, new Verso(TypeEffet.DEBUT_TOUR,Mouvement.BALEINE));
		touteTuile[15] = new Tuile (Environnement.PLAGE, new Verso(TypeEffet.PROTECTION,Protection.REQUIN));
		 
		//les 16 tuiles forêts
		touteTuile[16] = new Tuile (Environnement.FORET, new Verso(TypeEffet.DIRECT,Creation.BARQUE));
		touteTuile[17] = new Tuile (Environnement.FORET, new Verso(TypeEffet.DIRECT,Creation.BARQUE));
		touteTuile[18] = new Tuile (Environnement.FORET, new Verso(TypeEffet.DIRECT,Creation.BARQUE));
		touteTuile[19] = new Tuile (Environnement.FORET, new Verso(TypeEffet.DIRECT,Creation.BALEINE));
		touteTuile[20] = new Tuile (Environnement.FORET, new Verso(TypeEffet.DIRECT,Creation.BALEINE));
		touteTuile[21] = new Tuile (Environnement.FORET, new Verso(TypeEffet.DIRECT,Creation.REQUIN));
		touteTuile[22] = new Tuile (Environnement.FORET, new Verso(TypeEffet.DIRECT,Creation.REQUIN));
		touteTuile[23] = new Tuile (Environnement.FORET, new Verso(TypeEffet.DIRECT,Creation.TOURBILLON));
		touteTuile[24] = new Tuile (Environnement.FORET, new Verso(TypeEffet.DIRECT,Creation.TOURBILLON));
		touteTuile[25] = new Tuile (Environnement.FORET, new Verso(TypeEffet.DEBUT_TOUR,Mouvement.NAGEUR));
		touteTuile[26] = new Tuile (Environnement.FORET, new Verso(TypeEffet.DEBUT_TOUR,Mouvement.SERPENT));
		touteTuile[27] = new Tuile (Environnement.FORET, new Verso(TypeEffet.DEBUT_TOUR,Mouvement.REQUIN));
		touteTuile[28] = new Tuile (Environnement.FORET, new Verso(TypeEffet.DEBUT_TOUR,Mouvement.BALEINE));
		touteTuile[29] = new Tuile (Environnement.FORET, new Verso(TypeEffet.PROTECTION,Protection.REQUIN));
		touteTuile[30] = new Tuile (Environnement.FORET, new Verso(TypeEffet.PROTECTION,Protection.BALEINE));
		touteTuile[31] = new Tuile (Environnement.FORET, new Verso(TypeEffet.PROTECTION,Protection.BALEINE));
		 
		//les 8 tuiles montagnes
		touteTuile[32] = new Tuile (Environnement.MONTAGNE, new Verso(TypeEffet.DIRECT,Creation.REQUIN));
		touteTuile[33] = new Tuile (Environnement.MONTAGNE, new Verso(TypeEffet.DIRECT,Creation.TOURBILLON));
		touteTuile[34] = new Tuile (Environnement.MONTAGNE, new Verso(TypeEffet.DIRECT,Creation.TOURBILLON));
		touteTuile[35] = new Tuile (Environnement.MONTAGNE, new Verso(TypeEffet.DIRECT,Creation.TOURBILLON));
		touteTuile[36] = new Tuile (Environnement.MONTAGNE, new Verso(TypeEffet.DIRECT,Creation.TOURBILLON));
		touteTuile[37] = new Tuile (Environnement.MONTAGNE, new Verso(TypeEffet.DIRECT,Creation.VOLCAN));
		touteTuile[38] = new Tuile (Environnement.MONTAGNE, new Verso(TypeEffet.PROTECTION,Protection.BALEINE));
		touteTuile[39] = new Tuile (Environnement.MONTAGNE, new Verso(TypeEffet.PROTECTION,Protection.REQUIN));
		
		//classe coordonnee pour créer les coordonnées de l'ile manuellement et les stocker dans une arraylist de coordonnées
		class Coordonnee
		{
			int abs;
			int ord;
			
			public Coordonnee (int a, int o)
			{
				this.abs = a;
				this.ord = o;
			}
		}
		
		ArrayList <Coordonnee> listeCase = new ArrayList<Coordonnee>();
		
		listeCase.add(new Coordonnee (4,9));
		listeCase.add(new Coordonnee (5,9));
		listeCase.add(new Coordonnee (6,9));
		listeCase.add(new Coordonnee (7,9));
		listeCase.add(new Coordonnee (3,8));
		listeCase.add(new Coordonnee (4,8));
		listeCase.add(new Coordonnee (5,8));
		listeCase.add(new Coordonnee (6,8));
		listeCase.add(new Coordonnee (7,8));
		listeCase.add(new Coordonnee (2,7));
		
		listeCase.add(new Coordonnee (3,7));
		listeCase.add(new Coordonnee (4,7));
		listeCase.add(new Coordonnee (5,7));
		listeCase.add(new Coordonnee (6,7));
		listeCase.add(new Coordonnee (7,7));
		listeCase.add(new Coordonnee (8,7));
		listeCase.add(new Coordonnee (9,7));
		listeCase.add(new Coordonnee (2,6));
		listeCase.add(new Coordonnee (3,6));
		listeCase.add(new Coordonnee (4,6));

		listeCase.add(new Coordonnee (6,6));
		listeCase.add(new Coordonnee (7,6));
		listeCase.add(new Coordonnee (8,6));
		listeCase.add(new Coordonnee (2,5));
		listeCase.add(new Coordonnee (3,5));
		listeCase.add(new Coordonnee (4,5));
		listeCase.add(new Coordonnee (5,5));
		listeCase.add(new Coordonnee (6,5));
		listeCase.add(new Coordonnee (7,5));
		listeCase.add(new Coordonnee (8,5));
		
		listeCase.add(new Coordonnee (9,5));
		listeCase.add(new Coordonnee (3,4));
		listeCase.add(new Coordonnee (4,4));
		listeCase.add(new Coordonnee (5,4));
		listeCase.add(new Coordonnee (6,4));
		listeCase.add(new Coordonnee (7,4));
		listeCase.add(new Coordonnee (4,3));
		listeCase.add(new Coordonnee (5,3));
		listeCase.add(new Coordonnee (6,3));
		listeCase.add(new Coordonnee (7,3));
		
		int j = 39; //39 est le nombre de cases de l'ile de départ -1 car l'index de la liste de coordonnées va de 0 a 39
		//j va permettre de faire un math.random()
		int k; //resultat du math.random()
		Coordonnee coord; //variable pour recupérer les coordonnées de la case sélectionnée par lem ath.random()
		Case[][] plateau = this.getTabCases();
				
		//placement des tuiles de manières aléatoires
		for (int i = 0; i < 40; i ++)
		{
			k = (int)(Math.random()*j); //fais un random de 0 à j
			coord = listeCase.get(k); // recupere les coordonnées issue du random
			this.tabCases[coord.abs][coord.ord].setTuile(touteTuile[i]); //initialise la tuile i à la case pour laquelle les coordonnées ont été tirées au hasard
			listeCase.remove(k); //supprime les coordonnées issues du random
			j--;
		}
		
		this.setTabCases(plateau);
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
			for(int j = 0; j < 13; j++){
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
