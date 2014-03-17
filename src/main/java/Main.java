import java.util.Scanner;
import joueur.Joueur;
import util.Couleur;
import java.util.ArrayList;
import pion.Personnage;

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
            boolean colorOk = true;
            while(!colorExist){
                System.out.print("Choisir une couleur : ");
                for(Couleur color : Couleur.values()){
                    if(listJoueur != null){
                        for(Joueur j : listJoueur){
                            if(j.getCouleur().equals(color)){
                                colorOk = false;
                            }
                        }
                        //Si la couleur n'est pas déjà prise alors on l'affiche
                        if(colorOk){
                            System.out.print(nbCouleur + "-" + color.toString() + " ");
                        }
                        colorOk = true;
                    }else{
                        System.out.print(nbCouleur + "-" + color.toString() + " ");
                    }
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
            Joueur jtemp = new Joueur(colorJoueur);
            //On créer les pions personnages
            Personnage pers;
            ArrayList<Personnage> listPers = new ArrayList<Personnage>();
            for(int j=1;j<=7;j++){
                if(j<=3){
                    pers = new Personnage(jtemp.getCouleur(),1);
                    listPers.add(pers);
                }
                if(j>3 && j<=5){
                    pers = new Personnage(jtemp.getCouleur(),2);
                    listPers.add(pers);
                }
                if(j>5 && j<=7){
                    pers = new Personnage(jtemp.getCouleur(),3);
                    listPers.add(pers);
                }                 
            }
            pers = new Personnage(jtemp.getCouleur(),4);
            listPers.add(pers);
            pers = new Personnage(jtemp.getCouleur(),5);
            listPers.add(pers);
            pers = new Personnage(jtemp.getCouleur(),6);
            listPers.add(pers);
            //On ajoute le joueur dans la liste
            //jtemp.setPions(listPers); //ici on affect au joueur en cours sa liste de pions personnages. ATTTENTION : incompatible type !
            listJoueur.add(jtemp);
            
            //System.out.println(listJoueur.toString());
        }
    }
}
