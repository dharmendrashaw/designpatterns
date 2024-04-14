package factory;

public abstract class Burger {
    public abstract void prepare();
    
    public void printOrder() {
        System.out.println(this.getClass());
    }
    
}