package plateau;

import util.Environnement;

public class Tuile {

	//type de tuile (plage, foret, montagne)
	private Environnement environnement;
	//effet au verso de la tuile
	private Verso verso;
	
	public Tuile(Environnement e, Verso tv){
		environnement = e;
		verso = tv;
	}

	
	
	@Override
	public String toString() {
		return "Tuile [environnement=" + environnement + ", verso=" + verso
				+ "]";
	}



	public Environnement getEnvironnement() {
		return environnement;
	}

	public void setEnvironnement(Environnement environnement) {
		this.environnement = environnement;
	}

	public Verso getVerso() {
		return verso;
	}

	public void setVerso(Verso verso) {
		this.verso = verso;
	}
}
