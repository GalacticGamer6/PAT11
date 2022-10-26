/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend.Utility;

import Backend.DataTypes.Product;
import Backend.DataTypes.User;
import Backend.ManagerClasses.ProductManager;
import Backend.ManagerClasses.UserManager;
import java.sql.SQLException;

/**
 *
 * @author Neeraav Ranjit
 */
public class Test {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
    UserManager m = new UserManager();
    User u = new User("Geoff", "1234","StoreOwner","TechWorld");
    m.addUser(u);
    

    }
}
