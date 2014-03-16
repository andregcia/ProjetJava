package Main;

import java.util.Scanner;

public class Main {
        
    //Début du jeu 
    
    

    public static void main(String[] args) {
        
        //On pose la question du nombre de joueur
        int nbJoueur = 0;
        System.out.println("prout");
        while(nbJoueur < 2 || nbJoueur > 4){
            Scanner sc=new Scanner(System.in);
            System.out.println("Combien de joueur êtes-vous ? ");
            String saisieNb=sc.nextLine();
            
            if(saisieNb.length() > 0){
                nbJoueur = Integer.parseInt(saisieNb); 
            }else{
                System.out.println("Il faut saisir un nombre.");
            }
                      
        }
    }
}
