package plateau;

public class Verso {

	//type d'effet à jouer
	private int type;
	//action à réaliser
	private int action;
	
	
	public Verso(int t, int a){
		type = t;
		action = a;
	}

	
	//TODO
	public void creation(int a){
		
	}
	
	//TODO
	public void protection(int a){
			
	}
		
	//TODO
	public void mouvement(int a){
			
	}
	
	
	@Override
	public String toString() {
		return "Verso [type=" + type + ", action=" + action + "]";
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getAction() {
		return action;
	}

	public void setAction(int action) {
		this.action = action;
	}
}
