package pattern.old.factory.impl;

import pattern.old.factory.lib.Product;

public class HpPotion implements Product{

	protected HpPotion() {}
	
	@Override
	public void use() {
		System.out.println("hp Potion");
	}


}
