import java.util.Scanner;

class Employee {
    int employeeId;
    String employeeName;
    double basicSalary;

    Employee(int employeeId, String employeeName, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }

    double calculateBonus() {
        return basicSalary * 0.10;
    }
}

class Developer extends Employee {
    int projectsCompleted;

    Developer(int employeeId, String employeeName, double basicSalary, int projectsCompleted) {
        super(employeeId, employeeName, basicSalary);
        this.projectsCompleted = projectsCompleted;
    }

    @Override
    double calculateBonus() {
        return basicSalary * 0.10 + (projectsCompleted * 2000);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int employeeId = sc.nextInt();
        sc.nextLine();

        String employeeName = sc.nextLine();

        double basicSalary = sc.nextDouble();
        int projectsCompleted = sc.nextInt();

        Developer developer = new Developer(
            employeeId,
            employeeName,
            basicSalary,
            projectsCompleted
        );

        System.out.printf("Employee ID: %d%n", developer.employeeId);
        System.out.printf("Name: %s%n", developer.employeeName);
        System.out.printf("Basic Salary: %.2f%n", developer.basicSalary);
        System.out.printf("Projects Completed: %d%n", developer.projectsCompleted);
        System.out.printf("Bonus: %.2f%n", developer.calculateBonus());

        sc.close();
    }
}
