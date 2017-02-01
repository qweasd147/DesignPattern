package pattern.observer2;

import java.util.Observable;
import java.util.Observer;

//제공되는거 사용
public class Application {

	public static void main(String[] args) {
		Button button = new Button();
		
		//옵저버 여러개 일수도 있어서 add
		button.addObserver(new Observer() {
			@Override
			public void update(Observable o, Object arg) {
				System.out.println(o+"is Clicked");
			}
		});

		
		button.onClick();
		
	}
}
