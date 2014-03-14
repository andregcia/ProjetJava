package util;

//TODO enum plutot que constantes ? 
public abstract class Constantes {
	
	//couleurs des pions personnage, et des joueurs
	public static final int VERT = 1;
	public static final int BLEU = 2;
	public static final int ROUGE = 3;
	public static final int JAUNE = 4;
	
	//statuts des pions personnages
	public static final int TERRE = 1;
	public static final int MER = 2;
	public static final int EMBARQUE = 3;
	
	//environnements, type de tuile
	public static final int PLAGE = 1;
	public static final int FORET = 2;
	public static final int MONTAGNE = 3;
	
	//types d'effet verso
		//à jouer immédiatement
	public static final int DIRECT = 1; 
		//à jouer au début du tour de son choix
	public static final int DEBUT_TOUR = 2; 
		//protège un de nos pions, à jouer quand on est menacé
	public static final int PROTECTION = 3;
	
	//actions verso
		//creation
	public static final int CREA_BALEINE = 1;
	public static final int CREA_REQUIN = 2;
	public static final int CREA_SERPENT = 3;
	public static final int CREA_TOURBILLON = 4;
	public static final int CREA_VOLCAN = 5;
		//mouvement
	public static final int MVMT_BARQUE = 1;
	public static final int MVMT_NAGEUR = 2;
	public static final int MVMT_BALEINE = 3;
	public static final int MVMT_REQUIN = 4;
	public static final int MVMT_SERPENT = 5;
		//protection
	public static final int PROTECT_BALEINE = 1;
	public static final int PROTECT_REQUIN = 2;
}
