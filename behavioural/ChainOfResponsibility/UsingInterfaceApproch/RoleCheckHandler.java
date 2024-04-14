package behavioural.ChainOfResponsibility.UsingInterfaceApproch;

import behavioural.ChainOfResponsibility.Database;

public class RoleCheckHandler implements Handler {

    private Database db;

    private Handler next;

    public RoleCheckHandler(Database db) {
        this.db = db;
    }

    @Override
    public boolean handle(String username, String password) {
        if(this.db.isAdmin(username)) {
            System.out.println("User is admin " + username);
            return true;
        }
        System.out.println("User does not have valid access " + username);
        return false;
    }

    @Override
    public Handler setNextHandler(Handler next) {
        this.next = next;
        return next;
    }


    
}
