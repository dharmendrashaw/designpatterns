package factory.AbstractFactory;

public class MsiGPU implements GPU {

    @Override
    public void assemble() {
        System.out.println("Assemble " + this.getClass());
    }

    
}