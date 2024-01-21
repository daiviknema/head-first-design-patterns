package chapter2.observerpattern.weatherstationexample.observer;

import com.google.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import chapter2.observerpattern.weatherstationexample.subject.Subject;
import chapter2.observerpattern.weatherstationexample.subject.WeatherUpdate;

public class LatestTemperatureDisplayer implements Observer, Displayer {
    private static final Logger logger = LoggerFactory.getLogger(LatestTemperatureDisplayer.class);

    private double latestTemperature;


    @Inject
    public LatestTemperatureDisplayer() {
    }

    @Override
    public void update(Object weatherUpdate) {
        this.latestTemperature = ((WeatherUpdate)weatherUpdate).getTemperature();
        display();
    }

    @Override
    public void display() {
        logger.atInfo().log("Latest temperature: {}", latestTemperature);
    }
}
