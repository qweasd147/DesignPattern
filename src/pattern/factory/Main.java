package pattern.factory;

import pattern.factory.impl.HpCreator;
import pattern.factory.lib.Item;
import pattern.factory.lib.ItemCreator;

public class Main {

	public static void main(String[] args) {
		ItemCreator creator;
		Item item;
		
		creator = new HpCreator();
		item = creator.create();
		item.use();
		
	}

}
