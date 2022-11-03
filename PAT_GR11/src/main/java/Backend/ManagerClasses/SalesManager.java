
package Backend.ManagerClasses;

import Backend.DataTypes.Product;
import Backend.DataTypes.Sale;
import Backend.DataTypes.Store;
import Backend.Utility.DB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;


public class SalesManager {
    
    private Sale[] list_of_sales = new Sale[200];
    private int size = 0;
    DB db;
    private ProductManager pm;
    
    public SalesManager() throws ClassNotFoundException, SQLException{
        this.pm = new ProductManager();
        this.db = new DB();
        
        String statement = "Select* FROM tblsales;";
        record sales_table = db.query(statement);
        
        while(sales_table.next()){
            
            Product product = pm.getProduct((sales_table.getString("product_name")));
            String store_name = sales_table.getString("Store");
            String fair_name = sales_table.getString("Fair");
            LocalDate date = sales_table.getDate("Date").toLocalDate();
            Double profit = sales_table.getDouble("Profit");
            Sale current_sale = new Sale(product, store_name,fair_name, date,profit);
            list_of_sales[size] = current_sale;
            size++;
            
        }
        
    }
    
    public String toString(){
        
        String output = "";
        
        for(int i = 0 ; i < size; i++){
            
            output += list_of_sales[i].toString() + "\n";
            
        }
        return output;
        
    }
    
    public void addSale(Sale s) throws SQLException{
        
        String statement = "INSERT INTO tblsales(product_name,Store,Fair,Date,Profit)"
                + "\n" + "VALUES('" + s.getProduct_sold().getProductName() + "','" + s.getStore_name() + "','" + s.getFair_name() + "','" + java.sql.Date.valueOf( s.getDate_of_sale() ) + "','" + s.getProfit() + "');";
        System.out.println(statement);
        db.update(statement);
        
    }
    
    public ArrayList<Sale> getListOfTicketsByFair(String Fair_name) throws SQLException{
        
        ArrayList<Sale> sales_list = new ArrayList<Sale>();
        
        String statement = "SELECT* FROM tblsales WHERE product_name = " + "\"" + "Ticket" + "\"" + " AND Fair = " + "\"" + Fair_name + "\"" + ";";
        System.out.println("STATEMENT FROM getListOfTicketsByFair METHOD: " + statement);
        ResultSet sales_table = db.query(statement);
        
        while(sales_table.next()){
            
            Product product = pm.getProduct((sales_table.getString("product_name")));
            String store_name = sales_table.getString("Store");
            String fair_name = sales_table.getString("Fair");
            LocalDate date = sales_table.getDate("Date").toLocalDate();
            Double profit = sales_table.getDouble("Profit");
            Sale current_sale = new Sale(product, store_name,fair_name, date,profit);
            sales_list.add(current_sale);
            
            
        }
        
        return sales_list;
        
    }    
    
//    public Sale getSalesByStore(String store_name) throws SQLException{
//        
//        
//        String statement = "SELECT FROM tblsales WHERE STORE =" + store_name + ";";
//        ResultSet rs = db.query(statement);
//        
//        
//        while(rs.next()){
//        
//            String p = rs.getString("product_name");
//            String s = rs.getString("Store");
//            String f = rs.getString("Fair");
//            LocalDate date = rs.getDate("Date").toLocalDate();
//            
//        }
//    }
    
}
