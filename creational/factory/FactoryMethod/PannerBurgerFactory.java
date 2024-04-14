package factory.FactoryMethod;

import factory.Burger;
import factory.PaneerBurger;

public class PannerBurgerFactory extends RestaurantFM {

    @Override
    public Burger createBurger() {
        return new PaneerBurger();
    }
    
}
