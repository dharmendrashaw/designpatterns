package behavioural.ChainOfResponsibility.UsingAbstractApproch;

import behavioural.ChainOfResponsibility.Database;

public class UserExistsHandler extends Handler {


    public UserExistsHandler(Database db) {
        super(db);
    }

    @Override
    public boolean handle(String username, String password) {
        if(this.db.isValidUser(username)) {
            System.out.println("User exists " + username);
            return this.handleNext(username, password);
        }
        System.out.println("Wrong creds " + username);
        return false;
    }
    
}
