
package Backend.ManagerClasses;

import Backend.DataTypes.Product;
import Backend.DataTypes.Sale;
import Backend.Utility.DB;
import java.sql.SQLException;
import java.time.LocalDate;


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
            LocalDate date = sales_table.getDate("Date").toLocalDate();
        
            Sale current_sale = new Sale(product, store_name, date);
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
        
        String statement = "INSERT INTO tblsales(product_name,Store,Date)"
                + "\n" + "VALUES('" + s.getProduct_sold().getProductName() + "','" + s.getStore_name() + "','" + java.sql.Date.valueOf( s.getDate_of_sale() ) + "');";
        System.out.println(statement);
        db.update(statement);
        
    }
    
    
}
