/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend.Utility;

import Backend.DataTypes.Product;
import Backend.ManagerClasses.ProductManager;
import java.sql.SQLException;

/**
 *
 * @author Neeraav Ranjit
 */
public class Test {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        
        ProductManager p = new ProductManager("Sweets n Treats");
        System.out.println(p.toString());
        System.out.println("\n");
        System.out.println(p.getProduct("Candy Floss").toString());
    }
}
