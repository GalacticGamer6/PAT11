package Backend.ManagerClasses;

import Backend.DataTypes.Fair;
import Backend.DataTypes.Product;
import Backend.DataTypes.Store;
import Backend.Utility.DB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FairManager {
    
    private Fair[] fair_list = new Fair[50];
    private int size = 0;
    private DB db;
    
    public FairManager() throws ClassNotFoundException, SQLException{
        
        this.db = new DB();
        
        String statement = "SELECT* FROM tblfairs;";
        ResultSet fairs_table = db.query(statement);
        
        while(fairs_table.next()){
            
            String fair_name = fairs_table.getString("fair_name");
            double entrance_fee = fairs_table.getDouble("entrance_fee");
            double profit = fairs_table.getDouble("profit");
            String fair_owner = fairs_table.getString("fair_owner");
            
            Fair current_fair = new Fair(fair_name,entrance_fee,profit,fair_owner);
            fair_list[size] = current_fair;
            size++;
            
        }
        
    }
    
    
    public String toString(){
        String output = "";
        for(int i = 0 ; i < size;i++){
            output += fair_list[i].toString() + "\n";
        }
        return output;
    }
    
    public void addFair(Fair f) throws SQLException{
        
        String statement = "INSERT INTO tblfairs(fair_name,entrance_fee,profit,fair_owner)"
                + "\n" + "VALUES('" + f.getFair_name()+ "','" + f.getEntry_fee() + "','" + f.getOverall_profit() + "','" + f.getFair_owner() + "');";
        System.out.println(statement);
        db.update(statement);
    }
    
    public void deleteFair(String fair_name) throws SQLException{
        //deleting the fair itseld
        String fair_statement = "DELETE FROM tblfairs WHERE fair_name = " + "\"" + fair_name + "\"" + ";";
        System.out.println("Delete Fair Statement: " + fair_statement);
        db.update(fair_statement);
        
        //deleting the stores under the fair
        String store_statement = "DELETE FROM tblstores WHERE fair = " + "\"" + fair_name + "\"" + ";";
        db.update(store_statement);
        
        //deleting all products in store
        String product_statement = "DELETE FROM tblproducts WHERE fair = " + "\"" + fair_name + "\"" + ";";
        db.update(product_statement);
        
        //delete all sales from store
        String sale_statement = "DELETE FROM tblsales WHERE Fair = " + "\"" + fair_name + "\"" + ";";
    }
    
    
    
    public String [] getFairNames(){
        
        String output[] = new String[50];
        
        for(int i = 0; i < size;i++){
            
            output[i] = fair_list[i].getFair_name();
            
        }
        return output;
    }
    
    public int getFairNumber(){
        return size; 
    }
    
    public Fair searchStore(String fair_name){
        
        int index = 0;
        
        for(int i = 0; i < size;i++){
            
            if(fair_list[i].getFair_name().equals(fair_name)){
                index = i;
            }
        }
        return fair_list[index];
    }    
    
    public ArrayList<Fair> getListOfFairs() throws SQLException{
        
        ArrayList<Fair> fair_list = new ArrayList<Fair>();
        
        String statement = "SELECT* FROM tblfairs;";
        ResultSet fairs_table = db.query(statement);
        
        while(fairs_table.next()){
            
            String fair_name = fairs_table.getString("fair_name");
            double entrance_fee = fairs_table.getDouble("entrance_fee");
            double profit = fairs_table.getDouble("profit");
            String fair_owner = fairs_table.getString("fair_owner");
            
            Fair current_fair = new Fair(fair_name,entrance_fee,profit,fair_owner);
            fair_list.add(current_fair);
            
            
        }
        
        return fair_list;
        
    }    
    
   public double getFairProfit(String fair_name) throws SQLException{
       String get_fair_total_profit = "SELECT SUM(Profit) FROM neeraavrDB.tblstores WHERE Fair = " + "\"" + fair_name + "\"" + ";";
       ResultSet rs = db.query(get_fair_total_profit);
       double total_profit = rs.getDouble("SUM(Profit)");
       return total_profit;
       
   } 
    
   public void setFairProfit(String fair_name) throws SQLException{
       
       String get_fair_total_profit = "SELECT SUM(Profit) FROM neeraavrDB.tblstores WHERE Fair = " + "\"" + fair_name + "\"" + ";";
       ResultSet rs = db.query(get_fair_total_profit);
       double total_profit = rs.getDouble("SUM(Profit)");
       
       String set_total_profit = "UPDATE tblfairs SET profit =" + "\"" + total_profit + "\""  + " WHERE fair_name = " + "\"" + fair_name + "\"" + ";";
       db.update(set_total_profit);
   }
   
   public String getMostPopularStore(String fair_name) throws SQLException{
       
       String query = "SELECT store_name from tblstores WHERE Fair = " + "\"" + fair_name + "\"" + "ORDER BY customers_served DESC LIMIT 1;";
       ResultSet rs = db.query(query);
       return Integer.toString(rs.getInt("store_name"));
   }
   
   public String getLeastPopularStore(String fair_name) throws SQLException{
       
       String query = "SELECT store_name from tblstores WHERE Fair = " + "\"" + fair_name + "\"" + "ORDER BY customers_served ASC LIMIT 1;";
       ResultSet rs = db.query(query);
       return Integer.toString(rs.getInt("store_name"));
   }   
    
}
