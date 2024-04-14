package factory.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        AbstractCompany asus = new AsusCreator();
        GPU asusGpu = asus.creatGPU();
        Monitor asusMonitor = asus.createMonitor();

        asusGpu.assemble();
        asusMonitor.assemble();


        AbstractCompany msi = new MsiCreator();
        GPU msiGpu = msi.creatGPU();
        Monitor msMonitor = msi.createMonitor();

        msiGpu.assemble();
        msMonitor.assemble();


    }
}
