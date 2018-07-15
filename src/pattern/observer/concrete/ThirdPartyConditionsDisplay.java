package pattern.observer.concrete;

public class ThirdPartyConditionsDisplay implements Observer, DisplayElement {

    private float temperature;  //기온
    private float humidity;     //습도
    private Subject weatherData;

    public ThirdPartyConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("ThirdParty conditions : "+temperature+" F degrees and "+humidity+"% humidity");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
