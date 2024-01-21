package chapter2.observerpattern.weatherstationexample.inject;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;

import chapter2.observerpattern.weatherstationexample.observer.LatestTemperatureDisplayer;
import chapter2.observerpattern.weatherstationexample.observer.Observer;
import chapter2.observerpattern.weatherstationexample.subject.Subject;
import chapter2.observerpattern.weatherstationexample.subject.WeatherData;

public class WeatherModule extends AbstractModule {
    @Provides
    @Annotations.WeatherData
    public Subject providesWeatherData() {
        return new WeatherData();
    }

    @Provides
    @Annotations.LatestTemperatureDisplayer
    public Observer  providesLatestWeatherDisplayer() {
        return new LatestTemperatureDisplayer();
    }
}
