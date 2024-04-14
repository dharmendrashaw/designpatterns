package behavioural.ChainOfResponsibility.UsingAbstractApproch;

import behavioural.ChainOfResponsibility.Database;

public class ValidPasswordHandler extends Handler {


    public ValidPasswordHandler(Database db) {
        super(db);
    }

    @Override
    public boolean handle(String username, String password) {
        if(db.isValidPassword(username, password)) {
            System.out.println("Password verified " + username);
            return this.handleNext(username, password);
        }

        System.out.println("Wrong creds " + username);
        return false;
    }
    
}
