/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend.Utility;

import Backend.DataTypes.Product;
import Backend.DataTypes.Sale;
import Backend.DataTypes.Store;
import Backend.DataTypes.User;
import Backend.ManagerClasses.FairManager;
import Backend.ManagerClasses.ProductManager;
import Backend.ManagerClasses.SalesManager;
import Backend.ManagerClasses.StoreManager;
import Backend.ManagerClasses.UserManager;
import java.sql.SQLException;
import java.time.LocalDate;

/**
 *
 * @author Neeraav Ranjit
 */
public class Test {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
            
        ProductManager pm = new ProductManager();
        
        Product[] output = pm.getProductsOfAStore("ShakeLand");
        
        for(int i = 0; i < output.length;i++){
            
            System.out.println(output[i]);
        }
        
    }
}
