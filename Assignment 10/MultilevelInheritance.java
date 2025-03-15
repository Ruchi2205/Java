import java.util.*;
// Base Class
class Student 
{
    int studentID;
    String studentName;
    Scanner s = new Scanner(System.in);
    void getdata() 
    {
        System.out.println("Enter Student ID:");
        studentID = s.nextInt();
        System.out.println("Enter Student Name:");
        studentName = s.next();
    }
    void display() 
    {
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + studentName);
    }
}
// Derived Class
class PersonalInfo extends Student 
{
    String address;
    String phoneNumber;
    void getPersonalInfo()
     {
        getdata();
        System.out.println("Enter Address:");
        address = s.next();
        System.out.println("Enter Phone Number:");
        phoneNumber = s.next();
    }
    void displayPersonalInfo()
     {
        display();
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
    }
}
// Derived Class
class CourseDetails extends PersonalInfo 
{
    String courseName;
    int courseDuration;
    void getCourseDetails()
     {
        getPersonalInfo();
        System.out.println("Enter Course Name:");
        courseName = s.next();
        System.out.println("Enter Course Duration (in months):");
        courseDuration = s.nextInt();
    }
    void displayCourseDetails() 
    {
        displayPersonalInfo();
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Duration: " + courseDuration + " months");
    }
}
// Derived Class
class ExamResults extends CourseDetails
 {
    double exam1Score;
    double exam2Score;
    void getExamResults() 
    {
        getCourseDetails();
        System.out.println("Enter Exam 1 Score:");
        exam1Score = s.nextDouble();
        System.out.println("Enter Exam 2 Score:");
        exam2Score = s.nextDouble();
    }
    void displayExamResults() 
    {
        displayCourseDetails();
        System.out.println("Exam 1 Score: " + exam1Score);
        System.out.println("Exam 2 Score: " + exam2Score);
    }
}
public class MultilevelInheritance
{
    public static void main(String[] args) 
    {
        ExamResults student = new ExamResults();
        student.getExamResults();
        student.displayExamResults();
    }
}
