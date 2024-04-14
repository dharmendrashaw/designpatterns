package factory.AbstractFactory;

public class MsiCreator extends AbstractCompany {

    @Override
    public GPU creatGPU() {
        return new MsiGPU();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }
    
}
