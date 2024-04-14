package behavioural.ChainOfResponsibility.UsingInterfaceApproch;

import behavioural.ChainOfResponsibility.Database;

public class Main {

    public static void main(String[] args) {
        Database db = new Database();
        Handler handler = new UserExistHandler(db);
        handler.setNextHandler(new ValidPasswordHandler(db)).setNextHandler(new RoleCheckHandler(db));

        AuthService authService = new AuthService(handler);
        authService.signIn("root", "password_root");
    }
    
}
