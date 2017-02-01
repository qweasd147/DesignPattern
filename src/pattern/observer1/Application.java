package pattern.observer1;

import pattern.observer1.Button.OnClickListener;

public class Application {

	public static void main(String[] args) {

		Button button = new Button();

		//방법 1
		button.setOnClickListener(new ButtonClick());
		button.onClick();
		
		//방법2
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(Button button) {
				System.out.println(button+"is clicked 2");
			}

		});
		button.onClick();
		
		//방법3
		button.setOnClickListener((b)->{
			System.out.println(b+"is clicked 3");
        });
		button.onClick();
	}
}

class ButtonClick implements OnClickListener {

	@Override
	public void onClick(Button button) {
		System.out.println(button + "is Clicked 1");
	}

}