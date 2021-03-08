package page_95_weatherstation;

public class DisplayElements {
    
}

class CurrentConditionsDisplay implements Observer, DisplayElement  {

    private float temperature;
    private float humidity;
    private Subject WeatherData;

    public String toString() {

        Integer hash  = (Integer) this.hashCode();
        return hash.toString();

    }

    public CurrentConditionsDisplay(Subject weatherData)  {

        this.WeatherData = weatherData;
        weatherData.registerObserver(this);

    }

    public void update(float temperature, float humidity, float pressure) {

        this.temperature = temperature;
        this.humidity = humidity;
        this.toString();
        
        display();
    
    }

    public void display() { 

        System.out.println("\nWeather station ID: " + this.toString());
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + " humidity.");

    }
}