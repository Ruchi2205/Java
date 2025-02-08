public class SimpleObj
{
    public static void main(String[]args) 
    {
        Person p1= new Person();
        p1.name="Amit";
        p1.age=25;
        p1.display();
        Person p2= new Person();
        p2.name="Shivansh";
        p2.age=30;
        p2.display();
        Person p3= new Person();
        p3.name="Suman";
        p3.age=28;
        p3.display();
    }
}
class Person
{
String name;
int age;
void display()
{
    System.out.println("Person name:"+name);
    System.out.println("Age:"+age);
}
}