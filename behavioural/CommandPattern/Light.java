package behavioural.CommandPattern;

public class Light {

    private boolean switchedOn;

    public void swithLight() {
        this.switchedOn = !this.switchedOn;
    }
    
}
