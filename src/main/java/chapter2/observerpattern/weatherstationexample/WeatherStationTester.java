package chapter2.observerpattern.weatherstationexample;

import com.google.inject.Guice;
import com.google.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import chapter2.observerpattern.weatherstationexample.inject.Annotations;
import chapter2.observerpattern.weatherstationexample.inject.WeatherModule;
import chapter2.observerpattern.weatherstationexample.observer.Observer;
import chapter2.observerpattern.weatherstationexample.subject.Subject;
import chapter2.observerpattern.weatherstationexample.subject.WeatherData;

class WeatherStationRunner {
    private Subject weatherData;
    private Observer latestTemperatureDisplayer;

    @Inject
    WeatherStationRunner(@Annotations.WeatherData Subject weatherData, @Annotations.LatestTemperatureDisplayer Observer latestTemperatureDisplayer) {
        this.weatherData = weatherData;
        this.latestTemperatureDisplayer = latestTemperatureDisplayer;
    }

    public void run() {
        weatherData.registerObserver(latestTemperatureDisplayer);

        ((WeatherData)weatherData).pullWeatherUpdates();
        ((WeatherData)weatherData).pullWeatherUpdates();
        ((WeatherData)weatherData).pullWeatherUpdates();

        weatherData.removeObserver(latestTemperatureDisplayer);

        ((WeatherData)weatherData).pullWeatherUpdates();
        ((WeatherData)weatherData).pullWeatherUpdates();
        ((WeatherData)weatherData).pullWeatherUpdates();
    }
}

public class WeatherStationTester {
    private static final Logger logger = LoggerFactory.getLogger(WeatherStationTester.class);
    public static void main(String [] args) {
        WeatherStationRunner runner = Guice.createInjector(new WeatherModule()).getInstance(WeatherStationRunner.class);
        runner.run();
    }
}
