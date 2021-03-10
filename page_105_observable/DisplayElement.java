package page_105_observable;

import java.util.Observable;
import java.util.Observer;

public interface DisplayElement {

    public void display();

}

class DisplayClass  {

    Observable observable;

    public String toString() {

        Integer hash = (Integer) this.hashCode();
        return hash.toString();

    }

}

class CurrentConditionsDisplay extends DisplayClass implements Observer, DisplayElement {

    private float temperature;
    private float humidity;

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

class ForeCastDisplay extends DisplayClass implements Observer, DisplayElement {

    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForeCastDisplay(Observable observable) {

        if (observable instanceof WeatherData) {

            this.observable = observable;
            observable.addObserver(this);

        }
        
    }
    
    public void update(Observable observable, Object arg) {
        
        WeatherData weatherData = (WeatherData) observable;
        lastPressure = currentPressure;
        currentPressure = weatherData.getPressure();

        display();

    }

    public void display() {

        // Nothing

        System.out.println("\nWeather station ID: " + this.toString());
        System.out.println("Current pressure: " + currentPressure + " Last pressure: " + lastPressure);
        
    }
    
}