/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend.DataTypes;

/**
 *
 * @author Neeraav Ranjit
 */
public class Fair {
    
    private String fair_name;
    private double entry_fee;
    private double overall_profit;
    private String fair_owner;
    
    public Fair(String f,double ef,double op,String fo){
        
        fair_name = f;
        entry_fee = ef;
        overall_profit = op;
        fair_owner = fo;
        
        
    }

    public String getFair_name() {
        return fair_name;
    }

    public double getEntry_fee() {
        return entry_fee;
    }

    public double getOverall_profit() {
        return overall_profit;
    }

    public String getFair_owner() {
        return fair_owner;
    }
    
    public String toString(){
        
        return "{" + fair_name + "," + entry_fee + "," + overall_profit + "," + fair_owner + "}";
        
    }
    
    
    
}
