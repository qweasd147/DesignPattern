package pattern.bridge.remote;

public class RemoteMain {

    public static void main(String[] args) {
        TV tv = new RCA();
        RemoteControl remoteControl = new ConcreteRemote(tv);

        remoteControl.on();
        remoteControl.setChannel(10);
        remoteControl.off();
    }
}
