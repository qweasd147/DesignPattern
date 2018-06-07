package pattern.command.base;

public class ConcreteCommand implements Command{

    private Receiver receiver;

    public
    ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        if(receiver != null)
            receiver.action();
    }

    @Override
    public void undo() {

    }
}
