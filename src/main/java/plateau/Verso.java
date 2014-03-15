package plateau;

import util.Action;
import util.TypeEffet;

public class Verso {

	//type d'effet à jouer
	private TypeEffet type;
	//action à réaliser
	private Action action;
	
	
	public Verso(TypeEffet t, Action a){
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

	public TypeEffet getType() {
		return type;
	}

	public void setType(TypeEffet type) {
		this.type = type;
	}

	public Action getAction() {
		return action;
	}

	public void setAction(Action action) {
		this.action = action;
	}
}
