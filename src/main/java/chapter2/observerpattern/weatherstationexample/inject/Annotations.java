package chapter2.observerpattern.weatherstationexample.inject;

import com.google.inject.BindingAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Annotations {
    @BindingAnnotation
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER}) @Retention(RetentionPolicy.RUNTIME)
    public @interface WeatherData {};

    @BindingAnnotation
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER}) @Retention(RetentionPolicy.RUNTIME)
    public @interface LatestTemperatureDisplayer {};
}
