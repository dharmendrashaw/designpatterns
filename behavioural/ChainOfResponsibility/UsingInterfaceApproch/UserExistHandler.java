package behavioural.ChainOfResponsibility.UsingInterfaceApproch;


import behavioural.ChainOfResponsibility.Database;

public class UserExistHandler implements Handler {

    private Database db;

    private Handler next;

    public UserExistHandler(Database db) {
        this.db = db;
    }

    @Override
    public boolean handle(String username, String password) {
        if(this.db.isValidUser(username)) {
            System.out.println("User exists " + username);
            return next.handle(username, password);
        }
        System.out.println("Wrong creds " + username);
        return false;
    }

    @Override
    public Handler setNextHandler(Handler next) {
        this.next = next;

        return next;
    }

    
    
}
