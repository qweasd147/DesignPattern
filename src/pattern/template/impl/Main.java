package pattern.template.impl;

import pattern.template.AbstGameConnectHelper;

public class Main {
	public static void main(String[] args) {
		AbstGameConnectHelper helper = new DefaultGameConnertHelpwer();
		
		helper.requestConnection("디폴트");
	}
}
