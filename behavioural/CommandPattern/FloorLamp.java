package behavioural.CommandPattern;

public class FloorLamp {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void execute() {
        this.command.execute();
    }
    
}
