package pattern.factory;

import pattern.factory.impl.HpCreator;
import pattern.factory.impl.MpCreator;
import pattern.factory.lib.Product;
import pattern.factory.lib.ProductCreator;

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
