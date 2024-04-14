package factory.AbstractFactory;

public class MsiMonitor implements Monitor {

    @Override
    public void assemble() {
        System.out.println("Assemble " + this.getClass());
    }
    
}
