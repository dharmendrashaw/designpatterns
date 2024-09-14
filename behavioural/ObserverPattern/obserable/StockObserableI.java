package behavioural.ObserverPattern.obserable;

import behavioural.ObserverPattern.observer.NotifyObserverI;

public interface StockObserableI {

    void add(NotifyObserverI observer);

    void remove(NotifyObserverI observer);

    void notifySubscriber();

    void setData(int newStock);

    int getData();

}
