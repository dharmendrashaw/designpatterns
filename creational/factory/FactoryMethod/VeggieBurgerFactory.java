package factory.FactoryMethod;

import factory.Burger;
import factory.VeggieBurger;

public class VeggieBurgerFactory extends RestaurantFM {

    @Override
    public Burger createBurger() {
        return new VeggieBurger();
    }
    
}
