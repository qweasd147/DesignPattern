package pattern.state.base;

public class Context {

    private State nowState = new ConcreteStateA();

    public void request(){
        nowState.handle();

        if(nowState instanceof ConcreteStateA)
            nowState = new ConcreteStateB();
        else
            nowState = new ConcreteStateA();
    }

    public void setNowState(State state){
        this.nowState = state;
    }
}
