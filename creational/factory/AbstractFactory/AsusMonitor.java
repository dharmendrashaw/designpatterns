package factory.AbstractFactory;

public class AsusMonitor implements Monitor {

    @Override
    public void assemble() {
        System.out.println("Assemble " + this.getClass());
    }
    
}
