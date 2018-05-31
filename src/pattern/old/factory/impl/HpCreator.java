package pattern.old.factory.impl;

import java.util.Date;

import pattern.old.factory.lib.Product;
import pattern.old.factory.lib.ProductCreator;

public class HpCreator extends ProductCreator{
	
	@Override
	protected void requestItemsInfo() {
		System.out.println("체력 회복 물약 정보를 가져옴");
	}

	@Override
	protected void createItemLog() {
		System.out.println("체력 생성 시간 기록 "+new Date());
	}

	@Override
	protected Product createItem() {
		return new HpPotion();
	}


}
