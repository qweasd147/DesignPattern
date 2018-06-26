package pattern.state.base;

public class ConcreteStateB implements State{

    @Override
    public void handle() {
        System.out.println("handle ConcreteState B");
    }
}
