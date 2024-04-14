
package factory.AbstractFactory;

 public class AsusGPU implements GPU {

    @Override
    public void assemble() {
        System.out.println("Assemble " + this.getClass());
    }

    
}