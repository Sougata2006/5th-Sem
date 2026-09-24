import java.util.Scanner;

interface Payable {
    double getTotalPay();
}

interface Printable {
    void printDetails();
}

class Freelancer implements Payable, Printable {
    private String name;
    private double hoursWorked;
    private double ratePerHour;

    public Freelancer(String name, double hoursWorked, double ratePerHour) {
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    @Override
    public double getTotalPay() {
        return hoursWorked * ratePerHour;
    }

    @Override
    public void printDetails() {
        System.out.println("Freelancer: " + name);
        System.out.println("Hours worked: " + hoursWorked);
        System.out.println("Rate/hour: " + ratePerHour);
        System.out.printf("Total Pay: %.2f%n", getTotalPay());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        double hoursWorked = sc.nextDouble();
        double ratePerHour = sc.nextDouble();

        Freelancer freelancer = new Freelancer(name, hoursWorked, ratePerHour);
        freelancer.printDetails();

        sc.close();
    }
}
