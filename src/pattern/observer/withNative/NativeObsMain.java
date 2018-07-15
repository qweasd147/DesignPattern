package pattern.observer.withNative;

public class NativeObsMain {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        new CurrentConditionsDisplay(weatherData);
        new StatisticsConditionsDisplay(weatherData);
        new ThirdPartyConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

        //weatherData.measurementsChanged();
    }
}
