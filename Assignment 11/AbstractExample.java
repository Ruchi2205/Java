public class AbstractExample 
{
    public static void main(String[] args) 
    {
         Derived d = new Derived();
         d.getData();
         Test t = new Test();
         t.getData();
    }
}
abstract class Base 
{
    abstract void getData();
}

class Derived extends Base
 {
    void getData()
    {
        System.out.println("Java");
    }
}

class Test extends Base 
{
    void getData() 
    {
        System.out.println("Programming");
    }
}
