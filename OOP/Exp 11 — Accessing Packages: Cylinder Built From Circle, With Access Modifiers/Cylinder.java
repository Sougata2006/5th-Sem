public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder(Circle base, double height) {
        this.base = base;
        this.height = height;
    }

    public double volume() {
        return base.area() * height;
    }

    public double surfaceArea() {
        return 2 * base.area() + base.circumference() * height;
    }
}
