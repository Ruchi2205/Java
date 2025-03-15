import java.util.*;
// BASE CLASS
class Person 
{
   int Rollno; 
   String Name;
   Scanner input = new Scanner(System.in);
   void getdata() 
   {
      System.out.println("Enter Roll no:");
      Rollno = input.nextInt();
      System.out.println("Enter Name:");
      Name = input.next();
   }
   void display() 
   {
     System.out.println("Roll no is = " + Rollno);
     System.out.println("Name is = " + Name);
   }
}
// DERIVED CLASS
class Scores extends Person 
{
    int s1, s2;
    void data1()
     {
        getdata();
        System.out.println("Enter marks of sub1:");
        s1 = input.nextInt();
        System.out.println("Enter marks of sub2:");
        s2 = input.nextInt();
    }
    void display1() 
    {  
        display();
        System.out.println("Marks of sub1 = " + s1);
        System.out.println("Marks of sub2 = " + s2);
    }
}
// Main class to test the functionality
class SingleInheritance
{
    public static void main(String[] args)
     {
        Scores s = new Scores();
        s.data1();  
        s.display1();  
    }
}
