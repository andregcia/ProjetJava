import java.util.Scanner;
import joueur.Joueur;
import util.Couleur;
import java.util.ArrayList;

public class Main {
        
    //Début du jeu 
    

    public static void main(String[] args) {
        
        //On pose la question du nombre de joueur
        Scanner sc=new Scanner(System.in);
        int nbJoueur = 0;
        while(nbJoueur < 2 || nbJoueur > 4){
            
            System.out.print("Combien de joueur êtes-vous ? ");
            String saisieNb=sc.nextLine();
            
            if(saisieNb.length() > 0){
                try{
                    nbJoueur = Integer.parseInt(saisieNb); 
                }catch(NumberFormatException e){
                    System.out.println("Ceci n'est pas un nombre.");
                }
            }else{
                System.out.println("Il faut saisir un nombre.");
            }            
        }
        
        //Choix de la couleur pour chaque joueur
        ArrayList<Joueur> listJoueur = new ArrayList<Joueur>();
        
        for (int i=0;i<nbJoueur;i++){
            //On présente la liste des couleurs
            boolean colorExist = false;
            int nbCouleur = 1;
            Couleur colorJoueur = null;
            while(!colorExist){
                System.out.print("Choisir une couleur : ");
                for(Couleur color : Couleur.values()){
                    System.out.print(nbCouleur + "-" + color.toString() + " ");
                    nbCouleur++;
                }
                System.out.println("");
                System.out.print("Mon choix : ");
                String saisieCouleur=sc.nextLine();
                
                if(saisieCouleur.length() > 0){
                    try{
                        nbCouleur = Integer.parseInt(saisieCouleur);
                        System.out.println(nbCouleur);                                
                    }catch(NumberFormatException e){
                        System.out.println("Ceci n'est pas un nombre.");
                    }
                }else{
                    System.out.println("Il faut saisir le nombre correspondant à la couleur de votre choix.");
                }   
                
                switch(nbCouleur){
                    case 1:
                        colorJoueur = Couleur.VERT;
                        colorExist = true;
                        break;
                    case 2:
                        colorJoueur = Couleur.BLEU;
                        colorExist = true;
                        break;
                    case 3:
                        colorJoueur = Couleur.ROUGE;
                        colorExist = true;
                        break;
                    case 4:
                        colorJoueur = Couleur.JAUNE;
                        colorExist = true;
                        break;
                    default: 
                        colorExist = false;
                        nbCouleur = 1;
                        System.out.println("Le nombre choisi n'existe pas.");
                        break;
                }
            }
            
            //On attribut la couleur au joueur
            listJoueur.add(new Joueur(colorJoueur));
        }
    }
}
