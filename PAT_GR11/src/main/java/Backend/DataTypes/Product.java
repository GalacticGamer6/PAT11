package Backend.DataTypes;
 


public class Product {
    
    private  String name;
    private  String store_name;
    private  double cost_price;
    private  double selling_price;
    private  String category;
    private  int INITIAL_QUANTITY;
    private  int quantity;
    private  int num_sold;
    
    
    public Product(String n, String sn, double cp, double sp, String c, int q, int ns){
        
        name = n;
        store_name = sn;
        cost_price = cp;
        selling_price = sp;
        category = c;
        INITIAL_QUANTITY = q;
        quantity = q;
        num_sold = ns;
        
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
    
    public int getNumSold(){
        return num_sold;
    }
    
    public String toString(){
        
        return "{ " + name + " " + store_name + " " + cost_price + " " + selling_price + " " + category + " " + quantity + " " + num_sold + " }";
        
    }
    
}
