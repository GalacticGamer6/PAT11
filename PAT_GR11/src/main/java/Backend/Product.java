package Backend;
 


public class Product {
    
    private static String name;
    private static String store_name;
    private static double cost_price;
    private static double selling_price;
    private static String category;
    private static int INITIAL_QUANTITY;
    private static int quantity;
    
    
    public Product(String n, String sn, double cp, double sp, String c, int q){
        
        name = n;
        store_name = sn;
        cost_price = cp;
        selling_price = sp;
        category = c;
        INITIAL_QUANTITY = q;
        quantity = q;
        
    }
    
    public String getProductName(){
        return name;
    }
    
    public double getCostPrice(){
        return cost_price;
    }
    
    public double getSellingPrice(){
        return selling_price;
    }
    
    public String getCategory(){
        return category;
    }
    
    public int getQuantity(){
        return quantity;
    }
    
    public double getTotalCostPrice(){
        return  INITIAL_QUANTITY * cost_price;
    }
    
    public String getStoreName(){
        return store_name;
    }
    
    
}
