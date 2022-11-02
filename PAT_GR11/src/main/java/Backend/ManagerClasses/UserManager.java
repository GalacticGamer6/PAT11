/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend.ManagerClasses;

import Backend.DataTypes.User;
import Backend.Utility.DB;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Neeraav Ranjit
 */
public class UserManager {
    
    private User [] user_list = new User[50];
    private int size = 0;
    
    private DB MyFairLadyDB;
    
    public UserManager() throws SQLException, ClassNotFoundException{
        this.MyFairLadyDB = new DB();
        
        String statement = "SELECT * FROM tblusers;";
        ResultSet rs = MyFairLadyDB.query(statement);
        
        while(rs.next()){
        
            String username = rs.getString("Username");
            String password = rs.getString("Password");
            String account_level = rs.getString("Account_level");
            String store = rs.getString("store_or_fair_name");
            
            user_list[size] = new User(username,password,account_level,store);
            size++;
            
    }
        
       
        
        
        
    }
    
    public String toString() {
        
        String output = "";
        for(int i = 0; i < size;i++){
            
            output += user_list[i].toString() + "\n";
            
        }
        return output;
    }

    public void addUser(User u) throws SQLException{
        
        String statement = "INSERT INTO tblusers(Username, Password, Account_Level,store_or_fair_name)"
                + "\n" + "Values('" + u.getUsername() + "','" + u.getPassword() + "','" + u.getAccount_level() + "','" + u.getStoreOrFairName() + "');";
        MyFairLadyDB.update(statement);
    }
    
    public User searchUser(String username, String password){
        
        for(int i = 0 ; i < size;i++){
            
            if(user_list[i].getUsername().equals(username) & user_list[i].getPassword().equals(password))
            return user_list[i];
        }
        return null;
    }
    
}
