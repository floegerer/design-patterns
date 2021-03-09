package page_105_observable;

public class WeatherStation {

    public static void main(String[] args) {
        
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        CurrentConditionsDisplay currentDisplay2 = new CurrentConditionsDisplay(weatherData);
        CurrentConditionsDisplay currentDisplay3 = new CurrentConditionsDisplay(weatherData);
        
        weatherData.setMeasurments(90, 65, 30.4f);
        weatherData.setMeasurments(64, 68, 30.4f);
        weatherData.setMeasurments(77, 80, 21.4f);
        
    }
    
}
