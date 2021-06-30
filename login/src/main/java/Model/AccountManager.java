package Model;

import java.util.HashMap;

public class AccountManager {
    public HashMap<String,String> credentials;

    public AccountManager(){
        credentials = new HashMap<>();
        credentials.put("Patrick","1234");
        credentials.put("Molly","FloPup");
    }

    public boolean isRegistered(String username){
        return credentials.containsKey(username);
    }

    public boolean isCorrectPassword(String username,String password){
        return credentials.get(username).equals(password);
    }

    public void register(String username,String password) {
        credentials.put(username, password);
    }
}
