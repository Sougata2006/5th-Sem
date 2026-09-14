import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int mark1, mark2, mark3;

    Student(int rollNo, String name, int mark1, int mark2, int mark3) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    int total() {
        return mark1 + mark2 + mark3;
    }

    double percentage() {
        return total() / 3.0;
    }

    String remarks() {
        return getRemark(percentage());
    }

    String remarks(int bonus) {
        return getRemark((total() + bonus) / 3.0);
    }

    private String getRemark(double percent) {
        if (percent >= 75)
            return "Excellent";
        else if (percent >= 60)
            return "Good";
        else if (percent >= 40)
            return "Average";
        else
            return "Needs Improvement";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rollNo = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        int mark1 = sc.nextInt();
        int mark2 = sc.nextInt();
        int mark3 = sc.nextInt();
        int bonus = sc.nextInt();

        Student student = new Student(rollNo, name, mark1, mark2, mark3);

        System.out.println("Student ID: " + student.rollNo);
        System.out.println("Name: " + student.name);
        System.out.println("Marks: " + student.mark1 + ", " + student.mark2 + ", " + student.mark3);
        System.out.println("Total: " + student.total());
        System.out.printf("Percentage: %.2f%%%n", student.percentage());
        System.out.println("remarks(): " + student.remarks());
        System.out.println("remarks(" + bonus + "): " + student.remarks(bonus));
    }
}
