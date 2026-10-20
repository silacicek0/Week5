 
package week5;
 
public class OvernightPackage extends Package{
    private double additionalFee = 2.0;
    
    public OvernightPackage(String senderName, String senderAddress, String senderCity, String senderState, String senderZIPCode, String name, String address, String city, String state, String ZIPCode, double weight, double costPerOunce){
        super(senderName, senderAddress, senderCity, senderState, senderZIPCode, name, address, city, state, ZIPCode, weight, costPerOunce);
    }
    
    
    @Override
    public double calculateCost(){
        double total = (super.weight * super.costPerOunce) + (super.weight * this.additionalFee);
        return total;
    }
    
    @Override
    public void displayInfo(){
        System.out.println("[Overnight Package]");
        System.out.println("Sender      : " + this.senderName+", "+this.senderAddress+", "+this.senderCity+", "+this.senderState+", "+this.senderZIPCode);
        System.out.println("Recipient   : "+this.name+", "+this.address+", "+this.city+", "+this.state+", "+this.ZIPCode);
        System.out.println("Weight      : "+this.weight+" oz "+" Cost Per Ounce: "+this.costPerOunce);
        System.out.println("Additional Fee     :  $"+this.additionalFee);
        System.out.println("Total Shipping Cost: $"+calculateCost());
        System.out.println("");
    }
}
