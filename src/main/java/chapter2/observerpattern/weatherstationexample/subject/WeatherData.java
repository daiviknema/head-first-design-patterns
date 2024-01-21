package chapter2.observerpattern.weatherstationexample.subject;

import com.google.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

import chapter2.observerpattern.weatherstationexample.observer.Observer;

public class WeatherData implements Subject {
    private static final Logger logger = LoggerFactory.getLogger(WeatherData.class);

    private double temperature;

    private double humidity;

    private List<Observer> observers;

    @Inject
    public WeatherData() {
        logger.atInfo().log("Creating weather data object: {}", this);
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(Observer observer) {
        observer.update(
                WeatherUpdate
                        .newBuilder()
                        .setTemperature(this.getTemperature())
                        .setHumidity(this.getHumidity())
                        .build()
        );
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            notifyObserver(observer);
        }
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void pullWeatherUpdates() {
        logger.atInfo().log("Simulating API call to fetch weather updates");
        temperature = Math.floor(Math.random()*10.0);
        humidity = Math.floor(Math.random()*10.0);
        notifyAllObservers();
    }
}
