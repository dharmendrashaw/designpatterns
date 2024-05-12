package behavioural.CommandPattern;

public class SwitchLigtCommand implements Command {

    private Light light;

    public SwitchLigtCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.swithLight();
    }
    
}
