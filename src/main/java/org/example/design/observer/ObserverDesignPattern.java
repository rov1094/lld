package org.example.design.observer;

import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update();
}
interface Observable{
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    String getState();
    void notifyObservers();
}

class Oberver1Impl implements Observer {
    private Observable observable;

    public Oberver1Impl(Observable observable) {
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println(observable.getState() + " received update");
    }
}

class Oberver2Impl implements Observer {
    private Observable observable;

    public Oberver2Impl(Observable observable) {
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println(observable.getState() + " received update");
    }
}

class ObservableImpl implements Observable {
    private String state;
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}

public class ObserverDesignPattern {
    public static void main(String[] args) {
        ObservableImpl observable = new ObservableImpl();
        Observer observer1 = new Oberver1Impl(observable);
        Observer observer2 = new Oberver2Impl(observable);

        observable.addObserver(observer1);
        observable.addObserver(observer2);

        observable.setState("State 1");
        observable.setState("State 2");
        observable.setState("State 3");
        observable.setState("State 4");
    }
}
