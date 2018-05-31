package pattern.old.observer2;

import java.util.Observable;

public class Button extends Observable{

		public void onClick(){
			//알려줌
			setChanged();
			notifyObservers();
			
		}
	
}
