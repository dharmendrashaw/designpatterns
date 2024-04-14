 package behavioural.ChainOfResponsibility.UsingAbstractApproch;

import behavioural.ChainOfResponsibility.Database;

public class Main {

    public static void main(String[] args) {
        Database db = new Database();
        Handler handler = new UserExistsHandler(db);
        handler.setNextHandler(new ValidPasswordHandler(db)).setNextHandler(new RoleCheckHandler(db));
        

        AuthService authService = new AuthService(handler);
        authService.signIn("root", "password_root");

        authService.signIn("root_wrong", null);

        authService.signIn("user", "wrong_pass");

        System.out.println("Role_access denied");
        authService.signIn("user", "password_user");
    }

    static void testAbstractApproch()  {
        
    }

    
}