package behavioural.ObserverPattern;

import behavioural.ObserverPattern.obserable.LaptopStockObserable;
import behavioural.ObserverPattern.obserable.MobilePhoneStockObserable;
import behavioural.ObserverPattern.obserable.StockObserableI;
import behavioural.ObserverPattern.observer.EmailNotificationObserver;
import behavioural.ObserverPattern.observer.NotifyObserverI;
import behavioural.ObserverPattern.observer.SmsNotificationObserver;

public class Main {

    public static void main(String[] args) {
        StockObserableI laptopStocks = new LaptopStockObserable();
        StockObserableI phoneStocks = new MobilePhoneStockObserable();

        //Subscriber
        NotifyObserverI email1 = new EmailNotificationObserver(laptopStocks, "abc@mail.com");
        NotifyObserverI email2 = new EmailNotificationObserver(laptopStocks, "abc2@mail.com");
        NotifyObserverI sms1 = new SmsNotificationObserver(laptopStocks, 1234567890);

        //register subscriber
        laptopStocks.add(email1);
        laptopStocks.add(email2);
        laptopStocks.add(sms1);


        NotifyObserverI sms2 = new SmsNotificationObserver(phoneStocks, 345678902);
        NotifyObserverI sms3 = new SmsNotificationObserver(phoneStocks, 345118902);
        NotifyObserverI email3 = new EmailNotificationObserver(phoneStocks, "abc3@mail.com");
        NotifyObserverI email4 = new EmailNotificationObserver(phoneStocks, "abc4@mail.com");

        phoneStocks.add(sms2);
        phoneStocks.add(sms3);
        phoneStocks.add(email3);
        phoneStocks.add(email4);

        //update stocks
        laptopStocks.setData(100);

        phoneStocks.setData(1000);
    }
}
