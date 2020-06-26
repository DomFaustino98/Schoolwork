/*
 * Dominic Faustino
 * CMSY166-001
 * Final Project
 */
abstract public class Carrier {
    
    private String name = "Unknown Carrier";
    private double setupCostBase = 0.00;
    private double monthlyCostBase = 0.00;
    
    public Carrier(String name){
    	this.name = name;
    }
    
    //get and set functions for setup cost and monthly cost
    public double getSetupCost()
    {
    	return setupCostBase;
    }
    
    public void setSetupCost(double setupCostBase)
    {
    	this.setupCostBase = setupCostBase;
    }
    
    public double getMonthlyCostBase()
    {
    	return monthlyCostBase;
    }
    
    public void setMonthlyCostBase(double monthlyCostBase)
    {
    	this.monthlyCostBase = monthlyCostBase;
    }
    
    @Override
    public String toString(){
        return name;
    }
}