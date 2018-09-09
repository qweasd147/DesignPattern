package pattern.bridge.remote;

public class RCA implements TV{

    int channel;


    @Override
    public void on() {
        System.out.println("RCA on");
    }

    @Override
    public void off() {
        System.out.println("RCA off");
    }

    @Override
    public void tuneChannel(int channel) {
        this.channel = channel;
    }
}
