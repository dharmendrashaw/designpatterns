package behavioural.ChainOfResponsibility.UsingAbstractApproch;

public class AuthService {
    private Handler handler;
    public AuthService(Handler handler) {
            this.handler = handler;
    }

    public boolean signIn(String username, String password) {
        return handler.handle(username, password);
    }
    
}
