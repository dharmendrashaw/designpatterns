package factory.SimpleFactory;

import factory.Burger;
import factory.PaneerBurger;
import factory.VeggieBurger;

public class SimpleBurgerFactory {

    
    public static Burger createBurger(String type) {
        Burger burger = null;

        if("PANEER".equals(type)) {
            burger = new PaneerBurger();
        } else if ("VEGGIE".equals(type)) {
            burger = new VeggieBurger();
        }
        return burger;
    }
}