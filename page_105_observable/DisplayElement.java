package page_105_observable;

import java.util.Observable;
import java.util.Observer;

public interface DisplayElement {

    public void display();

}

class CurrentConditionsDisplay implements Observer, DisplayElement {

    Observable observable;
    private float temperature;
    private float humidity;

    public String toString() {

        Integer hash  = (Integer) this.hashCode();
        return hash.toString();

    }

    public CurrentConditionsDisplay(Observable observable) {

        this.observable = observable;
        observable.addObserver(this);

    }

    public void update(Observable obs, Object arg) {

        if (obs instanceof WeatherData) {

            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();

            display();

        }
    }

    public void display() { 

        System.out.println("\nWeather station ID: " + this.toString());
        System.out.println("Current conditions: " + temperature + " C degrees and " + humidity + " percent.");

    }
}
