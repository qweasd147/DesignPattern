package pattern.command.base;

public class Invoker {

    private Command command;

    public Invoker() {}

    public Invoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void invoke(){
        //좀 더 구체화된 액션
        if(command != null)
            command.execute();
    }
}
