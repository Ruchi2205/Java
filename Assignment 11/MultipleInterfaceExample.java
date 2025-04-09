public class MultipleInterfaceExample 
{
    public static void main(String[] args) 
    {
        Heater h = new Heater("Honeywell");
        h.turnOn();
        h.turnOff();
    }  
}
interface PowerOnable 
{
    void turnOn();
}
interface PowerOffable 
{
    void turnOff();
}
class Heater implements PowerOnable, PowerOffable 
{
    String brand;
    public Heater(String brand) 
    {
      this.brand = brand;
    }
    public void turnOn() 
    {
        System.out.println("The " + brand + " heater is now on!");
    }
    public void turnOff() 
    {
        System.out.println("The " + brand + " heater is now off.");
    }
}
