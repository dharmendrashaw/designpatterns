package behavioural.CommandPattern;

public class Main {

    public static void main(String[] args) {

        Room room = new Room();
        room.setCommand(new SwitchLigtCommand(new Light()));

        room.execute();

    }
    
}
