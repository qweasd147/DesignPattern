package pattern.adapter.base;

public class Adapter implements Target{

    private Adaptee adaptee;

    public Adapter(){
        this.adaptee = new Adaptee();
    }

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        //단순 위임이 아니라 반환값이 있으면 알맞게 핸들링 해야함
        adaptee.specificRequest();
    }
}
