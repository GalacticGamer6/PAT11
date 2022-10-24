package Backend.DataTypes;


public class User {
    
    private String username = "";
    private String password = "";
    private String account_level = "";
    private String store = "";
    
    
    public User(String u, String p, String a, String sn){
        
        username = u;
        password = p;
        account_level = a;
        store = sn;
        
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getAccount_level() {
        return account_level;
    }

    public String getStoreName() {
        return store;
    }

    @Override
    public String toString() {
        return "User{" + "username=" + username + ", password=" + password + ", account_level=" + account_level + ", store=" + store + '}';
    }
    
    
    
}
