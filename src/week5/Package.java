 
package week5;
 
public class Package {
    protected String senderName;
    protected String senderAddress;
    protected String senderCity;
    protected String senderState;
    protected String senderZIPCode;
    
    protected String name;
    protected String address;
    protected String city;
    protected String state;
    protected String ZIPCode;
    
    protected double weight;
    protected double costPerOunce;
    
    
    public Package(String senderName, String senderAddress, String senderCity, String senderState, String senderZIPCode, String name, String address, String city, String state, String ZIPCode, double weight, double costPerOunce){
        if(weight <= 0 || costPerOunce <= 0){
            throw new IllegalArgumentException("Weight and cost per ounce must be positive!");
        }
            
        this.senderName = senderName;
        this.senderAddress = senderAddress;
        this.senderCity = senderCity;
        this.senderState = senderState;
        this.senderZIPCode = senderZIPCode;
        
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.ZIPCode = ZIPCode;
        this.weight = weight;
        this.costPerOunce = costPerOunce;
    }
    
    
    public double calculateCost(){
        return this.weight * this.costPerOunce;
    }
    
    public void displayInfo(){
        System.out.println("[Standard Package]");
        System.out.println("Sender      : " + this.senderName+", "+this.senderAddress+", "+this.senderCity+", "+this.senderState+", "+this.senderZIPCode);
        System.out.println("Recipient   : "+this.name+", "+this.address+", "+this.city+", "+this.state+", "+this.ZIPCode);
        System.out.println("Weight      : "+this.weight+" oz "+" Cost Per Ounce: "+this.costPerOunce);
        System.out.println("Total Shipping Cost: $"+calculateCost());
        System.out.println("");
    }
}
