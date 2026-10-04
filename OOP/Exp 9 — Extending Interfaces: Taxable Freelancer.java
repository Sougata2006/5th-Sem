import java.util.Scanner;

interface Payable {
    double calculatePay();
}

interface Printable {
    void printDetails();
}

class Freelancer implements Payable, Printable {
    protected String name;
    protected double hoursWorked;
    protected double ratePerHour;

    Freelancer(String name, double hoursWorked, double ratePerHour) {
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    @Override
    public double calculatePay() {
        return hoursWorked * ratePerHour;
    }

    @Override
    public void printDetails() {
        System.out.println("Freelancer: " + name);
        System.out.println("Hours worked: " + hoursWorked);
        System.out.println("Rate/hour: " + ratePerHour);
        System.out.printf("Total Pay: %.2f%n", calculatePay());
    }
}

interface Taxable extends Payable {
    double netPay();
}

class TaxableFreelancer extends Freelancer implements Taxable {
    private double taxRate;

    TaxableFreelancer(String name, double hoursWorked, double ratePerHour, double taxRate) {
        super(name, hoursWorked, ratePerHour);
        this.taxRate = taxRate;
    }

    @Override
    public double netPay() {
        return calculatePay() - (calculatePay() * taxRate / 100);
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.printf("Tax Rate: %.1f%%%n", taxRate);
        System.out.printf("Net Pay: %.2f%n", netPay());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        double hoursWorked = Double.parseDouble(sc.nextLine());
        double ratePerHour = Double.parseDouble(sc.nextLine());
        double taxRate = Double.parseDouble(sc.nextLine());

        TaxableFreelancer freelancer =
                new TaxableFreelancer(name, hoursWorked, ratePerHour, taxRate);

        freelancer.printDetails();

        sc.close();
    }
}
