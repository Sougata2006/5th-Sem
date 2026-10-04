import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radius = sc.nextDouble();

        Circle circle = new Circle(radius);

        System.out.printf("Circle Area: %.2f%n", circle.area());
        System.out.printf("Circle Circumference: %.2f%n", circle.circumference());

        sc.close();
    }
}
