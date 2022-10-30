package Backend.DataTypes;


public class User {
    
    private String username = "";
    private String password = "";
    private String account_level = "";
    private String store_or_fair_name = "";
    
    
    public User(String u, String p, String a, String sfn){
        
        username = u;
        password = p;
        account_level = a;
        store_or_fair_name = sfn;
        
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

    public String getStoreOrFairName() {
        return store_or_fair_name;
    }

    @Override
    public String toString() {
        return "User{" + "username=" + username + ", password=" + password + ", account_level=" + account_level + ", store=" + store_or_fair_name + '}';
    }
    
    
    
}
