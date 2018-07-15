package pattern.observer.withNative;

import java.util.Observable;
import java.util.Observer;

public class StatisticsConditionsDisplay implements Observer, DisplayElement {

    private float temperature;  //기온
    private float humidity;     //습도
    private Observable observable;

    public StatisticsConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Statistics conditions : "+temperature+" F degrees and "+humidity+"% humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;

            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
