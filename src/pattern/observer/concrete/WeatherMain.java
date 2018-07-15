package pattern.observer.concrete;

public class WeatherMain {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        //observer 등록
        new CurrentConditionsDisplay(weatherData);
        new StatisticsConditionsDisplay(weatherData);
        new ThirdPartyConditionsDisplay(weatherData);

        weatherData.setMeasurements(88, 83, 30.4f);
        weatherData.setMeasurements(82, 78, 29.2f);
        weatherData.setMeasurements(70, 88, 29.2f);
    }
}
