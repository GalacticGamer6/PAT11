package Backend.ManagerClasses;

import Backend.DataTypes.Fair;
import Backend.DataTypes.Store;
import Backend.Utility.DB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StoreManager {

    private Store [] store_list = new Store[50];
    private int size = 0;
    private DB db;
    
    
    public StoreManager() throws ClassNotFoundException, SQLException{
        
        this.db = new DB();
        
        String statement = "SELECT* FROM tblstores;";
        ResultSet stores_table = db.query(statement);
        
        while(stores_table.next()){
            
            String store_name = stores_table.getString("store_name");
            Double profit = stores_table.getDouble("Profit");
            int customers_served = stores_table.getInt("customers_served");
            String category = stores_table.getString("Category");
            String fair_name = stores_table.getString("Fair");
            String owner_username = stores_table.getString("owner_username");
            
            Store current_store = new Store(store_name,profit,customers_served,category,fair_name,owner_username);
            store_list[size] = current_store;
            size++;
            
            
        }
    }
    
    
    public String toString(){
        
        String output = "";
        
        for(int i = 0; i < size;i++){
            
            output += store_list[i].toString() + "\n";
        }
        
        return output;
    }
    
    public void addStore(Store s) throws SQLException{
        
        String statement = "INSERT INTO tblstores(store_name,Profit,customers_served,Category,Fair,owner_username)"
        + "\n" +  "VALUES('" + s.getStore_name() + "','" + s.getProfit() + "','" + s.getCustomersServed() + "','" + s.getCategory() + "','" + s.getFair_name() + "','" + s.getOwner_name() + "');";
        System.out.println("ADD STORE STATEMENT: " + statement);
        db.update(statement);
    }
    public void deleteStore(String store_name) throws SQLException{
        
        //deleting the store
        String store_statement = "DELETE FROM tblstores WHERE store_name = " + "\"" + store_name + "\"" + ";";
        System.out.println("Delete store Statement: " + store_statement);
        db.update(store_statement);
        
        //deleting the products
        String product_statement = "DELETE FROM tblproducts WHERE store = " + "\"" + store_name + "\"" + ";";
        db.update(product_statement);
    }
    
    public Store searchStore(String store_name){
        
        int index = 0;
        
        for(int i = 0; i < size;i++){
            
            if(store_list[i].getStore_name().equals(store_name)){
                index = i;
            }
        }
        return store_list[index];
    }
    
    public String [] getStoreNames(){
        
        String output[] = new String[50];
        
        for(int i = 0; i < size;i++){
            
            output[i] = store_list[i].getStore_name();
            
        }
        return output;
    }  
    
    public ArrayList<Store> getListOfStores() throws SQLException{
        
        ArrayList<Store> store_list = new ArrayList<Store>();
        
        String statement = "SELECT* FROM tblstores;";
        ResultSet stores_table = db.query(statement);
        
        while(stores_table.next()){
            
            String store_name = stores_table.getString("store_name");
            double profit = stores_table.getDouble("profit");
            int customers_served = stores_table.getInt("customers_served");
            String category = stores_table.getString("Category");
            String fair = stores_table.getString("Fair");
            String owner = stores_table.getString("owner_username");
            
            Store current_store = new Store(store_name,profit,customers_served,category,fair,owner);
            store_list.add(current_store);
            
            
        }
        
        return store_list;
        
    }


    public ArrayList<Store> getListOfStoresByFair(String Fair_name) throws SQLException{
        
        ArrayList<Store> store_list = new ArrayList<Store>();
        
        String statement = "SELECT* FROM tblstores WHERE Fair = " + "\"" + Fair_name + "\"" + ";";
        System.out.println("STATEMENT FROM GETLISTOFSTORESBYFAIR METHOD: " + statement);
        ResultSet stores_table = db.query(statement);
        
        while(stores_table.next()){
            
            String store_name = stores_table.getString("store_name");
            double profit = stores_table.getDouble("profit");
            int customers_served = stores_table.getInt("customers_served");
            String category = stores_table.getString("Category");
            String fair = stores_table.getString("Fair");
            String owner = stores_table.getString("owner_username");
            
            Store current_store = new Store(store_name,profit,customers_served,category,fair,owner);
            store_list.add(current_store);
            
            
        }
        
        return store_list;
        
    }    
    
}
