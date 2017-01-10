package pattern.factory.impl;

import pattern.factory.lib.Item;

public class MpPotion implements Item{

	@Override
	public void use() {
		System.out.println("mp Potion");
	}


}
