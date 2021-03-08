package page_95_weatherstation;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() { 

        observers = new ArrayList<>();

    }

    // Register a new object as an observer

    public void registerObserver(Observer o) {

        observers.add(o);

    }

    // Remove object from list of observers

    public void removeObserver(Observer o) {

        int i = observers.indexOf(o);

        if (i >= 0) {

            observers.remove(i);

        }
    }

    // Notify all objects listening as an observer

    public void notifyObservers() { 

        for (int i = 0; i < observers.size(); i++) {

            Observer observer = (Observer)observers.get(i);
            observer.update(temperature, humidity, pressure);

        }
    }

    public void measurementsChanged() {

        notifyObservers();

    }

    public void setMeasurments(float temperature, float humidity, float pressure) {

        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();

    }

    // other WeatherData methods here
    
}
