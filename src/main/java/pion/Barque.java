package pion;

import java.util.ArrayList;

public class Barque extends Pion implements Nourriture{

	//Personnages présents dans la barque
	ArrayList<Personnage> passagers;
	
	public Barque(){
		passagers=new ArrayList<Personnage>(3); //3 passagers max
	}
	
	
	//TODO
	public void deplacer(){
		
	}
	
	//TODO
	public boolean verifierControle(int c){
		return true;
	}


	
	@Override
	public String toString() {
		return "Barque [passagers=" + passagers + "]";
	}


	public ArrayList<Personnage> getPassagers() {
		return passagers;
	}


	public void setPassagers(ArrayList<Personnage> passagers) {
		this.passagers = passagers;
	}
}