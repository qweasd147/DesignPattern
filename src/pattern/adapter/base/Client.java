package pattern.adapter.base;

public class Client {

    public static void main(String[] args) {

        Target target = new Adapter();

        target.request();   //내부적으로는 Adaptee 클래스를 쓰겠지만 client 입장에선 상관없음
    }

}
