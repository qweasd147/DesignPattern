package pattern.bridge.remote;

public abstract class RemoteControl {

    private TV tvImplementor;

    public RemoteControl(TV tvImplementor) {
        this.tvImplementor = tvImplementor;
    }

    public void on(){
        tvImplementor.on();
    }

    public void off(){
        tvImplementor.off();
    }

    public void setChannel(int channel){
        tvImplementor.tuneChannel(channel);
    }
}
