package pattern.old.factory.lib;

public abstract class ProductCreator {
	
	
	public Product create(){
		Product product = null;
		
		requestItemsInfo();
		product = createItem();
		createItemLog();
		
		return product;
	}
	
	//아이템을 생성하기 전에 데이터 베이스에서 아이템 정보를 요청
	abstract protected void requestItemsInfo();
	//아이템을 생성 후 아이템 복제 등의 불법을 방지하기 위해 데이터 베이스에서 생성 정보를 남김
	abstract protected void createItemLog();
	//아이템을 생성하는 알고리즘
	abstract protected Product createItem();
}
