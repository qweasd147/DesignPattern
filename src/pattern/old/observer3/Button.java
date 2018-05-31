package pattern.old.observer3;

import pattern.old.observer3.Observable.Observer;

public class Button{
	private Observable<String> observable;
	
	public Button(){
		observable = new Observable<String>();
	}
	public void addObserver(Observer<String> o){
		observable.addObserver(o);
	}
	
	public void notifyObservers() {
		observable.setChanged();
		observable.notifyObservers(null);
    }
	public void onClick() {
		notifyObservers();
	}
}
