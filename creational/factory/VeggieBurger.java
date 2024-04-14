package factory;

public class VeggieBurger  extends Burger {

    @Override
    public void prepare() {
        System.out.println("Preparing Veggie Burger");
    }
    
}
