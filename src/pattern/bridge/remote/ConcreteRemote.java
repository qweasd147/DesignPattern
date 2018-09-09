package pattern.bridge.remote;

public class ConcreteRemote extends RemoteControl{

    public ConcreteRemote(TV tvImplementor) {
        super(tvImplementor);
    }
}
