package pattern.command.receiver;

public class Light {

    private String lightTarget;
    public Light(String target) {
        this.lightTarget = target;
    }

    public void on(){
        System.out.println(lightTarget+" light on");
    }
    public void off(){
        System.out.println(lightTarget+" light off");
    }
}
