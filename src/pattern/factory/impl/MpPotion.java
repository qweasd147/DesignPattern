package pattern.factory.impl;

import pattern.factory.lib.Product;

public class MpPotion implements Product{

	protected MpPotion() {}
	
	@Override
	public void use() {
		System.out.println("mp Potion");
	}


}
