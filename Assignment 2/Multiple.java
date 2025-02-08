public class Multiple 
{
    public static void main(String[] args)
     {
        Employee e1 = new Employee();
        e1.name = "Riya";
        e1.salary = 55000;
        e1.display();
        System.out.println(); // Adding space for better readability
        Project p1 = new Project();
        p1.title = "AI Development";
        p1.duration = 6;
        p1.display();
    }
}
class Employee 
{
    String name;
    int salary;
    void display() 
    {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}
class Project 
{
    String title;
    int duration; 
    void display() 
    {
        System.out.println("Project Title: " + title);
        System.out.println("Duration: " + duration + " months");
    }
}
