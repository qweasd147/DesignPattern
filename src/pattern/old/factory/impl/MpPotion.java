package pattern.old.factory.impl;

import pattern.old.factory.lib.Product;

public class MpPotion implements Product{

	protected MpPotion() {}
	
	@Override
	public void use() {
		System.out.println("mp Potion");
	}


}
