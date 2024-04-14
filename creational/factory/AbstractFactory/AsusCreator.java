package factory.AbstractFactory;

public class AsusCreator extends AbstractCompany {

    @Override
    public GPU creatGPU() {
        return new AsusGPU();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }

}
