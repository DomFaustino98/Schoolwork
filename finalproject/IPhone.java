/*
 * Dominic Faustino
 * CMSY166-001
 * Final Project
 */
public class IPhone extends Phone {
      
    private final String MANUFACTURER = "Apple";
    private final String BRAND = "iPhone 10";
    private Carrier carrier;
    
    @Override
    public void initialize(String carrier, boolean memberCA){
    	if (memberCA == true)
		{
			this.carrier.setMonthlyCostBase(50.00); //Sets monthly cost to 50 for CA members
			this.carrier.setSetupCost(0.00); //Sets setup cost to 0 for CA members
		}
    }
    
    //Sets monthly and setup costs to the appropriate values for each carrier 
    public IPhone( String carrier ) {
        switch (carrier){
            case "Verizon": {
                this.carrier = new Verizon(  );
                this.carrier.setMonthlyCostBase(70.00);
                this.carrier.setSetupCost(20.00);
                break;
            }
            case "AT&T": {
                this.carrier = new ATandT(  );
                this.carrier.setMonthlyCostBase(60.00);
                this.carrier.setSetupCost(15.00);
                break;
            }
            case "T-Mobile": {
                this.carrier = new Tmobile(  );
                this.carrier.setMonthlyCostBase(60.00);
                this.carrier.setSetupCost(10.00);
                break;
            }
            default: {
                System.out.println("Unknown Carrier.  Try Again.%n");
                break;
            }
        }
        
    }
    
    @Override
    public String toString() {
        return MANUFACTURER + " " + BRAND + " on " + carrier.toString() + " - Setup Cost: " + carrier.getSetupCost() + ", Monthly cost: " + carrier.getMonthlyCostBase();
    }
    
}
