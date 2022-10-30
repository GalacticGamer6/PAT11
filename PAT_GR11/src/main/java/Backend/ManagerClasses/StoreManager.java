package Backend.ManagerClasses;

import Backend.DataTypes.Store;
import Backend.Utility.DB;
import java.sql.ResultSet;
import java.sql.SQLException;

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
        
        String statement = "DELETE FROM tblstores WHERE store name = " + "\"" + store_name + "\"" + ";";
        System.out.println("Delete store Statement: " + statement);
        db.update(statement);
    }
    
    
    public String [] getStoreNames(){
        
        String output[] = new String[50];
        
        for(int i = 0; i < size;i++){
            
            output[i] = store_list[i].getStore_name();
            
        }
        return output;
    }    
    
}
