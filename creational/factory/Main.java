package factory;

import factory.FactoryMethod.PannerBurgerFactory;
import factory.FactoryMethod.RestaurantFM;
import factory.FactoryMethod.VeggieBurgerFactory;
import factory.SimpleFactory.Restaurent;

public class Main {
    
    public static void main(String[] args) {
       testSimpleFactory();
       testFactoryMethod();
    }

    static void testFactoryMethod() {
        System.out.println("Testing factory method --------------------");
        RestaurantFM pannerBurgerF = new PannerBurgerFactory();
        Burger pBurger = pannerBurgerF.orderBurger();

        pBurger.printOrder();

        RestaurantFM vegBurgerF = new VeggieBurgerFactory();
        Burger vBurger = vegBurgerF.orderBurger();

        vBurger.printOrder();


    }

    static void testSimpleFactory() {
        System.out.println("Testing Simple Factory --------------------");
        var restraurent = new Restaurent();
        var burger = restraurent.orderBurger("PANEER");

        burger.printOrder();

        var burger2 = restraurent.orderBurger("VEGGIE");
        burger2.printOrder();
    }

}
