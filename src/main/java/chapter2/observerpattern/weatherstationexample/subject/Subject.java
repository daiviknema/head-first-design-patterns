package chapter2.observerpattern.weatherstationexample.subject;

import chapter2.observerpattern.weatherstationexample.observer.Observer;

public interface Subject {
    public void registerObserver(Observer observer);

    public void notifyObserver(Observer observer);

    public void removeObserver(Observer observer);
}
