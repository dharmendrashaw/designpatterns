package factory.SimpleFactory;

import factory.Burger;

public class Restaurent {

    public Burger orderBurger(String type) {
       var burger = SimpleBurgerFactory.createBurger(type);
       burger.prepare();
       return burger;
    }
    
}
