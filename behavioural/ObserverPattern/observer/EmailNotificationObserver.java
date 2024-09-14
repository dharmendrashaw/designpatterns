package behavioural.ObserverPattern.observer;

import behavioural.ObserverPattern.obserable.StockObserableI;

public class EmailNotificationObserver implements NotifyObserverI {

    private StockObserableI stockObserableI;
    private String emailId;

    public EmailNotificationObserver(StockObserableI stockObserableI, String emailId) {
        this.stockObserableI = stockObserableI;
        this.emailId = emailId;
    }

    @Override
    public void update() {
        sendEmail(this.stockObserableI.getData(), "Hurry!!! stock may get over soon");
    }

    private void sendEmail(int data, String message) {
        System.out.println("Emailed: " + emailId + " Stock available " + data + " --> " + message);
    }
}
