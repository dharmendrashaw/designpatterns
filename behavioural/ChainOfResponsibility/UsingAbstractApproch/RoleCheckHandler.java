package behavioural.ChainOfResponsibility.UsingAbstractApproch;

import behavioural.ChainOfResponsibility.Database;

public class RoleCheckHandler extends Handler {

    public RoleCheckHandler(Database db) {
        super(db);
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


    
}
