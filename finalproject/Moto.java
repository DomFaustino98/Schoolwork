/*
 * Dominic Faustino
 * CMSY166-001
 * Final Project
 */
public class Moto extends Phone {
    
    private final String MANUFACTURER = "Motorola";
    private final String BRAND = "Z3";
    private Carrier carrier;
    
    @Override
    public void initialize(String carrier, boolean memberCA){
    		
    			this.carrier.setMonthlyCostBase(70.00); //Sets monthly cost to 70 for moto
    			this.carrier.setSetupCost(20.00); //Sets setup cost to 20 for moto

    }
    
    //Don't need to set values for monthly and setup within the moto constructor because there is only one rate for each
    public Moto( String carrier ) {
        switch (carrier){
            case "Verizon": {
                this.carrier = new Verizon(  );
                break;
            }
            case "AT&T": {
                this.carrier = new ATandT(  );
                break;
            }
            case "T-Mobile": {
                this.carrier = new Tmobile(  );
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
