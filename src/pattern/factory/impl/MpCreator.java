package pattern.factory.impl;

import java.util.Date;

import pattern.factory.lib.Product;
import pattern.factory.lib.ProductCreator;

public class MpCreator extends ProductCreator{

	@Override
	protected void requestItemsInfo() {
		System.out.println("마력 회복 물약 정보를 가져옴");
	}

	@Override
	protected void createItemLog() {
		System.out.println("마력 생성 시간 기록 "+new Date());
	}

	@Override
	protected Product createItem() {
		return new MpPotion();
	}


}
