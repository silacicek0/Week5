 
package week5;
 
public class Week5 {
 
    public static void main(String[] args) {
         System.out.println("=======Package Delivery System Test=======");
         
         Package package1 = new Package("Sila Cicek", "Talas Bulv ", "Kayseri", "Talas", "TR 38039", "Suna Uyar", "Ataturk cad.", "Ankara", "A", "TR 06100", 10.0, 2.5);
         TwoDayPackage tDP = new TwoDayPackage("Sila Cicek", "Talas Bulv ", "Kayseri", "Talas", "TR 38039", "Suna Uyar", "Ataturk cad.", "Ankara", "A", "TR 06100", 10.0, 2.5);
         OvernightPackage oP = new OvernightPackage("Sila Cicek", "Talas Bulv ", "Kayseri", "Talas", "TR 38039", "Suna Uyar", "Ataturk cad.", "Ankara", "A", "TR 06100", 10.0, 2.5);
         
         package1.displayInfo();
         tDP.displayInfo();
         oP.displayInfo();
    }
    
}
