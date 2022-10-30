/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend.DataTypes;

public class Store {
    
    private String store_name;
    private double profit;
    private int customers_served;
    private String category;
    private String fair_name;
    private String owner_name;
    
    
    
    public Store(String sn, double p, int cs, String c, String fn,String o){
        
        store_name = sn;
        profit = p;
        customers_served = cs;
        category = c;
        fair_name = fn;
        owner_name = o;
       
    }

    public String getStore_name() {
        return store_name;
    }

    public double getProfit() {
        return profit;
    }

    public int getCustomersServed() {
        return customers_served;
    }

    public String getCategory() {
        return category;
    }

    public String getFair_name() {
        return fair_name;
    }

    public String getOwner_name() {
        return owner_name;
    }
    
    public void setCustomersServed(int total_customers_served){
        customers_served = total_customers_served;
    }
     
    public String toString(){
        
        return "{ " + store_name + " " + profit + " " + customers_served + " " + category + " " +  fair_name + " " + owner_name + " }";
    }
    
    
}
