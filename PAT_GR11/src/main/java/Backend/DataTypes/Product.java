package Backend.DataTypes;
 


public class Product {
    
    private  String name;
    private  String store_name;
    private  double selling_price;
    private  double cost_price;
    private double profit;
    private  String category;
    private  int INITIAL_QUANTITY;
    private  int quantity;
    private int num_sold;
    private String fair;
    //name, storename, cost, sell, quantity, numbersold
    public Product(String n, String sn,String f, double cp, double sp, double p,String c, int q, int ns){
        
        name = n;
        store_name = sn;
        fair = f;
        selling_price = sp;
        cost_price = cp;
        profit = p;
        category = c;
        INITIAL_QUANTITY = q;
        quantity = q;
        num_sold = ns;
        
    }
    
    public String getProductName(){
        return name;
    }
    public String getFair(){
        return fair;
    }
    public double getCostPrice(){
        return cost_price;
    }
    
    public double getSellingPrice(){
        return selling_price;
    }
    
    public double getProfit(){
        return profit;
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
    
    public void setQuantity(int new_quantity){
        quantity = new_quantity;
    }
    
    
    public String toString(){
        
        return "{ " + name + " " + store_name + " " + selling_price + " " + cost_price + " " + profit + " " +  category + " " + quantity + " "  + num_sold + " }";
        
    }
    
}
