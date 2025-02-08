public class ObjNewInstance {
    public static void main(String[]args)
    {
        try
        {
            ObjNewInstance outerClass=new ObjNewInstance();
            Class<?>c=Class.forName("ObjNewInstance$Fruit");
            Fruit f1=(Fruit)
            c.getDeclaredConstructor(ObjNewInstance.class).newInstance(outerClass);
            Fruit f2=(Fruit)
            c.getDeclaredConstructor(ObjNewInstance.class).newInstance(outerClass);
            f1.name="Mango";
            f1.color="Yellow";
            f2.name="Grapes";
            f2.color="Green";
            System.out.println("Fruit 1 Details:");
            f1.display();
            System.out.println("\nFruit 2 Details:");
            f2.display();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    class Fruit{
        String name;
        String color;
        void display(){
            System.out.println("Fruit Name:"+name);
            System.out.println("Fruit Color:"+color);
        }
        }
     }
    

    

