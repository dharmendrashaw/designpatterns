package behavioural.ChainOfResponsibility.UsingInterfaceApproch;

import behavioural.ChainOfResponsibility.Database;

public class ValidPasswordHandler implements Handler {

    private Database db;

    private Handler next;

    public ValidPasswordHandler(Database db) {
        this.db = db;
    }

    @Override
    public boolean handle(String username, String password) {
        if(db.isValidPassword(username, password)) {
            System.out.println("Password verified " + username);
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
