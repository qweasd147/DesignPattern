package pattern.factory.impl;

import java.util.Date;

import pattern.factory.lib.Item;
import pattern.factory.lib.ItemCreator;

public class HpCreator extends ItemCreator{

	@Override
	protected void requestItemsInfo() {
		System.out.println("체력 회복 물약 정보를 가져옴");
	}

	@Override
	protected void createItemLog() {
		System.out.println("체력 생성 시간 기록 "+new Date());
	}

	@Override
	protected Item createItem() {
		return new HpPotion();
	}


}
