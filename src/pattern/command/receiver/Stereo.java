package pattern.command.receiver;

public class Stereo {

    private String stereoTarget;

    public Stereo(String target) {
        this.stereoTarget = target;
    }

    public void on(){
        System.out.println(stereoTarget+" stereo on");
    }
    public void off(){
        System.out.println(stereoTarget+" stereo off");
    }

    public void setCD(){
        System.out.println(stereoTarget+" set CD");
    }
    public void getCD(){
        System.out.println(stereoTarget+" get CD");
    }
    public void setVolume(int volume){
        System.out.println(stereoTarget+" set volume");
    }
}
