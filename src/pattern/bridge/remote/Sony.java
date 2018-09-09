package pattern.bridge.remote;

public class Sony implements TV{

    int channel;

    @Override
    public void on() {
        System.out.println("Sony on");
    }

    @Override
    public void off() {
        System.out.println("Sony off");
    }

    @Override
    public void tuneChannel(int channel) {
        this.channel = channel;
    }
}
