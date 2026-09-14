import java.util.Scanner;
 
class Student {
    int rollNumber;
    String name;
    int marks1, marks2, marks3;
 
    Student(int rollNumber, String name, int marks1, int marks2, int marks3) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }
 
    void display() {
        int total = marks1 + marks2 + marks3;
        double percentage = total / 3.0;
 
        System.out.println("Student ID: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks1 + ", " + marks2 + ", " + marks3);
        System.out.println("Total: " + total);
        System.out.printf("Percentage: %.2f%%%n", percentage);
    }
}
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int rollNumber = sc.nextInt();
        sc.nextLine();
 
        String name = sc.nextLine();
 
        int marks1 = sc.nextInt();
        int marks2 = sc.nextInt();
        int marks3 = sc.nextInt();
 
        Student student = new Student(
            rollNumber, name, marks1, marks2, marks3
        );
 
        student.display();
 
        sc.close();
    }
}
