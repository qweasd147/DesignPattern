package pattern.observer.concrete;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

    private List<Observer> observers;

    private float temperature;  //기온
    private float humidity;     //습도
    private float pressure;     //기압

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int idx = observers.indexOf(observer);

        if(idx > -1){
            observers.remove(idx);
        }
    }

    @Override
    public void notifyObservers() {
        observers.forEach(
                observer -> observer.update(temperature, humidity, pressure)
        );
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }
}
