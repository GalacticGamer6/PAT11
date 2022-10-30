/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend.ManagerClasses;

import Backend.DataTypes.Product;
import Backend.DataTypes.Store;
import Backend.Utility.DB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

    

public class ProductManager {
    
    private Product products_list [] = new Product[100];
    private int size = 0;
    private DB MyFairLadyDB = new DB();
    
    public ProductManager() throws ClassNotFoundException, SQLException{
        
        String statement = "SELECT * FROM tblproducts;";
//        String statement = "SELECT* FROM tblproducts WHERE store LIKE" + "\"" + store_name + "\"" + ";";
        System.out.println(statement);
        ResultSet products_table = MyFairLadyDB.query(statement);
        
        while(products_table.next()){
            
            String product_name = products_table.getString("product_name");
            String store_of_product = products_table.getString("store");
            String fair_of_product = products_table.getString("fair");
            double selling_price = products_table.getDouble("selling_price");            
            double cost_price = products_table.getDouble("cost_price");
            double profit = products_table.getDouble("profit");
            String category = products_table.getString("category");
            int quantity = products_table.getInt("quantity");
            int num_sold = products_table.getInt("num_sold");
            products_list[size] = new Product(product_name,store_of_product,fair_of_product,selling_price,cost_price,profit,category,quantity,num_sold);
            size++;
            
        }
        
    }

    @Override
    public String toString() {
        
        String output = "";
        for(int i = 0; i < size;i++){
            
            output += products_list[i].toString() + "\n";
            
        }
        return output;
    }
    
    
    public void addProduct(Product p) throws SQLException{      
        
        String statement =  "INSERT INTO tblproducts(product_name,store,fair,selling_price,cost_price,profit,category,quantity,num_sold)"
        + "\n" +  "VALUES('" + p.getProductName() + "','" + p.getStoreName() + "','" + p.getFair() + "','" + p.getCostPrice() + "','" + p.getSellingPrice() + "','" + p.getProfit() + "','" + p.getCategory()  + "','" + p.getQuantity() + "','" + p.getNumSold() + "');";
        System.out.println(statement);
        MyFairLadyDB.update(statement);
        
    }
    
    public Product[] getProductsOfAStore(Store S){
        
        Product [] output = new Product[50];
        int current_index = 0;
        
        for(int i = 0; i < size;i++){
            if(products_list[i].getStoreName().equals(S.getStore_name())){
                output[current_index] = products_list[i];
                current_index++;
            }
        }
        return output;
    }
    
    
    
    public Product getProduct(String product_name){
        
        int pos = 0;
        for(int i = 0 ; i < size; i++){
            
            if(products_list[i].getProductName().equals(product_name)){
                pos = i;
            }
        }
        return products_list[pos];
    }
    
    public void decreaseProduct(Product p){
        
        int reduced_quantity = p.getQuantity() - 1;
        p.setQuantity(reduced_quantity);
        
    }
    
    
    
    

    
}
