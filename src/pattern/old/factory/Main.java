package pattern.old.factory;

import pattern.old.factory.impl.HpCreator;
import pattern.old.factory.impl.MpCreator;
import pattern.old.factory.lib.Product;
import pattern.old.factory.lib.ProductCreator;

public class Main {

	public static void main(String[] args) {
		ProductCreator creator;
		Product product;
		
		creator = new HpCreator();
		product = creator.create();
		product.use();
		
		creator = new MpCreator();
		product = creator.create();
		product.use();
		
		
	}

}
