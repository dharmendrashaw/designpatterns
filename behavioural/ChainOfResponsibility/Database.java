package behavioural.ChainOfResponsibility;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Database {

    Map<String, String> creds = new HashMap<>();
    Set<String> admins = new HashSet<>();

    public Database() {
        creds.put("root", "password_root");
        creds.put("user", "password_user");

        admins.add("root");
    }

    public boolean isValidUser(String user) {
        return creds.containsKey(user);
    }

    public boolean isValidPassword(String user, String password) {
        return isValidUser(user) ? creds.get(user).equals(password) : false;
    }

    public boolean isAdmin(String user) {
        return admins.contains(user);
    }

}
