package behavioural.ObserverPattern.obserable;

import behavioural.ObserverPattern.observer.NotifyObserverI;

import java.util.HashSet;
import java.util.Set;

public class LaptopStockObserable implements StockObserableI {

    private Set<NotifyObserverI> subscribers;

    private int currentStock;

    public  LaptopStockObserable() {
        subscribers = new HashSet<>();
    }

    @Override
    public void add(NotifyObserverI observer) {
        subscribers.add(observer);
    }

    @Override
    public void remove(NotifyObserverI observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifySubscriber() {
        for (NotifyObserverI subscriber: subscribers) {
            subscriber.update();
        }
    }

    @Override
    public void setData(int newStock) {
        if (currentStock != 0) {
            currentStock += newStock;
            return;
        }

        currentStock += newStock;
        notifySubscriber();
    }

    @Override
    public int getData() {
        return currentStock;
    }
}
