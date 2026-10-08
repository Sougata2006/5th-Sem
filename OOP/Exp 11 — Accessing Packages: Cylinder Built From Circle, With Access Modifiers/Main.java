import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radius = sc.nextDouble();
        double height = sc.nextDouble();

        Circle circle = new Circle(radius);
        Cylinder cyl = new Cylinder(circle, height);

        System.out.printf("Circle Area: %.2f%n", circle.area());
        System.out.printf("Circle Circumference: %.2f%n", circle.circumference());
        System.out.printf("Cylinder Volume: %.2f%n", cyl.volume());
        System.out.printf("Cylinder Surface Area: %.2f%n", cyl.surfaceArea());

    }
}
