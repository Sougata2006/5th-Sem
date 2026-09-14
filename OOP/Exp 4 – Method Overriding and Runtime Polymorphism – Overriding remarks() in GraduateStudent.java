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

    int total() {
        return marks1 + marks2 + marks3;
    }

    double percentage() {
        return total() / 3.0;
    }

    void displayResult() {
        System.out.println("Student ID: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks1 + ", " + marks2 + ", " + marks3);
        System.out.println("Total: " + total());
        System.out.printf("Percentage: %.2f%%%n", percentage());
    }

    String remarks() {
        double p = percentage();

        if (p >= 75) {
            return "Excellent";
        } else if (p >= 60) {
            return "Good";
        } else if (p >= 40) {
            return "Average";
        } else {
            return "Needs Improvement";
        }
    }

    String remarks(int bonus) {
        double p = (total() + bonus) / 3.0;

        if (p >= 75) {
            return "Excellent";
        } else if (p >= 60) {
            return "Good";
        } else if (p >= 40) {
            return "Average";
        } else {
            return "Needs Improvement";
        }
    }
}

class GraduateStudent extends Student {

    int thesisMarks;

    GraduateStudent(int rollNumber, String name, int marks1, int marks2,
                    int marks3, int thesisMarks) {

        super(rollNumber, name, marks1, marks2, marks3);
        this.thesisMarks = thesisMarks;
    }

    int finalScore() {
        return total() + thesisMarks;
    }

    @Override
    String remarks() {
        double p = (total() + thesisMarks) / 3.0;

        if (p >= 75) {
            return "Excellent";
        } else if (p >= 60) {
            return "Good";
        } else if (p >= 40) {
            return "Average";
        } else {
            return "Needs Improvement";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rollNumber1 = sc.nextInt();
        sc.nextLine();

        String name1 = sc.nextLine();

        int marks1 = sc.nextInt();
        int marks2 = sc.nextInt();
        int marks3 = sc.nextInt();

        Student student = new Student(
            rollNumber1, name1, marks1, marks2, marks3
        );

        int rollNumber2 = sc.nextInt();
        sc.nextLine();

        String name2 = sc.nextLine();

        int marks4 = sc.nextInt();
        int marks5 = sc.nextInt();
        int marks6 = sc.nextInt();

        int thesisMarks = sc.nextInt();

        GraduateStudent graduateStudent = new GraduateStudent(
            rollNumber2, name2, marks4, marks5, marks6, thesisMarks
        );

        Student[] students = new Student[2];

        students[0] = student;
        students[1] = graduateStudent;

        for (Student s : students) {
            s.displayResult();
            System.out.println("remarks(): " + s.remarks());
        }
    }
}
