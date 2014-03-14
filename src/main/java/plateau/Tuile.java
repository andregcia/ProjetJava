package plateau;

public class Tuile {

	//type de tuile (plage, foret, montagne)
	private int environnement;
	//effet au verso de la tuile
	private Verso verso;
	
	public Tuile(int e, Verso tv){
		environnement = e;
		verso = tv;
	}

	
	
	@Override
	public String toString() {
		return "Tuile [environnement=" + environnement + ", verso=" + verso
				+ "]";
	}



	public int getEnvironnement() {
		return environnement;
	}

	public void setEnvironnement(int environnement) {
		this.environnement = environnement;
	}

	public Verso getVerso() {
		return verso;
	}

	public void setVerso(Verso verso) {
		this.verso = verso;
	}
}
