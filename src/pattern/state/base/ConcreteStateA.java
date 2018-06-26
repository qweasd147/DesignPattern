package pattern.state.base;

public class ConcreteStateA implements State{

    @Override
    public void handle() {
        System.out.println("handle ConcreteState A");
    }
}
