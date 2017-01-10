package pattern.factory.impl;

import pattern.factory.lib.Item;

public class HpPotion implements Item{

	@Override
	public void use() {
		System.out.println("hp Potion");
	}


}
