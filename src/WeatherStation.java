import observers.CurrentConditionsDisplay;
import subjects.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(84, 63, 35.4f);
        weatherData.setMeasurements(75, 90, 38.4f);
    }
}
