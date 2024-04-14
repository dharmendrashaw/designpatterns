package behavioural.ChainOfResponsibility.UsingAbstractApproch;

import behavioural.ChainOfResponsibility.Database;

public abstract class Handler {

    private Handler next;
    protected Database db;

    public Handler setNextHandler(Handler next) {
        this.next = next;
        return next;
    }

    public Handler(Database db) {
        this.db = db;
    }

    public abstract boolean handle(String username, String password);

    protected boolean handleNext(String username, String password) {
        if (next == null)
            return true;

        return next.handle(username, password);
    }

}
