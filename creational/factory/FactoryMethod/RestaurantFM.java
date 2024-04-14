package factory.FactoryMethod;

import factory.Burger;

public abstract class RestaurantFM {

    public Burger orderBurger() {
       var burger = this.createBurger();
       burger.prepare();
       return burger;
    }

    public abstract Burger createBurger();
    
}