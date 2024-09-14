package behavioural.ObserverPattern.observer;

import behavioural.ObserverPattern.obserable.StockObserableI;

public class SmsNotificationObserver implements NotifyObserverI {

    private StockObserableI stockObserableI;
    private long phoneNumber;

    public SmsNotificationObserver(StockObserableI stockObserableI, long phoneNumber) {
        this.stockObserableI = stockObserableI;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update() {
        sendSMS(this.stockObserableI.getData(), "Hurry!!! stock may get over soon");
    }

    private void sendSMS(int data, String message) {
        System.out.println("SMS: " + phoneNumber + " Stock available " + data + " -> " + message);
    }
}
