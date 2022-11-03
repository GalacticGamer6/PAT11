/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend.DataTypes;

import Backend.ManagerClasses.ProductManager;
import java.time.LocalDate;

/**
 *
 * @author Neeraav Ranjit
 */
public class Sale {
    
    private Product product_sold;
    private String store_name;
    private String fair_name;
    private LocalDate date_of_sale;
    
    
    public Sale(Product p, String sn,String fn, LocalDate d){
   
        product_sold = p;
        store_name = sn;
        fair_name = fn;
        date_of_sale = d;
        
    }

    public Product getProduct_sold() {
        return product_sold;
    }

    public String getStore_name() {
        return store_name;
    }
    
    public String getFair_name(){
        return fair_name;
    }

    public LocalDate getDate_of_sale() {
        return date_of_sale;
    }
    
    public String toString(){
        
        return "{" + product_sold.getProductName() + "," + store_name + "," + date_of_sale + "}";
    }
    
}
