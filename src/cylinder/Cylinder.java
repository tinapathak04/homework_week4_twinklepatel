package cylinder;

public class Cylinder extends Circle {
    double height = 1.0;
    public Cylinder(double radius, double height) {
        this.height = height;
    }
    public double getHeight() {
        return this.height;
    }
    public double getVolume() {
        return super.getArea() * height;
    }
}
