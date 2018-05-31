package pattern.factory.base;

public abstract class Creator {

    //제품을 만들어주는 메소드는 추상 메소드로 구현
    protected abstract Product create();

    public void anOperation(){
        //product로 원하는 일을 하기 위한 메소드
        Product product= create();

        //TODO : handle product
        product.use();
    }

}
